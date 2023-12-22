package org.apache.jsp.Back_002dend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"dist/css/login/login.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"dist/css/fonts/fonts.css\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\" style=\"margin-top:100px\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-4 col-md-4 col-md-offset-4\">\r\n");
      out.write("                    <div class=\"panel panel-primary\" style=\" box-shadow: 2px 2px 5px 5px #e5e0e0; \">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <strong> INGRESO AL SISTEMA</strong>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <form role=\"form\" action=\"#\" method=\"POST\">\r\n");
      out.write("                                <fieldset>\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"center-block\">\r\n");
      out.write("                                            <img class=\"profile-img\"\r\n");
      out.write("                                                 src=\"dist/img/vice.jpg\" alt=\"\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"row\">\r\n");
      out.write("                                        <div class=\"col-sm-12 col-md-10  col-md-offset-1 \">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <div class=\"input-group\">\r\n");
      out.write("                                                    <span class=\"input-group-addon\">\r\n");
      out.write("                                                        <i class=\"glyphicon glyphicon-user\"></i>\r\n");
      out.write("                                                    </span> \r\n");
      out.write("                                                    <input class=\"form-control\" placeholder=\"Usuario\" name=\"loginname\" type=\"text\" autofocus>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <div class=\"input-group\">\r\n");
      out.write("                                                    <span class=\"input-group-addon\">\r\n");
      out.write("                                                        <i class=\"glyphicon glyphicon-lock\"></i>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <input class=\"form-control\" placeholder=\"ContraseÃ±a\" name=\"password\" type=\"password\" value=\"\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-lg btn-success btn-block\" aria-label=\"center Align\">\r\n");
      out.write("                                                    <span class=\"glyphicon glyphicon-log-in\" aria-hidden=\"true\"></span>Ingresar\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </fieldset>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
