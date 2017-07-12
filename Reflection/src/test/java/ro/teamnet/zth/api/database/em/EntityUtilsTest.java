package ro.teamnet.zth.api.database.em;

import org.junit.Test;
import ro.teamnet.zth.api.em.ColumnInfo;
import ro.teamnet.zth.api.em.EntityUtils;
import ro.teamnet.zth.appl.dao.domain.Department;

import static org.junit.Assert.assertEquals;

/**
 * Created by Beatrice.Chiriac on 7/12/2017.
 */
public class EntityUtilsTest {

    @Test
    public void testGetTableNameMethod() {
        String tableName = EntityUtils.getTableName(Department.class);
        assertEquals("Table name should be departments!", "departments", tableName);
    }

//    @Test
//    public void testGetTableNameMethode2(){
//        String tableName= EntityUtils.getTableName(Department.class);
//
//
//    }


}
