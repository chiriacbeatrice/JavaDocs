package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;
import ro.teamnet.zth.appl.domain.Employee;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by Beatrice.Chiriac on 7/13/2017.
 */
public class EntityManagerImplTest {


    @Test
    public void findByIdTest() throws SQLException {

        EntityManagerImpl objManager=new EntityManagerImpl() ;

        Department department=objManager.findById(Department.class,100L);

        assertEquals(department.getDepartmentName(),"Finance");
    }

    @Test

    public void getNextIdTest() throws SQLException {

        EntityManagerImpl objManager=new EntityManagerImpl();

        Long id=objManager.getNextIdVal("DEPARTMENTS","DEPARTMENT_ID");

        assertEquals((Object)id, 271L);
    }

    @Test
    public void insertTest() throws NoSuchFieldException, SQLException {
        EntityManagerImpl objManager=new EntityManagerImpl();

        Department department=new Department();

        department.setDepartmentName("Ceva");
        department.setLocation(1700L);
        department.setId(100L);

        Department obj=(Department)objManager.insert(department);

        assertEquals(obj.getDepartmentName(),"Ceva");

    }

    @Test
    public void findAllTest() throws SQLException {

        EntityManagerImpl objManager=new EntityManagerImpl();

        List<Department> departments=objManager.findAll(Department.class);

        assertEquals(departments.get(0).getDepartmentName(),"Administration");

    }

    @Test
    public void update() throws NoSuchFieldException, IllegalAccessException, SQLException, InstantiationException {

        EntityManagerImpl objManager=new EntityManagerImpl();
        Department department=new Department();


        department.setDepartmentName("Finance");
        department.setLocation(1700L);
        department.setId(110L);

        Department obj=(Department)objManager.update(department);

        assertEquals(obj.getDepartmentName(),"Finance");

    }

    @Test
    public void deleteTest() throws NoSuchFieldException, IllegalAccessException, SQLException {

        EntityManagerImpl objManager=new EntityManagerImpl();
        Department department=new Department();

        department.setId(280L);

        objManager.delete(department);

        assertEquals(null,objManager.findById(department.getClass(),department.getId()));
    }

    @Test
    public void findByParamsTest() throws NoSuchFieldException, IllegalAccessException, SQLException {

        EntityManagerImpl objManager=new EntityManagerImpl();

        Map<String,Object> MyMapParams=new HashMap<String,Object>();
        MyMapParams.put("DEPARTMENT_ID",220L);
        MyMapParams.put("DEPARTMENT_NAME","NOC");

        List<Department> list=objManager.findByParams(Department.class,MyMapParams);

        assertEquals(list.size(),1);

    }

    @Test
    public void findWithJoinLike() throws SQLException {
        EntityManagerImpl objManager=new EntityManagerImpl();
        Employee emp=new Employee();
        emp.setDepartmentId("60");
        Department dep=new Department();
        dep.setId(60L);
        dep.setDepartmentName("IT");
//
//        List<Employee> employees=objManager.findWithJoinLike(Employee.class,Department.class,emp.getDepartmentId(),dep.getId(),
//                                                             "IT",dep.getDepartmentName());
//        assertEquals(employees.get(0).getFirstName(),"Alexander");

    }
}
