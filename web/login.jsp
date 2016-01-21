<!DOCTYPE html>
<html>
   
<head>
     <title>Authentication</title>
     <link rel="stylesheet" href="css/style.css" type="text/css">
<style>
.form1
{ 
color:rgb;
height:300px;
width:400px;
}

</style>
</head>

<body>

<script>
    function func()
	{
	    var name     = document.getElementById("name").value;
        if(name.length>=6)
		{
		    if(/[A-Z]/.text(name.charAt(0)))
			{
			    if(checkemail() && checkpw())
				{
				    window.alert("User Validated!");
				}
				
			}
		}
		else
				{
				    window.alert("User Invalid!");
				}
		
	}
	
	function checkemail()
	{
	    var email = document.getElementById("em");
		var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;

		if (!filter.test(email.value)) 
		{
		    return false;
		}
		return true;
	}
	function checkpw()
	{
	    var pword = document.getElementById("pw");
		var psw   = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/;
		if(!psw.test(pword.value))
		{
		    return false;
		}
		return true;
	}
	
    

</script>






<div class = "body">
	<div class="form1">
      
     
      
      <div class = "heading">
        <div id="login">   
          <h1>LOGIN</h1>
          
          <form action="login" method="get">

          <div class = "email">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email" name = "user" required autocomplete="off"/>
          </div>
          
          <div class="pw">
            <label>
                Password<span class="req">*</span>
            </label>
            <input type="password" name ="pwd" style ="margin-left:33px" required autocomplete="off"/>
          </div>
          
          <button type="submit" class="button button-block"/>Get Started</button>
            <center>
                    <p> Don't Have an Account sign Up for free here</p>     
                    <a href="signup.jsp"> <h3>Sign Up</h3></a>
            </center>
          
          </form>

        </div>
</div>
</div>

</div>
</body>

</html>
