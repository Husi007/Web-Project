<!DOCTYPE html>
<!-- Website template by 1freewebsitetemplates.com -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Fashion Blog</title>
	<link rel="stylesheet" href="css/style.css" type="text/css">
	<!--[if IE 7]>
		<link rel="stylesheet" href="css/ie7.css" type="text/css">
	<![endif]-->
</head>
<body>
		<div class="header">
			<div>
				<a href="url1?index" id="logo"><img src="images/logo.gif" alt="logo"/></a>
				<div class="navigation">
					<ul class="first">
						<li class="first"><a href="url1?jewllery">ON SALE</a></li>
						
						
					</ul>
                                     
					<ul>
						<li><a href="url1?about">ABOUT US</a></li>
						<li><a href="url1?shoes">MY COLLECTION</a></li>
                                                <li><a href="url1?123">CONTACT</a></li>
                                                <%
              
                                                    if (session.getAttribute("userEmail")!= null)
                                                         {
                                                %>
                                                <li> 
                                                     <a href="user1.jsp"> ${sessionScope.name} </a> 
                                                </li>
                                                <li><a href="logout.jsp">LOGOUT</a></li>
                                                <li><a href="url1?blog">THE BLOG</a></li>
						
                                                  <% }
                                                            else if (session.getAttribute("userEmail")== null)
                                                         {
                                                  %>
                                                
                                                             <li><a href="url1?login">LOGIN</a></li>
                                                             
                                                             <%
                                                                 }
                                                             %>
                                                
					</ul>
                                      
				</div>
				
			</div>
			<div id="navigation">
				<ul>
					<li class="selected"><a href="url1?home">Home</a></li>
					<li><a href="url1?newarrival">New Arrival</a></li>
					<li><a href="url1?apparel">Suiting</a></li>
					<li><a href="url1?shoes">Shoes</a></li>
					<li><a href="url1?accessories">Accessories</a></li>
                                        <li><a href="url1?jewllery">Watches</a></li>
				</ul>
			</div>
		</div> 
</body>
</html>