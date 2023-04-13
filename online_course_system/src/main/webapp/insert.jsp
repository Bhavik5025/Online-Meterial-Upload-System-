<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DeshBoard</title>
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
                color: #D64B4B;
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
                border: 2px solid #4B69D6;

            }
            .tm{
  display: flex; 
  border:2px solid #4B69D6 ;
  width: 200px;
  height: 50px;
  border-radius: 5px;
  margin-left:20px;
  background-color: #4B69D6; 
  border: none;
  color: white;
  padding: 10px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  font-family: 'Poppins';
  font-weight: bold;
}
            
        </style>
<center>
    <div class="shadow-lg p-3 mb-5 bg-white rounded"
            style="border-radius: 20px;margin-left: 40px;margin-top: 100px;justify-content: center;list-style: none;display: list-item;width: 600px; height: max-content;align-items: center;">

            <div>
                <label
                    style="margin-top: 30px;font-family: Poppins; color: #4B69D6;font-weight: bold;font-size: 30px;">Welcome
                    </label>

            </div>
            
            <div style="display: flex;margin-top: 20px;margin-bottom:30px;">
                    <a href="/admin/login"  class="tm" >Admin</a>
                    <a href="/student/login" class="tm">Student</a>
                	<a href="/teacher/login" class="tm" style="margin-right:20px;">Teacher</a>
                </div>
</div>

</form>
</body>
</html>