
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
    	
		    <div class="col-sm-12" >
		    <div class="center2">
		      <div class="well">
		        <form method="post" action="jcr"
			          enctype="multipart/form-data">
                            <h3>Upload do arquivo lattes formato .zip do professor </h3> 
                        <div class="col-xs-12" >
                            <!--<input type="file" name="file" class="btn btn-primary"  />-->
                            
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
                                <button onclick='javascript:history.back();self.location.reload();' class="btn btn-danger">Voltar</button>
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