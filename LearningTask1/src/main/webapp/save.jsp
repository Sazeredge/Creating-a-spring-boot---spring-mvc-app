<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Example of JSP file</title>
</head>
<body>
<form action="/save" method="post">
	<label>Name </label>
    <input type="text" name="name"><br/>
    <label>Email </label>
    <input type="text" name="email"><br/>
    <label>Username </label>
    <input type="text" name="username"><br/>
    <label>Password: </label>
    <input type="password" name="password"><br/>
    <button>Submit</button>
</form>
</body>
</html>