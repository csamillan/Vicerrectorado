<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <aside class="main-sidebar">
            <section class="sidebar">
                <div class="user-panel">
                    <div class="pull-left image">
                        <img src="dist/img/admin.png" class="img-circle" alt="User Image">
                    </div>
                    <div class="pull-left info">
                        <p>Edward Mendoza</p>
                        <a href="#"><i class="fa fa-circle text-success"></i>Conectado</a>
                    </div>
                </div>
                <ul class="sidebar-menu" data-widget="tree">
                    <li class="header">MENU DE NAVEGACION</li>
                    <li class="treeview active">
                        <a href="index.html">
                            <i class="fa fa-dashboard"></i><span>Inicio</span>
                        </a>
                    </li>
                    <li class="treeview">
                        <a href="#">
                            <i class="fa fa-users"></i>
                            <span>Recurso Humano</span>
                            <span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="usuarios.jsp"><i class="fa fa-circle-o"></i>Usuarios</a></li>
                        </ul>
                    </li>
                    <li class="treeview">
                        <a href="#">
                            <i class="fa fa-users"></i>
                            <span>Administrar</span>
                            <span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="facultad.jsp"><i class="fa fa-circle-o"></i>Facultades</a></li>
                            <li><a href="#"><i class="fa fa-circle-o"></i>Bitacora</a></li>
                            <li><a href="Autoridades.jsp"><i class="fa fa-circle-o"></i>Autoridades</a></li>
                        </ul>
                    </li>
                    <li><a href="#"><i class="fa fa-book"></i><span>Documentation</span></a></li>
                    <li class="header">FrontEnd</li>
                    <li>
                        <a href="slide.jsp">
                            <i class="fa fa fa-sliders"></i>
                            <span>Slide</span>
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <i class="fa fa-briefcase"></i>
                            <span>Articulos</span>
                        </a>
                    </li>
                    <li >
                        <a href="#">
                            <i class="fa fa-image"></i>
                            <span>Imagenes</span>
                        </a>
                    </li>
                    <li>
                        <a href="Cursos.jsp">
                            <i class="fa fa-video-camera"></i> <span>Cursos</span>
                        </a>
                    </li>
                    <li>
                        <a href="Eventos.jsp">
                            <i class="fa fa-file-text-o"></i><span>Eventos</span>
                        </a>
                    </li>
                    <li>
                        <a href="Noticias.jsp">
                            <i class="fa fa-file-text-o"></i><span>Noticias</span>
                        </a>
                    </li>
                    <li >
                        <a href="#">
                            <i class="fa fa-calendar"></i> <span>Programacion</span>
                        </a>
                    </li>
                    <li >
                        <a href="#">
                            <i class="fa fa-folder"></i> <span>Archivos</span>
                        </a>
                    </li>
                    <li class="treeview">
                        <a href="#">
                            <i class="fa fa-calendar"></i> <span>Eventos</span>
                            <span class="pull-right-container">
                                <i class="fa fa-angle-left pull-right"></i>
                            </span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="#"><i class="fa fa-circle-o"></i>Vicerrectorado</a></li>
                            <li><a href="#"><i class="fa fa-circle-o"></i>Academicos</a></li>
                        </ul>
                    </li>
                    <li >
                        <a href="#">
                            <i class="fa fa-book"></i> <span>Documentos</span>
                        </a>
                    </li>
                    <li class="header">FrontEnd-Sistema de Biblioteca</li>
                    <li class="treeview">
                        <a href="#">
                            <i class="fa fa-diamond"></i>
                            <span>Recursos Electronicos</span>
                            <span class="pull-right-container"><i class="fa fa-angle-left pull-right"></i></span>
                        </a>
                        <ul class="treeview-menu">
                            <li><a href="LibrosElectronicos.jsp"><i class="fa fa-circle-o"></i>Libros Electronicos</a></li>
                        </ul>
                    </li>
                </ul>
            </section>
        </aside>
    </body>
</html>
