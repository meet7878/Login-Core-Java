<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>	
<body>
<%
String genderError = (String) request.getAttribute("genderError");
String genderValue = (String) request.getAttribute("genderValue");

%>

<h2>signup</h2>

<form method="post" action="Signupcontroller">

 firstName<input type="text" name="firstName" value="${firstNamevalue}"/>${firstNameError}  <br>
 lasttName<input type="text" name="lastName" value="${lastNamevalue}"/>${lastNameError}  <br>
  Email<input type="text" name="email"value="${emailValue}"/>${emailError}<br>
    password<input type="password" name="password" ><br>
    gender : Male<input type="radio" name="gender" value="male" <%=genderValue!=null&&genderValue.equals("male")?"checked":"" %> />
    female :<input type="radio" name="gender" value = "female"<%=genderValue!=null&&genderValue.equals("female")?"checked":"" %>/><br>
    
    <input type="submit" value="signup"><br>
    
  
 
</form>
</body>
</html>