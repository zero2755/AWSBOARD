<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원정보수정</title>
</head>
<body>
	<h1>사원정보수정한다</h1>
	<form action="<c:url value='/board/update'/>" method="post">

		<table border="1">
			
				
				<td><input type="text" name="boardNum" value="${boardNum}">
			보드번호 ${boardNum }의 수정 <br>
			<tr>
				<th>글쓴이</th>
				<td><input type="text" name="writer" required>글쓴이</td>
			</tr>
			<tr>
				<th>내용</th>
				<td><input type="text" name="boardContent">내용</td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title">제목</td>
			</tr>
			
			
			<tr>
				<th>&nbsp;</th>
				<td><input type="submit" value="수정하기"> <input
					type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>

