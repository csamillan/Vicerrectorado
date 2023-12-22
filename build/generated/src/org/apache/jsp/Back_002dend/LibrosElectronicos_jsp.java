package org.apache.jsp.Back_002dend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LibrosElectronicos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Vice | ADMIN</title>\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/Ionicons/css/ionicons.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/skins/_all-skins.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/morris/morris.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/datepicker/datepicker3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/fonts/fonts.css\">\n");
      out.write("        <link href=\"dist/css/noticias.css\" rel='stylesheet' type='text/css' />\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MenuVertical.jsp", out, false);
      out.write("\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Inicio\n");
      out.write("                        <small>Panel de Control</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                        <li class=\"active\">Libros</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("                <section class=\"content\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xs-12\">\n");
      out.write("                            <div class=\"box box-primary\">                \n");
      out.write("                                <div class=\"box-body\">                  \n");
      out.write("                                    <div class=\"nav-tabs-custom\">\n");
      out.write("                                        <ul class=\"nav nav-tabs pull-lef\">\n");
      out.write("                                            <li class=\"active\"><a href=\"#tab_1\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i>Libros </a></li>\n");
      out.write("                                            <li class=\"noti\"><a href=\"#tab_2\" data-toggle=\"tab\"><i class=\"fa fa-file-text-o\"></i> Agregar Libro</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <div class=\"tab-content\">\n");
      out.write("                                            <div class=\"tab-pane active\" id=\"tab_1\">\n");
      out.write("                                                <div class=\"container-fluid\">\n");
      out.write("                                                    <div class=\"table-responsive \">\n");
      out.write("\n");
      out.write("                                                        <table id=\"example2\" class=\"table table-bordered table-hover\">\n");
      out.write("                                                            <thead class=\"bg-info\">\n");
      out.write("                                                                <tr align=\"center\">\n");
      out.write("                                                                    \n");
      out.write("                                                                    <th>Foto</th>\n");
      out.write("                                                                    <th>Codigo</th>\n");
      out.write("                                                                    <th>Categoria</th>\n");
      out.write("                                                                    <th>Nombre del libro</th>\n");
      out.write("                                                                    <th>Autor(es)</th>\n");
      out.write("                                                                    <th>Adicional</th>\n");
      out.write("                                                                    <th>Opciones</th>\n");
      out.write("\n");
      out.write("                                                                </tr>\n");
      out.write("                                                            </thead>\n");
      out.write("                                                            <tbody align=\"center\">\n");
      out.write("                                                                <tr >\n");
      out.write("                                                                    <td > \n");
      out.write("                                                                        <img class=\"media-object\" src=\"dist/img/book.png\" alt=\"Libro\" width=\"48\" height=\"48\">\n");
      out.write("                                                                    </td>\n");
      out.write("                                                                    <td>0000001</td>\n");
      out.write("                                                                    <td>Matematica</td>\n");
      out.write("                                                                    <td>Calculo Diferencial</td>\n");
      out.write("                                                                    <td>Cobeñas </td>\n");
      out.write("                                                                    <td>Libro de matematic edicion 2015</td>\n");
      out.write("                                                                    \n");
      out.write("                                                                    <td>\n");
      out.write("                                                            <imput type=\"submit\" class=\"btn btn-info\" data-toggle=\"modal\" data-target=\"#editar-usuario\"><span class=\"glyphicon glyphicon-pencil\"></span> Editar</imput>\n");
      out.write("                                                            <imput type=\"submit\" class=\"btn btn-danger\" data-toggle=\"modal\" data-target=\"#eliminar-usuario\"><span class=\"glyphicon glyphicon-trash\"></span> Eliminar </imput>\n");
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            </tr>\n");
      out.write("                                                            \n");
      out.write("                                                            </tbody>\n");
      out.write("                                                        </table>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"row\"><div class=\"col-md-6\"><div class=\"dataTables_info\" id=\"usuarios_info\">Mostrando 11 al 20 de 30 registros</div></div><div class=\"col-md-6\"><div class=\"dataTables_paginate paging_bootstrap\"><ul class=\"pagination\"><li class=\"prev\"><a href=\"#\">← Anterior</a></li><li class=\"active\"><a href=\"#\">1</a></li><li ><a href=\"#\">2</a></li><li><a href=\"#\">3</a></li><li><a href=\"#\">4</a></li><li><a href=\"#\">5</a></li><li class=\"next\"><a href=\"#\">Siguiente → </a></li></ul></div></div></div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"tab-pane\" id=\"tab_2\">\n");
      out.write("                                                <div class=\"container-fluid\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("                                                        <div class=\"form-group col-md-12 bg-primary\">\n");
      out.write("                                                            <label class=\"control-label\">Registrar Libro Electrónico</label>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                        <div>\n");
      out.write("                                                            <div class=\"form-group col-md-6\">\n");
      out.write("                                                                <span>* </span><label>Categoria</label>\n");
      out.write("                                                                <select class=\"form-control\" >\n");
      out.write("                                                                    <option value=\"\" selected>Seleccionar...</option>\n");
      out.write("                                                                    <option value=\"#\">Matematica</option>\n");
      out.write("                                                                    <option value=\"#\">Fisica</option>\n");
      out.write("                                                                    <option value=\"#\">Contabilidad</option>  \n");
      out.write("                                                                    <option value=\"#\">Quimica</option>                    \n");
      out.write("                                                                </select>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-group col-md-6\">\n");
      out.write("                                                                <span>* </span><label>Nombre del libro</label>\n");
      out.write("                                                                <div>\n");
      out.write("                                                                    <textarea    rows=\"2\" class=\"form-control\" ></textarea>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"form-group col-md-6\">\n");
      out.write("                                                                <span>* </span><label>Autor(es)</label>\n");
      out.write("                                                                <div>\n");
      out.write("                                                                    <input   type=\"text\" placeholder=\"\" class=\"form-control\" required=\"\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"form-group col-md-6\">\n");
      out.write("                                                                <span>* </span><label>Informacion adicional</label>\n");
      out.write("                                                                <div>\n");
      out.write("                                                                    <input   type=\"text\" placeholder=\"\" class=\"form-control\" required=\"\">\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"form-group col-md-12\">\n");
      out.write("                                                                <div align=\"center\" >\n");
      out.write("                                                                    <button type=\"submit\" class=\"btn btn-primary\" value=\"Registrar\" name=\"opcion\" ><span class=\"glyphicon glyphicon-floppy-saved\"></span> Guardar</button>\n");
      out.write("                                                                    <button type=\"submit\" class=\"btn btn-danger\"><span class=\"glyphicon glyphicon-remove\"></span>Cancelar</button>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <footer class=\"main-footer\">\n");
      out.write("                <strong>Copyright Vicerrectorado de Investigacion-2017. </strong> Todos los derechos reservado.\n");
      out.write("            </footer>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"plugins/jQuery/jquery-3.1.1.min.js\"></script>\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $.widget.bridge('uibutton', $.ui.button);</script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("        <script src=\"plugins/morris/morris.min.js\"></script>\n");
      out.write("        <script src=\"plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("        <script src=\"plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("        <script src=\"plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("        <script src=\"plugins/knob/jquery.knob.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js\"></script>\n");
      out.write("        <script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <script src=\"plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script src=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("        <script src=\"plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <script src=\"plugins/fastclick/fastclick.js\"></script>\n");
      out.write("        <script src=\"dist/js/adminlte.min.js\"></script>\n");
      out.write("        <script src=\"dist/js/pages/dashboard.js\"></script>\n");
      out.write("        <script src=\"dist/js/demo.js\"></script>\n");
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
