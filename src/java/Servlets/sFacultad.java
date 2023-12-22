package Servlets;

import Beans.Bitacora;
import Beans.Facultad;
import Beans.Usuario;
import Negocio.nBitacora;
import Negocio.nFacultad;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "sFacultad", urlPatterns = {"/sFacultad"})
public class sFacultad extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            nFacultad nfacu = new nFacultad();
            /* nBitacora nbit = new nBitacora();
            HttpSession sesion = request.getSession();
            ArrayList<Usuario> user;
            Usuario usu = new Usuario();*/

            if (request.getParameter("opcion").equals("Registrar")) {
                String nombre = request.getParameter("nombre");
                String abrev = request.getParameter("abreviatura");

                Facultad facu = new Facultad(null, nombre, abrev);
                nfacu.RegistrarFacultad(facu);
                //nbit.RegistrarBitacora(new Bitacora(null, "Facultad", request.getParameter("opcion"), null, new Usuario(usu.getId())));
                response.sendRedirect("Back-end/facultad.jsp");
            }
            if (request.getParameter("opcion").equals("Modificar")) {
                String id = request.getParameter("u_id");
                String nombre = request.getParameter("u_nombre");
                String abrev = request.getParameter("u_abreviatura");

               /* user = (ArrayList<Usuario>) sesion.getAttribute("user");
                usu = (Usuario) user.get(0);*/

                Facultad facu = new Facultad(Integer.parseInt(id), nombre, abrev);
                nfacu.ModificarFacultad(facu);
                //nbit.RegistrarBitacora(new Bitacora(null, "Facultad", request.getParameter("opcion"), null, new Usuario(usu.getId())));
                response.sendRedirect("Back-end/facultad.jsp");
            }
            if (request.getParameter("opcion").equals("ListarFacultades")) {
                List<Facultad> lista = new ArrayList<Facultad>();
                lista = nfacu.ListarFacultades();
                request.setAttribute("listaFacultad", lista);
            }
            if (request.getParameter("opcion").equals("Eliminar")) {
                String id = request.getParameter("fac_id");
                Integer Id = Integer.parseInt(id);
                /*
                user = (ArrayList<Usuario>) sesion.getAttribute("user");
                usu = (Usuario) user.get(0);
*/
                nfacu.EliminarFacultad(Id);
               // nbit.RegistrarBitacora(new Bitacora(null, "Facultad", request.getParameter("opcion"), null, new Usuario(usu.getId())));
                response.sendRedirect("Back-end/facultad.jsp");
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
