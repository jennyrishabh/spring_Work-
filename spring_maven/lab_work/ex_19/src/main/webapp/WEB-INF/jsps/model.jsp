<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    
    
<%@ taglib prefix="mo" uri="http://www.springframework.org/tags/form"  %>    



<html>
<head>

<link href="resources/css/myFirst.css" rel="stylesheet">


</head>
<body>

 
 <h3>hello enter ur usernme ; pwd..</h3><br>
<mo:form action="fortest" method="post" modelAttribute="model123">
<mo:input path="userId" placeholder="enter user name"/>
<mo:input path="pwd" placeholder="enter user pass"/>
<mo:button>login</mo:button>
</mo:form>



</body>
</html>