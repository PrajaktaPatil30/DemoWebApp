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

	<div class="container">
		<div id="content">
			<div id="banner-image">
				<div id="inner-banner-image">
					<div id="banner_content">
						<h2>Register</h2>
						<p>${error}</p>
						<form action="adduser">
							<table>
								<tr>
									<td>User Id:</td>
									<td><input type="text" name="UserId"></td>
								</tr>
								<tr>
									<td>Password:</td>
									<td><input type="password" name="Password"></td>
								</tr>
								<tr>
									<td>User name:</td>
									<td><input type="text" name="UserName"></td>
								</tr>
								<tr>
									<td>Organization:</td>
									<td><input type="text" name="Organization"></td>
								</tr>
								<tr>
									<td>City:</td>
									<td><input type="text" name="City"></td>
								</tr>
								<tr>
									<td>Contact Number:</td>
									<td><input type="text" name="ContactNum"></td>
								</tr>
								<tr>
									<td></td>
									<td><input type="submit"></td>
								</tr>
								<tr>
									<td></td>
									<td><a href="/forget_password" style="color: whitesmoke;">Forget
											password ?</a></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
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