package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class organigrama_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/organigrama.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("        <link href=\"css/css-f4b41.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/font-awesome.min.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <section class=\"container cshadow breadcrumbs t3-sl t3-sl-1\">\r\n");
      out.write("                    <ul class=\"breadcrumb \">\r\n");
      out.write("                        <li class=\"active\"><span class=\"divider hasTooltip\" data-original-title=\"\" title=\"\"><i class=\"icon-user\" data-toggle=\"tooltip\" title=\"EstÃ¡ aquÃ­: \"></i></span></li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"pathway\">Inicio</a></li>\r\n");
      out.write("                        <li><a href=\"#\" class=\"pathway\">El VRIP</a></li>\r\n");
      out.write("                        <li><span>Acerca del VRIP</span></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"custom\">\r\n");
      out.write("                        <div class=\"seccion-title\">EL VRIP</div>\r\n");
      out.write("                        <div class=\"line-title\">&nbsp;</div>\r\n");
      out.write("                        <div class=\"ad-title\">&nbsp;</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section>\r\n");
      out.write("                <section class=\"container cshadow breadcrumbs t3-sl t3-sl-1\">\r\n");
      out.write("                    <div class=\"row-fluid cshadow\">\r\n");
      out.write("                        <div class=\"row-fluid\">\r\n");
      out.write("                            <div class=\"cpad\">\r\n");
      out.write("                                <div id=\"t3-content\" class=\"t3-content span9 pull-right\">\r\n");
      out.write("                                    <div id=\"system-message-container\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"item-page clearfix\">\r\n");
      out.write("                                        <article>\r\n");
      out.write("                                            <header class=\"article-header clearfix\">\r\n");
      out.write("                                                <h3 class=\"article-title\">Organigrama</h3>\r\n");
      out.write("                                            </header>\r\n");
      out.write("                                            <section class=\"article-content clearfix\">\r\n");
      out.write("                                                <div class=\"formato-org\"> \r\n");
      out.write("                                                    <center><img src=\"images/organigrama/orgnigrama.PNG\"></center>\t\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\t\t\r\n");
      out.write("                                                    <div class=\"moduletable\">\r\n");
      out.write("                                                        <div class=\"custom\">\r\n");
      out.write("                                                            <div id=\"button\" style=\"background-color: #0D47A1; padding: 0px; margin-top: 0px; margin-bottom: 20px; line-height: 6px;\">&nbsp;\r\n");
      out.write("                                                            </div>\r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div> \t\t\t\t\r\n");
      out.write("                                            </section>\r\n");
      out.write("                                        </article>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"t3-sidebar t3-sidebar-1 span3\">\r\n");
      out.write("                                    <div class=\"t3-module module\" id=\"Mod220\">\r\n");
      out.write("                                        <div class=\"module-inner\">\r\n");
      out.write("                                            <div class=\"module-ct\">\r\n");
      out.write("                                                <div class=\"accordeonck \">\r\n");
      out.write("                                                    <ul class=\"menu\" id=\"accordeonck220\">\r\n");
      out.write("                                                        <li id=\"item-545\" class=\"item-545 current active level2\"><a class=\"isactive \" href=\"vicerrectorado.jsp\">Acerca del VRIP</a></li>\r\n");
      out.write("                                                        <li id=\"item-550\" class=\"item-550 level2\"><a href=\"directorio.jsp\">Directorio</a></li>\r\n");
      out.write("                                                        <li id=\"item-551\" class=\"item-551 level2\"><a href=\"autoridades.jsp\">Autoridades</a></li>\r\n");
      out.write("                                                        <li id=\"item-552\" class=\"item-552 level2\"><a href=\"organigrama.jsp\">Organigrama</a></li>\r\n");
      out.write("                                                        <li id=\"item-553\" class=\"item-553 level2\"><a href=\"#\">Plan Estrategico</a></li>\r\n");
      out.write("                                                        <li id=\"item-555\" class=\"item-555 level2\"><a href=\"documentos.jsp\">Documentos</a></li>\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </section> \r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("        <script src=\"js/move-top.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(document).ready(function() {\r\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\r\n");
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
