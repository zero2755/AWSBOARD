<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>N번 보드 정보</title>
</head>
<body>
<form  method="get">

 
	<!-- ${board.toString()} --> 
	보드번호 : ${board.boardNum }
	<br>
	글쓴이 : ${board.writer }
	<br>
	내용 : ${board.boardContent }
	
	
	<a href="<c:url value='/update/${board.boardNum}'/>">${board.boardNum}의 내용수정하기</a>
	<a href="<c:url value='/deleteBoard/${board.boardNum}'/>">보드번호 ${board.boardNum}의 게시글삭제하기</a>
	
</form>
</body>
</html>