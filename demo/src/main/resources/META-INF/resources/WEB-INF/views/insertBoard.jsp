<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>새글등록</title>
<!-- Google Fonts -->
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,300italic,700,700italic">

<!-- CSS Reset -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.css">

<!-- Milligram CSS -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/milligram/1.4.1/milligram.css">

<!-- You should properly set the path from the main file. -->
<style>
	body {
		width: 700px;
		margin: 0 auto;
	}
</style>



</head>
<body>
		<h1>글 등록</h1>		
		<hr>
		<form action="saveBoard.do" method="post"> <!--  enctype="multipart/form-data" -->
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td width="70">제목</td>
					<td align="left"><input type="text" name="title"/></td>
				</tr>
				<tr>
					<td >작성자</td>
					<td align="left"><input type="text" size="10" name="writer" /></td>
				</tr>
				<tr>
					<td >내용</td>
					<td align="left"><textarea cols="40" rows="10" name="content"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"	value=" 새글 등록 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getBoardList.do">글 목록 가기</a>
</body>
</html>