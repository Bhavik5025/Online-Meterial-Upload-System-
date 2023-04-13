<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
    <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
    <link href='https://unpkg.com/css.gg@2.0.0/icons/css/password.css' rel='stylesheet'>
    <link rel="stylesheet" type="text/css" href="../static/Home.css">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="get" action="store_admin_data">
Name:-<input type="text" name="name" required><br>
Mobile no.<input type="tel" pattern="[789][0-9]{9}" name="mobile"><br>
Password:-<input type="text" name="password"><br>
<Button type="submit">Register</Button>
</form>
</body>
</html>