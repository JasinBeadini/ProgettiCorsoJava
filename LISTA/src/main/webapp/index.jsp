<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Lista utenti</title>
</head>
<body>
<h1>Lista utenti</h1>
<table>
    <tr>
        <th>ID</th>
        <th>Nome</th>
        <th>Cognome</th>
        <th>Matricola</th>
        <th>Azioni</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.nome}</td>
            <td>${user.cognome}</td>
            <td>${user.matricola}</td>
            <td>
                <a href="UserServlet?action=edit&id=${user.id}">Modifica</a>
                <a href="UserServlet?action=delete&id=${user.id}">Elimina</a>
            </td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="UserServlet?action=new">Aggiungi nuovo utente</a>
</body>
</html>
