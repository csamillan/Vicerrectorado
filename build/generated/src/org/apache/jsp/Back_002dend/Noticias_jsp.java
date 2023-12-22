package org.apache.jsp.Back_002dend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Beans.Noticia;

public final class Noticias_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../sNoticia?opcion=ListarNoticias", out, false);
      out.write('\r');
      out.write('\n');
      java.util.ArrayList ListarSlider = null;
      synchronized (request) {
        ListarSlider = (java.util.ArrayList) _jspx_page_context.getAttribute("ListarSlider", PageContext.REQUEST_SCOPE);
        if (ListarSlider == null){
          ListarSlider = new java.util.ArrayList();
          _jspx_page_context.setAttribute("ListarSlider", ListarSlider, PageContext.REQUEST_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <title>Vice | ADMIN</title>\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
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
      out.write("                <div class=\"content-wrapper\">\r\n");
      out.write("                    <section class=\"content-header\">\r\n");
      out.write("                        <h1>\r\n");
      out.write("                            Inicio\r\n");
      out.write("                            <small>Panel de Control</small>\r\n");
      out.write("                        </h1>\r\n");
      out.write("                        <ol class=\"breadcrumb\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\r\n");
      out.write("                            <li class=\"active\">Noticias</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section class=\"content\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-xs-12\">\r\n");
      out.write("                                <div class=\"box box-primary\">                \r\n");
      out.write("                                    <div class=\"box-body\">                  \r\n");
      out.write("                                        <div class=\"nav-tabs-custom\">\r\n");
      out.write("                                            <ul class=\"nav nav-tabs pull-lef\">\r\n");
      out.write("                                                <li class=\"active\"><a href=\"#tab_1\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i>Noticias</a></li>\r\n");
      out.write("                                                <li class=\"noti\"><a href=\"#tab_2\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i> Agregar Noticia</a></li>\r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                            <div class=\"tab-content\">\r\n");
      out.write("                                                <div class=\"tab-pane active\" id=\"tab_1\">\r\n");
      out.write("                                                    <div class=\"container-fluid\">\r\n");
      out.write("                                                        <div class=\"row\">\r\n");
      out.write("                                                            <div class=\"col-md-12\">\r\n");
      out.write("                                                            ");

                                                                for (int i = 0; i < ListarSlider.size(); i++) {
                                                                    Noticia inv = (Noticia) ListarSlider.get(i);
                                                            
      out.write("\r\n");
      out.write("                                                            <article style=\"border: 1px solid  #969696; margin: 10px; \">\r\n");
      out.write("                                                                <div class=\"row\">\r\n");
      out.write("                                                                    <div class=\"col-sm-4 col-md-4\" >\r\n");
      out.write("                                                                        <figure >\r\n");
      out.write("                                                                            <img src=\"dist/img/noticias/");
out.println(inv.getImagen());
      out.write("\" class=\"img-responsive\" style=\"width:400px; height: 200px;\">\r\n");
      out.write("                                                                        </figure>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <form action=\"../sNoticia\" method=\"post\" accept-charset=\"utf-8\" id=\"sNoticia\" enctype=\"multipart/form-data\">\r\n");
      out.write("                                                                        <input type=\"hidden\" id=\"u_id\" name=\"u_id\" value=\"");
out.print(inv.getId());
      out.write("\" >\r\n");
      out.write("                                                                        <input type=\"hidden\" id=\"imagen\" name=\"imagen\" value=\"");
out.print(inv.getImagen());
      out.write("\" >\r\n");
      out.write("                                                                        <div class=\"col-sm-4 col-md-4\">\r\n");
      out.write("                                                                            <div class=\"form-group \">\r\n");
      out.write("                                                                                <h2>Titulo: ");
out.print(inv.getTitulo());
      out.write("</h2> \r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                            <div class=\"form-group \">\r\n");
      out.write("                                                                                <div class=\"fecha\">Fecha: ");
out.print(inv.getFecha());
      out.write("</div>            \r\n");
      out.write("                                                                            </div>\r\n");
      out.write("                                                                            <div class=\"form-group\" >\r\n");
      out.write("                                                                                <p>&nbsp;");
out.print(inv.getContenido());
      out.write("\r\n");
      out.write("                                                                                </p>\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                        <div class=\"col-sm-4 col-md-4\">\r\n");
      out.write("                                                                            <div align=\"center\" style=\"margin: 60px;\" >\r\n");
      out.write("                                                                                <button type=\"submit\" class=\"btn btn-primary\" value=\"Modificar\" name=\"opcion\"><span class=\"glyphicon glyphicon-pencil\"></span> Editar</button>\r\n");
      out.write("                                                                                <button type=\"submit\" class=\"btn btn-danger\" value=\"Eliminar\" name=\"opcion\"><span class=\"glyphicon glyphicon-trash\"></span> Eliminar</button>\r\n");
      out.write("                                                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                                                        </div>\r\n");
      out.write("                                                                    </form>\r\n");
      out.write("                                                                </div>\r\n");
      out.write("                                                            </article>\r\n");
      out.write("                                                            ");
 }
      out.write("\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"tab-pane\" id=\"tab_2\">\r\n");
      out.write("                                                <div class=\"container-fluid\">\r\n");
      out.write("                                                    <div class=\"row\">\r\n");
      out.write("                                                        <div class=\"col-md-12\">\r\n");
      out.write("                                                            <form action=\"../sNoticia\" method=\"post\" accept-charset=\"utf-8\" id=\"sNoticia\" enctype=\"multipart/form-data\">  \r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Agregar Título\r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"titulo\" name=\"titulo\" placeholder=\"Titulo de noticia\" />\r\n");
      out.write("                                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Agregar Fecha \r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <input type=\"date\" class=\"form-control\" id=\"fecha\" name=\"fecha\" placeholder=\"Fecha de noticia\" />\r\n");
      out.write("                                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Seleccionar imagen\r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <input type=\"file\" id=\"files\" name=\"imagen\" />\r\n");
      out.write("                                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Agregar Contenido \r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <textarea cols=\"30\" rows=\"10\"  class=\"form-control\" id=\"contenido\" name=\"contenido\" placeholder=\"Contenido de noticia\" ></textarea>  \r\n");
      out.write("                                                                </div>\r\n");
      out.write("\r\n");
      out.write("                                                                <div class=\"form-group\">\r\n");
      out.write("                                                                    <label>\r\n");
      out.write("                                                                        Fuente \r\n");
      out.write("                                                                    </label>\r\n");
      out.write("                                                                    <input type=\"text\" class=\"form-control\" id=\"fuente\" name=\"fuente\" placeholder=\"Fuente\" />\r\n");
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
      out.write("            $.widget.bridge('uibutton', $.ui.button);</script>\r\n");
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
      out.write("</html>\r\n");
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
