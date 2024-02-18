/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanh.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class Util {
    final static private String BD_USER="sa";
    final static private String BD_PASS="1234";
    
    public static Connection makeConnection() throws ClassNotFoundException, SQLException{
        Connection con = null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://localhost:1433;databaseName=USERMANAGER";
        con = DriverManager.getConnection(url, BD_USER,BD_PASS);
        return con;
    }
    
    
}
