<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="performupdate" method="get">
name:-<input type="text" name="name" value="${name}">
<br>age:-<input type="number" name="age" value="${age}">
<input type="hidden" name="id" value="${id}">
<button type="submit">update</button>
</form>
</body>
</html>