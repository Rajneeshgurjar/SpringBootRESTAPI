<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
<style>
/* Navbar container */
.navbar {
	background-color: #333;
	overflow: hidden;
	font-family: Arial, sans-serif;
}

/* Links inside the navbar */
.navbar a {
	float: left;
	display: block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 20px;
	text-decoration: none;
}

/* Change color on hover */
.navbar a:hover {
	background-color: #575757;
	color: white;
}

/* Right aligned link */
.navbar a.right {
	float: right;
}

table, th, td {
	border: 1px solid white;
	border-collapse: collapse;
}

th, td {
	background-color: #96D4D4;
}
</style>
</head>
<body>
	<div class="navbar">
		<a href="/home">Home</a> <a href="/about">About</a> <a
			href="/services">Services</a> <a href="/contact">Contact</a> <a
			href="/login" class="right">Login</a>
	</div>
	<h1>Welcome ${name}!</h1>
	<div>
		<table>
			<tr>
				<td>Id</td>
				<td>${id}</td>
			</tr>
			<tr>
				<td>Name</td>
				<td>${name}</td>
			</tr>
			<tr>
				<td>UserName</td>
				<td>${userName}</td>
			</tr>
			<tr>
				<td>Password</td>
				<td>${password}</td>
			</tr>
		</table>

	</div>

</body>
</html>