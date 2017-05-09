
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
  <head>
  <style>
	.center {
	    margin: auto;
	    width: 60%;
	    padding: 10px;
	}
	.center2 {
	    margin: auto;
	    width: 30%;
	    padding: 0px;
	}
        .inputfile + label {
	cursor: pointer;
        }
	</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
  </head>
  <body>
  <div>
    <div class="col-sm-12">
	  <div class="center" style="width: 50%; border-style: solid;">
		    <c:if test="${area.equals('exata')}">
				<h1>Ciências Exatas</h1>
			</c:if>
			<c:if test="${area.equals('biologica')}">
				<h1>Ciências Biológicas</h1>
			</c:if>	
			<c:if test="${area.equals('eng')}">
				<h1>Engenharia e Ciência da computação</h1>
			</c:if>	
			<c:if test="${area.equals('saude')}">
				<h1>Ciências da Saúde</h1>
			</c:if>	
			<c:if test="${area.equals('social')}">
				<h1>Ciências Sociais Aplicadas</h1>
			</c:if>	
			<c:if test="${area.equals('humanas')}">
				<h1>Ciências Humanas</h1>
			</c:if>	
			<c:if test="${area.equals('letras')}">
				<h1>Linguística, Letras e Artes</h1>
			</c:if>
			</div>
	</div>	
		    <div class="col-sm-12" >
		    <div class="center2">
		      <div class="well">
		        <form method="post" action="upload"
			          enctype="multipart/form-data">
                            <h3>Arquivo Lattes formato .zip do professor </h3> <input type="file" name="file" class="btn btn-primary btn-lg" size="100" />
                            <br><br>
                            <div align="right">
                                <button onclick='javascript:history.back();self.location.reload();' class="btn btn-danger">Voltar</button>
                                <button type="submit" class="btn btn-success">Analisar</button>
                                
                            </div>
                        </form>
		      </div>
		     </div>
		    </div>
      
    
  </body>
</html>