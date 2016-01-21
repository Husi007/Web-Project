<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>

<%@ include file="header.jsp" %>
	<body>
		
		<%
       
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        Connection con = DriverManager.getConnection("jdbc:ucanaccess:////C:\\Users\\me\\Documents\\NetBeansProjects\\hussnain\\pages.accdb");
        Statement st = con.createStatement();
        ResultSet rs;
        rs = st.executeQuery("select * from htmlpage where ID=2");
        if (rs.next()) {
            String a=rs.getString("body");
            out.println(a);
        } 
       %>
		<div class="footer">
			<p>&#169; 2011 Herdesigns. All Rights Reserved.</p>
		</div>
	</body>
</html>