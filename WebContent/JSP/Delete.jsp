<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>削除画面</title>
</head>

<body>
<div style="text-align:center">
		データを削除しますか？<br />
		<form method="POST" action="/syaa/Delete">
			 <input type="submit" value="はい">
		</form>
		<form method="POST" action="/syaa/Edit">
			 <input type="submit" value="いいえ">
		</form>
</div>
</body>

</html>