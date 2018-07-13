<!-- verfication si cookie theme existe -->

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <c:if test="${cookie.background.value == 'jamaique'}" >
        <link rel="stylesheet" href="css/jamaique.css">
    </c:if>
    
    <c:if test="${cookie.background.value == 'cuba'}" >
        <link rel="stylesheet" href="css/cuba.css">
    </c:if>
