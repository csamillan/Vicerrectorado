package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class noticias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>VIR | VICERRECTORADO</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"Business_Blog Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("        <script type=\"applijewelleryion/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("        <link href=\"css/noticias.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/css-f4b41.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("            <div >\r\n");
      out.write("                <section class=\"container cshadow breadcrumbs t3-sl t3-sl-1\">\r\n");
      out.write("                    <ul class=\"breadcrumb \">\r\n");
      out.write("                        <li class=\"active\"><span class=\"divider hasTooltip\" data-original-title=\"\" title=\"\"><i class=\"icon-user\" data-toggle=\"tooltip\" title=\"Estas aqui: \"></i></span></li>\r\n");
      out.write("                        <li><a href=\"/\" class=\"pathway\">Inicio</a></li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"pathway\">Noticias</a></li>\r\n");
      out.write("                        <li><span>Locales</span></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"line-title\">&nbsp;</div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"container cshadow breadcrumbs\">\r\n");
      out.write("                    <div class=\"titulo-noticias-h1 text-center\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row \">\r\n");
      out.write("                                <div class=\"col-md-12\">\r\n");
      out.write("                                    <h1>Noticias</h1>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"noticias-menu\">\r\n");
      out.write("                        <div class=\"nav-noticias\">\r\n");
      out.write("                            <div class=\"col-md-offset-3 col-sm-offset-2 not-event-tabs hidden-xs\">\r\n");
      out.write("                                <ul class=\"nav nav-tabs\">\r\n");
      out.write("                                    <li class=\"active\"><a class=\"noti\"  role=\"tab\"  data-toggle=\"tab\"  href=\"#\">Locales</a></li>\r\n");
      out.write("                                    <li><a class=\"noti\"  role=\"tab\"  data-toggle=\"tab\" href=\"#\">Nacionales</a></li>\r\n");
      out.write("                                    <li><a class=\"noti\"  role=\"tab\"  data-toggle=\"tab\" href=\"#\">Internacionales</a></li>                        \r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"interna-wrapper\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row interna\">\r\n");
      out.write("                                <div class=\"col-md-3\">\r\n");
      out.write("                                    <div class=\"nav-interna\">\r\n");
      out.write("                                        <div class=\"row\" id=\"buscar\">\r\n");
      out.write("                                            <div class=\"col-sm-12\">\r\n");
      out.write("                                                <div class=\"input-group custom-search-form\">\r\n");
      out.write("                                                    <input type=\"text\" class=\"form-control\" placeholder=\"Buscar...\">\r\n");
      out.write("                                                    <span class=\"input-group-btn\">\r\n");
      out.write("                                                        <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                                                            <span class=\"glyphicon glyphicon-search\"></span>\r\n");
      out.write("                                                        </button>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"grupo-nav\">\r\n");
      out.write("                                            <div><h3> Archivo</h3></div>\r\n");
      out.write("                                            <div class=\"panel-group\">\r\n");
      out.write("                                                <div class=\"panel panel-default\">\r\n");
      out.write("                                                    <div class=\"panel-heading\">\r\n");
      out.write("                                                        <h4 class=\"panel-title\">\r\n");
      out.write("                                                            <a data-toggle=\"collapse\" href=\"#collapse1\"><span class=\"glyphicon glyphicon-menu-right\"></span> 2017</a>\r\n");
      out.write("                                                        </h4>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div id=\"collapse1\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                                        <ul class=\"list-group\">\r\n");
      out.write("                                                            <li class=\"list-group-item\">Enero(1)</li>\r\n");
      out.write("                                                            <li class=\"list-group-item\">Marzo(3)</li>\r\n");
      out.write("                                                            <li class=\"list-group-item\">Junio(4)</li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"panel-group\">\r\n");
      out.write("                                                <div class=\"panel panel-default\">\r\n");
      out.write("                                                    <div class=\"panel-heading\">\r\n");
      out.write("                                                        <h4 class=\"panel-title\">\r\n");
      out.write("                                                            <a data-toggle=\"collapse\" href=\"#collapse2\"><span class=\"glyphicon glyphicon-menu-right\"></span> 2016</a>\r\n");
      out.write("                                                        </h4>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div id=\"collapse2\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                                        <ul class=\"list-group\">\r\n");
      out.write("                                                            <li class=\"list-group-item\">Enero</li>\r\n");
      out.write("                                                            <li class=\"list-group-item\">Marzo</li>\r\n");
      out.write("                                                            <li class=\"list-group-item\">Junio</li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"panel-group\">\r\n");
      out.write("                                                <div class=\"panel panel-default\">\r\n");
      out.write("                                                    <div class=\"panel-heading\">\r\n");
      out.write("                                                        <h4 class=\"panel-title\">\r\n");
      out.write("                                                            <a data-toggle=\"collapse\" href=\"#collapse3\"><span class=\"glyphicon glyphicon-menu-right\"></span> 2015</a>\r\n");
      out.write("                                                        </h4>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <div id=\"collapse3\" class=\"panel-collapse collapse\">\r\n");
      out.write("                                                        <ul class=\"list-group\">\r\n");
      out.write("                                                            <li class=\"list-group-item\">Enero</li>\r\n");
      out.write("                                                            <li class=\"list-group-item\">Julio </li>\r\n");
      out.write("                                                            <li class=\"list-group-item\">Septiembre</li>\r\n");
      out.write("                                                        </ul>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"col-md-9\">\r\n");
      out.write("                                    <article>\r\n");
      out.write("                                        <div class=\"row container-fluid\">\r\n");
      out.write("                                            <div class=\"col-sm-6 col-md-4\">\r\n");
      out.write("                                                <figure>\r\n");
      out.write("                                                    <img src=\"images/noticias/noti2.jpg\">\r\n");
      out.write("                                                </figure>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-sm-6 col-md-8\">\r\n");
      out.write("                                                <div class=\"direc-text\">\r\n");
      out.write("                                                    <h4><a href=\"paginanoticia.html\">Lambayeque: implementan centro de investigación tecnológica en UNPRG</a></h4>\r\n");
      out.write("                                                    <div class=\"fecha\"><i class=\"glyphicon glyphicon-calendar\"></i> 04/05/2017</div>\r\n");
      out.write("                                                    <p>&nbsp;\r\n");
      out.write("                                                        El vicerrector de Investigación, Ernesto Hashimoto Moncayo, indicó que la adquisición de 50 potentes microscopios es una palanca para lograr el desarrollo de la investigación en la universidad nacional…\r\n");
      out.write("                                                        El vicerrector de Investigación, Ernesto Hashimoto Moncayo, indicó que la adquisición de 50 potentes microscopios es una palanca para lograr el desarrollo de la investigación en la universidad nacional…</p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </article>\r\n");
      out.write("                                    <div class=\"paginacion text-center\"><ul class=\"pagination\"><li class=\"active\"><a>1</a></li><li><a href=\"#\">2</a></li><li><a href=\"#\">3</a></li><li><a> » </a></li></ul></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("            </div>\r\n");
      out.write("                <br>\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("            <script src=\"js/move-top.js\"></script>\r\n");
      out.write("            <script type=\"text/javascript\">\r\n");
      out.write("                $(document).ready(function () {\r\n");
      out.write("                    $().UItoTop({easingType: 'easeOutQuart'});\r\n");
      out.write("                });\r\n");
      out.write("            </script>\r\n");
      out.write("            <a href=\"#\" id=\"toTop\" style=\"display: block;\"><span id=\"toTopHover\" style=\"opacity: 0;\"></span>To Top</a>\r\n");
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
