<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>検索入力画面</title>
</head>
<body>
<br>
検索したい社員の名前を入力してください
<br>
<form method="POST" action="/syaa/servlet/SerachIn">
<input type="text" name = "search">
<input type="submit" value="検索">
<c:forEach var="item" items="${requestScope['list']}">
<a href = "/syaa/SearchOut/" + item.id>
${fn:escapeXml (item.firstname)}
${fn:escapeXml (item.lastname)}
${fn:escapeXml (item.image)}
</a>
</c:forEach>
</form>
</body>