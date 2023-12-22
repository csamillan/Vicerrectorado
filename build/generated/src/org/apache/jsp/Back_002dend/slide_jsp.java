package org.apache.jsp.Back_002dend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Beans.Slider;

public final class slide_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../sSlider?opcion=ListarSlider", out, false);
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
      out.write("        <style>\r\n");
      out.write("            .thumb {\r\n");
      out.write("                height: 200px;\r\n");
      out.write("                width: 520px;\r\n");
      out.write("                border: 1px solid #000;\r\n");
      out.write("                margin: 10px 5px 0 0;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
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
      out.write("                            <li class=\"active\">Slide</li>\r\n");
      out.write("                        </ol>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section class=\"content\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-12\">\r\n");
      out.write("                                <div class=\"box box-primary\">\r\n");
      out.write("                                    <div class=\"box-header\">\r\n");
      out.write("                                        <h3 class=\"box-title\">Administrador Slide</h3>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"margin\">\r\n");
      out.write("                                        <div class=\"btn-group\">\r\n");
      out.write("                                            <button type=\"button\" class=\"btn btn-primary dropdown-toggle\" data-toggle=\"dropdown\"><spam class='glyphicon glyphicon-cog'></spam> Acciones <span class=\"caret\"></span><span class=\"sr-only\">Toggle Dropdown</span></button> \r\n");
      out.write("                                            <ul class=\"dropdown-menu\" role=\"menu\">\r\n");
      out.write("                                                <li><a href=\"#\" data-toggle=\"modal\" data-target=\"#nuevo-usuario\"><spam class='glyphicon glyphicon-user'></spam>Nueva Imagen</a></li>    \r\n");
      out.write("                                            </ul>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <div class=\"container-fluid\">\r\n");
      out.write("                                        <div id=\"carousel-1\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                                            <ol class=\"carousel-indicators\">\r\n");
      out.write("                                            ");

                                                for (int i = 0; i < ListarSlider.size(); i++) {
                                            
      out.write("\r\n");
      out.write("                                            <li data-target=\"#carousel-1\" data-slide-to=\"");
out.print(i);
      out.write('"');
      out.write(' ');
if (i == 0) {
                                                    out.println("class='active'");
                                                }
      out.write("></li>\r\n");
      out.write("                                                ");

                                                    }
                                                
      out.write("\r\n");
      out.write("                                        </ol>\r\n");
      out.write("                                        <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                                            ");

                                                for (int i = 0; i < ListarSlider.size(); i++) {
                                                    Slider inv = (Slider) ListarSlider.get(i);
                                            
      out.write("\r\n");
      out.write("                                            <div class=\"item ");
if (i == 0) {
                                                    out.println("active");
                                                }
      out.write("\"  align=\"center\">\r\n");
      out.write("                                                <img src=\"dist/img/slider/");
out.println(inv.getImagen());
      out.write("\" class=\"img-responsive\" alt=\"\"  >\r\n");
      out.write("                                                <div class=\"carousel-caption hidden-xs hidden-sm\">\r\n");
      out.write("                                                    <h3>");
out.println(inv.getTitulo());
      out.write("</h3>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            ");

                                                }
                                            
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <a href=\"#carousel-1\" class=\"left carousel-control\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                            <span class=\"sr-only\">Anterior</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                        <a href=\"#carousel-1\" class=\"right carousel-control\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("                                            <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("                                            <span class=\"sr-only\">Siguiente</span>\r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <div class=\"divider\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");

                                        for (int i = 0; i < ListarSlider.size(); i++) {
                                            Slider inv = (Slider) ListarSlider.get(i);
                                    
      out.write("\r\n");
      out.write("                                    <div class=\"col-md-3\" >\r\n");
      out.write("                                        <div class=\"thumbnail\">\r\n");
      out.write("                                            <img src=\"dist/img/slider/");
out.println(inv.getImagen());
      out.write("\" alt=\"...\">\r\n");
      out.write("                                            <div class=\"caption\">\r\n");
      out.write("                                                <form action=\"../sSlider\" method=\"get\" accept-charset=\"utf-8\" id=\"sSlider\" enctype=\"multipart/form-data\"> \r\n");
      out.write("                                                    <input type=\"hidden\" id=\"u_id\" name=\"u_id\" value=\"");
out.print(inv.getId());
      out.write("\" >\r\n");
      out.write("                                                    <input type=\"hidden\" id=\"imagen\" name=\"imagen\" value=\"");
out.print(inv.getImagen());
      out.write("\" >\r\n");
      out.write("                                                    <div class=\"form-group \">\r\n");
      out.write("                                                        <label class=\"control-label\">Titulo</label>\r\n");
      out.write("                                                        <input type=\"text\" class=\"form-control\" placeholder=\"Titulo\" id=\"titulo\" value=\"");
out.println(inv.getTitulo());
      out.write("\" name=\"titulo\">\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div class=\"form-group \">\r\n");
      out.write("                                                        <textarea row=\"5\" class=\"form-control\" placeholder=\"Descripcion\" id=\"descripcion\" name=\"descripcion\">");
out.println(inv.getDescripcion());
      out.write("</textarea>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div align=\"center\" >\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-primary\" value=\"Modificar\" name=\"opcion\"><span class=\"glyphicon glyphicon-pencil\"></span> Editar</button>\r\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-danger\" value=\"Eliminar\" name=\"opcion\"><span class=\"glyphicon glyphicon-trash\"></span> Eliminar</button>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </form>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    ");

                                        }
                                    
      out.write("\r\n");
      out.write("                                </div>            \r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <div class=\"modal fade\" id=\"nuevo-usuario\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("                    <div class=\"modal-dialog\">\r\n");
      out.write("                        <div class=\"modal-content\">\r\n");
      out.write("                            <div class=\"modal-header\" style=\"background-color:#3c8dbc; color:#FFF\" id=\"header-new\"><center><h3>Nuevo Usuario</h3></center></div>\r\n");
      out.write("                            <div class=\"modal-body\">  \r\n");
      out.write("                                <form action=\"../sSlider\" method=\"post\" accept-charset=\"utf-8\" id=\"sSlider\" enctype=\"multipart/form-data\">  \r\n");
      out.write("                                    <div>                                                          \r\n");
      out.write("                                        <div class=\"thumbnail\">\r\n");
      out.write("                                            <div class=\"caption\">\r\n");
      out.write("                                                <output id=\"list\"></output>\r\n");
      out.write("                                                <div class=\"form-group\">\r\n");
      out.write("                                                    <label class=\"control-label\">Subir foto</label>\r\n");
      out.write("                                                    <input type=\"file\" id=\"files\" name=\"imagen\" />\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group \">\r\n");
      out.write("                                                    <label class=\"control-label\">Titulo</label>\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Titulo\" id=\"titulo\" name=\"titulo\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"form-group \">\r\n");
      out.write("                                                    <textarea row=\"10\" class=\"form-control\" placeholder=\"Descripcion\" id=\"descripcion\" name=\"descripcion\"></textarea>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>            \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"modal-footer\">\r\n");
      out.write("                                        <center>\r\n");
      out.write("                                            <div class=\"form-group col-md-6\"> \r\n");
      out.write("                                                <button type=\"submit\"  class=\"btn btn-success btn-flat\" value=\"Registrar\" name=\"opcion\"><span class=\"glyphicon glyphicon-saved\" aria-hidden=\"true\"></span> Guardar</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group col-md-6\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-danger btn-flat\" data-dismiss=\"modal\"><span class=\"glyphicon glyphicon-remove-circle\" aria-hidden=\"true\"></span> Cancelar</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </center>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>          \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <footer class=\"main-footer\">\r\n");
      out.write("                <strong>Copyright Vicerrectorado de Investigacion-2017.  </strong> Todos los derechos reservado.\r\n");
      out.write("            </footer>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"plugins/jQuery/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            $.widget.bridge('uibutton', $.ui.button);\r\n");
      out.write("        </script>\r\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
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
      out.write("        <script src=\"dist/js/previsualizar.js\"></script>\r\n");
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
