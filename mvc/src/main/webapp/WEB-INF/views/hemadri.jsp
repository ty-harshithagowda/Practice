<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ApplicationForm</title>
    <style>
        body {
            background-size: 20%;
            background-color: blueviolet;
        }

        .div1 {
            background-color: coral;
        }
        .headdiv {
            background-color: dimgray;
        }
    </style>
</head>
<!--&nbsp makes a space-->
<!--&ensp makes two spaces-->
<!--&emsp makes four spaces-->

<body>
    <div class="col-sm-4">
        <h1 style="text-align: center;">Bharath Company Reqirement form</h1>
    </div>
    <form action="./login" method="post">
        <div class="div1" style="text-align: center;"><b>First Name :</b> <input type="text" name="firstname" value="">
            
            <b>Last Name: </b><input " type=" text" name="lastname" value="">
            <br>
            
        </div>
      
       
        <div style="text-align: center;">
            <button type="submit">Sumbit</button>
        </div>
    </form>
    <div></div>
</body>