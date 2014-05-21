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
<form method="POST" action="/syaa/servlet/SerachOutPersonal">
<input type="text" name = "search">
<input type="submit" value="検索">
<c:forEach var="item" items="${requestScope('list')}">
<a href = "/syaa/SearchOut/"+item.id>
${fn:escapeXml (item[0])}
</a>
<a href = "/syaa/SearchOut/"+item.id>
<img src="/syaa/WebContent/WEB-INF/Pic/"+item.image>
<!-- 
写真のURL指定の仕方を要確認。「+」が必要なのか。。。？
 -->
</a>

</c:forEach>
</form>
</body>