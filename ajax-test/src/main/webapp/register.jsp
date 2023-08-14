<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/8/13
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.4/jquery.js" ></script>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f2f5;
        }
        .container {
            width: 300px;
            padding: 16px;
            background-color: white;
            border-radius: 4px;
            margin: 100px auto;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        h3 {
            text-align: center;
            margin-bottom: 24px;
            color: cadetblue;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            border-radius: 4px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            border-radius: 4px;
        }
        button:hover {
            opacity: 0.8;
        }
        .success{
            border: 2px solid green;
        }

        .failed{
            border: 2px solid red;
        }
    </style>
</head>
<body>
<form <%--action="/login"--%>>
    <label for="uname"><b>用户名称</b></label>
    <input type="text" placeholder="输入用户名" name="uname" id="uname" required>

    <label for="psw"><b>用户密码</b></label>
    <input type="password" placeholder="输入密码" name="psw1" id="psw" required>
    <label for="psw1"><b>用户密码</b></label>
    <input type="password" placeholder="再次输入密码" name="psw2" id="psw1" required>
    <button>注册</button>
</form>
<script>
    $(function(){
        $('input[name=uname]').on('blur',function (){
            const uname=$('input[name=uname]').val();
            $.post("${pageContext.request.contextPath}/register",{uname:uname},function (ret){
                if(ret.code == 0){
                    $('input[name=uname]').removeClass('failed')
                    $('input[name=uname]').addClass("success")
                    alert(ret.msg);
                    window.location.href = ret.data
                }else{
                    $('input[name=uname]').removeClass('failed')
                    $('input[name=uname]').addClass("success")
                    alert(ret.msg);
                    console.log(ret.msg)
                    console.log(ret.code)
                }

            })
        })
    })

</script>t
</body>
</html>
