<%-- 
    Document   : logout
    Created on : Jan 9, 2016, 10:29:20 PM
    Author     : me
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
         session.invalidate();
         session = request.getSession();
         response.sendRedirect("url1?home");
     
     %>