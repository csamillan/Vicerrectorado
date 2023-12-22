package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class basedatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>VIR | Biblioteca</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"Business_Blog Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("        <script type=\"applijewelleryion/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <!-- Custom Theme files -->\r\n");
      out.write("\r\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("        <link href=\"css/bibliotecas.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("        <link href=\"css/css-f4b41.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- header -->\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><span class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></span><a href=\"#\">Biblioteca</a></li>\r\n");
      out.write("                    <li><span class=\"glyphicon glyphicon-envelope\" aria-hidden=\"true\"></span><a href=\"#\">Correo Institucional</a></li>\r\n");
      out.write("                    <li><span class=\"glyphicon glyphicon-phone\" aria-hidden=\"true\"></span><a href=\"http://unprg.edu.pe/univ/portal/documentos_s/unprg-directorio.pdf\">Directorio Telefonico</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- //header -->\r\n");
      out.write("\r\n");
      out.write("        <!-- header bot -->\r\n");
      out.write("        <div class=\"header-bot\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"col-md-3 header-left\">\r\n");
      out.write("                    <h1><a href=\"#\"><img src=\"images/logounprg.png\"></a></h1>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-6\">\r\n");
      out.write("                    <div  class=\"col-md-12\" id=\"menu-top\">\r\n");
      out.write("                        <ul id=\"circle\">\r\n");
      out.write("                            <li><a  href=\"index.jsp\" data-original-title=\"Inicio\"><i class=\"fa fa-home icon inicio\"></i></a></li>\r\n");
      out.write("                            <li><a  href=\"https://www.facebook.com/VRINV/\" ><i class=\"fa fa-facebook icon facebook\"></i></a></li>\r\n");
      out.write("                            <li><a rel=\"tooltip\" data-placement=\"top\" title=\"\" href=\"#\" data-original-title=\"Twitter\"><i class=\"fa fa-twitter icon twitter\"></i></a></li>\r\n");
      out.write("                            <li><a  href=\"https://www.youtube.com/channel/UCRmaQyHXfPhVOPeVG0Tc5DQ\" ><i class=\"fa fa-youtube icon youtube\"></i></a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <div  class=\"col-md-12 button_login\">\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li class= \"\"><a href=\"\" target=\"_blank\">Login</a></li>\r\n");
      out.write("                            <li class= \"\"><a href=\"\" target=\"_blank\">Registrar</a></li>\t\r\n");
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- //header bot -->\r\n");
      out.write("\r\n");
      out.write("        <!--head-bottom-->\r\n");
      out.write("        <div class=\"head-bottom-biblioteca\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav\">\r\n");
      out.write("                        <li ><a href=\"index.jsp\">Inicio</a></li>\r\n");
      out.write("                        <li class=\"dropdown\">\r\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">Sistema de Bibliotecas<span class=\"caret\"></span></a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\">\r\n");
      out.write("                                <li><a href=\"#\">Presentacion</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Historia del Sistema Bibliotecas</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Directorio</a></li>\r\n");
      out.write("                                <li><a href=\"#\">Bibliotecas</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"basedatos.jsp\">Base de datos</a></li>\r\n");
      out.write("                        <li ><a href=\"recursoselectronicos.jsp\">Recusos Electrónicos</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Catálogo en Línea</a></li>\r\n");
      out.write("                        <li><a href=\"#\">Repositorios</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div><!--/.nav-collapse -->\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--head-bottom-->\r\n");
      out.write("\r\n");
      out.write("        <!-- main contenido -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"container  t3-sl t3-sl-1\" style=\"border-bottom: 1px solid #D7D9DF;\">\t\t\r\n");
      out.write("                <div >\r\n");
      out.write("                    <center><h2>Base de datos</h2>\r\n");
      out.write("                    </center>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"bases-lista base-lista-pe\">\r\n");
      out.write("                    <div class=\"formato\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6 bases-item nueva\">\r\n");
      out.write("                                <div class=\"bases-item-content\">\r\n");
      out.write("                                    <div class=\"img\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/biblioteca/EBSCO_Discovery-80x80.jpg\" alt=\"\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"bases-item-over\">\r\n");
      out.write("                                        <h2><a href=\"#\">EBSCO Discovery Service (EDS)</a></h2>\r\n");
      out.write("                                        <a href=\"#\"  class=\"btn btn-primary consultar\">Consultar</a>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                        <a class=\"ver-mas\" href=\"#\">Más información <span class=\"glyphicon glyphicon-menu-right\"></span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6 bases-item nueva\">\r\n");
      out.write("                                <div class=\"bases-item-content\">\r\n");
      out.write("                                    <div class=\"img\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/biblioteca/EBSCO_Research_Databases-150x43.jpg\" alt=\"\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"bases-item-over\">\r\n");
      out.write("                                        <h2><a href=\"#\">Ebsco Research Database</a></h2>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-primary consultar\">Consultar</a>\t\t\t\t\r\n");
      out.write("                                        <a class=\"ver-mas\" href=\"#\">Más información <span class=\"glyphicon glyphicon-menu-right\"></span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6 bases-item nueva\">\r\n");
      out.write("                                <div class=\"bases-item-content\">\r\n");
      out.write("                                    <div class=\"img\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/biblioteca/proquest-150x57.jpg\" alt=\"\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"bases-item-over\">\r\n");
      out.write("                                        <h2><a href=\"#\">ProQuest</a></h2>\r\n");
      out.write("                                        <a href=\"#\"  class=\"btn btn-primary consultar\">Consultar</a>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                        <a class=\"ver-mas\" href=\"#\">Más información <span class=\"glyphicon glyphicon-menu-right\"></span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6 bases-item nueva\">\r\n");
      out.write("                                <div class=\"bases-item-content\">\r\n");
      out.write("                                    <div class=\"img\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/biblioteca/E-Libro-80x80.png\" alt=\"\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"bases-item-over\">\r\n");
      out.write("                                        <h2><a href=\"#\">E-Libro</a></h2>\r\n");
      out.write("                                        <a href=\"#\"  class=\"btn btn-primary consultar\">Consultar</a>\t\t\t\t\r\n");
      out.write("                                        <a class=\"ver-mas\" href=\"#\">Más información <span class=\"glyphicon glyphicon-menu-right\"></span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-md-6 bases-item nueva\">\r\n");
      out.write("                                <div class=\"bases-item-content\">\r\n");
      out.write("                                    <div class=\"img\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/biblioteca/Vlex.jpg\" alt=\"\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"bases-item-over\">\r\n");
      out.write("                                        <h2><a href=\"#\">Vlex</a></h2>\r\n");
      out.write("                                        <a href=\"#\"  class=\"btn btn-primary consultar\">Consultar</a>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("                                        <a class=\"ver-mas\" href=\"#\">Más información <span class=\"glyphicon glyphicon-menu-right\"></span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-6 bases-item nueva\">\r\n");
      out.write("                                <div class=\"bases-item-content\">\r\n");
      out.write("                                    <div class=\"img\">\r\n");
      out.write("                                        <a href=\"#\"><img src=\"images/biblioteca/wiley_stacked-150x53.jpg\" alt=\"\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"bases-item-over\">\r\n");
      out.write("                                        <h2><a href=\"#\">Wiley Online Library</a></h2>\r\n");
      out.write("                                        <a href=\"#\" target=\"_blank\" class=\"btn btn-primary consultar\">Consultar</a>\t\t\t\t\r\n");
      out.write("                                        <a class=\"ver-mas\" href=\"#\">Más información <span class=\"glyphicon glyphicon-menu-right\"></span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- End main contenido -->\r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <!-- technology -->\r\n");
      out.write("        <!-- footer -->\r\n");
      out.write("        <div class=\"footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"col-md-3\" >\r\n");
      out.write("                    <div class=\"col-md-12 header-left\">\r\n");
      out.write("                        <h4><a href=\"index.jsp\"><img src=\"images/logounprg.png\" ></a></h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"mid-btm\">\r\n");
      out.write("                        <p><i class=\"fa fa-map-marker\"></i><a> Calle Juan XXIII 391 Lambayeque</a></p>\r\n");
      out.write("                        <p><i class=\"fa fa-phone\"></i><a> 283146 - 283115 - 282120 - 282356</a></p>\r\n");
      out.write("                        <li><i class=\"fa fa-envelope\"></i><a href=\"#\"> webmaster@unprg.edu.pe</a></li>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <h4>Estudia UNPRG</h4>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"http://admision.unprg.edu.pe/admision\"> Admisiòn</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"http://cpu.unprg.edu.pe/phpcpu\"> Centro Preuniversitario </a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"http://unprg.edu.pe/univ/portal\"> Pregrado</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"http://www2.unprg.edu.pe/epg\"> Postgrado</a></li>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3 \">\r\n");
      out.write("                    <h4>Nosotros</h4>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Rectorado</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Vicerrectorado Acadèmico </a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Vicerrectorado de Investigaciòn</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Decanato</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Bienestar Universitario </a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-3 \">\r\n");
      out.write("                    <h4>Enlaces directos</h4>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Inicio</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Noticias</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Servicios</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Imagen Institucional</a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Portal de Transparencia </a></li>\r\n");
      out.write("                    <li><i class=\"fa fa-caret-square-o-right \"></i><a href=\"#\"> Descargas</a></li>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"clearfix\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- footer -->\r\n");
      out.write("        <!-- footer-bottom -->\r\n");
      out.write("        <!-- footer-bottom -->\r\n");
      out.write("        <div class=\"copyright\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <p>©  Vicerrectorado de Investigacion-UNPRG | 2017 </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/move-top.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function () {\r\n");
      out.write("                /*\r\n");
      out.write("                 var defaults = {\r\n");
      out.write("                 containerID: 'toTop', // fading element id\r\n");
      out.write("                 containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("                 scrollSpeed: 1200,\r\n");
      out.write("                 easingType: 'linear' \r\n");
      out.write("                 };\r\n");
      out.write("                 */\r\n");
      out.write("\r\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("        <a href=\"#\" id=\"toTop\" style=\"display: block;\"><span id=\"toTopHover\" style=\"opacity: 0;\"></span>To Top</a>\r\n");
      out.write("\r\n");
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
