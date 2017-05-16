
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html >
  <head>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
  </head>
  <body>
       <c:import url="cabecalho.jsp" />
   <h1>${resultado.getNomeCompleto()}: ${resultado.getTotalValor()} pontos</h1>
    <dl>
        <dt>Lattes</dt>
        <dd><a href="http://lattes.cnpq.br/${resultado.getLattes()}" target="_blank">http://lattes.cnpq.br/${resultado.getLattes()}</a></dd>
        <dt>Resumo CV</dt>
        <dd>${resultado.getResumoCV()}</dd>
        <dt>Atualização</dt>
        <dd>${resultado.getAtualizacao()}</dd>
        <dt>Pontuação no Triênio</dt>
        <dd>${resultado.getTotalValor()}</dd>
    </dl>
    <h2>Sumário</h2>

    <table class="table table-sm summary">
        <tr>
            <th>Categoria</th>
            <th>Quantidade</th>
            <th>Pontuação</th>
        </tr>
        <c:forEach var="tipo" items="${resultado.getLevante()}">
            <tr>
                <th>${tipo.getTipoObra()}</th>
                <td>${tipo.getAgenda().size()}</td>
                <td>${tipo.getTotalValor()}</td>
            </tr>
        </c:forEach>
    </table>

    <details>
        <summary>
            <h2>Avaliação completa</h2>
        </summary>
		<c:forEach var="levante" items="${resultado.getLevante()}">
			<h2>${levante.getTipoObra()}</h2>
			<table class="table table-sm">
			
				<tr>
		                <th>Descrição</th>
		                <th>valor</th>
		            </tr>
		            <c:forEach var="agenda" items="${levante.getAgenda()}">
		      		<c:choose>
	  					<c:when test="${agenda.getValor() == 0}">
			             <tr>
			             	<td><del>${agenda.getNome()}</del></td>
		                    <th>${agenda.getValor()}</th>
	                	</tr>
	                	</c:when>
	                	<c:otherwise>
				             <c:choose>
			  					<c:when test="${!agenda.isValido()}">
					             <tr>
					             	<td><del>${agenda.getNome()}</del></td>
				                    <th>0</th>
			                	</tr>
			                	</c:when>
			                	<c:otherwise>
						             <tr>
						             	<td>${agenda.getNome()}</td>
					                    <th>${agenda.getValor()}</th>
				                	</tr>
			                	</c:otherwise>
		              	 	 </c:choose>
	                	</c:otherwise>
              	 	 </c:choose>
              	  
                	</c:forEach>
               	<tr>
	                <th>Total</th>
	                <th>${levante.getTotalValor()}</th>
	            </tr>
			</table>
		
		</c:forEach>
    </details>   
    
    
    <c:import url="rodape.jsp" />
  </body>
</html>