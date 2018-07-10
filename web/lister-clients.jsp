<%-- 
    Document   : lister-clients
    Created on : 10 juil. 2018, 10:59:43
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Anton" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Anton|Lato" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css"/>
        <title>Liste clients</title>
    </head>
    <body>
        <h1>Liste des clients</h1>
        <button class="btnAjouter"><a href="<c:url value="/ajouter-cat"/>">Ajouter</a></button>
        <ul>
            <table>
                <tr>
                    <th>Id</th>
                    <th>Nom</th>
                    <th>Prénom</th>
                </tr>
                <c:forEach items="${listeClient}" var="clientActuel">
                        <tr>
                            <td class="CliTab">${clientActuel.id}</td>
                            <td class="CliTab">${clientActuel.nom} </td>
                            <td class="CliTab">${clientActuel.prenom}</td>
                        </tr>
                </c:forEach>
           </table>
        </ul>
    </body>
</html>
