<%@page import="Beans.Slider"%>
<jsp:include page="../sSlider?opcion=ListarSlider" />
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
        <link rel="stylesheet" href="dist/css/slide.css">
        <style>
            .thumb {
                height: 200px;
                width: 520px;
                border: 1px solid #000;
                margin: 10px 5px 0 0;
            }
        </style>
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
                            <li class="active">Slide</li>
                        </ol>
                    </section>
                    <section class="content">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="box box-primary">
                                    <div class="box-header">
                                        <h3 class="box-title">Administrador Slide</h3>
                                    </div>
                                    <div class="margin">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"><spam class='glyphicon glyphicon-cog'></spam> Acciones <span class="caret"></span><span class="sr-only">Toggle Dropdown</span></button> 
                                            <ul class="dropdown-menu" role="menu">
                                                <li><a href="#" data-toggle="modal" data-target="#nuevo-usuario"><spam class='glyphicon glyphicon-user'></spam>Nueva Imagen</a></li>    
                                            </ul>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="container-fluid">
                                        <div id="carousel-1" class="carousel slide" data-ride="carousel">

                                            <div class="carousel-inner" role="listbox">
                                            <%
                                                for (int i = 0; i < ListarSlider.size(); i++) {
                                                    Slider inv = (Slider) ListarSlider.get(i);
                                            %>
                                            <div class="item <%if (i == 0) {
                                                    out.println("active");
                                                }%>"  align="center">
                                                <img src="dist/img/slider/<%out.println(inv.getImagen());%>" class="img-responsive" alt=""  >
                                                <div class="carousel-caption">
                                                    <p class="contenido-slider"><%out.println(inv.getTitulo());%></p></div>
                                            </div>
                                            <%
                                                }
                                            %>
                                        </div>
                                        <!-- Controls -->
                                        <a href="#carousel-1" class="left carousel-control" role="button" data-slide="prev">
                                            <span class="icon-prev"></span>
                                        </a>
                                        <a href="#carousel-1" class="right carousel-control" data-slide="next">
                                            <span class="icon-next"></span>
                                        </a>
                                        <!-- Indicators -->
                                        <ol class="carousel-indicators indicadores">
                                            <%
                                                for (int i = 0; i < ListarSlider.size(); i++) {
                                            %>
                                            <li data-target="#carousel-1" data-slide-to="<%out.print(i);%>" <%if (i == 0) {
                                                    out.println("class='active'");
                                                }%>></li>
                                                <%
                                                    }
                                                %>
                                        </ol>
                                    </div>
                                    <br>
                                    <br>
                                    <div class="divider">
                                    </div>
                                    <%
                                        for (int i = 0; i < ListarSlider.size(); i++) {
                                            Slider inv = (Slider) ListarSlider.get(i);
                                    %>
                                    <div class="col-md-3" >
                                        <div class="thumbnail">
                                            <img src="dist/img/slider/<%out.println(inv.getImagen());%>" alt="...">
                                            <div class="caption">
                                                <form action="../sSlider" method="get" accept-charset="utf-8" id="sSlider" enctype="multipart/form-data"> 
                                                    <input type="hidden" id="u_id" name="u_id" value="<%out.print(inv.getId());%>" >
                                                    <input type="hidden" id="imagen" name="imagen" value="<%out.print(inv.getImagen());%>" >
                                                    <div class="form-group ">
                                                        <label class="control-label">Titulo</label>
                                                        <input type="text" class="form-control" placeholder="Titulo" id="titulo" value="<%out.println(inv.getTitulo());%>" name="titulo">
                                                    </div>
                                                    <div class="form-group ">
                                                        <textarea row="5" class="form-control" placeholder="Descripcion" id="descripcion" name="descripcion"><%out.println(inv.getDescripcion());%></textarea>
                                                    </div>
                                                    <div align="center" >
                                                        <button type="submit" class="btn btn-primary" value="Modificar" name="opcion"><span class="glyphicon glyphicon-pencil"></span> Editar</button>
                                                        <button type="submit" class="btn btn-danger" value="Eliminar" name="opcion"><span class="glyphicon glyphicon-trash"></span> Eliminar</button>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                    <%
                                        }
                                    %>
                                </div>            
                            </div>
                        </div>
                    </div>
                </section>
                <div class="modal fade" id="nuevo-usuario" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header" style="background-color:#3c8dbc; color:#FFF" id="header-new"><center><h3>Nuevo Usuario</h3></center></div>
                            <div class="modal-body">  
                                <form action="../sSlider" method="post" accept-charset="utf-8" id="sSlider" enctype="multipart/form-data">  
                                    <div>                                                          
                                        <div class="thumbnail">
                                            <div class="caption">
                                                <output id="list"></output>
                                                <div class="form-group">
                                                    <label class="control-label">Subir foto</label>
                                                    <input type="file" id="files" name="imagen" />
                                                </div>
                                                <div class="form-group ">
                                                    <label class="control-label">Titulo</label>
                                                    <input type="text" class="form-control" placeholder="Titulo" id="titulo" name="titulo">
                                                </div>
                                                <div class="form-group ">
                                                    <textarea row="10" class="form-control" placeholder="Descripcion" id="descripcion" name="descripcion"></textarea>
                                                </div>
                                            </div>
                                        </div>            
                                    </div>
                                    <div class="modal-footer">
                                        <center>
                                            <div class="form-group col-md-6"> 
                                                <button type="submit"  class="btn btn-success btn-flat" value="Registrar" name="opcion"><span class="glyphicon glyphicon-saved" aria-hidden="true"></span> Guardar</button>
                                            </div>
                                            <div class="form-group col-md-6">
                                                <button type="button" class="btn btn-danger btn-flat" data-dismiss="modal"><span class="glyphicon glyphicon-remove-circle" aria-hidden="true"></span> Cancelar</button>
                                            </div>
                                        </center>
                                    </div>
                                </form>
                            </div>          
                        </div>
                    </div>
                </div>
            </div>
            <footer class="main-footer">
                <strong>Copyright Vicerrectorado de Investigacion-2017.  </strong> Todos los derechos reservado.
            </footer>
        </div>
        <script src="plugins/jQuery/jquery-3.1.1.min.js"></script>
        <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
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
        <script src="dist/js/previsualizar.js"></script>
    </body>
</html>
