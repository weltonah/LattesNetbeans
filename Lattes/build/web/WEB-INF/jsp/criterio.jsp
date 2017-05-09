
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
            <h2>�rea do conhecimento </h2>
            <div class="col-sm-6">
		<select class=" form-control" name="area" id="area">
		  <option value="exata">Ci�ncias Exatas</option>
		  <option value="biologica">Ci�ncias Biol�gicas</option>
		  <option value="eng">Engenharia e Ci�ncia da computa��o</option>
		  <option value="saude">Ci�ncias da Sa�de</option>
		  <option value="social">Ci�ncias Sociais Aplicadas</option>
		  <option value="humanas">Ci�ncias Humanas</option>
		  <option value="letras">Lingu�stica, Letras e Artes</option>
		</select>
            </div>
        </div>
	<div class="col-md-12">
	<h2>Crit�rios analisados</h2>
        <div class="well">
		<div id="exata" class="formulario">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedica��o Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos em peri�dico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos aceitos para publica��o
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
				Organiza��o de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes internacionais
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
				Banca de Qualifica��o de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Doutorado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Doutorado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Mestrado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Mestrado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o Inicia��o Cient�fica andamento/conclu�da 
			</div>
		</div>
		
		<div id="biologica" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedica��o Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos em peri�dico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos aceitos para publica��o
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
				Dep�sitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes internacionais
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
				Banca de Qualifica��o de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Doutorado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Doutorado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Mestrado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Mestrado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o Inicia��o Cient�fica andamento/conclu�da 
			</div>
		</div>
		
		<div id="eng" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedica��o Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos em peri�dico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos aceitos para publica��o
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
				Organiza��o de livros
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
				Dep�sitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes internacionais
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
				Banca de Qualifica��o de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Doutorado em Andamento
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Mestrado em Andamento
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Doutorado Conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Mestrado Conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Doutorado Conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-Orienta��o de Mestrado Conclu�da
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Orienta��o TFC Conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o Inicia��o Cient�fica andamento/conclu�da 
			</div>
		</div>
				
		<div id="saude" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedica��o Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos em peri�dico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos aceitos para publica��o
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
				Organiza��o de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes internacionais
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
				Banca de Qualifica��o de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Doutorado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Doutorado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Mestrado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Mestrado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o Inicia��o Cient�fica andamento/conclu�da 
			</div>
		</div>
		
		<div id="social" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedica��o Exclusiva
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Doutor
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos em peri�dico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Artigos completos aceitos para publica��o
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
				Organiza��o de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes internacionais
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
				Banca de Qualifica��o de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Doutorado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Doutorado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Mestrado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Mestrado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o Inicia��o Cient�fica andamento/conclu�da 
			</div>
		</div>
		
		<div id="humanas" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedica��o Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos em peri�dico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos aceitos para publica��o
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
				Organiza��o de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes internacionais
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
				Banca de Qualifica��o de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Doutorado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Doutorado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Mestrado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Mestrado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o Inicia��o Cient�fica andamento/conclu�da 
			</div>
		</div>
		
		<div id="letras" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedica��o Exclusiva
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos em peri�dico indexados
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Artigos completos aceitos para publica��o
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
				Organiza��o de livros
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Trabalhos completos em eventos
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes nacionais
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Dep�sitos de patentes internacionais
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Produ��o artistica coletiva em �mbito nacional
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Produ��o art�stica individual em �mbito nacional
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Produ��o art�stica coletiva em �mbito internacional
			</div>
                        <div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
				Produ��o art�stica individual em �mbito internacional
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
				Banca de Qualifica��o de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Doutorado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Doutorado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o de Mestrado em andamento/conclu�da 
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Co-orienta��o de Mestrado em andamento/conclu�da
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Orienta��o Inicia��o Cient�fica andamento/conclu�da 
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