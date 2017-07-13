package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotations.Id;
import ro.teamnet.zth.api.database.DBManager;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static ro.teamnet.zth.api.em.EntityUtils.castFromSqlType;

/**
 * Created by Beatrice.Chiriac on 7/13/2017.
 */
public class EntityManagerImpl implements EntityManager {



    @Override
    public <T> T findById(Class<T> entityClass, Long id) throws SQLException {

        Connection conn = DBManager.getConnection();

        String myTableName = EntityUtils.getTableName(entityClass);
        List<ColumnInfo> columName = EntityUtils.getColumns(entityClass);
        List<Field> fieldsName = EntityUtils.getFieldsByAnnotations(entityClass, Id.class);

        ro.teamnet.zth.api.em.Condition cond = new ro.teamnet.zth.api.em.Condition();

        cond.setColumnName(fieldsName.get(0).getAnnotation(Id.class).name());
        cond.setValue(id);


        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(myTableName);
        queryBuilder.addQueryColumns(columName);
        queryBuilder.setQueryType(QueryType.SELECT);
        queryBuilder.addCondition(cond);

        String query = queryBuilder.createQuery();
        System.out.println(query);
        ResultSet resultSet;


        try (Statement stmt = conn.createStatement()) {

            resultSet = stmt.executeQuery(query);
            if (resultSet.next()) {

                try {
                    T instance = entityClass.newInstance();
                    for(ColumnInfo i:columName) {
                        Field fil = instance.getClass().getDeclaredField(i.getColumnName());
                        fil.setAccessible(true);

                        fil.set(instance,castFromSqlType(resultSet.getObject(i.getDbColumnName()),fil.getType()));
                    }
                    return  instance;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }

            }
        }

        catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    @Override
    public Long getNextIdVal(String tableName, String columnIdName) throws SQLException {
        Connection conn = DBManager.getConnection();
        long Id=-1;
        String query="SELECT MAX("+columnIdName+")FROM "+tableName;
        System.out.println(query);

        try (Statement stmt = conn.createStatement()) {
            ResultSet max=stmt.executeQuery(query);

            if(max.next()){
                Id=max.getLong(1);
            }
        }
        catch (SQLException e) {
            System.out.println(e);
        }



        return (Id+1);
    }

    @Override
    public <T> Object insert(T entity) throws SQLException, NoSuchFieldException {

        Connection connection = DBManager.getConnection();

        String myTableName = EntityUtils.getTableName(entity.getClass());
        List<ColumnInfo> columName = EntityUtils.getColumns(entity.getClass());

        Long id;

        for (ColumnInfo col : columName) {
            if (col.isId() == true) {

                col.setValue(getNextIdVal(myTableName, col.getColumnName()));
                id= (Long) col.getValue();
                return findById((Class<T>) entity,id);

            }

            else {
                Field fil = entity.getClass().getDeclaredField(col.getColumnName());
                fil.setAccessible(true);
                col.setValue(fil.getName());
            }


            QueryBuilder queryBuilder = new QueryBuilder();
            queryBuilder.setTableName(myTableName);
            queryBuilder.addQueryColumns(columName);
            queryBuilder.setQueryType(QueryType.INSERT);
            queryBuilder.createQuery();

            String query = queryBuilder.createQuery();
            ResultSet resultSet;

            try (Statement stmt = connection.createStatement()) {

                resultSet = stmt.executeQuery(query);
            } catch (SQLException e) {
                System.out.println(e);
            }


        }
        return  null;

        }

    @Override
    public <T> List<T> findAll(Class<T> entityClass) throws SQLException {
        Connection connection=DBManager.getConnection();

        String myTableName = EntityUtils.getTableName(entityClass);
        List<ColumnInfo> columName = EntityUtils.getColumns(entityClass);

        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.setTableName(myTableName);
        queryBuilder.addQueryColumns(columName);
        queryBuilder.setQueryType(QueryType.SELECT);
        queryBuilder.createQuery();


        String query = queryBuilder.createQuery();
        ResultSet resultSet;

        try (Statement stmt = connection.createStatement()) {

            resultSet = stmt.executeQuery(query);
            ArrayList<T> myList=new ArrayList<>();

            while(resultSet.next()){
                try {
                    T instance = entityClass.newInstance();
                    for(ColumnInfo i:columName) {
                        Field fil = instance.getClass().getDeclaredField(i.getColumnName());
                        fil.setAccessible(true);
                        fil.set(instance,castFromSqlType(resultSet.getObject(i.getDbColumnName()),fil.getType()));
                    }

                    myList.add(instance);
                    return myList;

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (NoSuchFieldException e) {
                    e.printStackTrace();
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }
}
