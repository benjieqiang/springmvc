<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>测试接受参数和返回值</head>
<body>

    <p>第一个springmvc项目</p>
    <p>
    <form action="some.do" method="post">
        <button>发起some.do的post请求</button>
    </form>

    <br><h1>测试逐个接受参数</h1>
    <form method="post" action="register.do">
        姓名：<input type="text" name="name"> </br>
        年龄：<input type="text" name="age"> </br>
        <button type="submit">点击提交</button>
    </form>
</body>
</html>
