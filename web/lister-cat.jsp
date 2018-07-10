<%-- 
    Document   : lister-cat
    Created on : 9 juil. 2018, 16:25:13
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
        <title>JSP Page</title>
    </head>
    <body>
        Bonjour ${cookie.pseudo.value}
        <h1>Liste des catégories</h1>
        <button class="btnAjouter"><a href="<c:url value="/ajouter-cat"/>">Ajouter</a></button>
       <ul>
        <c:forEach items="${listeCat}" var="catActuelle">
            <li class="listeCat">
                ${catActuelle.nom}
                <a href="<c:url value="/supprimer-cat"/>?idCat=${catActuelle.id}">Supprimer</a>
            </li>
        </c:forEach>
        </ul>
    </body>
</html>
