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
	<form:form action="/springJspExample/Addemployee.htm" method="POST">
		<div align="center">
			<table>
				<tr>
					<td>employeeId</td>
					<td><input type="text" name="employeeid" /></td>
				</tr>
				<tr>
					<td>employeeNo</td>
					<td><input type="text" name="employeeno" /></td>
				</tr>
				<tr>
					<td>employeeName</td>
					<td><input type="text" name="employeename" /></td>
				</tr>
				<tr>
					<td>employeeSalary</td>
					<td><input type="text" name="employeesalary" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit" /></td>
				</tr>
			</table>
		</div>
	</form:form>
</body>
</html>