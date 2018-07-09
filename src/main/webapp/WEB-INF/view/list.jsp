<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mykyta_Huchenko
  Date: 7/9/2018
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <c:if test="${not empty contacts}">
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Birth Date</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="contact" items="${contacts}">
                    <tr>
                        <td>${contact.id}</td>
                        <td>${contact.firstName}</td>
                        <td>${contact.lastName}</td>
                        <td>${contact.birthDate.toLocalDate()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>


</body>
</html>
