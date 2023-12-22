package Servlets;

import Beans.Curso;
import Negocio.nCurso;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "sCurso", urlPatterns = {"/sCurso"})
public class sCurso extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            nCurso nnot = new nCurso();
            if (request.getParameter("opcion").equals("Registrar")) {
                String titulo = request.getParameter("titulo");
                String contenido = request.getParameter("contenido");
                String horario = request.getParameter("hora");
                String lugar = request.getParameter("lugar");
                String organizadores = request.getParameter("organizadores");
                String area = request.getParameter("area");
                String fechaInicio = request.getParameter("fechaInicio");
                String fechaFin = request.getParameter("fechaFin");

                Date a = Date.valueOf(fechaInicio);
                Date b = Date.valueOf(fechaFin);

                Curso not = new Curso(null, titulo, a, b, horario, lugar, organizadores, area, contenido, "A");
                nnot.Registrarcurso(not);

                response.sendRedirect("Back-end/Eventos.jsp");
            }
            if (request.getParameter("opcion").equals("ListarCursos")) {
                List<Curso> lista = new ArrayList<Curso>();
                lista = nnot.Listarcursoes();
                request.setAttribute("ListarCursos", lista);
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
