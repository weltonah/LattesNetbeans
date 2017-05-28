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
import br.com.DAO.ListaJCRDao;
import br.com.Modelo.Criterios;
import br.com.Modelo.Pesquisador;
import br.com.Modelo.Resultado;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Clock;




@Controller
public class SistemaController {
        //ambiente de produção
        //private final String ROOTPATH= "/var/lib/tomcat7/webapps/Lattes";
        // ambiente de desenvolvimento
        private final String ROOTPATH= "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\Lattes";
        private ListaJCRDao listajcr;
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
        
        @RequestMapping("/jcrupload")
	public String jcrupload() {
		return "jcr";
	}
        
        @RequestMapping("/jcr")
	public String jcr(Model model,@RequestParam("file") MultipartFile jcr, HttpSession session) throws IOException{
            File convFile = new File( jcr.getOriginalFilename());
            //file2.transferTo(convFile);
            String fileName = null;
            String aux = (String) session.getAttribute("area");
                try {
                        byte[] bytes = jcr.getBytes();
                        fileName = jcr.getOriginalFilename();
                        CriterioDao criDao = new CriterioDao();
                        Criterios crit = criDao.preencher(aux);

                        File file = new File(ROOTPATH + File.separator + "tmpFiles");
                        // Create the file on server
                        if (!file.exists())
                                file.mkdirs();
                        File serverFile = new File(file.getAbsolutePath() + File.separator + fileName);
                        BufferedOutputStream stream;
                        stream = new BufferedOutputStream(new FileOutputStream(serverFile));
                        stream.write(bytes);
                        stream.close();
                        listajcr = new ListaJCRDao(serverFile);
                        stream.close();
                        return "jcr";
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                        return e.getMessage();
                }
	}
        
        
        
	@RequestMapping("/submitCriterio")
	public String submitCriterio(@RequestParam("area") String aux, HttpSession session) {
		session.setAttribute("area", aux);
		return "upload";
	}
	@RequestMapping("/upload")
	public String upload(Model model,@RequestParam("file") MultipartFile file2, HttpSession session) throws IOException {
		File convFile = new File( file2.getOriginalFilename());
                //file2.transferTo(convFile);
                String fileName = null;
		String aux = (String) session.getAttribute("area");
			try {
				byte[] bytes = file2.getBytes();
				fileName = file2.getOriginalFilename();
				CriterioDao criDao = new CriterioDao();
				Criterios crit = criDao.preencher(aux);
				       
				File file = new File(ROOTPATH + File.separator + "tmpFiles");
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
}
