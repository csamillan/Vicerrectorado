package Servlets;

import Beans.Evento;
import Negocio.nEvento;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(name = "sEvento", urlPatterns = {"/sEvento"})
@MultipartConfig
public class sEvento extends HttpServlet {

   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            nEvento nnot = new nEvento();
            if (request.getParameter("opcion").equals("Registrar")) {
                String titulo = request.getParameter("titulo");
                String contenido = request.getParameter("contenido");
                String hora = request.getParameter("hora");
                String lugar = request.getParameter("lugar");
                String fecha = request.getParameter("fecha");
                Date a = Date.valueOf(fecha);

                //recivir la imagen cargada
                InputStream inputStream = null;

                Part filePart = request.getPart("imagen");
                if (filePart != null) {
                    System.out.println(filePart.getName());
                    System.out.println(filePart.getSize());
                    System.out.println(filePart.getContentType());

                    inputStream = filePart.getInputStream();
                }
                String root = getServletContext().getRealPath("/");
                root = root.substring(0, root.length() - 10) + "\\web\\Back-end\\dist\\img\\eventos";

                // Lugar de guardado y nombre del archivo
                File directorio = new File(root);
                String nombre = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();

                // ... código de guardado de imagen
                File file = File.createTempFile(nombre, ".jpg", directorio);
                nombre = file.getName();

                Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);

                Evento not = new Evento(null, titulo, a, hora, lugar, contenido, nombre);
                nnot.RegistrarEvento(not);

                response.sendRedirect("Back-end/Eventos.jsp");
            }
            if (request.getParameter("opcion").equals("ListarEventos")) {
                List<Evento> lista = new ArrayList<Evento>();
                lista = nnot.ListarEventoes();
                request.setAttribute("ListarEventos", lista);
            }
        } catch (Exception e) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
