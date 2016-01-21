     <%@page import="beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new user</title>
    </head>
    <body>
        <form method="POST" action='UserController' name="frmAddUser">
            <% String action = request.getParameter("action");
                System.out.println(action);
                User ubean= new User();
            %>
            <% if (action.equalsIgnoreCase("edit")) {%>
           
            
            User Name : <input type="text" name="fname"
                               value="<%= ubean.getUserByEmail(request.getParameter("email")).getFirst_name() %>"/>  <br /> 
            User Name : <input type="text" name="lname"
                               value="<%= ubean.getUserByEmail(request.getParameter("email")).getLast_name() %>"/>  <br /> 
            
            Password : <input
                type="password" name="pass"
                value="<%= ubean.getUserByEmail(request.getParameter("email")).getPwd()%>" /> <br /> 
            Email : <input
                type="text" name="email"
                value="<%= ubean.getUserByEmail(request.getParameter("email")).getEmail()%>"  readonly="readonly"/>(You Can't Change this <br />
            
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
    </body>
</html>
