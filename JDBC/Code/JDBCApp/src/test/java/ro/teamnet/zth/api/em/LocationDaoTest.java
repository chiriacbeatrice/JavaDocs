package ro.teamnet.zth.api.em;

import org.junit.Test;
import ro.teamnet.zth.appl.dao.DepartmentDao;
import ro.teamnet.zth.appl.dao.LocationDao;
import ro.teamnet.zth.appl.domain.Department;
import ro.teamnet.zth.appl.domain.Location;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Beatrice.Chiriac on 7/14/2017.
 */
public class LocationDaoTest {
    @Test
    public void findByIdTest() throws SQLException {

       LocationDao objManager=new LocationDao() ;

        Location location=objManager.findById(Location.class,1000L);

        assertEquals(location.getCity(),"Roma");
    }

    @Test

    public void getNextIdTest() throws SQLException {

        LocationDao objManager=new LocationDao();

        Long id=objManager.getNextIdVal("LOCATIONS","LOCATION_ID");

        assertEquals((Object)id, 3201L);
    }

    @Test
    public void insertTest() throws NoSuchFieldException, SQLException {
       LocationDao objManager=new LocationDao();

      Location location=new Location();

      location.setCity("Cluj");
        location.setId(3300L);
        location.setPostalCode("000000");
        location.setStateProvince("sdada");
        location.setStreetAddress("fdtydtdt,fyfdt");

        Department obj=(Department)objManager.insert(location);

        assertEquals(obj.getLocation(),"Cluj");

    }

    @Test
    public void findAllTest() throws SQLException {

        LocationDao objManager=new LocationDao();

        List<Location> locations=objManager.findAll(Location.class);

        assertEquals(locations.get(0).getCity(),"Roma");

    }

    @Test
    public void update() throws NoSuchFieldException, IllegalAccessException, SQLException, InstantiationException {

        LocationDao objManager=new LocationDao();
         Location location=new Location();


        location.setStreetAddress("Pieter Breughelstraat 837");
        location.setId(3100L);
        location.setStateProvince("Utrecht");
        location.setPostalCode("3029SK");
        location.setCity("Utrecht");

        Location obj=(Location) objManager.update(location);

        assertEquals(obj.getCity(),"Utrecht");

    }

    @Test
    public void deleteTest() throws NoSuchFieldException, IllegalAccessException, SQLException {
        LocationDao objManager=new LocationDao();
        Location location=new Location();

        location.setId(34000L);

        objManager.delete(location);

        assertEquals(null,objManager.findById(location.getClass(),location.getId()));
    }

    @Test
    public void findByParamsTest() throws NoSuchFieldException, IllegalAccessException, SQLException {

        LocationDao objManager=new LocationDao();

        Map<String,Object> MyMapParams=new HashMap<String,Object>();
        MyMapParams.put("LOCATION_ID",3200L);
        MyMapParams.put("City","Mexico City");

        List<Location> list=objManager.findByParams(Location.class,MyMapParams);

        assertEquals(list.size(),1);

    }
}
