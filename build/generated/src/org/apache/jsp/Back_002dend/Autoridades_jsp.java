package org.apache.jsp.Back_002dend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Autoridades_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <title>Vice | ADMIN</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/Ionicons/css/ionicons.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/skins/_all-skins.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/morris/morris.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/datepicker/datepicker3.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/fonts/fonts.css\">\r\n");
      out.write("        <link href=\"dist/css/noticias.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MenuVertical.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"content-wrapper\">\r\n");
      out.write("                <section class=\"content-header\">\r\n");
      out.write("                    <h1>\r\n");
      out.write("                        Inicio\r\n");
      out.write("                        <small>Panel de Control</small>\r\n");
      out.write("                    </h1>\r\n");
      out.write("                    <ol class=\"breadcrumb\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\r\n");
<<<<<<< HEAD
      out.write("                        <li class=\"active\">Autoridades</li>\r\n");
=======
      out.write("                        <li class=\"active\">Noticias</li>\r\n");
>>>>>>> 3c5c3580e6e64ef1d7ece96f8225d98f62f0de11
      out.write("                    </ol>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"content\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-xs-12\">\r\n");
      out.write("                            <div class=\"box box-primary\">                \r\n");
      out.write("                                <div class=\"box-body\">                  \r\n");
      out.write("                                    <div class=\"nav-tabs-custom\">\r\n");
      out.write("                                        <ul class=\"nav nav-tabs pull-lef\">\r\n");
<<<<<<< HEAD
      out.write("                                            <li class=\"active\"><a href=\"#tab_1\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i>Autoridades</a></li>\r\n");
      out.write("                                            <li class=\"noti\"><a href=\"#tab_2\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i> Registrar Autoridad</a></li>\r\n");
=======
      out.write("                                            <li class=\"active\"><a href=\"#tab_1\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i>Noticias</a></li>\r\n");
      out.write("                                            <li class=\"noti\"><a href=\"#tab_2\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i> Agregar Noticia</a></li>\r\n");
>>>>>>> 3c5c3580e6e64ef1d7ece96f8225d98f62f0de11
      out.write("                                        </ul>\r\n");
      out.write("                                        <div class=\"tab-content\">\r\n");
      out.write("                                            <div class=\"tab-pane active\" id=\"tab_1\">\r\n");
      out.write("\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"tab-pane\" id=\"tab_2\">\r\n");
      out.write("                                                <div class=\"container-fluid\">\r\n");
      out.write("                                                    <div class=\"row\">\r\n");
      out.write("                                                        <div class=\"col-md-12\">\r\n");
      out.write("                                                            <form action=\"../sAutoridades\" method=\"post\" accept-charset=\"utf-8\" id=\"sAutoridades\" enctype=\"multipart/form-data\">  \r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Nombre de la Autoridad\r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"nombre\" name=\"nombre\" placeholder=\"Nombre de la Autoridad\" />\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Cargo:  \r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"cargo\" name=\"cargo\" placeholder=\"Cargo de la Autoridad\" />\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                 <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Año de Inicio de Gestion:  \r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                     <input type=\"text\" class=\"form-control\" id=\"ano\" name=\"ano\" maxlength=\"4\" placeholder=\"Año de Inicio de Gestion\" />\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Seleccionar Foto: \r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <input type=\"file\" id=\"files\" name=\"imagen\" />\r\n");
      out.write("                                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Perfil de la Autoridad:  \r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <textarea cols=\"30\" rows=\"10\"  class=\"form-control\" id=\"contenido\" name=\"contenido\" placeholder=\"Perfil de la Autoridad\" ></textarea>  \r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <div align=\"center\" >\r\n");
      out.write("                                                                        <button type=\"submit\" class=\"btn btn-primary\" value=\"Registrar\" name=\"opcion\" ><span class=\"glyphicon glyphicon-floppy-saved\"></span> Guardar</button>\r\n");
      out.write("                                                                        <button type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-remove\"></span>Cancelar</button>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </form>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            </div>\r\n");
      out.write("            <footer class=\"main-footer\">\r\n");
      out.write("                <strong>Copyright Vicerrectorado de Investigacion-2017. </strong> Todos los derechos reservado.\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"plugins/jQuery/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/morris/morris.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/sparkline/jquery.sparkline.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\r\n");
      out.write("        <script src=\"plugins/knob/jquery.knob.js\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\r\n");
      out.write("        <script src=\"plugins/datepicker/bootstrap-datepicker.js\"></script>\r\n");
      out.write("        <script src=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/slimScroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("        <script src=\"plugins/fastclick/fastclick.js\"></script>\r\n");
      out.write("        <script src=\"dist/js/adminlte.min.js\"></script>\r\n");
      out.write("        <script src=\"dist/js/pages/dashboard.js\"></script>\r\n");
      out.write("        <script src=\"dist/js/demo.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
