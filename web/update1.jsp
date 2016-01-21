<%@page import="beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <form method="POST" action='User' name="frmAddUser">
            <% //String action = request.getParameter("action");
                //System.out.println(action);
                User ubean= new User();
            %>
            <% //if (action.equalsIgnoreCase("edit")) {%>
           
            
            User First Name : <input type="text" name="fname"
                               value=" ${sessionScope.name} "/>  <br /> 
            User Last Name : <input type="text" name="lname"
                               value="${sessionScope.last}"/>  <br /> 
            
            Password : <input
                type="password" name="pass"
                value="${sessionScope.psd}" /> <br /> 
            Email : <input
                type="text" name="email"
                value="${sessionScope.userEmail}"  readonly="readonly"/>(You Can't Change this) <br />
            
            <%//} else {%>
           
            <input  type="submit" value="Submit" />
        </form>
            </div>
    </body>
</html>
