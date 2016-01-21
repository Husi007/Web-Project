<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="com.bari.dao.UserDao"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <style>
        #f1 { 
    width: 300px;
    padding: 50px;
    border: 25px ;
    margin: 50px;
}
</style>
        
    </head>
<body>
    
    <center>
   <div id="f1">
    <table border=1>
        <thead>
            <tr>
                <th>User Name</th>
                <th>Email</th>
                <th>Registration Date</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            
            <%
UserDao ubean= new UserDao(); //(UserDao)request.getAttribute("bean");

//out.print("Welcome, "+ ubean.getAllUsers().toString());

 //   while (ubean.getAllUsers().iterator().hasNext()) {    
     //                       out.println(ubean.getAllUsers().iterator().next());
   // }

for(int i = 0; i < ubean.getAllUsers().size(); i++) {
//out.print("Welcome, "+ ubean.getAllUsers().get(i).getUname());
         //allFestivals.get(i).getFestivalName()
%>
        <tr>      
            <td><%= ubean.getAllUsers().get(i).getUname()%></td>
            <td><%= ubean.getAllUsers().get(i).getEmail() %></td>
            <td><%= ubean.getAllUsers().get(i).getRegisteredon() %></td>
            <td><a href="UserController?action=edit&userId=<%= ubean.getAllUsers().get(i).getId() %>">Update</a></td>
            <td><a href="UserController?action=delete&userId=<%= ubean.getAllUsers().get(i).getId() %>">Delete</a></td>
        </tr>
    <%  } %>

        </tbody>
    </table>
    </div>
    </center>
    <p><a href="UserController?action=insert">Add User</a></p>
</body>
</html>
