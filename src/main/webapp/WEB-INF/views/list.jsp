<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	img{
		width: 100px;
		height: 100px;
	}
</style>
</head>
<body>
	<h1>User List</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Password</th>
            <th>File Name</th>
            <th>Image</th>
        </tr>
        <tr>
        	<c:forEach var="e" items="${listUserDTOs}">
			    <tr>
			        <td>${e.id}</td>
			        <td>${e.userName}</td>
			        <td>${e.passWord}</td>
			        <td>${e.fileName}</td>
			        <td>
					    <img src="data:image/jpeg;base64,${e.base64Image}" />
					</td>
			    </tr>
			</c:forEach>
        </tr>
    </table>
</body>
</html>