<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example of JSP file</title>
</head>
<body>
<form action="/login" method="post">
	<label>ID: </label>
    	<input type="text" name="id"><br/>
    <label>Password: </label>
    <input type="password" name="password">
    <br/>
    <button>Submit</button><a href="/save">Or sign up</a>
</form>
</body>
</html>