<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Employee Id</th>
			<th>Employee No</th>
			<th>Employee Name</th>
			<th>Employee Salary</th>
		</tr>


		<c:forEach items="${list}" var="emp" >
		
			<tr>
				<td>${emp.employeeid}</td>
				<td>${emp.employeeno}</td>
				<td>${emp.employeename}</td>
				<td>${emp.employeesalary}</td>

			</tr>

		</c:forEach>
	</table>
	<a href="menu.htm">Menu</a>
</body>
</html>