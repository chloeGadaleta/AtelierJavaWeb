<%-- 
    Document   : _TEMPLATE
    Created on : 10 juil. 2018, 16:42:39
    Author     : Administrateur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Cache-Type" content="text/html"; charset="UTF-8">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
    <title>Shop</title>
    <link rel="stylesheet" href="css/style.css">
    <c:import url="_STYLESHEETS.jsp"/>
    </head>
    <body>
          <c:import url="_MENU.jsp"/>
          <c:import url="_HEADER.jsp"/>
          <main>
              <h1>Créez votre compte</h1>
                <form method="POST" action="">
                    <label class="lab">login</label>
                    <input class="champ champCli" type="text" name="login"/>
                    <label class="lab">Adresse mail</label>
                    <input class="champ champCli" type="email" name="adresseMail"/>
                    <label class="lab">Mot de passe</label>
                    <input class="champ champCli" type="password" name="mdp"/>
                    <input class="btnSubmit" type="submit"/>
                </form>
          </main>
          <c:import url="_FOOTER.jsp"/>
          <c:import url="_JAVASCRIPTS.jsp"/>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
      </body>
  </html>

