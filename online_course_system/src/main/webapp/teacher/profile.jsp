<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
  integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
<script src="https://kit.fontawesome.com/yourcode.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.13.0/css/all.min.css">
<link href='https://unpkg.com/css.gg@2.0.0/icons/css/password.css' rel='stylesheet'>
<link rel="stylesheet" type="text/css" href="../static/Home.css">
</head>
<body>
<style>
    body {
        margin: 0;
        /* justify-content: center; */
        font-family: Arial, Helvetica, sans-serif;
       
        background-position: center;
        background-repeat: no-repeat;
        background-size: contain;
        background-position-x: right;
        height: 100%;
    }

    .topnav {
        overflow: hidden;
        background-color: #4B69D6;
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

    .a1 {
        margin-left: 30;
        float: left;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 27px;
        font-family: 'Poppins';
        font-weight: bold;
    }


    .a2 {
        margin-left: 10px;
        float: left;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 27px;
        font-family: 'Poppins';
        font-weight: bold;
    }

    .a3 {
        margin-right: 30px;
        float: right;
        color: #f2f2f2;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
        font-size: 27px;
        font-family: 'Poppins';
        font-weight: bold;
    }

    .dd {
        margin-top: 70px;
        margin-left: 50px;
    }

    .input-bx {
        position: relative;
        width: 130px;
        margin-left: 10px;
    }

    .input-bx input {
        width: 100%;
        padding: 10px;
        border: none;
        background-color: #FCF6F6;
        border-radius: 5px;
        outline: none;
        font-size: 1rem;
        transition: 0.6s;
    }

    .input-bx span {
        position: absolute;
        left: 0;
        padding: 10px;
        font-size: 1rem;
        color: #7f8fa6;
        text-transform: uppercase;
        pointer-events: none;
        transition: 0.6s;
    }

    .input-bx input:valid~span,
    .input-bx input:focus~span {
        color: #D64B4B;
        transform: translateX(10px) translateY(-7px);
        font-size: 0.65rem;
        font-weight: 600;
        padding: 0 10px;
        background: #fff;
        letter-spacing: 0.1rem;
    }

    .input-bx input:valid,
    .input-bx input:focus {
        color: #050404;
        border: 2px solid #D64B4B;

    }

    .dm {

        background-color: #FCF6F6;
        border: 1px solid;
        padding: 10px;
        box-shadow: 5px 10px 18px #c9c5c5;
        width: 900px;
        height: 70px;
        margin-top: 20px;
        margin-left: 20px;
        border-radius: 10px;
        display: flex;
    }

    .dm1 {
        background-color: #FCF6F6;
        border: 1px solid;
        padding: 10px;
        box-shadow: 5px 10px 18px #c9c5c5;
        width: 530px;
        height: 70px;
        margin-top: 20px;
        margin-left: 20px;
        border-radius: 10px;
        display: flex;
    }

    .ip {
        background-color: #FCF6F6;
        margin-left: 8px;
        border: none;

    }

    .dline {
        height: 50px;
        background-color: #050404;
        border: 0.5px solid black;
        box-shadow: 5px 10px 18px #c9c5c5;
        margin-left: 10px;
    }

    .tm {

        border: 2px solid#D64B4B;
        width: 132px;
        height: 50px;
        border-radius: 5px;

        background-color: #D64B4B;
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

    .input-bx {
        position: relative;
        width: 370px;

    }

    .input-bx input {
        width: 100%;
        padding: 10px;
        border: 1px solid #000000;
        border-radius: 5px;
        outline: none;
        font-size: 1.2rem;
        transition: 0.6s;
    }

    .input-bx textarea {
        width: 100%;
        padding: 10px;
        border: 1px solid #000000;
        border-radius: 5px;
        outline: none;
        font-size: 1.2rem;
        transition: 0.6s;
    }

    .input-bx span {
        position: absolute;
        left: 0;
        padding: 10px;
        font-size: 1rem;
        color:#4B69D6;
        text-transform: uppercase;
        pointer-events: none;
        transition: 0.6s;
    }
    .ab{
      position: absolute;
        left: 0;
        padding: 10px;
        font-size: 18px;
        color: #D64B4B;
        
        
    }
     

    .input-bx input:valid~span,
    .input-bx input:focus~span {
        color: #D64B4B;
        transform: translateX(10px) translateY(-7px);
        font-size: 0.65rem;
        font-weight: 600;
        padding: 0 10px;
        background: #fff;
        letter-spacing: 0.1rem;
    }

    .input-bx input:valid,
    .input-bx input:focus {
        color: #050404;
        border: 2px solid #D64B4B;

    }

    .input-bx textarea:valid~span,
    .input-bx textarea:focus~span {
        color: #D64B4B;
        transform: translateX(10px) translateY(-7px);
        font-size: 0.65rem;
        font-weight: 600;
        padding: 0 10px;
        background: #fff;
        letter-spacing: 0.1rem;
    }

    .input-bx textarea:valid,
    .input-bx textarea:focus {
        color: #050404;
        border: 2px solid #D64B4B;

    }
</style>
<div class="topnav" style="width: 1290px; height: 70px;">
        <a class="a1" href="/teacher/home" >Home</a>
        <a class="a2" href="/teacher/history">History</a>
        <a class="a2" href="#" style="background-color: #f2f2f2;color: black;" >Profile</a>
        <a class="a3" href="/teacher/logout">Logout</a>
    </div>

<center>
      <div class="shadow-lg p-3 mb-5 bg-white rounded"
        style="border-radius: 20px;margin-top: 20px;justify-content: center;list-style: none;display: list-item;width: 600px; height: max-content;align-items: center;">
       
        <div class="text-center">
          <img src="https://static.vecteezy.com/system/resources/previews/011/381/872/original/male-teacher-sitting-in-the-classroom-3d-character-illustration-png.png" class="rounded float-left" width="200px" alt="...">
        </div>
         <div>
          <label
            style="margin-left:13px;font-family: Poppins; color:#4B69D6;font-weight: bold;font-size: 30px;">Information</label>

        </div>
        <div style="display: flex;margin-top: 20px; margin-left: 70px;">
          <i class='fas fa-id-card' style="font-size:24px;margin-top: 8px;color:#4B69D6;"></i>
          <div class="input-bx" style="margin-left: 19px;">

              <span style="font-family: 'Poppins';font-size: large;">${teacher.name}</span>
          </div>
          </div>
          
           <div style="display: flex;margin-top: 20px; margin-left: 70px;">
          <i class='fas fa-graduation-cap' style="font-size:24px;margin-top: 8px;color: #4B69D6;"></i>
          <div class="input-bx" style="margin-left: 17px;">

              <span style="font-family: 'Poppins';font-size: large;">${teacher.qualification}</span>
          </div>
          </div>
          
          <div style="display: flex;margin-top: 20px; margin-left: 73px;margin-bottom:20px;">
            <i class='fa fa-mobile-phone' style="font-size:24px;margin-top: 8px;color: #4B69D6;"></i>
            <div class="input-bx" style="margin-left: 28px;">

                <span style="font-family: 'Poppins';font-size: large;">${teacher.mobile_no}</span>
            </div>
        </div>
</body>
</html>