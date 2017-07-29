<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2017/7/22
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>test</title>
    <script type="text/javascript" src="jquery-3.2.1.js"></script>
    <script type="text/javascript">
      $(function () {
          $("#btn1").click(function () {
              $.post(
                  "hello",{
                      "username":$("#username").val()

                  },function (data,status) {
                      $("#message").html(data);
                  }
              )
          })
      })

    </script>
  </head>
  <body>
  <a href="hello">hello</a>
  用户名：<input type="text" id="username" width="200px" >
  <input type="button"  id="btn1" width="100px"  >
  <a href="httpresp">httpresp</a>
  <div id="message"></div>
  </body>
</html>
