package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bibliotecasCampus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>VIR | Biblioteca</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("        <meta name=\"keywords\" content=\"Business_Blog Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\r\n");
      out.write("        <script type=\"applijewelleryion/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\r\n");
      out.write("        <link href=\"css/style.css\" rel='stylesheet' type='text/css' />\t\r\n");
      out.write("        <link href=\"css/bibliotecaCampus.css\" rel='stylesheet' type='text/css' />\t\r\n");
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
      out.write("                <div class=\"bottom_content\">  \r\n");
      out.write("                    <h3 class=\"titulo\">Bibliotecas</h3>\r\n");
      out.write("                    <div class=\"col-md-6  portfolio-left\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <div class=\"event-img\">\r\n");
      out.write("                                <img src=\"images/bibliotecaCampus/biblioUNPRG.jpg\" alt=\"...\" >\r\n");
      out.write("                                <div class=\"over-image\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h4><a href=\"#\">Lorem Ipsum</a></h4>\r\n");
      out.write("                                <p>Mauris diam massa, malesuada a sapien in, semper vehicula erat. Vivamus sagittis leo a ullamcorper ultricies. Suspendisse placerat mattis arcu nec por</p>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    <a href=\"#\">School Studies</a>\r\n");
      out.write("                                    <a href=\"#\">College Studies</a>\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <span><i class=\"fa fa-chain chain_1\"></i>VIEW PROJECT</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 portfolio-left\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <div class=\"event-img\">\r\n");
      out.write("                                <img src=\"images/bibliotecaCampus/biblioUNPRG.jpg\" alt=\"...\" >\r\n");
      out.write("                                <div class=\"over-image\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"caption \">\r\n");
      out.write("                                <h4><a href=\"#\">Lorem Ipsum</a></h4>\r\n");
      out.write("                                <p>Mauris diam massa, malesuada a sapien in, semper vehicula erat. Vivamus sagittis leo a ullamcorper ultricies. Suspendisse placerat mattis arcu nec por</p>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    <a href=\"#\">School Studies</a>\r\n");
      out.write("                                    <a href=\"#\">College Studies</a>\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <span><i class=\"fa fa-chain chain_1\"></i>VIEW PROJECT</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 portfolio-left\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <div class=\"event-img\">\r\n");
      out.write("                                <img src=\"images/bibliotecaCampus/biblioUNPRG.jpg\" alt=\"...\" >\r\n");
      out.write("                                <div class=\"over-image\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"caption \">\r\n");
      out.write("                                <h4><a href=\"#\">Lorem Ipsum</a></h4>\r\n");
      out.write("                                <p>Mauris diam massa, malesuada a sapien in, semper vehicula erat. Vivamus sagittis leo a ullamcorper ultricies. Suspendisse placerat mattis arcu nec por</p>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    <a href=\"#\">School Studies</a>\r\n");
      out.write("                                    <a href=\"#\">College Studies</a>\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <span><i class=\"fa fa-chain chain_1\"></i>VIEW PROJECT</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6 portfolio-left\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <div class=\"event-img\">\r\n");
      out.write("                                <img src=\"images/bibliotecaCampus/biblioUNPRG.jpg\" alt=\"...\" >\r\n");
      out.write("                                <div class=\"over-image\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"caption \">\r\n");
      out.write("                                <h4><a href=\"#\">Lorem Ipsum</a></h4>\r\n");
      out.write("                                <p>Mauris diam massa, malesuada a sapien in, semper vehicula erat. Vivamus sagittis leo a ullamcorper ultricies. Suspendisse placerat mattis arcu nec por</p>\r\n");
      out.write("                                <span>\r\n");
      out.write("                                    <a href=\"#\">School Studies</a>\r\n");
      out.write("                                    <a href=\"#\">College Studies</a>\r\n");
      out.write("                                </span>\r\n");
      out.write("                                <a href=\"#\">\r\n");
      out.write("                                    <span><i class=\"fa fa-chain chain_1\"></i>VIEW PROJECT</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
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
