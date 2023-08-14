<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
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
            width: 50%;
            border-radius: 4px;
        }
        button:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>
<div class="container">
    <h3>AJAX测试</h3>
    <form <%--action="/login"--%>>
        <label for="uname"><b>用户名</b></label>
        <input type="text" placeholder="输入用户名" name="uname" id="uname" required>

        <label for="psw"><b>密码</b></label>
        <input type="password" placeholder="输入密码" name="psw" id="psw" required>

        <button type="button">登录</button> <%--<button href="http://localhost:8080/register.jsp">注册</button>--%>
        <a href="http://localhost:8080/register.jsp">注册</a>
    </form>

</div>
<script>
    $(function (){
        $('button').eq(0).on('click',function (){
            const uname=$('input[name=uname]').val();
            // alert(uname)
            const psw=$('input[name=psw]').val();
            $.post("/login",{uname:uname,psw:psw},function (response){
                console.log(response.code)
                if(response.code == 0){
                    alert(response.msg)
                    window.location.href = response.data;
                }else{
                    alert(response.msg)
                }

            })
            // $.ajax({
            //     url: "login",
            //     type: "POST",
            //     data: { "uname": uname ,"psw":psw},
            //     success:function (){
            //         alert("登录成功")
            //     },
            //     error:function (){
            //         alert("登录失败")
            //     }
            // })
        })
    })
</script>
</body>
</html>