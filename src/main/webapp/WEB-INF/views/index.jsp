<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<jsp:include page="cmm/head.jsp"/>
<body>
	<header id="header">      
        <div class="container">
            <div class="row">
                <div class="col-sm-12 overflow">
                   <jsp:include page="cmm/social.jsp"/>
             	</div>
             </div>
        </div>
        <div class="navbar navbar-inverse" role="banner">
            <div class="container">
                <jsp:include page="cmm/logo.jsp"/>
                <jsp:include page="cmm/navbar.jsp"/>
                <jsp:include page="cmm/search.jsp"/>
            </div>
        </div>
    </header>
	<jsp:include page="cmm/main_slider.jsp"/>
    <jsp:include page="cmm/wow.jsp"/>
    <jsp:include page="cmm/action.jsp"/>
	<jsp:include page="cmm/features.jsp"/>
    <jsp:include page="cmm/clients.jsp"/>
	<jsp:include page="cmm/footer.jsp"/>
    <script src="${cmm}/js/jquery.js"></script>
    <script src="${cmm}/js/bootstrap.min.js"></script>
    <script src="${cmm}/js/lightbox.min.js"></script>
    <script src="${cmm}/js/wow.min.js"></script>
    <script src="${cmm}/js/main.js"></script>   
    <script src="${cmm}/js/index.js"></script>
    <script	>
    cmm.init(`${ctx}`)
    </script>
</body>
</html>