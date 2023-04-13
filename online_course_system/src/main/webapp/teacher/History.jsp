<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>History of Materials</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
    <script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
    <link href='https://unpkg.com/css.gg@2.0.0/icons/css/password.css' rel='stylesheet'>

</head>
<body>
<style>
body {
    
    font-family: Arial, Helvetica, sans-serif;
 	
    background-position: center;
    background-repeat: no-repeat;
    background-size: contain;
    background-position-x: right;
    height: 100%;
   
  }
  
  .topnav {
    overflow: hidden;
    background-color:#4B69D6;
  }
/*   
  .topnav a {
    float: left;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 27px;
    font-family: 'Poppins'; 
     font-weight:bold;
  } */
  
  .topnav a:hover {
    background-color: rgb(251, 251, 251);
    color: black;
  }
  
  .topnav a.active {
    background-color: #04AA6D;
    color: white;
    border-radius: 10px;
  }

  .a1{
   margin-left: 30;
    float: left;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 27px;
    font-family: 'Poppins'; 
     font-weight:bold;
  }

  
  .a2{
    margin-left: 10px;
    float: left;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 27px;
    font-family: 'Poppins'; 
     font-weight:bold;
  }
  .a3{
    margin-right: 30px;
    float: right;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    font-size: 27px;
    font-family: 'Poppins'; 
     font-weight:bold;
  }
  .dd
  {
    margin-top: 50px;
    margin-left: 50px;
  }
  .l1{
    font-size: 24px;
    font-family: 'Poppins';
    width: fit-content;
    height: 40px;
  }
  .l2{
    font-size: 24px;
    font-family: 'Poppins';
    width: fit-content;
    margin-left: 20px;

}
.h3{
    margin-left: 10px;
}

.co input:checked ~ .check {  
  background-color: blue;  
}  
.con {
 
  position: relative;
  padding-left: 35px;
  margin-left: 35px;
   margin-top: 6px;
   margin-bottom: 0%;
  cursor: pointer;
  font-size: 22px;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}

/* Hide the browser's default radio button */
.con input {
  position: absolute;
  opacity: 0;
  cursor: pointer;
}

/* Create a custom radio button */
.checkmark {
  position: absolute;
  top: 0;
  left: 0;
  height: 25px;
  width: 25px;
  background-color: #eee;
  border-radius: 50%;
}

/* On mouse-over, add a grey background color */
.con:hover input ~ .checkmark {
  background-color: #ccc;
}

/* When the radio button is checked, add a blue background */
.con input:checked ~ .checkmark {
  background-color: #D64B4B;
}

/* Create the indicator (the dot/circle - hidden when not checked) */
.checkmark:after {
  content: "";
  position: absolute;
  display: none;
}

/* Show the indicator (dot/circle) when checked */
.con input:checked ~ .checkmark:after {
  display: block;
}

/* Style the indicator (dot/circle) */
.con .checkmark:after {
 	top: 9px;
	left: 9px;
	width: 8px;
	height: 8px;
	border-radius: 50%;
	background: white;
}


.input-bx{
    position: relative;
    width: 130px;
    margin-top: 20px;
}
.input-bx input{
    width: 100%;
    padding: 10px;
    border: 2px solid #000000;
    border-radius: 5px;
    outline: none;
    font-size: 1rem;
    transition: 0.6s;
}

.input-bx span{
    position: absolute;
    left: 0;
    padding: 10px;
    font-size: 1rem;
    color: #7f8fa6;
    text-transform: uppercase;
    pointer-events: none;
    transition: 0.6s;
}
.input-bx input:valid ~ span,
.input-bx input:focus ~ span{
    color: #D64B4B;
    transform: translateX(10px) translateY(-7px);
    font-size: 0.65rem;
    font-weight: 600;
    padding: 0 10px;
    background: #fff;
    letter-spacing: 0.1rem;
}

.input-bx input:valid,
.input-bx input:focus{
    color: #050404;
    border: 2px solid #D64B4B;

}
.tm{
  display: flex; 
  border:2px solid#4B69D6;
  width: 100px;
  height: 50px;
  border-radius: 5px;
  margin-top: 20px;
  background-color:#4B69D6; 
  border: none;
  color: white;
  padding: 10px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 20px;
  font-family: 'Poppins';
  font-weight: bold;
}
</style>
<div class="topnav" style="width: 1290px; height: 70px;">
        <a class="a1" href="/teacher/home" >Home</a>
        <a class="a2" href="#" style="background-color: #f2f2f2;color: black;">History</a>
        <a class="a2" href="/teacher/profile" >Profile</a>
        <a class="a3" href="/teacher/logout">Logout</a>
    </div>
    
    
        <c:choose>
       
		<c:when test="${materials != null}">
		<center>
		<table class="table table-striped" style="align:center; margin-top: 80px ;margin-right: 10px;width:900px">
        <tr>
            <th style=" background-color: #4B69D6;
                font-family: 'Poppins';color:#f2f2f2">Material Name</th>
            <th style=" background-color:#4B69D6;
                font-family: 'Poppins';color:#f2f2f2; text-align: center;">Link</th>
   
            <th style=" background-color:#4B69D6;
                font-family: 'Poppins';color:#f2f2f2;text-align:center;" >Action</th>

        </tr>
        <c:forEach var="t" items="${materials}">
			<tr>
							<td style="text-align: center;"> ${t.materialName}</td>
							<td>${t.link}</td>
							 <td style="font-family: Poppins;color: #f2f2f2;"><a
                        href="delete/${t.id}" class="btn btn-danger" style=" text-decoration: none;margin-left:14px;"
                        class="link-light">Delete</a></td>
			</tr>
		</c:forEach>
		</table>
		</center>
		
		</c:when>
	</c:choose>
    
    
</body>
</html>