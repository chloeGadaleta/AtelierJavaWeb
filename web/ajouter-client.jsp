<%-- 
    Document   : ajouter-client
    Created on : 10 juil. 2018, 10:20:08
    Author     : Administrateur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Anton" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Anton|Lato" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css"/>
        <title> Ajouter Nouveau Client</title>
    </head>
    <body>
        <h1>Ajouter nouveau client</h1>
        <form method="POST" action="">
            <label class="lab">Nom</label>
            <input class="champ champCli" type="text" name="nom"/>
            <label class="lab">Prénom</label>
            <input class="champ champCli" type="text" name="prenom"/>
            <label class="lab">Rue</label>
            <input class="champ champCli" type="text" name="adresse"/>
            <label class="lab">Numéro de Rue</label>
            <input class="champ champCli" type="text" name="numero"/>
            <label class="lab">Code postal</label>
            <input class="champ champCli" type="text" name="codePostal"/>
            <input class="btnSubmit" type="submit"/>
        </form>
    </body>
</html>
