
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
    <script>
        $(function() {

        // We can attach the `fileselect` event to all file inputs on the page
        $(document).on('change', ':file', function() {
          var input = $(this),
              numFiles = input.get(0).files ? input.get(0).files.length : 1,
              label = input.val().replace(/\\/g, '/').replace(/.*\//, '');
          input.trigger('fileselect', [numFiles, label]);
        });

        // We can watch for our custom `fileselect` event like this
        $(document).ready( function() {
            $(':file').on('fileselect', function(event, numFiles, label) {

                var input = $(this).parents('.input-group').find(':text'),
                    log = numFiles > 1 ? numFiles + ' files selected' : label;

                if( input.length ) {
                    input.val(log);
                } else {
                    if( log ) alert(log);
                }

            });
        });
  
});
    </script>
  </head>
  <body>
       <c:import url="cabecalho.jsp" />
<div class="mx-auto" style="margin: 0 auto; width: 50%; position: relative;">
    <div class="col-sm-12">
            <div class="center">
              <font align="center">
		    <c:if test="${area.equals('exata')}">
				<h1>Ci�ncias Exatas</h1>
			</c:if>
			<c:if test="${area.equals('biologica')}">
				<h1>Ci�ncias Biol�gicas</h1>
			</c:if>	
			<c:if test="${area.equals('eng')}">
				<h1>Engenharia e Ci�ncia da computa��o</h1>
			</c:if>	
			<c:if test="${area.equals('saude')}">
				<h1>Ci�ncias da Sa�de</h1>
			</c:if>	
			<c:if test="${area.equals('social')}">
				<h1>Ci�ncias Sociais Aplicadas</h1>
			</c:if>	
			<c:if test="${area.equals('humanas')}">
				<h1>Ci�ncias Humanas</h1>
			</c:if>	
			<c:if test="${area.equals('letras')}">
				<h1>Lingu�stica, Letras e Artes</h1>
			</c:if>
                </font>
            </div>
    </div>	
        <div class="col-sm-12" >
            <div class="center2">
              <div class="well">
                <form method="post" action="upload" enctype="multipart/form-data">
                    <h3>Upload do arquivo lattes formato .zip ou .xml do professor </h3> 
                <div class="col-xs-12" >
                    <div class="input-group">
                        <label class="input-group-btn">
                            <span class="btn btn-primary">
                                <span class="glyphicon glyphicon-open-file" aria-hidden="true"></span>
                                Selecione o arquivo&hellip; <input type="file" name="file" style="display: none;" multiple>
                            </span>
                        </label>
                        <input type="text" class="form-control" readonly>
                    </div>
                </div>
                <br><br>
                <div align="right">
                    <a href="criterio" class="btn btn-danger">Voltar</a>
                    <button type="submit" class="btn btn-success">Analisar</button>
                </div>
                </form>
              </div>
             </div>
        </div>
</div>
    <c:import url="rodape.jsp" />
  </body>
</html>