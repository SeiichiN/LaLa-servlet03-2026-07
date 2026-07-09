<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<form action="UpdateDoneServlet" method="post">
<table>
	<tr>
		<th>ID</th>
		<td><c:out value="${emp.id}" /></td>
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
	<input type="hidden" name="id" value="<c:out value="${emp.id}" />">
	<input type="submit" value="登録" class="btn">
	<input type="submit" value="編集に戻る" class="btn"
		formaction="UpdateServlet" formmethod="post">
</form>