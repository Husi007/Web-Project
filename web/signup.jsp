<!DOCTYPE html>
<html>
      
<head>
    <title>Authentication</title>
     <link rel="stylesheet" href="css/style.css" type="text/css">
<style>
.form1
{ 
color:black;
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
    <%! boolean check = true;%>
    <% if (!check){%>
        <h3>Invalid Email ID try again with another Email ID?</h3>
	
    <%}%>
    
        <div class="form1"> 
      <div class = "heading">
        <div id="signup">   
          <h1>Sign Up for Free</h1>
          
          <form action="register" method="get">
          
          <div class="top-row">
            <div class="name">
              <label>
                First Name<span class="req">*</span>
              </label>
              <input type="text" name="fname" style ="margin-left:28px" required autocomplete="off" />
            </div>
        
            <div  class = "name">
              <label>
                Last Name<span class="req">*</span>
              </label>
              <input type="text" name="lname" style ="margin-left:30px" required autocomplete="off"/>
            </div>
          </div>

          <div class = "email">
            <label>
              Email Address<span class="req">*</span>
            </label>
            <input type="email" name="femail" style ="margin-left:5px" required autocomplete="off"/>
          </div>
          
          <div class="pw">
            <label>
              Set A Password<span class="req">*</span>
            </label>
            <input type="password" name="fpassword" required autocomplete="off"/>
          </div>
          
          <button type="submit" class="button button-block"/>Get Started</button>
          
          
          </form>

        </div>
</div>
</div>
    </div>

</body>
</html>