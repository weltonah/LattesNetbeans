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
            <li>versão 1.2.2 (22/06/2017)</li>
             <ul>
                 <li>Correções na analise de orientações em andamentos da engenharia</li>
                 <li>Alteração da contabilização de dedicação exclusiva</li>
                 
            </ul>
            <li>versão 1.2.1 (05/06/2017)</li>
             <ul>
                 <li>inclusão de link para sugestão</li>
                 <li>Alteração da interface</li>
                 <li>Travas da aplicadas [Socias Aplicada]</li>
                 <li>Criação de explicação de criterios analisados</li>
                 <li>Ativo o criterio de analise de trabalho de conclusão de curso</li>
                 <li>Ativo o criterio de Bancas externas para Exatas,sociais e Biologicas, saude, humanas e linguistica</li>
                 <li>criação de log do sistema</li>
            </ul>
            <li>versão 1.2.0 (01/06/2017)</li>
             <ul>
                  <li>Correções relativas a contabilidade de Trabalhos em eventos nacionais e internacionais</li>
                  <li>Retirada de Analise de Banca externa</li>
                  <li>correções do botão voltar da pagina upload </li>
                  <li>Leitura de arquivo .xml na opção de upload</li>
                  <li>correções do select da pagina criterios</li>
                  <li>correções da contabilização de organização, capiutulos e livros</li>
                  <li>destaque de valores validos na tabela e outras observações colocada na interface</li>
                  <li>implentação da travas para a area de engenharia</li>
                  <li>criação de legenda para projetos que estão no trienio mas ultrapassam o maiximo</li>
             </ul>
            
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
