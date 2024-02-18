/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanh.attendance;

/**
 *
 * @author Admin
 */
public class AttendanceDTO {
    private String id;
    private String name;
    private String email;
    private boolean isAbsent;
    private String reason;

//    public AttendanceDTO() {
//    }

    public AttendanceDTO(String id, String name, String email, boolean isAbsent, String reason) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.isAbsent = isAbsent;
        this.reason = reason;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsAbsent() {
        return isAbsent;
    }

    public void setIsAbsent(boolean isAbsent) {
        this.isAbsent = isAbsent;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    
    
    
}
