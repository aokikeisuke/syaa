<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>ログイン画面</title>
</head>

<body>

	<center>
		私たちのチームの名前は？<br />
		<form method="POST" action="/servlet/Login.java">
			<input type="text" name="answer" /> <input type="submit" value="ログイン">

		</form>
	</center>
</body>

</html>