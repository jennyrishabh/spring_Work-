<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@ taglib prefix="mo" uri="http://www.springframework.org/tags/form"  %>    
    
<!DOCTYPE html>
<html>
<head>

<link href="resources/css/first.css" rel="stylesheet">



<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>hello enter details as per your best..</h3><br>
<mo:form action="fortest" method="post" modelAttribute="model123">
<mo:input path="userId" placeholder="enter user name"/>
<mo:input path="pwd" placeholder="enter user pass"/>
<!-- 

we can also do this by hiding the password from the user using "*" sign
<mo:password path="pwd" placeholder="enter user pass"/>

 -->

<br>what's ur interest : 
<label for="Bird watching">Bird watching: </label>
<mo:checkbox path="hobby" id="Bird watching" value="Bird watching"/>
<label for="Astronomy">Astronomy: </label>
<mo:checkbox path="hobby" id="Astronomy" value="Astronomy"/>
<label for="Snowboarding">Snowboarding:</label>
 <mo:checkbox path="hobby" id="Snowboarding" value="Snowboarding"/><br>
<br>sex:(note here i have used label tag for better interaction)<br>
<label for="male">Male:</label>
 <mo:radiobutton path="sex"  id="male" value="Male"/>
<label for="female">Female:</label>
 <mo:radiobutton path="sex" id="female" value="Female"/><br>

<mo:button>login</mo:button>
</mo:form>


<br><br><br><br>
//Rishabh  Jain<br>
//19CSU247
</body>
</html>