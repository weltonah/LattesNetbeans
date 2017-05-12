
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html >
  <head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
 integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="<c:url value="transition.min.js" />"></script>
  </head>
  <body>
       <c:import url="cabecalho.jsp" />
   <h1>${resultado.getNomeCompleto()}: ${resultado.getTotalValor()}</h1>
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
    
    <button class="btn btn-primary" type="button" data-toggle="collapse" data-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
        Button with data-target
      </button>
      <div class="collapse" id="collapseExample">
        <div class="well">
          .asdaskdjhasiuhdiuashudh
        </div>
      </div>
    
    <c:import url="rodape.jsp" />
  </body>
</html>