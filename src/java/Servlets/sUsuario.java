package Servlets;

import Beans.Bitacora;
import Beans.Facultad;
import Beans.Usuario;
import Negocio.nBitacora;
import Negocio.nFacultad;
import Negocio.nUsuario;
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

@WebServlet(name = "sUsuario", urlPatterns = {"/sUsuario"})
public class sUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            nUsuario nUser = new nUsuario();
            nBitacora nbit = new nBitacora();
            nFacultad nfac = new nFacultad();
            HttpSession sesion = request.getSession();
            ArrayList<Usuario> user;
            Usuario usu = new Usuario();

            if (request.getParameter("opcion").equals("Registrar")) {
                List<Facultad> listafac = new ArrayList<Facultad>();

                String nombre = request.getParameter("nombre");
                String Apellidop = request.getParameter("apaterno");
                String Apellidom = request.getParameter("amaterno");
                String Dni = request.getParameter("dni");
                String Sexo = "";
                String Grado = request.getParameter("grado");
                String Cargo = "";
                String Correo = request.getParameter("correo");
                String Celular = request.getParameter("celular");
                String clave = request.getParameter("clave");
                String cuenta = request.getParameter("cuenta");
                String Tipo = "U";
                String facultad = request.getParameter("facultad");
                Integer idfac = null;

                if (request.getParameter("sexo").equals("Femenino")) {
                    Sexo = "F";
                }
                if (request.getParameter("sexo").equals("Masculino")) {
                    Sexo = "M";
                }
                if (request.getParameter("cargo").equals("Director de investigacion")) {
                    Cargo = "D";
                }
                if (request.getParameter("cargo").equals("Secretaria")) {
                    Cargo = "S";
                }
                if (request.getParameter("cargo").equals("Chofer")) {
                    Cargo = "C";
                }
                if (request.getParameter("cargo").equals("Conserje")) {
                    Cargo = "E";
                }

                listafac = nfac.ListarFacultades();

                for (int i = 0; i < listafac.size(); i++) {
                    if (facultad.equals(listafac.get(i).getAbreviatura())) {
                        idfac = listafac.get(i).getId();
                    }
                }

                usu = new Usuario(null, nombre, Apellidop, Apellidom, Dni, Sexo, Grado, Cargo, Correo, Celular, cuenta, clave, Tipo, new Facultad(idfac));

                nUser.RegistrarUsuario(usu);
                //nbit.RegistrarBitacora(new Bitacora(null,"Usuario",request.getParameter("opcion"), null,new Usuario(usu.getId())));
                response.sendRedirect("Back-end/usuarios.jsp");

            }

            if (request.getParameter("opcion").equals("ListarUsuarios")) {
                List<Usuario> lista = new ArrayList<Usuario>();
                lista = nUser.ListarUsuarios();
                request.setAttribute("ListarUsuarios", lista);
            }

            if (request.getParameter("opcion").equals("Eliminar")) {
                String id = request.getParameter("us_id");
                Integer Id = Integer.parseInt(id);
                nUser.Eliminar(Id);
                user = (ArrayList<Usuario>) sesion.getAttribute("user");
                usu = (Usuario) user.get(0);

//                List<Usuario> lista = new ArrayList<Usuario>();
//                lista = nUser.ListarUsuarios();
                //nbit.RegistrarBitacora(new Bitacora(null,"Usuario",request.getParameter("opcion"), null,new Usuario(usu.getId())));
                response.sendRedirect("Back-end/usuarios.jsp");
            }

            if (request.getParameter("opcion").equals("Modificar")) {
                List<Facultad> listafac = new ArrayList<Facultad>();

                String id = request.getParameter("id");
                String nombre = request.getParameter("nombre");
                String Apellidop = request.getParameter("apaterno");
                String Apellidom = request.getParameter("amaterno");
                String Dni = request.getParameter("dni");
                String Sexo = request.getParameter("sexo");
                String Grado = request.getParameter("grado");
                String Cargo = "";
                String Correo = request.getParameter("correo");
                String Celular = request.getParameter("celular");
                String clave = request.getParameter("clave");
                String cuenta = request.getParameter("cuenta");
                String Tipo = "U";
                String facultad = request.getParameter("facultad");
                Integer idfac = null;

                if (request.getParameter("cargo").equals("DIRECTOR")) {
                    Tipo = "D";
                }
                if (request.getParameter("cargo").equals("SECRETARIA")) {
                    Tipo = "S";
                }
                if (request.getParameter("cargo").equals("CONSERJE")) {
                    Tipo = "E";
                }
                if (request.getParameter("cargo").equals("CHOFER")) {
                    Tipo = "C";
                }

                listafac = nfac.ListarFacultades();

                for (int i = 0; i < listafac.size(); i++) {
                    if (facultad == listafac.get(i).getAbreviatura()) {
                        idfac = listafac.get(i).getId();
                    }
                }

                if (idfac != null) {
                    usu = new Usuario(Integer.parseInt(id), nombre, Apellidop, Apellidom, Dni, Sexo, Grado, Cargo, Correo, Celular, cuenta, clave, Tipo, new Facultad(idfac));
                } else {
                    usu = new Usuario(Integer.parseInt(id), nombre, Apellidop, Apellidom, Dni, Sexo, Grado, Cargo, Correo, Celular, cuenta, clave, Tipo, null);
                }
                nUser.ModificarUsuario(usu);

//                List<Usuario> lista = new ArrayList<Usuario>();
//                lista = nUser.ListarUsuarios();
//                nbit.RegistrarBitacora(new Bitacora(null,"Usuario",request.getParameter("opcion"), null,new Usuario(usu.getId())));
                response.sendRedirect("Back-end/usuarios.jsp");
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
