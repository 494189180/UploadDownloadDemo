<%--
  Created by IntelliJ IDEA.
  User: gaoyanbao
  Date: 2019/4/4
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored = "false" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>文件下载</h3> -->
<a
        href="download?filename=${requestScope.user.headimage.originalFilename}">
    用户头像：${requestScope.user.headimage.originalFilename}
</a> </body>
</html>
