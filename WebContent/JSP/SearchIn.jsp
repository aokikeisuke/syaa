<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索入力画面</title>
</head>

<body background="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTdx6DnOZp8JyO9MFqozKmDDvmbR6JY7qnq6kzNQjxVu8IiKOc_NA">
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