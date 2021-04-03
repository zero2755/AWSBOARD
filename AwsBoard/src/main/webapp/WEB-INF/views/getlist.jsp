<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/include/staticFiles.jsp" />
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LogisALL</title>
</head>
<body>
	
	
	<h1>LogisALL</h1>
	<jsp:include page="/WEB-INF/views/include/bodyHeader.jsp" />
	<a href="<c:url value='/insert'/>">새 게시물 입력</a>

	<table border="1" bordercolor="blue" width ="500" height="300" align = "center" >
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
		
		 
	</table>
	
	
	 		
			
			<table border="1" bordercolor="blue" width ="500" height="50" align = "center" >
				<c:if test="${pageHandler.prev}">
					<td><a href="<c:url value='/getlist?page=${pageHandler.startPage-1}'/>">prev</a></td>
				</c:if>
				
				
				
				<c:forEach begin="${pageHandler.startPage }" end="${pageHandler.endPage }" var="idx">
				 <td>
					<a href="<c:url value='/getlist?page=${idx}'/>">${idx}page</a>
				 </td>
				</c:forEach>
				
					
			
				
				<c:if test="${pageHandler.next}">
					<td><a href="<c:url value='/getlist?page=${pageHandler.endPage+1}'/>">next</a></td>
				</c:if>
				
			</table>
			
				<jsp:include page="/WEB-INF/views/include/footer.jsp" />

</body>
</html>