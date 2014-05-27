<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String id = (String)session.getAttribute("id");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>編集確認画面</title>
<link rel="stylesheet" href="../css/text.css" type="text/css" />
</head>
<body class="background" style="text-align:center">
<header>
<a href="/syaa/JSP/Top.jsp"> <br>
<img src="/syaa/Pic/casley_logo.png" 
width="250" height="47" style="opacity: 1;">
</a>
</header>
<br>
<p>
姓:${requestScope['lastname']}<br>
名:${requestScope['firstname']}<br>
フリガナ（姓）:${requestScope['lsubname']}<br>  
フリガナ（名）:${requestScope['fsubname']}<br>
誕生日:${requestScope['birthday']}<br>
最寄り駅:${requestScope['place']}<br>
趣味:${requestScope['hobby']}<br>
写真:<img src="../Pic/${requestScope['image']} " alt="" width="100" height="100" border="0" /><br>
一言お願いします:${requestScope['word']}<br>
</p>
以上の内容で変更を上書きしますか？
<form  method="POST" action="/syaa/servlet/EditOut">
 <!--    <input type="hidden" name="lastname" value="${ requestScope['lastname']} "/>--> 
    <input type="hidden" name="lastname" value="${requestScope['lastname']} "/>
    <input type="hidden" name="firstname" value="${requestScope['firstname']}"/>
    <input type="hidden" name="lsubname" value="${requestScope['lsubname']}"/>
    <input type="hidden" name="fsubname" value="${requestScope['fsubname']}"/>
    <input type="hidden" name="birthday" value="${requestScope['birthday']}"/>
    <input type="hidden" name="place" value="${requestScope['place']}"/>
    <input type="hidden" name="hobby" value="${requestScope['hobby']}"/>
    <input type="hidden" name="image" value="${requestScope['image']}"/>
    <input type="hidden" name="word" value="${requestScope['word']}"/>
    <input type="hidden" name="id" value="${requestScope['id']}"/>
	<input type="submit" name="yesno" value="はい"/>
	
	<input type="submit" name="yesno" value="いいえ"/>
	
	
	</form>


</body>
</html>


