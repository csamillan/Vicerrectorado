<%-- 
    Document   : Menu
    Created on : 03/09/2017, 01:25:00 PM
    Author     : Edward Mendoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- navegation-->
        <div class="navigation-agileits">
            <div class="container">
                <nav class="navbar navbar-default">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" >
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li class="active"><a href="index.jsp">Home</a></li>
                            <li class="agileits dropdown">
                                <a href="#" data-toggle="dropdown" aria-expanded="true">Vicerrectorado <span class="caret"></span></a>
                                <ul class="dropdown-menu ">
                                    <li><a href="vicerrectorado.jsp">Acerca</a></li>
                                    <li><a href="directorio.jsp">Directorio</a></li>
                                    <li><a href="autoridades.jsp">Autoridades</a></li>
                                    <li><a href="organigrama.jsp">Organigrama</a></li>
                                    <li><a href="#">Plan Estratégico</a></li>
                                    <li><a href="documentos.jsp">Documentos</a></li>
                                </ul>
                            </li>
                            <li class="agileits dropdown">
                                <a href="#" data-toggle="dropdown" aria-expanded="true">Formacion <span class="caret"></span></a>
                                <ul class="dropdown-menu ">
                                    <li><a href="Bibliotecas.jsp">Bibliotecas</a></li>
                                    <li><a href="tesis.jsp">Tesis</a></li>
                                    <li><a href="#">OCW</a></li>
                                    <li><a href="cursos.jsp">Cursos</a></li>
                                    <li><a href="recursoselectronicos.jsp">Recursos electronicos</a></li>
                                </ul>
                            </li>
                            <li><a href="eventos.jsp">Eventos</a></li>
                            <li><a href="noticias.jsp">Noticias</a></li>
                            <li class="agileits dropdown">
                                <a href="#" data-toggle="dropdown" aria-expanded="true">Publicaciones <span class="caret"></span></a>
                                <ul class="dropdown-menu ">
                                    <li><a href="revistas.jsp">Revistas</a></li>
                                    <li><a href="boletines.jsp">Boletines</a></li>
                                    <li><a href="articulos.jsp">Articulos</a></li>
                                </ul>
                            </li>
                            <li class="agileits dropdown">
                                <a href="#" data-toggle="dropdown" aria-expanded="true">Biblioteca <span class="caret"></span></a>
                                <ul class="dropdown-menu ">
                                    <li><a href="basededatos.jsp">Bases de Datos</a></li>
                                    <li><a href="#">Boletines</a></li>
                                    <li><a href="articulos.jsp">Articulos</a></li>
                                </ul>
                            </li>
                            <li><a href="#">Proyectos</a></li>

                        </ul>
                    </div>
                </nav>
            </div>
            <div class="clearfix"> </div>
        </div>
    </body>
</html>
