<%--
  Created by IntelliJ IDEA.
  User: Mykyta_Huchenko
  Date: 7/9/2018
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Contact</title>
</head>
<body>
    ${contact.id}
    ${contact.firstName}
    ${contact.lastName}
    ${contact.birthDate.toLocalDate()}
</body>
</html>
