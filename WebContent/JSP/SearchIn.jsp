<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索入力画面</title>
</head>

<body>
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


	<c:forEach var="item" items="${requestScope['list']}">

		<a href="/syaa/servlet/SearchOutPersonal/${item.id}"> <br>
		<li>${fn:escapeXml(item.name)}</li>
		</a>
		<a href="/syaa/servlet/SearchOutPersonal/${item.id}"> 
		<img src="http://localhost:8080/syaa/WebContent/WEB-INF/Pic/${item.image}" alt="" width="100"height="100" border="0" />
		</a>

		<!-- 
写真のURL指定の仕方を要確認。「+」が必要なのか。。。？
 -->

	</c:forEach>

</body>