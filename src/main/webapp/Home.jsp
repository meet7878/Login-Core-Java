<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%  String firstName = (String) request.getAttribute("firstNamevalue");
    String lastName = (String) request.getAttribute("lastNamevalue");
    String email = (String) request.getAttribute("emailValue");
    String gender = (String) request.getAttribute("genderValue");
   String password = (String) request.getAttribute("password");
  
    

%>

firstName:
<%= firstName   %><br>

lastName:
<%=lastName %><br>

email:
<%=email %><br>

gender :
<%=gender %>

password:
<%=password %><br>


</body>
</html>