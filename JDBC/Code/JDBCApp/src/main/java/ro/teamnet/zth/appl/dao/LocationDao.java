package ro.teamnet.zth.appl.dao;

import ro.teamnet.zth.api.em.EntityManager;
import ro.teamnet.zth.api.em.EntityManagerImpl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Beatrice.Chiriac on 7/14/2017.
 */
public class LocationDao {
    EntityManager objEntity=new EntityManagerImpl() ;


        public <Location> Location findById(Class<Location> entityClass, Long id) throws SQLException {

            return objEntity.findById(entityClass,id);
        }


        public Long getNextIdVal(String tableName, String columnIdName) throws SQLException {
            return objEntity.getNextIdVal(tableName,columnIdName);
        }


        public <Location> Object insert(Location entity) throws SQLException, NoSuchFieldException {
            return objEntity.insert(entity);
        }


        public <Location> List<Location> findAll(Class<Location> entityClass) throws SQLException {
            return objEntity.findAll(entityClass);
        }


        public <Location> Location update(Location entity) throws SQLException, IllegalAccessException, NoSuchFieldException, InstantiationException {
            return objEntity.update(entity);
        }


        public void delete(Object entity) throws SQLException, NoSuchFieldException, IllegalAccessException {
            objEntity.delete(entity);
        }


        public <Location> List<Location> findByParams(Class<Location> entityClass, Map<String, Object> params) throws SQLException, NoSuchFieldException, IllegalAccessException {
            return objEntity.findByParams(entityClass,params);
        }

}
