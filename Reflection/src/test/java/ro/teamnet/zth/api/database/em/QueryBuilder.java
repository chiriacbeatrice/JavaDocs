package ro.teamnet.zth.api.database.em;

import ro.teamnet.zth.api.em.ColumnInfo;
import ro.teamnet.zth.api.em.Condition;

import javax.management.Query;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Beatrice.Chiriac on 7/12/2017.
 */
public class QueryBuilder {

    private Object tableName;
    private List<ColumnInfo> queryColumns;
    private Query queryType;
    private List<Condition> conditions;

    public String getValueForQuery(Object value) {

        if (value instanceof String) return value.toString();

        else if (value instanceof Date) {

            DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");
            return "TO_DATE('" + dateFormat.format((Date) value) + "','mm-dd-YYYY'";
        }

       else
           return value.toString();
    }

    public QueryBuilder addCondition(Condition condition){

        this.conditions.add(condition);

   return this;
    }


    public QueryBuilder setTableName(Object tableName){
        this.tableName=tableName;
        return this;
    }

    public QueryBuilder addQueryColumns(List<ColumnInfo> queryColumns){

        this.queryColumns=queryColumns;

        return this;
    }

    public QueryBuilder setQueryType(Query queryType){

        this.queryType=queryType;
        return this;
    }



}
