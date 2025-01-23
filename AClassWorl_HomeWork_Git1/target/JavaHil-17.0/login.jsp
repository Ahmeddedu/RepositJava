<%@ page language="java" contentType="text/html; charset=Windows-1251" pageEncoding="Windows-1251"%>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Form</h2>
    <form action="login" method="post">
        <label for="login">Login:</label>
        <input type="text" id="login" name="login" required /><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required /><br><br>

        <input type="submit" value="Login" />
    </form>
</body>
</html>
