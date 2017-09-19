<%--
  EL隐含对象测试，输入http://localhost:8087/ELtest1.jsp进行测试
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ELtest1.jsp</title>
</head>
<body>
<form action="paramresult.jsp" method="post">
    姓名：<input type="text" name="name"><br>
    性别：<input type="text" name="gender"><br>
    第一志愿：<input type="text" name="aspiration"><br>
    第二志愿：<input type="text" name="aspiration"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
