<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>年齢を求める</h1>
	<form action="PersonServlet" method="post">
		名前：<input type="text" name="name"><br>
		誕生日：<input type="text" name="birthday"
		              placeholder="0000/00/00"><br>
		<input type="submit" value="送信">
	</form>
	<hr>
	<p>名前：${person.name}</p>
	<p>年齢：${person.age}歳</p>
</body>
</html>