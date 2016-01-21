<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.RequestDispatcher" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD Example</title>
    </head>
    <body>
        
        <%
            response.sendRedirect("listuser.jsp");
            // <jsp:forward page="/UserController?action=listuser" /> ></jsp:forward>
        //RequestDispatcher rd=request.getRequestDispatcher("/UserController?action=listuser");
        //rd.forward(request, response);
            
        %>
    </body>
</html>
