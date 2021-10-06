<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write.jsp</title>
</head>
<body>
	
	<h1>Board</h1>
	<table>
		<tr>
			<td>페이지</td>
			<td>${page}</td>
		</tr>
		<tr>
			<td>글제목</td>
			<td>${title}</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>${writer}</td>
		</tr>
	</table>
	<a href="list.do">목록</a>
	<a href="board.do">등록</a>
</body>
</html>