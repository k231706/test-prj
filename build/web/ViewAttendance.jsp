<%-- 
    Document   : newjspViewAttendance
    Created on : Jan 31, 2024, 2:18:05 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="khanh.attendance.AttendanceDTO" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance Page</title>
    </head>
    <body>
    <%
        List<AttendanceDTO> list = (List<AttendanceDTO>) request.getAttribute("ATTENDANCE_LIST");
        if (list.size() > 0) {
    %>
    <form action="Viewservlet0" method="post">
        
 
    <table border='1'>
        <thead>
            <tr>
                <th>id</th>
                <th>name</th>
                <th>email</th>
                <th>Absent</th>
                <th>Present</th>
                <th>Reason</th>
            </tr>
        </thead>
        
        
        <tbody>
            <% for (AttendanceDTO att : list) { %>
            <tr>
                <td><%= att.getId() %></td>
                <td><%= att.getName() %></td>
                <td><%= att.getEmail() %></td>
                <td><input type="radio" value="absent" name=<%= "rd" + att.getId() %><%= att.isIsAbsent() ? "checked='checked'" : "" %>></td>
                <td><input type="radio" value="present" name=<%= "rd" + att.getId() %><%= !att.isIsAbsent() ? "checked='checked'" : "" %>></td>
                <td><textarea rows="1" cols="20" name=<%= "txt" + att.getId() %>><%= att.getReason() %></textarea></td>
            </tr>
            <% } %>
        </tbody>
    </table>
        <input type="submit" name="btSubmit" value="Submit"/>
        <input type="reset" value="Reset"/>
        </form>
    <%
        }
    %>
</body>


</html>
