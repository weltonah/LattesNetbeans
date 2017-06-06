
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html >
  <head>
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
      <c:import url="cabecalho.jsp" />
      <div class="mx-auto" style="margin: 0 auto; width: 70%; position: relative;">
          <div class="alert alert-warning col-sm-12" style="margin-top: 10px;">
              <div class="col-md-1"><span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span></div>
                <div class="col-md-10"><label style="padding-left: 10px;"> Este sistema esta calibrado 
                para analisar corriculos de docentes da Universidade Federal de Juiz de Fora. O triênio avaliado é de 2014-2017 </label>
                </div>
          </div>
          
	<form action="submitCriterio">
	<div class="col-sm-12">
            <h3>Área do conhecimento </h2>
            <div class="col-sm-6">
		<select style="width: 100%; height: 40px;" name="area" id="area">
		  <option value="exata">Ciências Exatas</option>
		  <option value="biologica">Ciências Biológicas</option>
		  <option value="eng">Engenharia e Ciência da computação</option>
		  <option value="saude">Ciências da Saúde</option>
		  <option value="social">Ciências Sociais Aplicadas</option>
		  <option value="humanas">Ciências Humanas</option>
		  <option value="letras">Linguística, Letras e Artes</option>
		</select>
            </div>
            <div class="col-sm-3"></div>
             <div class="col-sm-2"><button type="submit" class="btn btn-primary btn-lg ">Avançar -></button></div>
             <div class="col-sm-1"></div>
        </div>
        </form>
        <div class="col-md-12">
        <hr size="30" style="border: 1px solid #ccc">
        </div>
	<div class="col-md-12">
	 <h3>Critérios analisados</h3>
        <div class="well" style="background-color: #e6eeff;">
            <div class="well row"> 
                <h5 style="margin-left: 40%;"><strong>Legenda</strong></h5>
                <div class="col-sm-6">
                <span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                    Criterio ativado para analise na ferramenta
                </div>
                <div class="col-sm-6">
                <span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                    Criterio desativado para analise na ferramenta
                </div>
            </div>
		<div id="exata" class="formulario">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva
                            <a class="glyphicon glyphicon-question-sign" href="dedExc" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Artigos completos em periódico indexados
                        <a class="glyphicon glyphicon-question-sign" href="artComplInd" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Artigos completos aceitos para publicação
                        <a class="glyphicon glyphicon-question-sign" href="artComplAceito" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Livros publicados
                        <a class="glyphicon glyphicon-question-sign" href="livroPublic" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Capitulos de livros
                            <a class="glyphicon glyphicon-question-sign" href="capLivro" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Organização de livros
                            <a class="glyphicon glyphicon-question-sign" href="livroOrg" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Trabalhos completos em eventos
                            <a class="glyphicon glyphicon-question-sign" href="trabEve" target="_blank"></a>    
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes nacionais
                            <a class="glyphicon glyphicon-question-sign" href="patNac" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes internacionais
                            <a class="glyphicon glyphicon-question-sign" href="patInt" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Mestrado externa ao programa
                            <a class="glyphicon glyphicon-question-sign" href="BancMes" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Doutorado externa ao programa
                            <a class="glyphicon glyphicon-question-sign" href="BancDou" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Qualificação de Doutorado externa ao programa
                            <a class="glyphicon glyphicon-question-sign" href="BancQuaDou" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Doutorado em andamento/concluída 
                            <a class="glyphicon glyphicon-question-sign" href="OriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Doutorado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="OriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação Iniciação Científica andamento/concluída 
                            <a class="glyphicon glyphicon-question-sign" href="OriIcAndConc" target="_blank"></a>
                            
			</div>
		</div>
		
		<div id="biologica" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
				Regime de Dedicação Exclusiva                            
                            <a class="glyphicon glyphicon-question-sign" href="dedExc" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Artigos completos em periódico indexados *
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Artigos completos aceitos para publicação *
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Livros publicados
                            <a class="glyphicon glyphicon-question-sign" href="livroPublic" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Capitulos de livros
                            <a class="glyphicon glyphicon-question-sign" href="capLivro" target="_blank"></a>
			</div>
			
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes nacionais
                            <a class="glyphicon glyphicon-question-sign" href="patNac" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes internacionais
                            <a class="glyphicon glyphicon-question-sign" href="patInt" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Mestrado externa ao programa
                            <a class="glyphicon glyphicon-question-sign" href="BancMes" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Doutorado externa ao programa
                            <a class="glyphicon glyphicon-question-sign" href="BancDou" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Qualificação de Doutorado externa ao programa
                            <a class="glyphicon glyphicon-question-sign" href="BancQuaDou" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Doutorado em andamento/concluída 
                            <a class="glyphicon glyphicon-question-sign" href="OriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Doutorado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="OriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação Iniciação Científica andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="OriIcAndConc" target="_blank"></a>
			</div>
                        <div>
                            <br><br>
			* O sistema não contabiliza este item pois ainda não analisa o fator de
                        impacto
			</div>
		</div>
		
		<div id="eng" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Regime de Dedicação Exclusiva
                            <a class="glyphicon glyphicon-question-sign" href="dedExc" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Artigos completos em periódico indexados *
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Artigos completos aceitos para publicação *
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Livros publicados
                            <a class="glyphicon glyphicon-question-sign" href="livroPublic" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Capitulos de livros
                            <a class="glyphicon glyphicon-question-sign" href="capLivro" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Organização de livros
                            <a class="glyphicon glyphicon-question-sign" href="livroOrg" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Trabalhos Completos em Eventos Internacionais
                            <a class="glyphicon glyphicon-question-sign" href="TraEvInt" target="_blank"></a>
			</div>
                        <div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Trabalhos Completos em Eventos Nacionais
                            <a class="glyphicon glyphicon-question-sign" href="TraEvNac" target="_blank"></a>
			</div>
                        <div>
                            (Eventos Internacionais + Eventos Nacionais) possui limite máximo de 9
			</div>
                    
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes nacionais
                            <a class="glyphicon glyphicon-question-sign" href="patNac" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes internacionais
                            <a class="glyphicon glyphicon-question-sign" href="patInt" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Mestrado externa ao programa (limite máximo de 6)
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Doutorado externa ao programa (limite máximo de 3)
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Qualificação de Doutorado externa ao programa (limite máximo de 3)
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Doutorado em Andamento (limite máximo de 3)
                            <a class="glyphicon glyphicon-question-sign" href="OriDouAnd" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Mestrado em Andamento (limite máximo de 9)
                            <a class="glyphicon glyphicon-question-sign" href="OriMesAnd" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Doutorado Concluída  
                            <a class="glyphicon glyphicon-question-sign" href="OriDouCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Mestrado Concluída
                            <a class="glyphicon glyphicon-question-sign" href="OriMesCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Doutorado Concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriDouCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-Orientação de Mestrado Concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriMesCon" target="_blank"></a>
			</div>
                        <div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação TFC Concluída (limite máximo de 12)
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação Iniciação Científica andamento/concluída  (limite máximo de 24)
                            <a class="glyphicon glyphicon-question-sign" href="OriIcAndConc" target="_blank"></a>
			</div>
                        <div>
                            <br><br>
                            * O sistema não contabiliza este item pois ainda não analisa o JCR
			</div>
		</div>
				
		<div id="saude" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Regime de Dedicação Exclusiva
                            <a class="glyphicon glyphicon-question-sign" href="dedExc" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Artigos completos em periódico indexados
                            <a class="glyphicon glyphicon-question-sign" href="artComplInd" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Artigos completos aceitos para publicação
                            <a class="glyphicon glyphicon-question-sign" href="artComplAceito" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Livros publicados
                            <a class="glyphicon glyphicon-question-sign" href="livroPublic" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Capitulos de livros
                            <a class="glyphicon glyphicon-question-sign" href="capLivro" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Organização de livros
                            <a class="glyphicon glyphicon-question-sign" href="livroOrg" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Trabalhos completos em eventos
                            <a class="glyphicon glyphicon-question-sign" href="trabEve" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes nacionais
                            <a class="glyphicon glyphicon-question-sign" href="patNac" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes internacionais
                            <a class="glyphicon glyphicon-question-sign" href="patInt" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Doutorado em andamento/concluída 
                            <a class="glyphicon glyphicon-question-sign" href="OriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Doutorado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="OriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação Iniciação Científica andamento/concluída 
                            <a class="glyphicon glyphicon-question-sign" href="OriIcAndConc" target="_blank"></a>
			</div>
		</div>
		
		<div id="social" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Regime de Dedicação Exclusiva
                            <a class="glyphicon glyphicon-question-sign" href="dedExc" target="_blank"></a>
			</div>
                        <div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Doutor
                            <a class="glyphicon glyphicon-question-sign" href="Doutor" target="_blank"></a>    
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Artigos completos em periódico indexados *
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Artigos completos aceitos para publicação *
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Livros publicados (limite máximo de 3)
                            <a class="glyphicon glyphicon-question-sign" href="livroPublic" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Capitulos de livros (limite máximo de 12)
                            <a class="glyphicon glyphicon-question-sign" href="capLivro" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Organização de livros (limite máximo de 3)
                            <a class="glyphicon glyphicon-question-sign" href="livroOrg" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Trabalhos completos em eventos (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="trabEve" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes nacionais
                            <a class="glyphicon glyphicon-question-sign" href="patNac" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes internacionais
                            <a class="glyphicon glyphicon-question-sign" href="patInt" target="_blank"></a>
			</div>
                        <div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Mestrado externa ao programa (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="BancMes" target="_blank"></a>
			</div>
                        <div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Doutorado externa ao programa (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="BancDou" target="_blank"></a>
			</div>
                        <div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Banca de Qualificação de Doutorado externa ao programa (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="BancQuaDou" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Doutorado em andamento/concluída (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="OriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Doutorado em andamento/concluída (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="CoriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Mestrado em andamento/concluída  (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="OriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Mestrado em andamento/concluída (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="CoriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação Iniciação Científica andamento/concluída  (limite máximo de 18)
                            <a class="glyphicon glyphicon-question-sign" href="OriIcAndConc" target="_blank"></a>
			</div>
                        <div>
                            <br><br>
                            * O sistema não contabiliza este item pois ainda não analisa o Qualis 
			</div>
		</div>
		
		<div id="humanas" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Regime de Dedicação Exclusiva
                            <a class="glyphicon glyphicon-question-sign" href="dedExc" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Artigos completos em periódico indexados
                            <a class="glyphicon glyphicon-question-sign" href="artComplInd" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Artigos completos aceitos para publicação
                            <a class="glyphicon glyphicon-question-sign" href="artComplAceito" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Livros publicados
                            <a class="glyphicon glyphicon-question-sign" href="livroPublic" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Capitulos de livros
                            <a class="glyphicon glyphicon-question-sign" href="capLivro" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Organização de livros
                            <a class="glyphicon glyphicon-question-sign" href="livroOrg" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Trabalhos completos em eventos
                            <a class="glyphicon glyphicon-question-sign" href="trabEve" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes nacionais
                            <a class="glyphicon glyphicon-question-sign" href="patNac" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes internacionais
                            <a class="glyphicon glyphicon-question-sign" href="patInt" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Doutorado em andamento/concluída 
                            <a class="glyphicon glyphicon-question-sign" href="OriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Doutorado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="OriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Mestrado em andamento/concluída
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação Iniciação Científica andamento/concluída 
                            <a class="glyphicon glyphicon-question-sign" href="OriIcAndConc" target="_blank"></a>
			</div>
		</div>
		
		<div id="letras" class="formulario" style="display:none;">
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Regime de Dedicação Exclusiva
                            <a class="glyphicon glyphicon-question-sign" href="dedExc" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Artigos completos em periódico indexados
                            <a class="glyphicon glyphicon-question-sign" href="artComplInd" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Artigos completos aceitos para publicação
                            <a class="glyphicon glyphicon-question-sign" href="artComplAceito" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Livros publicados
                            <a class="glyphicon glyphicon-question-sign" href="livroPublic" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Capitulos de livros
                            <a class="glyphicon glyphicon-question-sign" href="capLivro" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Organização de livros
                            <a class="glyphicon glyphicon-question-sign" href="livroOrg" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Trabalhos completos em eventos
                            <a class="glyphicon glyphicon-question-sign" href="trabEve" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes nacionais
                            <a class="glyphicon glyphicon-question-sign" href="patNac" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Depósitos de patentes internacionais
                            <a class="glyphicon glyphicon-question-sign" href="patInt" target="_blank"></a>
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
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Mestrado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-remove-circle red" aria-hidden="true"></span>
                            Banca de Qualificação de Doutorado externa ao programa
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Doutorado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="OriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Doutorado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriDouAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="OriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Co-orientação de Mestrado em andamento/concluída
                            <a class="glyphicon glyphicon-question-sign" href="CoriMesAndCon" target="_blank"></a>
			</div>
			<div>
			<span class="glyphicon glyphicon-ok-circle green" aria-hidden="true"></span>
                            Orientação Iniciação Científica andamento/concluída 
                            <a class="glyphicon glyphicon-question-sign" href="OriIcAndConc" target="_blank"></a>
			</div>
		</div>
	</div>  
                
       
        </div>
        	
          <div class="col-md-12">
            <br><br><br>
          </div>
  </div>
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