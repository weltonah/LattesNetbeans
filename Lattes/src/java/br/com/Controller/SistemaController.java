package br.com.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import br.com.Analise.LattesMetricService;
import br.com.DAO.CriterioDao;
import br.com.Modelo.Criterios;
import br.com.Modelo.Pesquisador;
import br.com.Modelo.Resultado;
import java.io.IOException;
import java.time.Clock;

@Controller
public class SistemaController {
	@RequestMapping("/criterio")
	public String criterio() {
	return "criterio";
        //return "manutencao";
	}
        @RequestMapping("/")
	public String index() {
	return "criterio";
         //return "manutencao";
	}
        @RequestMapping("/atualizacao")
	public String atualizacao() {
	return "atualizacao";
         //return "manutencao";
	}
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	@RequestMapping("/submitCriterio")
	public String submitCriterio(@RequestParam("area") String aux, HttpSession session) {
		session.setAttribute("area", aux);
		return "upload";
	}
	@RequestMapping("/upload")
	public String upload(Model model,@RequestParam("file") MultipartFile file2, HttpSession session) throws IOException {
		File convFile = new File( file2.getOriginalFilename());
                String fileName = null;
		String aux = (String) session.getAttribute("area");
			try {
				byte[] bytes = file2.getBytes();
				fileName = file2.getOriginalFilename();
                                 System.out.println(fileName);
				CriterioDao criDao = new CriterioDao();
				Criterios crit = criDao.preencher(aux);
                                String rootPath;
				//Versão Linux
                                rootPath =  "/var/lib/tomcat7/webapps/Lattes";
                                // Versão windows
                                //rootPath = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\Lattes";
                                        
				File file = new File(rootPath + File.separator + "tmpFiles");
				// Create the file on server
                                if (!file.exists())
					file.mkdirs();
				File serverFile = new File(file.getAbsolutePath() + File.separator + fileName);
                                BufferedOutputStream stream;
                                stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                                stream.write(bytes);
                                stream.close();
				
				Resultado result = LattesMetricService.getPesquisador2(serverFile, crit);
				
				model.addAttribute("resultado", result);
                                bytes.clone();
				return "analise";
			} catch (Exception e) {
				System.out.println(e.getMessage());
				return e.getMessage();
			}
	}
	@RequestMapping("/analise")
	public String analise() {
		
		return "null";
	}
        
        @RequestMapping("/artComplInd")
	public String artComplInd() {
		return "criterio/artComplInd";
	}
        
        @RequestMapping("/artComplAceito")
	public String artComplAceito() {
		return "criterio/artComplAceito";
	}
        
        @RequestMapping("/livroPublic")
	public String livroPublic() {
		return "criterio/livroPublic";
	}
        @RequestMapping("/livroOrg")
	public String livroOrg() {
		return "criterio/livroOrg";
	}
        @RequestMapping("/capLivro")
	public String capLivro() {
		return "criterio/capLivro";
	}
        @RequestMapping("/trabEve")
	public String trabEve() {
		return "criterio/trabEve";
	}
        @RequestMapping("/OriDouAndCon")
	public String OriDouAndCon() {
		return "criterio/OriDouAndCon";
	}
        @RequestMapping("/CoriDouAndCon")
	public String CoriDouAndCon() {
		return "criterio/CoriDouAndCon";
	}
        @RequestMapping("/OriMesAndCon")
	public String OriMesAndCon() {
		return "criterio/OriMesAndCon";
	}
        @RequestMapping("/CoriMesAndCon")
	public String CoriMesAndCon() {
		return "criterio/CoriMesAndCon";
	}
        @RequestMapping("/OriIcAndConc")
	public String OriIcAndConc() {
		return "criterio/OriIcAndConc";
	}
        @RequestMapping("/dedExc")
	public String dedExc() {
		return "criterio/dedExc";
	}
        @RequestMapping("/patNac")
	public String patNac() {
		return "criterio/patNac";
	}
        @RequestMapping("/patInt")
	public String patInt() {
		return "criterio/patInt";
	}
        @RequestMapping("/TraEvInt")
	public String TraEvInt() {
		return "criterio/TraEvInt";
	}
        @RequestMapping("/TraEvNac")
	public String TraEvNac() {
		return "criterio/TraEvNac";
	}
        @RequestMapping("/OriDouAnd")
	public String OriDouAnd() {
		return "criterio/OriDouAnd";
	}
        @RequestMapping("/OriMesAnd")
	public String OriMesAnd() {
		return "criterio/OriMesAnd";
	}
        @RequestMapping("/OriDouCon")
	public String OriDouCon() {
		return "criterio/OriDouCon";
	}
        @RequestMapping("/OriMesCon")
	public String OriMesCon() {
		return "criterio/OriMesCon";
	}
        @RequestMapping("/CoriDouCon")
	public String CoriDouCon() {
		return "criterio/CoriDouCon";
	}
        @RequestMapping("/CoriMesCon")
	public String CoriMesCon() {
		return "criterio/CoriMesCon";
	}
        @RequestMapping("/Doutor")
	public String Doutor() {
		return "criterio/Doutor";
	}
        @RequestMapping("/BancMes")
	public String BancMes() {
		return "criterio/BancMes";
	}
        @RequestMapping("/BancDou")
	public String BancDou() {
		return "criterio/BancDou";
	}
        @RequestMapping("/BancQuaDou")
	public String BancQuaDou() {
		return "criterio/BancQuaDou";
	}
        
}
