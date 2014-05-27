<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索入力画面</title>
</head>
<body class="background" style="text-align:center">
<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png">
</a>
</header>
<br>
検索したい社員の名前を入力してください
<br>
<form method="POST" action="/syaa/servlet/SearchOutSearch">
	<input type="text" name = "search"  value = "${requestScope['keyWord']}">
	<input type="submit" value="検索">
</form>
検索結果は ${requestScope['objNum']}件です
<c:forEach var="item" items="${requestScope['list']}">

<a href = "/syaa/servlet/SearchOutPersonal/${item.id}">
<li>${fn:escapeXml(item.allname)}
</a>
<a href = "/syaa/servlet/SearchOutPersonal/${item.id}">
<img src="/syaa/Pic/${item.image}" alt="" width="100" height="100" border="0" />

</a>

</c:forEach>

</body>