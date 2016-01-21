<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%> 
<%@page import="java.sql.*"%> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
    <head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>Example of Java Server Page with JDBC</title> 
    </head> 
    <body> 
        <% String  u = null;//request.getParameter("userid");
    String p = "aaa";//request.getParameter("password");
    String n = "aaa";//request.getParameter("uname");
    String e = "aaa";//request.getParameter("email");
    String a = "aaa";//request.getParameter("registeredon");
    try {
        //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        //Class.forName("com.mysql.jdbc.Driver");
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\me\\Documents\\NetBeansProjects\\hussnain\\webdb.accdb", "root", "root");
        /* Passing argument through the question mark */ 
        PreparedStatement ps = con.prepareStatement("insert into users values(?,?,?,?,?)");
        ps.setString(1, u);
        ps.setString(2, p);
        ps.setString(3, n);
        ps.setString(4, a);
        ps.setString(5, e);
        int i = ps.executeUpdate(); /*Set the Update query command */ if (i != 0) {
            response.sendRedirect("index.jsp?msg=Thank You for registering with us in Mrbool !");
        } else {
            response.sendRedirect("registerinsert.jsp?msg=Insertion Failed!! Please try again!!! ");
        }
        con.close();
    } catch (Exception ex) {
        out.println(ex);
    }%> </body> 
</html>