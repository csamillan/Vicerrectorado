<%@page import="Beans.Facultad"%>
<jsp:include page="../sFacultad?opcion=ListarFacultades" />
<jsp:useBean id="listaFacultad" scope="request" class="java.util.ArrayList"/>
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
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <jsp:include  page="Menu.jsp"></jsp:include>
            <jsp:include  page="MenuVertical.jsp"></jsp:include>
                <div class="content-wrapper">
                    <section class="content-header">
                        <h1><spam class='glyphicon glyphicon-user'></spam>Recurso Humano<small>Usuarios</small></h1>
                        <ol class="breadcrumb">
                            <li><a href="index.jsp"><i class="fa fa-dashboard"></i> Inicio</a></li>
                            <li><a href="facultad.jsp"><i class="fa fa-users"></i> Administrar</a></li>
                            <li class="active">Lista de Facultades</li>
                        </ol>
                    </section>
                    <section class="content">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="box box-primary">
                                    <div class="box-header">
                                        <h3 class="box-title">Listado de Facultades</h3>
                                    </div>              
                                    <div class="margin">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"><spam class='glyphicon glyphicon-cog'></spam> Acciones <span class="caret"></span><span class="sr-only">Toggle Dropdown</span></button> 
                                            <ul class="dropdown-menu" role="menu">
                                                <li><a href="#" data-toggle="modal" data-target="#nuevo-usuario"><spam class='glyphicon glyphicon-user'></spam>Nueva Facultad</a></li>    
                                                <li class="divider"></li>
                                                <li><a href="#"><spam class='glyphicon glyphicon-print'></spam>Imprimir Listado</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                    <br>
                                    <div class="margin">
                                        <div class="row">
                                            <div class="col-md-6">
                                                <div id="" class="dataTables_length">
                                                    <label>
                                                        <select size="1" name="" aria-controls="usuarios">
                                                            <option value="10" selected="selected">10</option>
                                                            <option value="25">25</option>
                                                            <option value="50">50</option><option value="100">100</option>
                                                        </select>
                                                        Registros por pagina
                                                    </label>
                                                </div>
                                            </div>
                                            <div class="col-md-6" >
                                                <form class="navbar-form" role="search" style="float: right;" >
                                                    <div class="input-group">
                                                        <input type="text" class="form-control" placeholder="Buscar usuario" name="q">
                                                        <div class="input-group-btn">
                                                            <button class="btn btn-default" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="container-fluid">
                                        <div class="table-responsive ">
                                            <table id="example2" class="table table-bordered table-hover">
                                                <thead class="bg-info">
                                                    <tr align="center">
                                                        <th>N°</th>
                                                        <th>Nombres</th>
                                                        <th>Abreviatura</th>
                                                        <th>Opciones</th>
                                                    </tr>
                                                </thead>
                                                <tbody align="center">
                                                <%
                                                    for (int i = 0; i < listaFacultad.size(); i++) {
                                                        Facultad inv = (Facultad) listaFacultad.get(i);

                                                        String id = inv.getId().toString();
                                                        String nombre = inv.getNombre();
                                                        String Abreviatura = inv.getAbreviatura();
                                                %>
                                                <tr>
                                                    <td><% out.println(i + 1); %></td>
                                                    <td><% out.println(inv.getNombre());%></td>
                                                    <td><% out.println(inv.getAbreviatura());%></td>
                                                    <td>
                                            <imput type="submit" class="btn btn-info" data-toggle="modal" data-target="#editar-usuario" onClick="pasar('<%=id%>', '<%=nombre%>', '<%=Abreviatura%>')"><span class="glyphicon glyphicon-pencil"></span>Editar</imput>
                                            <imput type="submit" class="btn btn-danger" data-toggle="modal" data-target="#eliminar-usuario" onClick="pasarId('<%= id%>')"> <span class ="glyphicon glyphicon-trash"></span>Eliminar</imput>
                                            </td>
                                            </tr>
                                            <%}
                                            %>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-md-6">
                            <div class="dataTables_info" id="usuarios_info">Mostrando 11 al 20 de 30 registros</div>
                        </div>
                        <div class="col-md-6">
                            <div class="dataTables_paginate paging_bootstrap">
                                <ul class="pagination">
                                    <li class="prev"><a href="#">Anterior</a></li>
                                    <li class="active"><a href="#">1</a></li>
                                    <li ><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li class="next"><a href="#">Siguiente</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </section>
                <!-- Insertar nuevo usuario modal  -->
                <div class="modal fade" id="nuevo-usuario" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header" style="background-color:#3c8dbc; color:#FFF" id="header-new"><center><h3>Nuevo Usuario</h3></center></div>
                            <div class="modal-body">  
                                <form action="../sFacultad" method="post" accept-charset="utf-8" id="sFacultad"> 
                                    <div>                                                          
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Nombre</label>
                                            <input type="text" class="form-control" id="nombre" name="nombre" maxlength="50">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Abreviatura</label>
                                            <input type="text" class="form-control" id="abreviatura" name="abreviatura" maxlength="10">
                                        </div>                                                             
                                    </div>
                                    <br>
                                    <br>
                                    <div class="modal-footer">
                                        <center>
                                            <div class="form-group col-md-6"> 
                                                <button type="submit"  class="btn btn-success btn-flat" value="Registrar" name="opcion"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Crear</button>
                                            </div>
                                            <div class="form-group col-md-6">
                                                <button type="button" class="btn btn-danger btn-flat" data-dismiss="modal"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span>Cancelar</button>
                                            </div>
                                        </center>
                                    </div>
                                </form>
                            </div>          
                        </div>
                    </div>
                </div>
                <!-- Modificar usuario modal  -->
                <div class="modal fade" id="editar-usuario" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header" style="background-color:#3c8dbc; color:#FFF" id="header-editar"><center><h3>Editar Usuario</h3></center></div>
                            <div class="modal-body">  
                                <form action="../sFacultad" method="post" accept-charset="utf-8" id="sFacultad">  
                                    <div>
                                        <input type="hidden" id="u_id" name="u_id">
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Nombre</label>
                                            <input type="text" class="form-control" id="u_nombre" name="u_nombre" maxlength="50">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Abreviatura</label>
                                            <input type="text" class="form-control" id="u_abreviatura" name="u_abreviatura" maxlength="10">
                                        </div>                          
                                    </div>
                                    <br>
                                    <br>
                                    <div class="modal-footer">
                                        <center>
                                            <div class="form-group col-md-6"> 
                                                <button type="submit"  class="btn btn-success btn-flat" value="Modificar" name="opcion"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span>Modificar</button>
                                            </div>
                                            <div class="form-group col-md-6">
                                                <imput type="submit" class="btn btn-danger" data-dismiss="modal" ><span class="glyphicon glyphicon-remove"></span>Cancelar</imput>
                                            </div>
                                        </center>
                                    </div>
                                </form>
                            </div>          
                        </div>
                    </div>
                </div>
                <!-- Eliminar usuario modal  -->
                <div class="modal fade bs-example-modal-sm" id="eliminar-usuario" tabindex="-1" role="dialog" aria-labelledby="mySmallModalLabel" aria-hidden="true">
                    <div class="modal-dialog modal-sm">
                        <div class="modal-content">
                            <div class="modal-header" style="background-color:#ff2f28; color:#FFF">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button> <h4 class="modal-title" id="myModalLabel">Eliminar Usuario</h4>
                            </div>
                            <div class="modal-body" id=""></div>
                            <center><p>¿Deseas eliminar la facultad?</p></center> 
                            <br>
                            <form action="../sFacultad" method="post" accept-charset="utf-8" id="sFacultad">
                                <input type="hidden" id="fac_id" name="fac_id">
                                <div class="modal-footer"><center>
                                        <div class="form-group col-md-6"> 
                                            <button type="submit" class="btn btn-success" value="Eliminar" name="opcion"><span class="glyphicon glyphicon-floppy-saved" aria-hidden="true"></span>Eliminar</button>
                                        </div>
                                        <div class="form-group col-md-6">
                                            <imput type="submit" class="btn btn-danger" data-dismiss="modal" ><span class="glyphicon glyphicon-remove"></span>Cancelar</imput>
                                        </div>
                                    </center>
                                </div>
                            </form>         
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
        <script type="text/javascript">
                                                function pasar(id, nombre, abreviatura) {
                                                    $('#u_id').val(id);
                                                    $('#u_nombre').val(nombre);
                                                    $('#u_abreviatura').val(abreviatura);
                                                }
                                                ;
        </script>
        <script type="text/javascript">
            function pasarId(id) {
                $('#fac_id').val(id);
            }
            ;
        </script>
    </body>
</html>
