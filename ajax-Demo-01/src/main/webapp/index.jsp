<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>使用表单发送请求</h1>
<form action="/login">
    用户名称:<input type="text" name="name" placeholder="请输入用户名">
    <hr>
    密码:<input type="password" name="password" placeholder="请输入密码">
    <input type="submit"value="登录">
</form>
</body>
</html>