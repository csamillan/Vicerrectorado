<%@page import="Beans.Autoridades"%>
<jsp:include page="../sAutoridades?opcion=ListarAutoridades" />
<jsp:useBean id="ListarAutoridades" scope="request" class="java.util.ArrayList"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
<<<<<<< HEAD
                <div class="content-wrapper">
                    <section class="content-header">
                        <h1>
                            Inicio
                            <small>Panel de Control</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                            <li class="active">Autoridades</li>
                        </ol>
                    </section>
                    <section class="content">
                        <div class="row">
                            <div class="col-xs-12">
                                <div class="box box-primary">                
                                    <div class="box-body">                  
                                        <div class="nav-tabs-custom">
                                            <ul class="nav nav-tabs pull-lef">
                                                <li class="active"><a href="#tab_1" data-toggle="tab"><i class="fa fa-file-text-o"></i>Autoridades</a></li>
                                                <li class="noti"><a href="#tab_2" data-toggle="tab"><i class="fa fa-file-text-o"></i> Registrar Autoridad</a></li>
                                            </ul>
                                            <div class="tab-content">
                                                <div class="tab-pane active" id="tab_1">
                                                    <div class="container-fluid">
                                                        <div class="table-responsive ">
                                                            <table id="example2" class="table table-bordered table-hover">
                                                                <thead class="bg-info">
                                                                    <tr align="center">
                                                                        <th>N°</th>
                                                                        <th>Nombres</th>
                                                                        <th>Cargo</th>
                                                                        <th>Año de Inicio</th>
                                                                        <th>Opciones</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody align="center">
                                                                <%
                                                                    for (int i = 0; i < ListarAutoridades.size(); i++) {
                                                                        Autoridades inv = (Autoridades) ListarAutoridades.get(i);
=======
            <div class="content-wrapper">
                <section class="content-header">
                    <h1>
                        Inicio
                        <small>Panel de Control</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Autoridades</li>
                    </ol>
                </section>
                <section class="content">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">                
                                <div class="box-body">                  
                                    <div class="nav-tabs-custom">
                                        <ul class="nav nav-tabs pull-lef">
                                            <li class="active"><a href="#tab_1" data-toggle="tab"><i class="fa fa-file-text-o"></i>Autoridades</a></li>
                                            <li class="noti"><a href="#tab_2" data-toggle="tab"><i class="fa fa-file-text-o"></i> Registrar Autoridad</a></li>
                                        </ul>
                                        <div class="tab-content">
                                            <div class="tab-pane active" id="tab_1">
>>>>>>> 3c5c3580e6e64ef1d7ece96f8225d98f62f0de11

                                                                        String id = inv.getId().toString();
                                                                        String nombre = inv.getNombre();
                                                                        String ApellidoP = inv.getCargo();
                                                                        String ApellidoM = inv.getAñoInicio();
                                                                %>
                                                                <tr>
                                                                    <td><% out.println(i + 1); %></td>
                                                                    <td><% out.println(inv.getNombre());%></td>
                                                                    <td><% out.println(inv.getCargo());%></td>
                                                                    <td><% out.println(inv.getAñoInicio());%></td>
                                                                    <td>
                                                            <imput type="submit" class="btn btn-info" data-toggle="modal" data-target="#editar-usuario"><span class="glyphicon glyphicon-pencil"></span>Editar</imput>
                                                            <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>Cancelar</button>
                                                            </td>
                                                            </tr>
                                                            <%}
                                                            %>
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="tab-pane" id="tab_2">
                                                <div class="container-fluid">
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <form action="../sAutoridades" method="post" accept-charset="utf-8" id="sAutoridades" enctype="multipart/form-data">  
                                                                <div class="form-group">
                                                                    <label>
                                                                        Nombre de la Autoridad
                                                                    </label>
                                                                    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre de la Autoridad" />
                                                                </div>
                                                                <div class="form-group">
                                                                    <label>
                                                                        Cargo:  
                                                                    </label>
                                                                    <input type="text" class="form-control" id="cargo" name="cargo" placeholder="Cargo de la Autoridad" />
                                                                </div>
                                                                <div class="form-group">
                                                                    <label>
                                                                        Año de Inicio de Gestion:  
                                                                    </label>
                                                                    <input type="text" class="form-control" id="ano" name="ano" maxlength="4" placeholder="Año de Inicio de Gestion" />
                                                                </div>
                                                                <div class="form-group">
                                                                    <label>
                                                                        Seleccionar Foto: 
                                                                    </label>
                                                                    <input type="file" id="files" name="imagen" />
                                                                </div>

                                                                <div class="form-group">
                                                                    <label>
                                                                        Perfil de la Autoridad:  
                                                                    </label>
                                                                    <textarea cols="30" rows="10"  class="form-control" id="contenido" name="contenido" placeholder="Perfil de la Autoridad" ></textarea>  
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
            <!-- Modificar usuario modal  -->
            <div class="modal fade" id="editar-usuario" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header" style="background-color:#3c8dbc; color:#FFF" id="header-editar"><center><h3>Editar Usuario</h3></center></div>
                        <div class="modal-body">  
                            <div class="form-group col-md-6" id="">
                                <img src="dist/img/slider/>" alt="...">
                                <label class="control-label">Email</label>
                            </div>                  
                        </div>
                    </div>          
                </div>
            </div>

            <footer class="main-footer">
                <strong>Copyright Vicerrectorado de Investigacion-2017. </strong> Todos los derechos reservado.
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
    </body>
</html>