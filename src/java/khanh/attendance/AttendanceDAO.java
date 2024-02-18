/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanh.attendance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import khanh.Util.Util;

/**
 *
 * @author Admin
 */
public class AttendanceDAO {
    public List<AttendanceDTO> getData () throws ClassNotFoundException,SQLException{
        ArrayList<AttendanceDTO> list = new ArrayList();
        Connection con = null;
        ResultSet rs = null;
        PreparedStatement stm =null;
        con =Util.makeConnection();
        String query="select * from attendance";
        stm = con.prepareCall(query);
        rs=stm.executeQuery();
        while (rs.next()) {
            String id =rs.getString("id");
            String name =rs.getString("name");
            String email =rs.getString("email");
            boolean isAbsent =rs.getBoolean("isAbsent");
            String reason =rs.getString("reason");
            list.add(new AttendanceDTO(id, name, email, isAbsent, reason));
            
        }
        if (rs !=null) rs.close();
        if (stm !=null) stm.close();
        if (con !=null) con.close();
        
        return list;
    }
    
    public void setData(List<AttendanceDTO> list)throws ClassNotFoundException,SQLException{
        Connection con=null;

        PreparedStatement stm = null;
        
        con=Util.makeConnection();
        
        String query = "UPDATE attendance SET isAbsent = ?,reason = ? where id = ?";
        stm=con.prepareStatement(query);
        
        for (AttendanceDTO att:list) {
           stm.setBoolean(1, att.isIsAbsent());
           stm.setString(2, att.getReason());
           stm.setString(3, att.getId());
//           stm.executeQuery();
             stm.executeUpdate();
            
        }
         if (stm !=null) stm.close();
        if (con !=null) con.close();
        
    }
    
}

