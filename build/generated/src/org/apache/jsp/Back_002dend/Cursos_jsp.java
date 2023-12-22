package org.apache.jsp.Back_002dend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Beans.Evento;

public final class Cursos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../sEvento?opcion=ListarEventos", out, false);
      out.write('\n');
      java.util.ArrayList ListarEventos = null;
      synchronized (request) {
        ListarEventos = (java.util.ArrayList) _jspx_page_context.getAttribute("ListarEventos", PageContext.REQUEST_SCOPE);
        if (ListarEventos == null){
          ListarEventos = new java.util.ArrayList();
          _jspx_page_context.setAttribute("ListarEventos", ListarEventos, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Vice | ADMIN</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/Ionicons/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/skins/_all-skins.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/morris/morris.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/datepicker/datepicker3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/fonts/fonts.css\">\n");
      out.write("        <link href=\"dist/css/noticias.css\" rel='stylesheet' type='text/css' />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MenuVertical.jsp", out, false);
      out.write("\n");
      out.write("                <div class=\"content-wrapper\">\n");
      out.write("                    <section class=\"content-header\">\n");
      out.write("                        <h1>\n");
      out.write("                            Inicio\n");
      out.write("                            <small>Panel de Control</small>\n");
      out.write("                        </h1>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                            <li class=\"active\">Evento</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </section>\n");
      out.write("                    <section class=\"content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-12\">\n");
      out.write("                                <div class=\"box box-primary\">                \n");
      out.write("                                    <div class=\"box-body\">                  \n");
      out.write("                                        <div class=\"nav-tabs-custom\">\n");
      out.write("                                            <ul class=\"nav nav-tabs pull-lef\">\n");
      out.write("                                                <li class=\"active\"><a href=\"#tab_1\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i>Evento</a></li>\n");
      out.write("                                                <li class=\"noti\"><a href=\"#tab_2\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i> Agregar Evento</a></li>\n");
      out.write("                                            </ul>\n");
      out.write("                                            <div class=\"tab-content\">\n");
      out.write("                                                <div class=\"tab-pane active\" id=\"tab_1\">\n");
      out.write("                                                    <div class=\"container-fluid\">\n");
      out.write("                                                        <div class=\"row\">\n");
      out.write("                                                            <div class=\"col-md-12\">\n");
      out.write("                                                            ");

                                                                for (int i = 0; i < ListarEventos.size(); i++) {
                                                                    Evento inv = (Evento) ListarEventos.get(i);
                                                            
      out.write("\n");
      out.write("                                                            <article style=\"border: 1px solid  #969696; margin: 10px; \">\n");
      out.write("                                                                <div class=\"row\">\n");
      out.write("                                                                    <div class=\"col-sm-4 col-md-4\" >\n");
      out.write("                                                                        <figure >\n");
      out.write("                                                                            <img src=\"dist/img/eventos/");
out.println(inv.getImagen());
      out.write("\" class=\"img-responsive\" style=\"width:400px; height: 200px;\">\n");
      out.write("                                                                        </figure>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <form action=\"../sNoticia\" method=\"post\" accept-charset=\"utf-8\" id=\"sNoticia\" enctype=\"multipart/form-data\">\n");
      out.write("                                                                        <input type=\"hidden\" id=\"u_id\" name=\"u_id\" value=\"");
out.print(inv.getId());
      out.write("\" >\n");
      out.write("                                                                        <input type=\"hidden\" id=\"imagen\" name=\"imagen\" value=\"");
out.print(inv.getImagen());
      out.write("\" >\n");
      out.write("                                                                        <div class=\"col-sm-4 col-md-4\">\n");
      out.write("                                                                            <div class=\"form-group \">\n");
      out.write("                                                                                <h2>Titulo: ");
out.print(inv.getTitulo());
      out.write("</h2> \n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"form-group \">\n");
      out.write("                                                                                <div class=\"fecha\">Fecha: ");
out.print(inv.getFecha());
      out.write("</div>            \n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <div class=\"form-group\" >\n");
      out.write("                                                                                <p>&nbsp;");
out.print(inv.getHora());
      out.write("\n");
      out.write("                                                                                </p>\n");
      out.write("                                                                            </div>\n");
      out.write("\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <div class=\"col-sm-4 col-md-4\">\n");
      out.write("                                                                            <div align=\"center\" style=\"margin: 60px;\" >\n");
      out.write("                                                                                <button type=\"submit\" class=\"btn btn-primary\" value=\"Modificar\" name=\"opcion\"><span class=\"glyphicon glyphicon-pencil\"></span> Editar</button>\n");
      out.write("                                                                                <button type=\"submit\" class=\"btn btn-danger\" value=\"Eliminar\" name=\"opcion\"><span class=\"glyphicon glyphicon-trash\"></span> Eliminar</button>\n");
      out.write("                                                                            </div>\n");
      out.write("\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </form>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </article>\n");
      out.write("                                                            ");
 }
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"tab-pane\" id=\"tab_2\">\n");
      out.write("                                                <div class=\"container-fluid\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"col-md-12\">\n");
      out.write("                                                            <form action=\"../sEvento\" method=\"post\" accept-charset=\"utf-8\" id=\"sEvento\" enctype=\"multipart/form-data\">  \n");
      out.write("                                                                <div class=\"form-group col-md-12\">\n");
      out.write("                                                                    <label>\n");
      out.write("                                                                        Nombre del Evento\n");
      out.write("                                                                    </label>\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"titulo\" name=\"titulo\" placeholder=\"Nombre del evento\" />\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group col-md-6\">\n");
      out.write("                                                                    <label>\n");
      out.write("                                                                        Fecha del Evento \n");
      out.write("                                                                    </label>\n");
      out.write("                                                                    <input type=\"date\" class=\"form-control\" id=\"fecha\" name=\"fecha\" placeholder=\"Fecha del Evento\" />\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group col-md-6\">\n");
      out.write("                                                                    <label>\n");
      out.write("                                                                        Hora del Evento\n");
      out.write("                                                                    </label>\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"hora\" name=\"hora\" placeholder=\"Hora del Evento\" />\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group col-md-12\">\n");
      out.write("                                                                    <label>\n");
      out.write("                                                                        Lugar del Evento\n");
      out.write("                                                                    </label>\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"lugar\" name=\"lugar\" placeholder=\"Lugar del evento\" />\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group col-md-12\">\n");
      out.write("                                                                    <label>\n");
      out.write("                                                                        Imagen del evento\n");
      out.write("                                                                    </label>\n");
      out.write("                                                                    <input type=\"file\" id=\"files\" name=\"imagen\" />\n");
      out.write("                                                                </div>\n");
      out.write("\n");
      out.write("                                                                <div class=\"form-group col-md-12\">\n");
      out.write("                                                                    <label>\n");
      out.write("                                                                        Breve descripcion del evento \n");
      out.write("                                                                    </label>\n");
      out.write("                                                                    <textarea cols=\"30\" rows=\"10\"  class=\"form-control\" id=\"contenido\" name=\"contenido\" placeholder=\"Descripcion del Evento\" ></textarea>  \n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"form-group col-md-12\">\n");
      out.write("                                                                    <div align=\"center\" >\n");
      out.write("                                                                        <button type=\"submit\" class=\"btn btn-primary\" value=\"Registrar\" name=\"opcion\" ><span class=\"glyphicon glyphicon-floppy-saved\"></span> Guardar</button>\n");
      out.write("                                                                        <button type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-remove\"></span>Cancelar</button>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </form>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <footer class=\"main-footer\">\n");
      out.write("                <strong>Copyright Vicerrectorado de Investigacion-2017. </strong> Todos los derechos reservado.\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"plugins/jQuery/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $.widget.bridge('uibutton', $.ui.button);</script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("        <script src=\"plugins/morris/morris.min.js\"></script>\n");
      out.write("        <script src=\"plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("        <script src=\"plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("        <script src=\"plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("        <script src=\"plugins/knob/jquery.knob.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js\"></script>\n");
      out.write("        <script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <script src=\"plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script src=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("        <script src=\"plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <script src=\"plugins/fastclick/fastclick.js\"></script>\n");
      out.write("        <script src=\"dist/js/adminlte.min.js\"></script>\n");
      out.write("        <script src=\"dist/js/pages/dashboard.js\"></script>\n");
      out.write("        <script src=\"dist/js/demo.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
