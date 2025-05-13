<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
        }
        .container {
            width: 400px;
            margin: 80px auto;
            padding: 30px;
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 10px #aaa;
        }
        h2 {
            text-align: center;
            margin-bottom: 25px;
        }
        input, select {
            width: 100%;
            padding: 10px;
            margin-top: 8px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .btn {
            width: 100%;
            padding: 10px;
            background: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 16px;
        }
        .btn:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>
	<div class="container">
        <h2>User Login</h2>
        <form action="/authenticate" method="get">
               	
            <label for="username">UserName</label>
            <input type="text" name="userName" id="userName" required>

            <label for="password">Password</label>
            <input type="password" name="password" id="password" required>
			<h5 center>New User ? <a href="/Registration">Register Now</a> </h5>

            <button type="submit" class="btn">Login</button>
        </form>
    </div>
</body>
</html>