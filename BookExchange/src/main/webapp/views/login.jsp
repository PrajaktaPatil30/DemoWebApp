<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>register</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<link rel="stylesheet" href="design.css">

</head>
<body>
	<div id="top">
		<div class="nav">
			<div class="navbar">
				<ul id="nagigation">
					<a href="/"><li><img src="logo.jpg" id="#"><span
							id="#">Welcome to BookSharing</span></li></a>
				</ul>
			</div>
		</div>
	</div>
	
	
  

  <div class="container" align="center">
  <form action="user" align="center">
    <label for="uname"><b>Username</b></label>
    <input type="text" placeholder="Enter Username" name="uname" required><br>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required><br>

    <button type="submit">Login</button>
    </form>
 
  
  New User? <a href="register" >Register Here</a>
 </div>

	
	<footer>
		<div id="container">
			<center>
				<p>Copyright &copy; 2019 | Contact Us: +91 90000 00000.</p>
			</center>
		</div>
	</footer>
</body>
</html>