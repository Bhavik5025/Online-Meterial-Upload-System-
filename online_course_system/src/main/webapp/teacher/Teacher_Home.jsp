<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teacher Home</title>
    <link rel="stylesheet" type="text/css" href="../static/Home.css">
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
    body {
                margin: 0;

                font-family: Arial, Helvetica, sans-serif;
				background-image: url('https://drive.google.com/file/d/1f-QME_twDb8F65VEVlqlqN6Qk8NtuiW2/view?usp=share_link');
                background-position: center;
                background-repeat: no-repeat;
                background-size: contain;
                background-position-x: right;
                height: 100%;

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
                color: #4B69D6;
                text-transform: uppercase;
                pointer-events: none;
                transition: 0.6s;
            }

            .input-bx input:valid~span,
            .input-bx input:focus~span {
                color: #4B69D6;
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
                border: 2px solid #4B69D6;

            }

            .input-bx textarea:valid~span,
            .input-bx textarea:focus~span {
                color: #4B69D6;
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
                border: 2px solid #4B69D6;

            }
</style>
<script type="text/javascript">
	if("${message}")
		{
		alert("${message}")
			
		}
	</script>
<div class="topnav" style="width: 1290px; height: 70px;">
        <a class="a1" href="#" style="background-color: #f2f2f2;color: black;">Home</a>
        <a class="a2" href="history" >History</a>
        <a class="a2" href="/teacher/profile" >Profile</a>
        <a class="a3" href="/teacher/logout">Logout</a>
    </div>
     <center>
    <div class="shadow-lg p-3 mb-5 bg-white rounded"
            style="border-radius: 20px;margin-left: 40px;margin-top: 100px;justify-content: center;list-style: none;display: list-item;width: 600px; height: max-content;align-items: center;">

            <div>
                <label
                    style="margin-top: 30px;font-family: Poppins; color: #4B69D6;font-weight: bold;font-size: 30px;">Add Meterial</label>

            </div>
     <form action="store_material" method="POST">
      <div style="display: flex;margin-top: 20px; margin-left: 70px;">
                    <i class="fas fa-book-open" style="font-size:24px;margin-top: 8px;color:#4B69D6;"></i>
                    <div class="input-bx" style="margin-left: 19px;">
                        <input type="text"  name="material_name" required />
                        <span style="font-family: 'Poppins';">Material Name</span>
                    </div>
                </div>
	
	 <div style="display: flex;margin-top: 20px; margin-left: 75px;">
                    <i class="fas fa-file" autocomplete="current-password"
                        style="font-size:24px;margin-top: 8px;color:#4B69D6;"></i>
                    <div class="input-bx" style="margin-left: 22px;">
                        <input type="text" name="link" required />
                        <span style="font-family: 'Poppins';">Material Link</span>
                    </div>
                </div>

		
<div>
                    <div class="d-flex justify-content-center" style="margin-bottom:30px;">
                        <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body"
                            style="width: 100px;margin-top: 20px; background-color:#4B69D6; font-family: Poppins; font-weight: bold;color: #fff;"><label
                                style="color: #fff;">Add</label></button>
                        <!-- <button type="submit"
                          class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" style="width: 100px;margin-left: 46px;margin-top: 20px; background-color: #D64B4B; font-family: Poppins; font-weight: bold; font-color:white"><label style="color: #fff;">Login</label></button> -->
                    </div>
			
                </div>

            </form>

        </div>
    
 </center>
</body>
</html>