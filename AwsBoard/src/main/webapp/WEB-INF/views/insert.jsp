
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>새 게시판 생성</title>
</head>
<body>
	<h1>게시판정보입력</h1>
	<form action="./insert" method="post">
		<table border="1">
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
				<td><input type="submit" value="저장"> <input
					type="reset" value="취소"></td>
					
					<input type="hidden" name="boardNum" value="0">
			</tr>
		</table>
	</form>
</body>
</html>

