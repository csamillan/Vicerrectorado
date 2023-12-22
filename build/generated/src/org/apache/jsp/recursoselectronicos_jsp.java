package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recursoselectronicos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>VIR | Biblioteca</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Business_Blog Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("        <script type=\"applijewelleryion/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\t\n");
      out.write("        <link href=\"css/bibliotecas.css\" rel='stylesheet' type='text/css' />\t\n");
      out.write("        <link href=\"css/css-f4b41.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel='stylesheet' type='text/css' />\t\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- //header -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- navegation-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- main contenido -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"container  t3-sl t3-sl-1\" style=\"border-bottom: 1px solid #D7D9DF;\">\t\t\n");
      out.write("                <div >\n");
      out.write("                    <center><h2>Recursos Electrónicos</h2>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"bases-lista base-lista-pe\">\n");
      out.write("                    <div class=\"formato\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"images/recursos electronicos/ingenierias.png\" >\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <h3>Ciencias e Ingenierias</h3>\n");
      out.write("                                        <p>Aquí podras encontrar libros electronicos de ciencias básicas e ingenierias</p>\n");
      out.write("                                        <br>\n");
      out.write("                                        <p><a href=\"ingenierias.jsp\" class=\"btn btn-primary\"  role=\"button\">Ver más <span class=\"glyphicon glyphicon-eye-open\"></span></a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"images/recursos electronicos/cienciassalud.jpg\" >\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <h3>Ciencias de la Salud</h3>\n");
      out.write("                                        <p>Aquí podras encontrar libros electronicos de ciencias básicas e ingenierias</p>\n");
      out.write("                                        <br>\n");
      out.write("                                        <p><a href=\"ciencias_salud.jsp\" class=\"btn btn-primary\"  role=\"button\">Ver más <span class=\"glyphicon glyphicon-eye-open\"></span></a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"images/recursos electronicos/economicos y empresariales.jpg\" >\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <h3>Económicos-Empresariales</h3>\n");
      out.write("                                        <p>Aquí podras encontrar libros electronicos de ciencias básicas e ingenierias</p>\n");
      out.write("                                        <br>\n");
      out.write("                                        <p><a href=\"economicas_empresariales.jsp\" class=\"btn btn-primary\"  role=\"button\">Ver más <span class=\"glyphicon glyphicon-eye-open\"></span></a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 col-md-4\">\n");
      out.write("                                <div class=\"thumbnail\">\n");
      out.write("                                    <img src=\"images/recursos electronicos/sociales_educacion.png\" >\n");
      out.write("                                    <div class=\"caption\">\n");
      out.write("                                        <h3>Ciencias Sociales y Educación</h3>\n");
      out.write("                                        <p>Aquí podras encontrar libros electronicos de ciencias básicas e ingenierias</p>\n");
      out.write("                                        <br>\n");
      out.write("                                        <p><a href=\"#\" class=\"btn btn-primary\"  role=\"button\">Ver más <span class=\"glyphicon glyphicon-eye-open\"></span></a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- End main contenido -->\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <!-- technology -->\n");
      out.write("        <!-- footer -->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"col-md-3\" >\n");
      out.write("                    <div class=\"col-md-12 header-left\">\n");
      out.write("                        <h4><a href=\"index.html\"><img src=\"images/logounprg.png\" ></a></h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"mid-btm\">\n");
      out.write("                        <p><i class=\"fa fa-map-marker\"></i><a> Calle Juan XXIII 391 Lambayeque</a></p>\n");
      out.write("                        <p><i class=\"fa fa-phone\"></i><a> 283146 - 283115 - 282120 - 282356</a></p>\n");
      out.write("                        <li><i class=\"fa fa-envelope\"></i><a href=\"#\"> webmaster@unprg.edu.pe</a></li>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <h4>Estudia UNPRG</h4>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"http://admision.unprg.edu.pe/admision\"> Admisiòn</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"http://cpu.unprg.edu.pe/phpcpu\"> Centro Preuniversitario </a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"http://unprg.edu.pe/univ/portal\"> Pregrado</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"http://www2.unprg.edu.pe/epg\"> Postgrado</a></li>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 \">\n");
      out.write("                    <h4>Nosotros</h4>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Rectorado</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Vicerrectorado Acadèmico </a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Vicerrectorado de Investigaciòn</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Decanato</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Bienestar Universitario </a></li>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 \">\n");
      out.write("                    <h4>Enlaces directos</h4>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Inicio</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Noticias</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Servicios</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Imagen Institucional</a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Portal de Transparencia </a></li>\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Descargas</a></li>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- footer -->\n");
      out.write("        <!-- footer-bottom -->\n");
      out.write("        <!-- footer-bottom -->\n");
      out.write("        <div class=\"copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p>©  Vicerrectorado de Investigacion-UNPRG | 2017 </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                /*\n");
      out.write("                 var defaults = {\n");
      out.write("                 containerID: 'toTop', // fading element id\n");
      out.write("                 containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                 scrollSpeed: 1200,\n");
      out.write("                 easingType: 'linear' \n");
      out.write("                 };\n");
      out.write("                 */\n");
      out.write("\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <a href=\"#\" id=\"toTop\" style=\"display: block;\"><span id=\"toTopHover\" style=\"opacity: 0;\"></span>To Top</a>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
