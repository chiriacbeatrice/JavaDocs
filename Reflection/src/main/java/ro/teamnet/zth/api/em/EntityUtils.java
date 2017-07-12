package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.annotation.Column;
import ro.teamnet.zth.api.annotation.Id;
import ro.teamnet.zth.api.annotation.Table;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Beatrice.Chiriac on 7/12/2017.
 */
public class EntityUtils {

    EntityUtils(){
        throw new UnsupportedOperationException();
    }



    public static String getTableName(Class entity){
        Annotation[] an=entity.getAnnotations();
        for(Annotation i:an)
        if(i.annotationType().equals(Table.class))
            return ((Table)i).name();

            return entity.getName();

    }


    public static ArrayList<ColumnInfo> getCollumns(Class entity) {

        ArrayList<ColumnInfo> coloane = new ArrayList<ColumnInfo>();

        Field[] fil = entity.getDeclaredFields();

        for (Field i : fil)

            if ((i.getAnnotations().getClass().getName().equals(Column.class.getName())) ||
                    (i.getAnnotations().getClass().getName().equals(Id.class.getName()))) {

                ColumnInfo colInfo = new ColumnInfo();

                colInfo.setColumnName("");
                colInfo.setColumnType(null);
                colInfo.getDbColumnName();
                colInfo.setId(true);
                colInfo.setValue(null);


                coloane.add(colInfo);
            }

       return coloane;
    }

    public static Object castFromSqlType(Object value, Class wantedType){

        if((value instanceof BigDecimal) &&(wantedType.getClass().getName().equals("Integer")))
            return (Integer) value;

        if((value instanceof BigDecimal) &&(wantedType.getClass().getName().equals("Long")))
        return (Long) value;

        if((value instanceof BigDecimal) &&(wantedType.getClass().getName().equals("Float")))
            return (Float) value;

        if((value instanceof BigDecimal) &&(wantedType.getClass().getName().equals("Double")))
            return (Double) value;

        else {
            return value;

        }
    }

    public static ArrayList<Field> getFieldsByAnnotations(Class clazz, Class annotation){

        ArrayList<Field> filList=new ArrayList<Field>();

        Field[] fil = clazz.getDeclaredFields();
        for (Field i : fil)

            if (i.getAnnotations().getClass().getName().equals(annotation.getClass().getName())){

            filList.add(i);

        }

        return filList;
    }

    public static Object getSqlValue(Object object){

        if(object.getClass().isAnnotationPresent(Table.class)){
            Field[] fil = object.getClass().getFields();
            for (Field i : fil)

                if (i.getAnnotations().getClass().getName().equals(Id.class.getName()))
                 return object;


        }
       return object;
    }

}
