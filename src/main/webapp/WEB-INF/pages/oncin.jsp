<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<t:template>
    <c:if test = "${!empty oncinListl}">
        <c:forEach items = "${oncinListl}" var = "oncin">

            <div>

                <a href="#${oncin.ID}" class="button">
                    <img style="max-height: 200px; max-width: 200px;" src="<c:url value="/resources/images/${oncin.ART}.jpg" />" />
                    <br><br><b>${oncin.NAME}</b><br>
                </a>
                <hr noshade size="1" width="75%">
                <a style="float: left; margin-left: 10px; padding: 12px;">
                    <font size=6>
                        <b>${oncin.PRICE}</b>
                    </font>
                    <font size="4">р.</font>
                </a>
                <a style="float: right;  margin-right: 0; padding: 1px;">
                    <button onclick='$("#bcTarget").barcode("${oncin.COD}", "ean13",{barWidth:2, barHeight:80}); javascript:CallPrint("print-content");'class="print">
                        <img src="<c:url value='/resources/images/red_print.png' />" />
                    </button>
                </a>

                <a href="#" class="overlay" id="${oncin.ID}"></a>
                <div class="popup">
                    <h2>${oncin.NAME}</h2>
                    <br>
                    <img class="is-image" src="<c:url value="/resources/images/${oncin.ART}.jpg" />"/>
                    <br>
                    <h1>Описание</h1>
                    <hr noshade size="1">
                    <p>${oncin.ABOUT}</p>
                    <br>
                    <h1>Характеристики</h1>
                    <hr noshade size="1">
                        ${oncin.CHARAC}
                    <br>
                    <a class="close" title="Закрыть" href="#close"></a>
                </div>

            </div>

        </c:forEach>
    </c:if>
</t:template>


