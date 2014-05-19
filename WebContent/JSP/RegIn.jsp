<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>シャアタイトル</title>
</head>
<body>
　*は必須項目です</br>
*姓：</br>
<input type="text" name="name" /><br/>
</form>
*名：</br>
<input type="text" name="name" /><br/>
</form>
*フリガナ（姓）：</br>
<input type="text" name="subname" /><br/>
</form>
*フリガナ（名）：</br>
<input type="text" name="subname" /><br/>
</form>
生年月日：</br>
<input type="date" name="birthday" /><br/>
</form>
最寄り駅：</br>
<input type="text" name="place" /><br/>
</form>
趣味：</br>
<input type="text" name="hobby" /><br/>
</form>
一言お願いします：</br>
<input type="text" name="word" /><br/>
</form>
<form method="POST" action="/syaa/RegOut">
<input type="submit" value="登録">
</body>
</html>