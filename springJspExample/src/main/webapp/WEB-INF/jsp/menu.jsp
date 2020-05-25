<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/springJspExample/menu.htm" method="POST">
		<div align="center">
			<table>

				<tr>
					<td></td>
					<td><a href="Addemployee.htm">ADDEMPLOYEE</a></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="Deleteemployee.htm">DELETEEMPLOYEE</a></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="EditEmployee.htm">EDITEMPLOYEE</a></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="Displayemployee.htm">DISPLAYEMPLOYEE</a></td>
				</tr>
				<tr>
					<td></td>
					<td><a href="Searchemployee.htm">SEARCHEMPLOYEE</a></td>
				</tr>
			</table>

		</div>
	</form:form>
</body>
</html>