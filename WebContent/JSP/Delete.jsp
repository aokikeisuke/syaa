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
<header>
<a href="http://localhost:8080/syaa/JSP/Top.jsp"> <br>
<img src="http://www.casleyconsulting.co.jp/wp-content/themes/casleyconsulting/images/header_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
<br>
		データを削除しますか？<br />
		<form method="POST" action="/syaa/Delete">
			 <input type="submit" name="yesno2" style="WIDTH: 80px; HEIGHT: 25px"value="はい">
			 <input type="hidden" name="id" value="${requestScope['id']}"/>
		  </form>  
		<br>
		  <form method="POST" action="/syaa/JSP/Personal.jsp">  
		
		
			 <input type="submit" name="yesno2" style="WIDTH: 80px; HEIGHT: 25px" value="いいえ">
		</form>
</div>
</body>

</html>