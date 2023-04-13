<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
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

<center>
    <div class="shadow-lg p-3 mb-5 bg-white rounded"
            style="border-radius: 20px;margin-left: 40px;margin-top: 100px;justify-content: center;list-style: none;display: list-item;width: 600px; height: max-content;align-items: center;">

            <div>
                <label
                    style="margin-top: 30px;font-family: Poppins; color: #4B69D6;font-weight: bold;font-size: 30px;">Sign
                    Up</label>

            </div>
<form method="get" action="store_student_data">
 <div style="display: flex;margin-top: 20px; margin-left: 70px;">
                    <i class="fas fa-id-card" style="font-size:24px;margin-top: 8px;color:#4B69D6;"></i>
                    <div class="input-bx" style="margin-left: 19px;">
                        <input type="text" name="name" required />
                        <span style="font-family: 'Poppins';">Name</span>
                    </div>
                </div>
	 <div style="display: flex;margin-top: 20px; margin-left: 80px;">
                    <i class="fa fa-mobile-phone" style="font-size:24px;margin-top: 8px;color: #4B69D6;"></i>
                    <div class="input-bx" style="margin-left: 19px;">
                        <input type="tel"  pattern="[789][0-9]{9}" name="mobile" required />
                        <span style="font-family: 'Poppins';">Mobile_no</span>
                    </div>
                </div>
                
                <div style="display: flex;margin-top: 20px; margin-left: 70px;">
                    <i class="fas fa-id-card" style="font-size:24px;margin-top: 8px;color: #4B69D6;"></i>
                    <div class="input-bx" style="margin-left: 19px;">
                        <input type="text" name="age" required />
                        <span style="font-family: 'Poppins';">Age</span>
                    </div>
                </div>
                
	 <div style="display: flex;margin-top: 20px; margin-left: 70px;">
                    <i class="gg-password" autocomplete="current-password"
                        style="font-size:24px;margin-top: 8px;color: #4B69D6;"></i>
                    <div class="input-bx" style="margin-left: 15px;">
                        <input type="password" name="password" required />
                        <span style="font-family: 'Poppins';">Password</span>
                    </div>
                </div>


<div>
                    <div class="d-flex justify-content-center">
                        <button type="submit" class="btn btn-success btn-block btn-lg gradient-custom-4 text-body"
                            style="width: 100px;margin-top: 20px; background-color:#4B69D6; font-family: Poppins; font-weight: bold;color: #fff;"><label
                                style="color: #fff;">Register</label></button>
                        <!-- <button type="submit"
                          class="btn btn-success btn-block btn-lg gradient-custom-4 text-body" style="width: 100px;margin-left: 46px;margin-top: 20px; background-color: #D64B4B; font-family: Poppins; font-weight: bold; font-color:white"><label style="color: #fff;">Login</label></button> -->
                    </div>
			 <div style="margin-top: 10px;">
                        <p class="text-center text-muted mt-5 mb-0">If you are Already User? Here   <a href="/student/login" class="fw-bold text-body"><u
                                    style="font-family: Poppins; color: #4B69D6;font-weight: bold;">Login</u></a>
                        </p>
 			</div>
                </div>

</form>
  </div>
    
 </center>

<a href="">Login</a>
</body>
</html>