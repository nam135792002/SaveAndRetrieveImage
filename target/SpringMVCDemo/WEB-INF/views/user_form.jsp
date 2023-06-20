<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<h1>User Register</h1>
	<form action="save" method="post" enctype="multipart/form-data">
	  <div class="mb-3 mt-3">
	    <label for="userName" class="form-label">Username:</label>
	    <input type="text" class="form-control" id="username" placeholder="Enter username" name="userName">
	  </div>
	  <div class="mb-3">
	    <label for="passWord" class="form-label">Password:</label>
	    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="passWord">
	  </div>
	  <div class="mb-3">
		<label for="fileUpload" class="form-label">Upload:</label>
	    <input type="file" class="form-control" id="fileUpload" name="fileUpload">
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>