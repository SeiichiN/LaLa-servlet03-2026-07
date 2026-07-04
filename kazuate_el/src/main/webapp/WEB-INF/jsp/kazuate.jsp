<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>数あてゲーム</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<jsp:include page="header.jsp" />
	<main>
		<form action="Kazuate" method="post">
			1～99を入力:<br>
			<input type="text" name="kazu"><br>
			<input type="submit" value="送信">
		</form>
		<c:if test="${not empty com.msg}">
			<p><c:out value="${com.msg}"/></p>
		</c:if>
		<p><a href="Kazuate">新しくゲームを始める</a></p>
	</main>
	<jsp:include page="footer.jsp" />
</body>
</html>