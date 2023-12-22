package org.apache.jsp.Back_002dend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                        <li class=\"active\">Dashboard</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"content\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("                            <div class=\"small-box bg-aqua\">\r\n");
      out.write("                                <div class=\"inner\">\r\n");
      out.write("                                    <h3>300</h3>\r\n");
      out.write("                                    <p>Usuarios Registrados</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"ion ion-person-add\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"usuarios.jsp\" class=\"small-box-footer\">Mas Informacion <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("                            <div class=\"small-box bg-green\">\r\n");
      out.write("                                <div class=\"inner\">\r\n");
      out.write("                                    <h3>4</h3>\r\n");
      out.write("                                    <p>Slide</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"ion-android-options\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"slide.jsp\" class=\"small-box-footer\">Mas Informacion <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("                            <div class=\"small-box bg-yellow\">\r\n");
      out.write("                                <div class=\"inner\">\r\n");
      out.write("                                    <h3>44</h3>\r\n");
      out.write("                                    <p>Articulos</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"ion-ios-paper\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"#\" class=\"small-box-footer\">Mas Informacion <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("                            <div class=\"small-box bg-purple\">\r\n");
      out.write("                                <div class=\"inner\">\r\n");
      out.write("                                    <h3>65</h3>\r\n");
      out.write("                                    <p>Noticias</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"ion-android-clipboard\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"#\" class=\"small-box-footer\">Mas Informacion <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("                            <div class=\"small-box bg-blue\">\r\n");
      out.write("                                <div class=\"inner\">\r\n");
      out.write("                                    <h3>65</h3>\r\n");
      out.write("                                    <p>Eventos</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"ion-android-calendar\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"#\" class=\"small-box-footer\">Mas Informacion <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-xs-6\">\r\n");
      out.write("                            <div class=\"small-box bg-red\">\r\n");
      out.write("                                <div class=\"inner\">\r\n");
      out.write("                                    <h3>10</h3>\r\n");
      out.write("                                    <p>Videos</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"ion-ios-videocam\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"#\" class=\"small-box-footer\">Mas Informacion <i class=\"fa fa-arrow-circle-right\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
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
