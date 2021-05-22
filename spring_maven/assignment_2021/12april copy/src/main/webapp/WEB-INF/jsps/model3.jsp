<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
        
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
            
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="resources/css/second.css" rel="stylesheet">

<title>test_model</title>
</head>
<body>


<c:out value="${model123.userId}"></c:out>
<c:out value="${model123.pwd}"></c:out>



<c:out value="${model123.CCode}"></c:out>
<c:out value="${model123.phoneno}"></c:out>



</body>
</html>