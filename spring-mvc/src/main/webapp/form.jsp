<%--
  Created by IntelliJ IDEA.
  User: ttn
  Date: 1/4/19
  Time: 9:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
${heading}
<form method="post" action="/newStudent">
    <label>firstname</label>
    <input name="firstname" type="text"/>
    <label>lastname</label>
    <input name="lastname" type="text"/>
    <input type="submit">
</form>
</body>
</html>