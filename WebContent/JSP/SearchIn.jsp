<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索入力画面</title>
</head>

<body bgproperties="scroll" background="data:image/jpeg;base64,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">
<div style="text-align:center">
<header>
<a href="http://localhost:8080/syaa/JSP/Top.jsp"> <br>
<img src="http://www.casleyconsulting.co.jp/wp-content/themes/casleyconsulting/images/header_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
	<br> 検索したい社員の名前を入力してください
	<br>
	<form method="POST" action="/syaa/servlet/SearchOutSearch">
		<input type="text" name="search">
		 <input type="submit" value="検索">
	</form>
</div>
<table align="center">
	<c:forEach var="item" items="${requestScope['list']}">
	<a href="/syaa/servlet/SearchOutPersonal/${item.id}"> <br>

<tr>
<td align="right"><a href="/syaa/servlet/SearchOutPersonal/${item.id}">${fn:escapeXml(item.name)}</a></td><td><a href="/syaa/servlet/SearchOutPersonal/${item.id}"><img src="http://localhost:8080/syaa/Pic/${item.image}" alt="" width="75"height="75" border="0" /></a></td>
</tr>

</a>
	</c:forEach>
</table>
</body>