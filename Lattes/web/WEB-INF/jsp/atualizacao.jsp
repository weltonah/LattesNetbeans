<%-- 
    Document   : atualizacao
    Created on : 24/05/2017, 14:00:37
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
        <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <title>Lista de atualizações</title>
        <style>
            .inputfile + label {
	cursor: pointer;
        }
        html {
            position: relative;
            min-height: 100%;
        }
        body {
            margin: 0 0 60px; /* altura do seu footer */
        }
        footer{
            position: absolute;
            bottom: 0px;
            width: 100%;
            margin-top: 10px;
        }
        </style>
    </head>
    <body>
        <c:import url="cabecalho.jsp" />
        
        <div class="col-sm-6">
        <h3>Atualizações do sistema</h3>
        <ul>
             <li>versão 1.1.0</li>
             <ul>
                  <li>Correções relativas a contabilidade de orientação de Mestrado e Doutorado [Todas as áreas]</li>
                  <li>Contagem seguindo o criterio de maximo de trabalhos contabilizados [engenharia]</li>
                  <li>correções de interface </li>
             </ul>
             <li>versão 1.0.3</li>
        </ul>
        </div>
        <div class="col-sm-6">
        <h3>Proximas correções (não necessariamente na ordem a seguir)</h3> 
        <ul>
            <li> Funcionalidades</li>
            <ul>
                <li>Implementação de analise de orientação de TFC (engenharia)</li>
                <li>Implementação de analise de Artigos via fator de impacto (biologia)</li>
                <li>Implementação de analise de Artigos via JCR (engenharia)</li>
                <li>Implementação de analise de Artigos via Qualis (sociais)</li>
                <li>Implementação de analise de produção artistica (letras e artes)</li>
                <li>Geração de relatorio em csv</li>
            </ul>
            <li> Mudanças graficas</li>
            <ul>
                <li></li>
            </ul>
        </ul>
        </div>
        
        
        
        <c:import url="rodape.jsp" />
    </body>
</html>
