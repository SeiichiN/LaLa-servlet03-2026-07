<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<c:forEach items="${errors}" var="error">
	<p class="error"><c:out value="${error}" /></p>	
</c:forEach>

<form action="CreateConfirmServlet" method="post">
<table>
	<tr>
		<th>ID</th>
		<td><input type="text" name="id"
			value="<c:out value="${emp.id}" />"></td>
	</tr>
	<tr>
		<th>名前</th>
		<td><input type="text" name="name"
			value="<c:out value="${emp.name}" />"></td>
	</tr>
	<tr>
		<th>年齢</th>
		<td><input type="text" name="age"
			value="<c:out value="${emp.age}" />"></td>
	</tr>
</table>
	<input type="submit" value="確認" class="btn">
	<input type="submit" value="キャンセル" class="btn"
		formaction="list" formmethod="get">
</form>