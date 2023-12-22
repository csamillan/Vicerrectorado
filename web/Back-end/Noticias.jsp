<%@page import="Beans.Noticia"%>
<jsp:include page="../sNoticia?opcion=ListarNoticias"/>
<jsp:useBean id="ListarSlider" scope="request" class="java.util.ArrayList"/>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Vice | ADMIN</title>
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="bootstrap/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="bootstrap/Ionicons/css/ionicons.min.css">
        <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
        <link rel="stylesheet" href="dist/css/skins/_all-skins.min.css">
        <link rel="stylesheet" href="plugins/morris/morris.css">
        <link rel="stylesheet" href="plugins/jvectormap/jquery-jvectormap-1.2.2.css">
        <link rel="stylesheet" href="plugins/datepicker/datepicker3.css">
        <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css">
        <link rel="stylesheet" href="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
        <link rel="stylesheet" href="dist/css/fonts/fonts.css">
        <link href="dist/css/noticias.css" rel='stylesheet' type='text/css' />
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <jsp:include  page="Menu.jsp"></jsp:include>
            <jsp:include  page="MenuVertical.jsp"></jsp:include>
                <div class="content-wrapper">
                    <section class="content-header">
                        <h1>
                            Inicio
                            <small>Panel de Control</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                            <li class="active">Noticias</li>
                        </ol>
                    </section>
                    <section class="content">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="box box-primary">                
                                    <div class="box-body">                  
                                        <div class="nav-tabs-custom">
                                            <ul class="nav nav-tabs pull-lef">
                                                <li class="active"><a href="#tab_1" data-toggle="tab"><i class="fa fa-file-text-o"></i>Noticias</a></li>
                                                <li class="noti"><a href="#tab_2" data-toggle="tab"><i class="fa fa-file-text-o"></i> Agregar Noticia</a></li>
                                            </ul>
                                            <div class="tab-content">
                                                <div class="tab-pane active" id="tab_1">
                                                    <div class="container-fluid">
                                                        <div class="row">
                                                            <div class="col-md-12">
                                                            <%
                                                                for (int i = 0; i < ListarSlider.size(); i++) {
                                                                    Noticia inv = (Noticia) ListarSlider.get(i);
                                                            %>
                                                            <article style="border: 1px solid  #969696; margin: 10px; ">
                                                                <div class="row">
                                                                    <div class="col-sm-4 col-md-4" >
                                                                        <figure >
                                                                            <img src="dist/img/noticias/<%out.println(inv.getImagen());%>" class="img-responsive" style="width:400px; height: 200px;">
                                                                        </figure>
                                                                    </div>
                                                                    <form action="../sNoticia" method="post" accept-charset="utf-8" id="sNoticia" enctype="multipart/form-data">
                                                                        <input type="hidden" id="u_id" name="u_id" value="<%out.print(inv.getId());%>" >
                                                                        <input type="hidden" id="imagen" name="imagen" value="<%out.print(inv.getImagen());%>" >
                                                                        <div class="col-sm-4 col-md-4">
                                                                            <div class="form-group ">
                                                                                <h2>Titulo: <%out.print(inv.getTitulo());%></h2> 
                                                                            </div>
                                                                            <div class="form-group ">
                                                                                <div class="fecha">Fecha: <%out.print(inv.getFecha());%></div>            
                                                                            </div>
                                                                            <div class="form-group" >
                                                                                <p>&nbsp;<%out.print(inv.getContenido());%>
                                                                                </p>
                                                                            </div>

                                                                        </div>
                                                                        <div class="col-sm-4 col-md-4">
                                                                            <div align="center" style="margin: 60px;" >
                                                                                <button type="submit" class="btn btn-primary" value="Modificar" name="opcion"><span class="glyphicon glyphicon-pencil"></span> Editar</button>
                                                                                <button type="submit" class="btn btn-danger" value="Eliminar" name="opcion"><span class="glyphicon glyphicon-trash"></span> Eliminar</button>
                                                                            </div>

                                                                        </div>
                                                                    </form>
                                                                </div>
                                                            </article>
                                                            <% }%>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="tab_2">
                                                <div class="container-fluid">
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <form action="../sNoticia" method="post" accept-charset="utf-8" id="sNoticia" enctype="multipart/form-data">  
                                                                <div class="form-group">
                                                                    <label>
                                                                        Agregar Título
                                                                    </label>
                                                                    <input type="text" class="form-control" id="titulo" name="titulo" placeholder="Titulo de noticia" />
                                                                </div>

                                                                <div class="form-group">
                                                                    <label>
                                                                        Agregar Fecha 
                                                                    </label>
                                                                    <input type="date" class="form-control" id="fecha" name="fecha" placeholder="Fecha de noticia" />
                                                                </div>

                                                                <div class="form-group">
                                                                    <label>
                                                                        Seleccionar imagen
                                                                    </label>
                                                                    <input type="file" id="files" name="imagen" />
                                                                </div>

                                                                <div class="form-group">
                                                                    <label>
                                                                        Agregar Contenido 
                                                                    </label>
                                                                    <textarea cols="30" rows="10"  class="form-control" id="contenido" name="contenido" placeholder="Contenido de noticia" ></textarea>  
                                                                </div>

                                                                <div class="form-group">
                                                                    <label>
                                                                        Fuente 
                                                                    </label>
                                                                    <input type="text" class="form-control" id="fuente" name="fuente" placeholder="Fuente" />
                                                                </div>
                                                                <div class="form-group">
                                                                    <div align="center" >
                                                                        <button type="submit" class="btn btn-primary" value="Registrar" name="opcion" ><span class="glyphicon glyphicon-floppy-saved"></span> Guardar</button>
                                                                        <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>Cancelar</button>
                                                                    </div>
                                                                </div>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </div>
            <footer class="main-footer">
                <strong>Copyright Vicerrectorado de Investigacion-2017. </strong> Todos los derechos reservado.
            </footer>
        </div>
        <script src="plugins/jQuery/jquery-3.1.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
        <script>
            $.widget.bridge('uibutton', $.ui.button);</script>
        <script src="bootstrap/js/bootstrap.min.js"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
        <script src="plugins/morris/morris.min.js"></script>
        <script src="plugins/sparkline/jquery.sparkline.min.js"></script>
        <script src="plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
        <script src="plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
        <script src="plugins/knob/jquery.knob.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
        <script src="plugins/daterangepicker/daterangepicker.js"></script>
        <script src="plugins/datepicker/bootstrap-datepicker.js"></script>
        <script src="plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
        <script src="plugins/slimScroll/jquery.slimscroll.min.js"></script>
        <script src="plugins/fastclick/fastclick.js"></script>
        <script src="dist/js/adminlte.min.js"></script>
        <script src="dist/js/pages/dashboard.js"></script>
        <script src="dist/js/demo.js"></script>
    </body>
</html>
