<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Salary</th>
		<th>Designation</th>
	</tr>

	<c:forEach var="emp" items="${allEmployee}">
		<tr>
			<td>${emp.id}</td>
			<td>${emp.employeeName}</td>
			<td>${emp.employeeSalary}</td>
			<td>${emp.employeeDesignation}</td>
		</tr>
	</c:forEach>
</table>
<br>
<a href="empform">Add Employee</a>  