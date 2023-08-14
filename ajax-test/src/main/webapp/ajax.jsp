<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/8/12
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.4/jquery.js" ></script>
  <%--<script>
    $(document).ready(function() {
      $("#submit").click(function() {
        var name = $("#name").val();
        $.post("http://localhost:8080/ajax", { "name": name }, function(response) {
          $("#result").html(response);
        }, function() {
          alert("请求失败");
        });
      });
    });
  </script>--%>
  <script>
    $(document).ready(function() {
      $("#submit").click(function() {
        var name = $("#name").val();
        $.ajax({
          url: "ajax",
          type: "POST",
          data: { "name": name },
          success: function(response) {
            $("#result").html(response);
          },
          error: function() {
            alert("请求失败");
          }
        });
      });
    });
  </script>
</head>
<body>
  <input type="text" id="name" placeholder="请输入您的名字">
  <button id="submit">提交</button>
  <div id="result"></div>
</body>
</html>
