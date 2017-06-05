
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
  <head>
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
    
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
     <script src="<c:url value="/resources/js/jquery-3.2.1.min.js" />"></script>
    
  </head>
  <body>
       <c:import url="../cabecalho.jsp" />
<div class="mx-auto" style="margin: 0 auto; width: 80%; position: relative;">
    <div class="col-sm-12">
    <h3>Como a ferramenta analisa a Orientação Iniciação Científica andamento/concluída: </h3>
    <h5>1) Vai no Capítulo Orientações do Lattes (como na figura abaixo)</h5>
    <img src="<c:url value="/resources/images/Oriparte1.png"/>" class="img-responsive" style="border:solid;" />
    
    <h5>2) Vai na seção de Orientações e supervisões em andamento (como na figura abaixo) </h5>
    <img src="<c:url value="/resources/images/OriAndparte2.png"/>" class="img-responsive"  style="border:solid;"/>
    <h5>3) Vai no item Iniciação científica (como na figura abaixo) </h5>
    <img src="<c:url value="/resources/images/ICparte3.png"/>" class="img-responsive"  style="border:solid;"/>
    <h5>4) Busca todos os itens e soma com os proximos passos.
    </h5>
    <h5>5) Vai na seção de Orientações e supervisões concluídas (como na figura abaixo) </h5>
    <img src="<c:url value="/resources/images/OriConparte2.png"/>" class="img-responsive"  style="border:solid;"/>
    <h5>6) Vai no item Iniciação científica (como na figura abaixo) </h5>
    <img src="<c:url value="/resources/images/ICparte3.png"/>" class="img-responsive"  style="border:solid;"/>
    <h5>7) Somados os itens de orientação em andamento e concluidos se
        analisa em relação ao triênio para ser contabilizado.
    </h5>

    </div>
</div>
    <c:import url="../rodape.jsp" />
  </body>
</html>