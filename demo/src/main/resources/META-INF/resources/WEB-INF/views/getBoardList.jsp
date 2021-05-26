<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 목록</title>
<!-- Google Fonts -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,300italic,700,700italic">

<!-- CSS Reset -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.css">

<!-- Milligram CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">
<style>
	body {
		width: 700px;
		margin: 0 auto;
	}

</style>

</head>
<body>
	<h1>게시글 목록</h1>
	<form action='getBoardList.do' method='post'>
		<select name = 'searchCondition'>
			<option value='title'>제목</option>
			<option value='content'>내용</option>
			<option value='writer'>작성자</option>
		</select>
	
	<input type='text' name='searchKeyword'/>
	<input type='submit' value='검색'/>
	</form>
		
	<table border="1">
			<tr>
				<th bgcolor="white" width="100">번호</th>
				<th bgcolor="white" width="200">제목</th>
				<th bgcolor="white" width="150">작성자</th>
				<th bgcolor="white" width="150">등록일</th>
				<th bgcolor="white" width="100">조회수</th>
			</tr>
			<c:forEach items="${boardList }" var="board">
				<tr>
					<td>${board.board_no }</td>
					<td align="left"><a href="getBoard.do?boardNo=${board.board_no }&title=${board.title }&content=${board.content }">
							${board.title }</a></td>
					<td>${board.writer }</td>
					<%--<!-- <td><fmt:formatDate value="${board.regDate }" pattern="yyyy-MM-dd"/></td> -->
					<!-- <td>${board.cnt }</td> --> --%>
				</tr>
			</c:forEach>
		</table>
		<br> <a href="insertBoard.do">새글 등록</a>
</body>
</html>