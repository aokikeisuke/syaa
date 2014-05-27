<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索入力画面</title>
<link rel="stylesheet" href="../css/text.css" type="text/css" />
</head>
<body class="background" style="text-align:center">

<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png">
</a>
</header>
	<br> 検索したい社員の名前を入力してください
	<br>
	<form method="POST" action="/syaa/servlet/SearchOutSearch">
		<input type="text" name="search">
		 <input type="submit" value="検索">
	</form>

<table align="center">
	<c:forEach var="item" items="${requestScope['list']}">

	<tr>
		<td align="right"><a href="/syaa/servlet/SearchOutPersonal/${item.id}">${fn:escapeXml(item.name)}</a></td>
		<td><a href="/syaa/servlet/SearchOutPersonal/${item.id}"><img src="/syaa/Pic/${item.image}" alt="" width="75"height="75" border="0" /></a></td>
	</tr>

	</c:forEach>
</table>
</body>
</html>