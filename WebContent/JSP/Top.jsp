<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>トップ画面</title>
</head>

<body>

	<center>
		<form method="POST" action="http://localhost:8080/syaa/JSP/RegIn.jsp">
			<input type="submit" value="新規登録">
		</form>
		<form method="POST" action="/syaa/servlet/Top">
			<input type="submit" value="社員一覧">
		</form>
	</center>
</body>

</html>