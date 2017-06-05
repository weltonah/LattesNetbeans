<%-- 
    Document   : sistema em manutenção
    Created on : 22/05/2017, 15:22:01
    Author     : USUARIO
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISTEMA EM MANUTENÇÂO</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
            <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

        <style>
        span.glyphicon {
            font-size: 2.0em;
        }
        .green {
            color: green;
        }

        .red {
            color: red;
        }
        html {
            position: relative;
            min-height: 100%;
        }
        body {
            margin: 0 0 60px; /* altura do seu footer */
        }
        </style>
    </head>
    <body>
        <h1>SISTEMA EM MANUTENÇÃO</h1>
        <c:import url="rodape.jsp" />
    </body>
    
</html>
