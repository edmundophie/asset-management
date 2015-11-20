package example;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by emhah on 11/20/2015.
 */
public class DBConncetionManager {

    public static Connection getConnection(){
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
