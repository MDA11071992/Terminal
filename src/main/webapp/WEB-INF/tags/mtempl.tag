<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag description="Template Tag" pageEncoding="utf-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!doctype>
<html>
<head>
    <link href="<c:url value="/resources/css/Styleback.css" />" rel="stylesheet" type="text/css"  />
    <link href="<c:url value="/resources/css/lblog.css" />" rel="stylesheet" type="text/css"  />
    <link href="<c:url value="/resources/css/buttonback.css" />" rel="stylesheet" type="text/css"  />
    <meta http-equiv="refresh" content="180; url=http://localhost/">
    <div id="footop">
        <p class="fig"><img src="<c:url value="/resources/images/mvideo-logo.png"/>" /></p>
    </div>
    <title>TERMINAL</title>
</head>
<body>
<div class="content">
    <div align="center">
        <div id="parent">
            <div id="child">
                <div class="container">
                    <jsp:doBody/>
                </div>
            </div>
        </div>
    </div>
</div>
<div id="footer">
    <p class="fig">
        <a href="<c:url value="/"/>" class="buttonb">В главное меню</a>
    </p>
</div>
</body>
</html>
