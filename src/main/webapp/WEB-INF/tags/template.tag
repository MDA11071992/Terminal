<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ tag description="Template Tag" pageEncoding="utf-8" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-1.3.2.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-barcode.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/CallPrint.js"/>"></script>

<!doctype>
<html>
<head>
    <link href="<c:url value="/resources/css/Styleback2.css" />" rel="stylesheet" type="text/css"  />
    <link href="<c:url value="/resources/css/button.css" />" rel="stylesheet" type="text/css"  />
    <link href="<c:url value="/resources/css/buttonback.css" />" rel="stylesheet" type="text/css"  />
    <link href="<c:url value="/resources/css/modalwindow.css" />" rel="stylesheet" type="text/css"  />
    <link href="<c:url value="/resources/css/conteiner.css" />" rel="stylesheet" type="text/css"  />
    <link href="<c:url value="/resources/css/buttonprint.css" />" rel="stylesheet" type="text/css"  />
    <!--<meta http-equiv="refresh" content="180; url=http://localhost/">-->
    <title>TERMINAL</title>
</head>

<body>
<div class="logo">
    <a href="/"><img src="<c:url value="/resources/images/mvideo-logo.png"/>" /></a>
</div>
<div class="content">
    <div align="center">
        <div class="container">
                    <jsp:doBody/>
        </div>
        <div style="display:none">
            <div id="print-content" style="align-content: center;">
                <style>
                    @media print {

                        @page  {
                            size: 3cm 3cm;
                        }
                        img.slip {
                            margin-left: 1.5cm;
                        }                       
                    }
                </style>
                    <img class="slip" src="http://localhost:8080/terminal/resources/images/mvideo-logo-print.png">
                <br>
                    <a class="slip" id="bcTarget"></a>
            </div>
        </div>
    </div>
</div>
</body>

<div id="footop">
        <a href="<c:url value="/"/>" class="buttonb">В главное меню</a>
</div>

</html>
