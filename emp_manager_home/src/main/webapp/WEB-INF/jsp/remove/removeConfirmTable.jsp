<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<table>
	<tr>
		<th>ID</th>
		<td><c:out value="${emp.id}" /></td>
	</tr>
	<tr>
		<th>名前</th>
		<td><c:out value="${emp.name}" /></td>
	</tr>
	<tr>
		<th>年齢</th>
		<td><c:out value="${emp.age}" /></td>
	</tr>
</table>
<form action="RemoveDoneServlet" method="post">
	<input type="hidden" name="id" value="<c:out value="${emp.id}" />">
	<input type="submit" value="削除" class="btn">
	<input type="submit" value="一覧に戻る" class="btn"
		formaction="list" formmethod="get">
</form>