//package br.com.Analise;
//
//import java.io.File;
//import java.io.IOException;
//import java.rmi.ServerException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.Part;
//
//import br.com.Modelo.Pesquisador;
//
///**
// *
// * @author igor
// */
//@WebServlet(name = "LattesMetricServlet", urlPatterns = {"/index.html", "/file-upload.html", "/list.html", "/file.html"})
//@MultipartConfig(location = "/tmp/LattesMetric/uploadedFiles")
//public class LattesMetricServlet extends HttpServlet {
//	
//    private final Map<String, String> GET_MAP = new HashMap<String, String>() {
//        {
//            put("/index.html", "WEB-INF/file-upload.jsp");
//        }
//    };
//    private final Map<String, String> POST_MAP = new HashMap<String, String>() {
//        {
//
//        }
//    };
//    private static final String SAVE_DIR = "/tmp/LattesMetric/uploadedFiles";
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.INFO, "GET {0}", request.getServletPath());
//
//        if (GET_MAP.containsKey(request.getServletPath())) {
//            request.getRequestDispatcher(GET_MAP.get(request.getServletPath())).forward(request, response);
//        } else {
//            if (request.getServletPath().contains("/list.html")) {
//                doListFiles(request, response);
//            } else if (request.getServletPath().contains("/file.html")) {
//                doFileShow(request, response);
//            }
//        }
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.INFO, "POST {0}", request.getServletPath());
//
//        if (POST_MAP.containsKey(request.getServletPath())) {
//            request.getRequestDispatcher(POST_MAP.get(request.getServletPath())).forward(request, response);
//        } else {
//            if (request.getServletPath().contains("/file-upload.html")) {
//                doFileUpload(request, response);
//            }
//        }
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Lattes Metric";
//    }// </editor-fold>
//
//    private void doFileUpload(HttpServletRequest request, HttpServletResponse response) {
//        // gets absolute path of the web application
//        String appPath = request.getServletContext().getRealPath("");
//        // constructs path of the directory to save uploaded file
//        String savePath = SAVE_DIR;
//        Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.INFO, "\nappPath {0}\n savePath {1}", new Object[]{appPath, savePath});
//
//        try {
//            // creates the save directory if it does not exists
//            File fileSaveDir = new File(savePath);
//            if (!fileSaveDir.exists()) {
//                fileSaveDir.mkdir();
//            }
//
//            for (Part part : request.getParts()) {
//                String fileName = extractFileName(part);
//                // refines the fileName in case it is an absolute path
//                fileName = new File(fileName).getName();
//                Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.INFO, "\nfilename {0}", savePath);
//                part.write(File.separator + fileName);
//                Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.INFO, "part: {0}", part.getSubmittedFileName());
//            }
//            request.setAttribute("message", "Envio bem sucedido!");
//            request.getRequestDispatcher("WEB-INF/upload-status.jsp").forward(request, response);
//        } catch (IOException | ServletException ex) {
//            Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//
//    private void doListFiles(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        //String appPath = request.getServletContext().getRealPath("");
//        String savePath = SAVE_DIR;
//
//        List<Pesquisador> pesquisadores = new ArrayList<>();
//
//        try {
//            File[] files = new File(savePath).listFiles();
//            Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.INFO, "files: {0}", savePath);
//            for (File file : files) {
//                if (file.isFile()) {
//                    pesquisadores.add(LattesMetricService.getPesquisador(file));
//                }
//            }
//            Collections.sort(pesquisadores);
//            Collections.reverse(pesquisadores);
//            request.setAttribute("pesquisadores", pesquisadores);
//            request.getRequestDispatcher("WEB-INF/list-files.jsp").forward(request, response);
//        } catch (Exception e) {
//            throw new ServerException("Erro ao listar os pesquisadores", e);
//        }
//    }
//
//    /**
//     * Extracts file name from HTTP header content-disposition
//     */
//    private String extractFileName(Part part) {
//        String contentDisp = part.getHeader("content-disposition");
//        String[] items = contentDisp.split(";");
//        for (String s : items) {
//            if (s.trim().startsWith("filename")) {
//                return s.substring(s.indexOf("=") + 2, s.length() - 1);
//            }
//        }
//        return "";
//    }
//
//    private void doFileShow(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            //String appPath = request.getServletContext().getRealPath("");
//            String savePath = SAVE_DIR;
//            File file = new File(savePath + File.separator + request.getParameter("f"));
//            if (!file.exists()) {
//                response.sendRedirect("list.html");
//                return;
//            }
//
//            Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.INFO, "Reading file: {0}", file.getAbsolutePath());
//
//            Pesquisador pesquisador = LattesMetricService.getPesquisador(file);
//
//            request.setAttribute("pesquisador", pesquisador);
//            request.getRequestDispatcher("WEB-INF/file.jsp").forward(request, response);
//        } catch (Exception ex) {
//            Logger.getLogger(LattesMetricServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//}
