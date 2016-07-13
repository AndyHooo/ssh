<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页面</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/user/user_reg.action" method="post">
		userName:<input type="text" name="userName"><br>
		pass:<input type="text" name="pass"><br>
		<input type="submit" value="注册">
	</form>
</body>
</html>