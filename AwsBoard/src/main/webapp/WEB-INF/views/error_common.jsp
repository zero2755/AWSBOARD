<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러페이지</title>
</head>
<body>
	<h1>${exception.getMessage() }</h1>
	
	<ul>
	<c:forEach items="${exception.getStackTrace() }" var="item">
	<li>${item.toString() }</li>
	
	</c:forEach>
	</ul>
	
</body>
</html>