
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
  <head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
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

</style>
  </head>
  
  
  
  <body>
      <c:import url="cabecalho.jsp" />
      
	<form class="form-horizontal" action="submitCriterio">
            
	<div class="col-sm-12">
            <h2>Área do conhecimento </h2>
            <div class="col-sm-6">
		<select class=" form-control" name="area" id="area">
		  <option value="exata">Ciências Exatas</option>
		  <option value="biologica">Ciências Biológicas</option>
		  <option value="eng">Engenharia e Ciência da computação</option>
		  <option value="saude">Ciências da Saúde</option>
		  <option value="social">Ciências Sociais Aplicadas</option>
		  <option value="humanas">Ciências Humanas</option>
		  <option value="letras">Linguística, Letras e Artes</option>
		</select>
            </div>
        </div>
	<div class="col-md-12">
	<h2>Critérios analisados</h2>
        <div class="well">
		<div id="exata" class="formulario">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos em periódico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos aceitos para publicação
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Livros publicados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Capitulos de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Organização de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes internacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Doutorado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Doutorado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Mestrado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Mestrado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação Iniciação Científica andamento/concluída 
			</div>
		</div>
		
		<div id="biologica" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos em periódico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos aceitos para publicação
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Livros publicados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Capitulos de livros
			</div>
			
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes internacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Doutorado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Doutorado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Mestrado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Mestrado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação Iniciação Científica andamento/concluída 
			</div>
		</div>
		
		<div id="eng" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos em periódico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos aceitos para publicação
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Livros publicados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Capitulos de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Organização de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos Completos em Eventos Internacionais
			</div>
                        <div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos Completos em Eventos Nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes internacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Doutorado em Andamento
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Mestrado em Andamento
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Doutorado Concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Mestrado Concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Doutorado Concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-Orientação de Mestrado Concluída
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Orientação TFC Concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação Iniciação Científica andamento/concluída 
			</div>
		</div>
				
		<div id="saude" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos em periódico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos aceitos para publicação
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Livros publicados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Capitulos de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Organização de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes internacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Doutorado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Doutorado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Mestrado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Mestrado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação Iniciação Científica andamento/concluída 
			</div>
		</div>
		
		<div id="social" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Doutor
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos em periódico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos aceitos para publicação
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Livros publicados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Capitulos de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Organização de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes internacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Doutorado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Doutorado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Mestrado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Mestrado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação Iniciação Científica andamento/concluída 
			</div>
		</div>
		
		<div id="humanas" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos em periódico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos aceitos para publicação
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Livros publicados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Capitulos de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Organização de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes internacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Doutorado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Doutorado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Mestrado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Mestrado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação Iniciação Científica andamento/concluída 
			</div>
		</div>
		
		<div id="letras" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos em periódico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos aceitos para publicação
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Livros publicados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Capitulos de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Organização de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Depósitos de patentes internacionais
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Produção artistica coletiva em âmbito nacional
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Produção artística individual em âmbito nacional
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Produção artística coletiva em âmbito internacional
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Produção artística individual em âmbito internacional
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Doutorado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Doutorado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação de Mestrado em andamento/concluída 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orientação de Mestrado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orientação Iniciação Científica andamento/concluída 
			</div>
		</div>
	</div>  
                
        <div align="right"><button type="submit" class="btn btn-primary">Selecionar</button></div>
        </div>
        </form>	
    <br>
    <br>
    <br>
    <c:import url="rodape.jsp" />
  </body>
  <script>
  var select = document.getElementById("area");
  var formularios = document.querySelectorAll('.formulario');

  select.onchange = function () {
      for (var i = 0; i < formularios.length; i++) formularios[i].style.display = 'none';
      var divID = select.options[select.selectedIndex].value;
      var div = document.getElementById(divID);
      div.style.display = 'block';
  };
  </script>
</html>