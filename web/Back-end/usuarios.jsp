<%@page import="Beans.Usuario"%>
<%@page import="Beans.Facultad"%>
<jsp:include page="../sFacultad?opcion=ListarFacultades" />
<jsp:include page="../sUsuario?opcion=ListarUsuarios" />
<jsp:useBean id="listaFacultad" scope="request" class="java.util.ArrayList"/>
<jsp:useBean id="ListarUsuarios" scope="request" class="java.util.ArrayList"/>
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
                            <li><a href="usuarios.jsp"><i class="fa fa-users"></i> Recurso Humano</a></li>
                            <li class="active">Lista de usuarios</li>
                        </ol>
                    </section>
                    <section class="content">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="box box-primary">
                                    <div class="box-header">
                                        <h3 class="box-title">Listado de Usuarios</h3>
                                    </div>              
                                    <div class="margin">
                                        <div class="btn-group">
                                            <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown"><spam class='glyphicon glyphicon-cog'></spam> Acciones <span class="caret"></span><span class="sr-only">Toggle Dropdown</span></button> 
                                            <ul class="dropdown-menu" role="menu">
                                                <li><a href="#" data-toggle="modal" data-target="#nuevo-usuario"><spam class='glyphicon glyphicon-user'></spam>Nuevo Usuario</a></li>    
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
                                                        <th>N�</th>
                                                        <th>Dni</th>
                                                        <th>Nombres</th>
                                                        <th>Cargo</th>
                                                        <th>Email</th>
                                                        <th>Celular</th>
                                                        <th>Opciones</th>
                                                    </tr>
                                                </thead>
                                                <tbody align="center">
                                                <%
                                                    for (int i = 0; i < ListarUsuarios.size(); i++) {
                                                        Usuario inv = (Usuario) ListarUsuarios.get(i);

                                                        String id = inv.getId().toString();
                                                        String nombre = inv.getNombre();
                                                        String ApellidoP = inv.getApellidoP();
                                                        String ApellidoM = inv.getApellidoM();
                                                        String Sexo = inv.getSexo();
                                                        String Grado = inv.getGradoAcademico();
                                                        String dni = inv.getDni();
                                                        String Correo = inv.getCorreo();
                                                        String Celular = inv.getCelular();
                                                        String Cuenta = inv.getCuenta();
                                                        String Clave = inv.getClave();
                                                        String facultad = inv.getFacultad().getId().toString();
                                                        String Cargo = "";
                                                        if (inv.getCargo().equals("D")) {
                                                            Cargo = "Director de investigacion";
                                                        }
                                                        if (inv.getCargo().equals("S")) {
                                                            Cargo = "Secretaria";
                                                        }
                                                        if (inv.getCargo().equals("C")) {
                                                            Cargo = "Chofer";
                                                        }
                                                        if (inv.getCargo().equals("E")) {
                                                            Cargo = "Conserje";
                                                        }
                                                %>
                                                <tr>
                                                    <td><% out.println(i + 1); %></td>
                                                    <td><% out.println(inv.getDni());%></td>
                                                    <td><% out.println(inv.getApellidoP() + " " + inv.getApellidoM() + " " + inv.getNombre());%></td>
                                                    <td><% out.println(Cargo); %></td>
                                                    <td><% out.println(inv.getCorreo());%></td>
                                                    <td><% out.println(inv.getCelular());%></td>
                                                    <td>
                                            <imput type="submit" class="btn btn-info" data-toggle="modal" data-target="#editar-usuario" onClick="pasar('<%=id%>', '<%=nombre%>', '<%=ApellidoP%>', '<%=ApellidoM%>', '<%=Sexo%>', '<%=Grado%>', '<%=dni%>', '<%=Correo%>', '<%=Celular%>', '<%=Cuenta%>', '<%=Clave%>', '<%=facultad%>', '<%=Cargo%>')"><span class="glyphicon glyphicon-pencil"></span>Editar</imput>
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
                                <form action="../sUsuario" method="get" accept-charset="utf-8" id="sUsuario">  
                                    <div>                                                          
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Nombres</label>
                                            <input type="text" class="form-control" id="nombre" name="nombre">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Apellidos Paternos</label>
                                            <input type="text" class="form-control" id="apaterno" name="apaterno">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Apellidos Maternos</label>
                                            <input type="text" class="form-control" id="amaterno" name="amaterno">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Documento de Identidad</label>
                                            <input type="text" class="form-control" id="dni" name="dni" maxlength="8">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Genero</label>
                                            <select class="form-control" id="sexo" name="sexo">
                                                <option selected>Seleccionar...</option>
                                                <option>Femenino</option>
                                                <option>Masculino</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Grado Academico</label>
                                            <input type="text" class="form-control" id="grado" name="grado">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Cargo</label>
                                            <select class="form-control" id="cargo" name="cargo">
                                                <option selected>Seleccionar...</option>
                                                <option>Director de investigacion</option>
                                                <option>Secretaria</option>
                                                <option>Chofer</option>
                                                <option>Conserje</option>  
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Email</label>
                                            <input type="text" class="form-control" id="correo" name="correo" maxlength="50">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Celular</label>
                                            <input type="text" class="form-control" name ="celular" id="celular" maxlength="9">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Cuenta</label>
                                            <input type="text" class="form-control" id="celular" name="cuenta">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Clave</label>
                                            <input type="password" class="form-control" id="clave" name="clave">
                                        </div> 
                                        <div class="form-group col-md-6">
                                            <label for="exampleInputEmail1">Facultad</label>
                                            <div class="input-group">
                                                <span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-list"></span></span>
                                                <select class="form-control" name="facultad" id="facultad" aria-describedby="basic-addon1">
                                                    <option value="" selected>Seleccionar...</option>    
                                                    <%
                                                        for (int i = 0; i < listaFacultad.size(); i++) {
                                                            Facultad cat = (Facultad) listaFacultad.get(i);
                                                    %>
                                                        <option><% out.println(cat.getAbreviatura());
                                                            }%></option>
                                                </select>
                                            </div>
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
                                <form action="" method="post" accept-charset="utf-8" id="FormUser"> 
                                    <div>                                                          
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Tipo de Documento</label>
                                            <select class="form-control" id="" name="">
                                                <option value="" selected>Seleccionar...</option>
                                                <option value="#">Registro Civil</option>
                                                <option value="#">Tarjeta Identidad</option>
                                                <option value="#">Carnet</option>  
                                                <option value="#">DNI</option>                    
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Documento de Identidad</label>
                                            <input type="text" class="form-control" id="" name="" disabled>
                                            <input type="hidden" id="" name="" value="">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Nombres y Apellidos</label>
                                            <input type="text" class="form-control" id="" name="">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Genero</label>
                                            <select class="form-control" id="" name="">
                                                <option value="" selected>Seleccionar...</option>
                                                <option value="">Femenino</option>
                                                <option value="">Masculino</option>
                                            </select>
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Email</label>
                                            <input type="text" class="form-control" id="" name="">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Telefono</label>
                                            <input type="text" class="form-control" name ="" id="">
                                        </div>
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Clave</label>
                                            <input type="password" class="form-control" id="" name="">
                                        </div> 
                                        <div class="form-group col-md-6" id="">
                                            <label class="control-label">Niveles de Acceso</label>
                                            <select class="form-control" id="" name="">
                                                <option value="" selected>Seleccionar...</option>
                                                <option value="">Administrador</option>
                                                <option value="">Vicerrector</option>
                                                <option value="">Decanos</option>                            
                                                <option value="">Secretaria Vicerrectorado</option>
                                                <option value="">Secretaria Academica</option>                              
                                            </select>
                                        </div>                       
                                    </div>
                                    <br>
                                    <br>
                                    <div class="modal-footer">
                                        <center>
                                            <div class="form-group col-md-6">
                                                <imput type="submit" class="btn btn-danger" data-dismiss="modal" ><span class="glyphicon glyphicon-remove"></span>Cancelar</imput>
                                            </div>
                                            <div class="form-group col-md-6"> 
                                                <imput type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-floppy-saved"></span>Guardar</imput>
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
                            <center><p>�Deseas eliminar el usuario?</p></center> 
                            <br>
                            <div class="modal-footer"><center>
                                    <div class="form-group col-md-6">
                                        <imput type="submit" class="btn btn-danger" data-dismiss="modal" ><span class="glyphicon glyphicon-remove"></span>Cancelar</imput>
                                    </div>
                                    <div class="form-group col-md-6"> 
                                        <imput type="submit" class="btn btn-success"><span class="glyphicon glyphicon-floppy-saved"></span>Eliminar</imput>
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
                                                function pasar(id, nombre, ApellidoP, ApellidoM, Sexo, Grado, dni, Correo, Celular, Cuenta, Clave, facultad, Cargo) {
                                                    $('#u_id').val(id);
                                                    $('#u_nombre').val(nombre);
                                                    $('#u_apellidop').val(ApellidoP);
                                                    $('#u_apellidom').val(ApellidoM);
                                                    $('#u_sexo').val(Sexo);
                                                    $('#u_grado').val(Grado);
                                                    $('#u_dni').val(dni);
                                                    $('#u_correo').val(Correo);
                                                    $('#u_celular').val(Celular);
                                                    $('#u_cuenta').val(Cuenta);
                                                    $('#u_clave').val(Clave);
                                                    $('#u_facultad').val(facultad);
                                                    $('#u_cargo').val(cargo);
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
