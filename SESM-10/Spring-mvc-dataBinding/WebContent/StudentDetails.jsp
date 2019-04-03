<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>student detials</h2>

	<h3><table>
		<tr>
			<th> first name</th>
			<td> ${student.fname }</td>
		</tr>
		<tr>
			<th>last name</th>
			<td>${student.lname }</td>
		</tr>
		<tr>
			<th>roll no</th>
			<td>${student.rollNO} </td>
		</tr>
		<tr>
			<th>mobile No</th>
			<td>${student.mobileNo} </td>
		</tr>
		
	</table></h3>

</body>
</html>