
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html >
  <head>
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
      
  </head>
  <body>
      <div class="row">
       <c:import url="cabecalho.jsp" />
      </div>
       
<div class="mx-auto" style="margin: 0 auto; width: 70%; position: relative;">
    <h1>${resultado.getNomeCompleto()}: ${resultado.getTotalValor()} pontos</h1>
    <dl>
        <dt></dt>
        <dd> Link Lattes :  <a class=" glyphicon glyphicon-link btn btn-link" href="http://lattes.cnpq.br/${resultado.getLattes()}" target="_blank"> Numero:${resultado.getLattes()}</a></dd>
        <dt>Resumo do currículo</dt>
        <blockquote> <dd> <h4>${resultado.getResumoCV()} </h4></dd></blockquote>
        <dt>Ultima atualização</dt>
        <dd>${resultado.getAtualizacao()}</dd>
    </dl>
    
    <div>
    <hr size="30" style="border: 1px solid #ccc">
    </div>
    
    
    <div class="well">
    <h2>Sumário</h2>
    <table class="table table-sm summary">
        <tr style="background-color: #e6eeff;">
            <th>Categoria</th>
            <th>Quantidade <br>
                (Válidos* /Total)
            </th>
            <th>Pontuação por item</th>
            <th>Pontuação total</th>
        </tr>
        <c:forEach var="tipo" items="${resultado.getLevante()}">
            <tr>
                <th>${tipo.getTipoObra()}</th>
                <td><strong style="color:green;"> ${tipo.getValida()} </strong>/ ${tipo.getAgenda().size()}</td>
                <td>${tipo.getValorItem()}</td>
                <td>${tipo.getTotalValor()}</td>
            </tr>
        </c:forEach>
            <tr style="background-color: #bfbfbf;">
                <th>Total de pontos no triênio</th>
                <td></td>
                <td></td>
                <td>${resultado.getTotalValor()}</td>
            </tr>
            
    </table>
            <div>
                <span> * Na contagem só são contabilizados os itens que são válidos de acordo com as regras do triênio e do edital</span>
            </div>
    </div>
    <div class="col-md-12">
    <hr size="30" style="border: 1px solid #ccc">
    </div>
    
    <details >
        <summary class="btn btn-info btn-lg" type="button" >
            <span >Avaliação completa</span>
        </summary>
        
        <div  class="col-md-12">
            <div class="col-md-6 " style="background-color: #fff5cc;">
            <table class="well table table-sm">
                <h3>Legenda</h3>
                <tr style="background-color: #ccffb3;">
                    <th>Objeto analisado se encontra dentro do triênio</th>
                </tr>
                <tr style="background-color: #ffcccc;">
                    <th>Objeto analisado se encontra fora do triênio</th>
                </tr>
                <tr style="background-color: #ccffeb;">
                    <th>Objeto analisado se encontra dentro do triênio porém ultrapaça o limite maximo</th>
                </tr>
            </table>
            </div>
            <div class="col-md-6">
                
            </div>
            
        </div>
		<c:forEach var="levante" items="${resultado.getLevante()}">
			<h2>${levante.getTipoObra()}</h2>
                        <div class="well">
			<table class="table table-sm">
			
				<tr style="background-color: #e6eeff;">
                                    <th>Descrição</th>
                                    <th>valor</th>
                                </tr>
		            <c:forEach var="agenda" items="${levante.getAgenda()}">
		      		<c:choose>
                                <c:when test="${agenda.getValor()==0}">
			             <tr style="background-color: #ffcccc;">
			             	<td>${agenda.getNome()}</td>
                                        <th>${agenda.getValor()}</th>
                                    </tr>
	                	</c:when>
	                	<c:otherwise>
                                        <c:choose>
                                                <c:when test="${!agenda.isValido()}">
                                                    <c:choose>
                                                        <c:when test="${agenda.getValor()== -1}">
                                                        <tr style="background-color: #ccffeb;">
                                                            <td>${agenda.getNome()}</td>
                                                            <th>0</th>
                                                        </tr>
                                                        </c:when>
                                                        <c:otherwise>
                                                        <tr style="background-color: #ffcccc;">
                                                            <td>${agenda.getNome()}</td>
                                                            <th>0</th>
                                                        </tr>
                                                        </c:otherwise>
                                                     </c:choose>
			                	</c:when>
			                	<c:otherwise>
						             <tr style="background-color: #ccffb3;">
						             	<td>${agenda.getNome()}</td>
					                    <th>${agenda.getValor()}</th>
				                	</tr>
			                	</c:otherwise>
		              	 	 </c:choose>
	                	</c:otherwise>
                                </c:choose>
              	  
                	</c:forEach>
                        <tr style="background-color: #bfbfbf;">
                            <th>Total</th>
                            <th>${levante.getTotalValor()}</th>
                        </tr>
			</table>
                        </div>
		</c:forEach>
        
    </details>
            
    <div class="col-md-12">
        <br><br><br>
    </div>
    
</div>
    <div class="row">
        <c:import url="rodape.jsp" />
    </div>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    <script src="<c:url value="/resources/js/transition.js" />"></script>
    <script src="<c:url value="/resources/js/collapse.js" />"></script>
  </body>
</html>