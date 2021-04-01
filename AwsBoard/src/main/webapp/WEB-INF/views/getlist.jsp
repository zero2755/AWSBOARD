<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판리스트</title>
</head>
<body>
	<h1>게시판리스트</h1>
	<a href="<c:url value='/insert'/>">새 게시물 입력</a>

	<table border="1">
		<tr>
			<th>게시판번호</th>
			<th>글쓴이</th>
			<th>보드내용</th>
			<th>글제목</th>
			
		</tr>
		<c:forEach var="board" items="${List}">
			<tr>
				
				<td><a href="<c:url value='/getBoard/${board.boardNum}'/>">${board.boardNum}</a>
						</td>
				<td>${board.writer}</td>
				<td>${board.boardContent}</td>
				<td>${board.title}</td>
				
				
				 
			</tr>
		</c:forEach>
		
		<tr>
				<td><a href="<c:url value='/getlist?page=1'/>">페이지1보기</a></td>
				
				
				 
			</tr>
	</table>
	
			
			

</body>
</html>