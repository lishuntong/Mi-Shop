<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/8/11
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>


<html>
<head>
    <title>Title</title>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.4/jquery.js" ></script>
</head>
<body>
    <button>点击发送请求</button>
    <script>
        $('button').eq(0).on('click',function (){
            $.get("/login",function (ret){
                console.log(ret);
            })
        })
    </script>
</body>
</html>
