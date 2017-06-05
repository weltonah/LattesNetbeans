
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
  <head>
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
    
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
     <script src="<c:url value="/resources/js/jquery-3.2.1.min.js" />"></script>
    
  </head>
  <body>
       <c:import url="../cabecalho.jsp" />
<div class="mx-auto" style="margin: 0 auto; width: 80%; position: relative;">
    <div class="col-sm-12">
    <h3>Como a ferramenta analisa a Orientação de Mestrado Concluída: </h3>
    <h5>1) Vai no Capítulo Orientações do Lattes (como na figura abaixo)</h5>
    <img src="<c:url value="/resources/images/Oriparte1.png"/>" class="img-responsive" style="border:solid;" />
    <h5>2) Vai na seção de Orientações e supervisões concluídas (como na figura abaixo) </h5>
    <img src="<c:url value="/resources/images/OriConparte2.png"/>" class="img-responsive"  style="border:solid;"/>
    <h5>3) Vai no item Dissertação de mestrado (como na figura abaixo) </h5>
    <img src="<c:url value="/resources/images/Mesparte3.png"/>" class="img-responsive"  style="border:solid;"/>
    <h5>4) Somados os itens de orientação concluidos a ferramenta seleciona os itens em que
        o docente é orientador principal e
        analisa em relação ao triênio para ser contabilizado.
    </h5>

    </div>
</div>
    <c:import url="../rodape.jsp" />
  </body>
</html>