<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<table>
	<tr>
		<th>ID</th>
		<th>名前</th>
		<th>年齢</th>
		<th class="no-border no-bkcolor"></th>
		<th class="no-border no-bkcolor"></th>
	</tr>
	<c:forEach items="${empList}" var="emp">
		<tr>	
			<td><c:out value="${emp.id}" /></td>
			<td><c:out value="${emp.name}" /></td>
			<td><c:out value="${emp.age}" /></td>
			<td class="no-border">
				<form action="UpdateServlet" method="post">
					<input type="hidden" name="id" value="<c:out value="${emp.id}" />">
					<input type="submit" value="更新" class="btn">
				</form>
			</td>
			<td class="no-border">
				<form action="RemoveServlet" method="post">
					<input type="hidden" name="id" value="<c:out value="${emp.id}" />">
					<input type="submit" value="削除" class="btn">
				</form>
			</td>
		</tr>
	</c:forEach>
</table>