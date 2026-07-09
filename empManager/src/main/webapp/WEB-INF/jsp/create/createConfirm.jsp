<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員管理システム</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<jsp:include page="../common/header.jsp" />
	
	<div class="container">
		<main>
			<h2>新規社員登録・確認</h2>
				<table>
					<tr>
						<th>ID</th>
						<td><c:out value-"${emp.id}" /></td>
					</tr>
					<tr>
						<th>名前</th>
						<td><c:out value="${emp.name}" /></td>
					</tr>
						<th>年齢</th>
						<td><c:out value="${emp.age}" /></td>
					<tr>
				</table>
			<form action="CreateDoneServlet" method="post">
				<input type="submit" value="登録" class="btn">
				<input type="submit" value="入力に戻る" class="btn"
				       formaction=""> 
			</form>
		</main>
		<jsp:include page="../common/aside.jsp" />
	</div>
	
	<jsp:include page="../common/footer.jsp" />
</body>
</html>