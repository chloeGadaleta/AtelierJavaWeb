<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- si ça existe alors j'affiche le login SUR TOUTES LES PAGES -->
<!-- ceci est une balise jstl -->
<c:if test="${clientConnecte ne null}">
    Yo ${clientConnecte.login}
</c:if>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Clients</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Produits<span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Categories
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Client</a>
          <a class="dropdown-item" href="#">Produits</a>
          <a class="dropdown-item" href="#">Vêtements</a>
          <a class="dropdown-item" href="#">Accessoires</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Tout voir</a>
        </div>
      </li>
      
      <!-- choose est comme un if ou un switch -->
      <!-- ici il dit : qs clt est pas connecté alr on affiche login et inscription -->
      <!-- sinon clt connecté on affiche mon compte et logout -->
      
      
      <c:choose>
          <c:when test="${clientConnecte == null}">
              <li class="nav-item">
                  <a class="nav-link" href="<c:url value="/connexion"/>">Login</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link" href="<c:url value="/inscription-client"/>">Inscription</a>
              </li>
          </c:when>
          <c:otherwise>
              <li class="nav-item">
                  <a class="nav-link" href="<c:url value="/deconnection"/>">Logout</a>
              </li>
              <li class="nav-item">
                  <a class="nav-link" href="#">Mon compte</a>
              </li> 
          </c:otherwise>
      </c:choose>
      <li>
        <a class="nav-link disabled" href="cookie-shop?style=jamaique">Jamaique</a>
      </li>
      <li>
        <a class="nav-link disabled" href="cookie-shop?style=cuba">cuba</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0 formClo">
      <input class="form-control mr-sm-2 champRech" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
