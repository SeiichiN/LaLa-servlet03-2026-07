<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
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
			<h2>社員情報編集・確認</h2>
			<jsp:include page="updateConfirmTable.jsp" />
		</main>
		<jsp:include page="../common/aside.jsp" />
	</div>		
	<jsp:include page="../common/footer.jsp" />
</body>
</html>