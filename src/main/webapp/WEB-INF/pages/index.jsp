<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="margin-left" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="margin-top" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <link href="<c:url value="/resources/css/Styleback.css" />" rel="stylesheet" type="text/css"  />
    <link href="<c:url value="/resources/css/bblog.css" />" rel="stylesheet" type="text/css" />
    <div class="logo">
        <a><img src="<c:url value="/resources/images/mvideo-logo.png"/>" /></a>
    </div>
    <title>TERMINAL</title>
</head>
<body>

<div align="center">

    <div class="container">
    <a href="avir" class="blog" >Антивирусы</a>
    <a href="office" class="blog">Office</a>
    <a href="turnsol" class="blog">Программы</a>
    </div>

    <div class="container">
    <a href="X" class="blog">Xbox</a>
    <a href="PS" class="blog">PlayStation</a>
    <a href="PC" class="blog">PC</a>
    </div>

    <div class="container">
    <a href="oncin" class="blog">Smart TV</a>
    <a href="itunes" class="blog">iTunes</a>
    <a href="other" class="blog">Другое</a>
    </div>

    <div id="footer">
    </div>
</div>
</body>
</html>
