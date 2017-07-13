package ro.teamnet.zth.api.database;

import org.junit.Test;
import ro.teamnet.zth.api.em.Condition;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created by Beatrice.Chiriac on 7/13/2017.
 */
public class DBManagerTest {

@Test

    public void getConnection() throws SQLException {

    Connection con=DBManager.getConnection();
    assertFalse(con==null);
}

@Test

    public void checkConnection() throws SQLException {

    Boolean x=DBManager.checkConnection(DBManager.getConnection());
    assertEquals(false,x);
}
}
