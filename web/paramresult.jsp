<%--
 通过param和paramValues获得对象的值
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>paramResult.jsp</title>
</head>
<body>
${param.name}<br />
${param.gender}<br />
${param.aspiration}<br /><!--只能获得第一个参数的值-->
${paramValues.aspiration[0]}<br />
${paramValues.aspiration[1]}<br />
${paramValues.name[0]}<br />

</body>
</html>
