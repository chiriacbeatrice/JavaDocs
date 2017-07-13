package ro.teamnet.zth.api.database;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Beatrice.Chiriac on 7/13/2017.
 */
public class DBManager {

    public static String CONNECTION_STRING= "jdbc:oracle:thin:@" + DBProperties.IP + ":" + DBProperties.PORT+":xe";

    DBManager() throws UnsupportedOperationException, ClassNotFoundException {}

    private static void  registerDriver() throws ClassNotFoundException {

        Class.forName(DBProperties.DRIVER_CLASS) ;
    }




    public static Connection getConnection() throws SQLException {
//register your driver
        String URL=CONNECTION_STRING ;
        String USER=DBProperties.USER;
        String PASS=DBProperties.PASS;

        Connection conn=DriverManager.getConnection(URL,USER,PASS);

        return conn;
    }




    public static boolean checkConnection(Connection connection){

        String stmquery="SELECT 1 FROM DUAL";

        try (Statement stm=connection.createStatement()){

            stm.execute(stmquery);
        }

        catch (SQLException e)
        {
            System.out.println(e);
        }


        return false;
    }

}
