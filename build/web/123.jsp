<%@ include file="header.jsp" %>
<head>
    
    <title>Authentication</title>
   
<style>
.form1
{ 
color:black;
border:15px solid black;
height:300px;
width:400px;
}
body
{
background-image:url("login2.jpg");
background-size:default;

}
div{
    color:black;
}
</style>
</head>
      
    <body>
    <form align ="center" name="contact" action="mail" method="GET" enctype="multipart/form-data">
        
    <input type="hidden" name="action" value="submit" color="white">
    <div>Your name:</div>
    <input name="name" type="text" value="" size="30"/><br><br>
    <div>Your subject:</div>
    <input name="subject" type="text" value="" size="30"/><br><br>
    <div> Your message:</div>
    <textarea name="message" rows="7" cols="30"></textarea><br><br>
    <input type="submit" value="Send email"/>
    </form>
 
    </body>