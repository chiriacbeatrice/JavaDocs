package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.domain.Department;

import java.sql.SQLException;
import java.util.List;

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
    public void findAllTest() throws SQLException {

        EntityManagerImpl objManager=new EntityManagerImpl();

        List<Department> departments=objManager.findAll(Department.class);

        assertEquals(departments.get(0).getDepartmentName(),"Administration");

    }
}
