package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.dao.DepartmentDao;
import ro.teamnet.zth.appl.domain.Department;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Beatrice.Chiriac on 7/14/2017.
 */
public class DepartmentDaoTest {
    @Test
    public void findByIdTest() throws SQLException {

        DepartmentDao objManager=new DepartmentDao() ;

        Department department=objManager.findById(Department.class,100L);

        assertEquals(department.getDepartmentName(),"Finance");
    }

    @Test

    public void getNextIdTest() throws SQLException {

        DepartmentDao objManager=new DepartmentDao();

        Long id=objManager.getNextIdVal("DEPARTMENTS","DEPARTMENT_ID");

        assertEquals((Object)id, 271L);
    }

    @Test
    public void insertTest() throws NoSuchFieldException, SQLException {
      DepartmentDao objManager=new DepartmentDao();

        Department department=new Department();

        department.setDepartmentName("Ceva");
        department.setLocation(1700L);
        department.setId(100L);

        Department obj=(Department)objManager.insert(department);

        assertEquals(obj.getDepartmentName(),"Ceva");

    }

    @Test
    public void findAllTest() throws SQLException {

        DepartmentDao objManager=new DepartmentDao();

        List<Department> departments=objManager.findAll(Department.class);

        assertEquals(departments.get(0).getDepartmentName(),"Administration");

    }

    @Test
    public void update() throws NoSuchFieldException, IllegalAccessException, SQLException, InstantiationException {

        DepartmentDao objManager=new DepartmentDao();
        Department department=new Department();


        department.setDepartmentName("Finance");
        department.setLocation(1700L);
        department.setId(110L);

        Department obj=(Department)objManager.update(department);

        assertEquals(obj.getDepartmentName(),"Finance");

    }

    @Test
    public void deleteTest() throws NoSuchFieldException, IllegalAccessException, SQLException {
        DepartmentDao objManager=new DepartmentDao();
        Department department=new Department();

        department.setId(280L);

        objManager.delete(department);

        assertEquals(null,objManager.findById(department.getClass(),department.getId()));
    }

    @Test
    public void findByParamsTest() throws NoSuchFieldException, IllegalAccessException, SQLException {

       DepartmentDao objManager=new DepartmentDao();

        Map<String,Object> MyMapParams=new HashMap<String,Object>();
        MyMapParams.put("DEPARTMENT_ID",220L);
        MyMapParams.put("DEPARTMENT_NAME","NOC");

        List<Department> list=objManager.findByParams(Department.class,MyMapParams);

        assertEquals(list.size(),1);

    }
}
