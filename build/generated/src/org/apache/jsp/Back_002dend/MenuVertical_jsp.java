package org.apache.jsp.Back_002dend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenuVertical_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <aside class=\"main-sidebar\">\r\n");
      out.write("            <section class=\"sidebar\">\r\n");
      out.write("                <div class=\"user-panel\">\r\n");
      out.write("                    <div class=\"pull-left image\">\r\n");
      out.write("                        <img src=\"dist/img/admin.png\" class=\"img-circle\" alt=\"User Image\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"pull-left info\">\r\n");
      out.write("                        <p>Edward Mendoza</p>\r\n");
      out.write("                        <a href=\"#\"><i class=\"fa fa-circle text-success\"></i>Conectado</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul class=\"sidebar-menu\" data-widget=\"tree\">\r\n");
      out.write("                    <li class=\"header\">MENU DE NAVEGACION</li>\r\n");
      out.write("                    <li class=\"treeview active\">\r\n");
      out.write("                        <a href=\"index.html\">\r\n");
      out.write("                            <i class=\"fa fa-dashboard\"></i><span>Inicio</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"treeview\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-users\"></i>\r\n");
      out.write("                            <span>Recurso Humano</span>\r\n");
      out.write("                            <span class=\"pull-right-container\"><i class=\"fa fa-angle-left pull-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"treeview-menu\">\r\n");
      out.write("                            <li><a href=\"usuarios.jsp\"><i class=\"fa fa-circle-o\"></i>Usuarios</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"treeview\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-users\"></i>\r\n");
      out.write("                            <span>Administrar</span>\r\n");
      out.write("                            <span class=\"pull-right-container\"><i class=\"fa fa-angle-left pull-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"treeview-menu\">\r\n");
      out.write("                            <li><a href=\"facultad.jsp\"><i class=\"fa fa-circle-o\"></i>Facultades</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i>Bitacora</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\"><i class=\"fa fa-book\"></i><span>Documentation</span></a></li>\r\n");
      out.write("                    <li class=\"header\">FrontEnd</li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"slide.jsp\">\r\n");
      out.write("                            <i class=\"fa fa fa-sliders\"></i>\r\n");
      out.write("                            <span>Slide</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-briefcase\"></i>\r\n");
      out.write("                            <span>Articulos</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-image\"></i>\r\n");
      out.write("                            <span>Imagenes</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-video-camera\"></i> <span>Videos</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-eye\"></i> <span>Suscriptores</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"Noticias.jsp\">\r\n");
      out.write("                            <i class=\"fa fa-file-text-o\"></i><span>Noticias</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-calendar\"></i> <span>Programacion</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-folder\"></i> <span>Archivos</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"treeview\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-calendar\"></i> <span>Eventos</span>\r\n");
      out.write("                            <span class=\"pull-right-container\">\r\n");
      out.write("                                <i class=\"fa fa-angle-left pull-right\"></i>\r\n");
      out.write("                            </span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"treeview-menu\">\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i>Vicerrectorado</a></li>\r\n");
      out.write("                            <li><a href=\"#\"><i class=\"fa fa-circle-o\"></i>Academicos</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li >\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-book\"></i> <span>Documentos</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"header\">FrontEnd-Sistema de Biblioteca</li>\r\n");
      out.write("                    <li class=\"treeview\">\r\n");
      out.write("                        <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-diamond\"></i>\r\n");
      out.write("                            <span>Recursos Electronicos</span>\r\n");
      out.write("                            <span class=\"pull-right-container\"><i class=\"fa fa-angle-left pull-right\"></i></span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <ul class=\"treeview-menu\">\r\n");
      out.write("                            <li><a href=\"LibrosElectronicos.jsp\"><i class=\"fa fa-circle-o\"></i>Libros Electronicos</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </section>\r\n");
      out.write("        </aside>\r\n");
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
