<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>firstname</h1>
<h2>  <%=request.getAttribute("firstname") %></h2>
   <h1>lastname</h1>
 <h2> <%=request.getAttribute("lastname") %></h2>

</body>
</html>