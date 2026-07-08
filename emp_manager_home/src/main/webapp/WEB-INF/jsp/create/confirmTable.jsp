<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<form action="CreateDoneServlet" method="post">

<table>
	<tr>
		<th>ID</th>
		<td class="no-border"><c:out value="${emp.id}" /></td>
	</tr>
	<tr>
		<th>名前</th>
		<td class="no-border"><c:out value="${emp.name}" /></td>
	</tr>
	<tr>
		<th>年齢</th>
		<td class="no-border"><c:out value="${emp.age}" /></td>
	</tr>
</table>
	<input type="hidden" name="id" value="<c:out value="${emp.id}" />">
	<input type="hidden" name="name" value="<c:out value="${emp.name}" />">
	<input type="hidden" name="age" value="<c:out value="${emp.age}" />">
	<input type="submit" value="登録" class="btn">
	<input type="submit" value="確認にもどる" class="btn"
		formaction="CreateConfirmServlet">
</form>