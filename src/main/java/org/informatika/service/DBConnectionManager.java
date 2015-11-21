package org.informatika.service;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by emhah on 11/20/2015.
 */
public class DBConnectionManager {

    public static Connection getConnection(){
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assetmanagementdb","root","");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
