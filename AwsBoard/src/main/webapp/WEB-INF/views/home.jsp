<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
	<title>Home</title>
</head>
<body>
<form action="getlist" method="post"></form>
<h1>
	Hello world!
		
			<tr>
				<td><a href="<c:url value='/getlist?page=2'/>">페이지2보기</a></td>
				
				
				 
			</tr>
		
	
	
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
