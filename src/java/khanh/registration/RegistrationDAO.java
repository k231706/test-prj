/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanh.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import khanh.Util.Util;

/**
 *
 * @author Admin
 */
public class RegistrationDAO {
    public ResultSet authenticate(String user,String pass) throws ClassNotFoundException, SQLException{
        ResultSet rs = null;
        Connection con = Util.makeConnection();
        PreparedStatement stm = null;
        String query = "select * from registration where username=? and password = ?";
        stm = con.prepareStatement(query);
        stm.setString(1, user);
        stm.setString(1, pass);
        rs=stm.executeQuery();
        
        
        return rs;
    }
    
}
