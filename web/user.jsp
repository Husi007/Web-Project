<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bari.dao.UserDao"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <style>
        #f1 { 
    width: 500px;
    padding: 150px;
    border: 25px ;
    margin: 30px;
}
</style>
    </head>

    <body>
        <div id="f1">
        <form method="POST" action='UserController' name="frmAddUser">
            <% String action = request.getParameter("action");
                System.out.println(action);
                UserDao ubean= new UserDao();
            %>
            <% if (action.equalsIgnoreCase("edit")) {%>
            <input type="hidden" name="userId"
                               value="<%= request.getParameter("userId") %>"/>
            
            User Name : <input type="text" name="uname"
                               value="<%= ubean.getUserById(request.getParameter("userId")).getUname() %>" readonly="readonly"/>(You Can't Change this)  <br /> 
            
            Password : <input
                type="password" name="pass"
                value="<%= ubean.getUserById(request.getParameter("userId")).getPassword()%>" /> <br /> 
            Email : <input
                type="text" name="email"
                value="<%= ubean.getUserById(request.getParameter("userId")).getEmail()%>" /> <br />
            
            Registration : <input
                type="text" name="dob"
                value="<%= ubean.getUserById(request.getParameter("userId")).getRegisteredon() %>" readonly="readonly"/>(You Can't Change this)  <br />
            
            <%} else {%>
            User Name : <input type="text" name="uname" value="" /> <br />
            
            Password : <input
                type="text" name="pass" value="" /> <br /> 
            Email : <input
                type="text" name="email"  value="" /> <br /> 
            
            Registration : <input
                type="text" name="dob" value="" />(yyyy/MM/dd)  <br /> 
            <%}%>
            <input  type="submit" value="Submit" />
        </form>
    </div>
    </body>
</html>
