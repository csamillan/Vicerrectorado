
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
            <div class="content-wrapper">
                <section class="content-header">
                    <h1>
                        Inicio
                        <small>Panel de Control</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li class="active">Libros</li>
                    </ol>
                </section>
                <section class="content">
                    <div class="row">
                        <div class="col-xs-12">
                            <div class="box box-primary">                
                                <div class="box-body">                  
                                    <div class="nav-tabs-custom">
                                        <ul class="nav nav-tabs pull-lef">
                                            <li class="active"><a href="#tab_1" data-toggle="tab"><i class="fa fa-file-text-o"></i>Libros </a></li>
                                            <li class="noti"><a href="#tab_2" data-toggle="tab"><i class="fa fa-file-text-o"></i> Agregar Libro</a></li>
                                        </ul>
                                        <div class="tab-content">
                                            <div class="tab-pane active" id="tab_1">
                                                <div class="container-fluid">
                                                    <div class="table-responsive ">

                                                        <table id="example2" class="table table-bordered table-hover">
                                                            <thead class="bg-info">
                                                                <tr align="center">
                                                                    
                                                                    <th>Foto</th>
                                                                    <th>Codigo</th>
                                                                    <th>Categoria</th>
                                                                    <th>Nombre del libro</th>
                                                                    <th>Autor(es)</th>
                                                                    <th>Adicional</th>
                                                                    <th>Opciones</th>

                                                                </tr>
                                                            </thead>
                                                            <tbody align="center">
                                                                <tr >
                                                                    <td > 
                                                                        <img class="media-object" src="dist/img/book.png" alt="Libro" width="48" height="48">
                                                                    </td>
                                                                    <td>0000001</td>
                                                                    <td>Matematica</td>
                                                                    <td>Calculo Diferencial</td>
                                                                    <td>Cobeñas </td>
                                                                    <td>Libro de matematic edicion 2015</td>
                                                                    
                                                                    <td>
                                                            <imput type="submit" class="btn btn-info" data-toggle="modal" data-target="#editar-usuario"><span class="glyphicon glyphicon-pencil"></span> Editar</imput>
                                                            <imput type="submit" class="btn btn-danger" data-toggle="modal" data-target="#eliminar-usuario"><span class="glyphicon glyphicon-trash"></span> Eliminar </imput>

                                                            </td>
                                                            </tr>
                                                            
                                                            </tbody>
                                                        </table>
                                                    </div>
                                                    <div class="row"><div class="col-md-6"><div class="dataTables_info" id="usuarios_info">Mostrando 11 al 20 de 30 registros</div></div><div class="col-md-6"><div class="dataTables_paginate paging_bootstrap"><ul class="pagination"><li class="prev"><a href="#">← Anterior</a></li><li class="active"><a href="#">1</a></li><li ><a href="#">2</a></li><li><a href="#">3</a></li><li><a href="#">4</a></li><li><a href="#">5</a></li><li class="next"><a href="#">Siguiente → </a></li></ul></div></div></div>

                                                </div>
                                            </div>
                                            <div class="tab-pane" id="tab_2">
                                                <div class="container-fluid">
                                                    <div class="row">
                                                        <div class="form-group col-md-12 bg-primary">
                                                            <label class="control-label">Registrar Libro Electrónico</label>
                                                        </div>

                                                        <div>
                                                            <div class="form-group col-md-6">
                                                                <span>* </span><label>Categoria</label>
                                                                <select class="form-control" >
                                                                    <option value="" selected>Seleccionar...</option>
                                                                    <option value="#">Matematica</option>
                                                                    <option value="#">Fisica</option>
                                                                    <option value="#">Contabilidad</option>  
                                                                    <option value="#">Quimica</option>                    
                                                                </select>
                                                            </div>

                                                            <div class="form-group col-md-6">
                                                                <span>* </span><label>Nombre del libro</label>
                                                                <div>
                                                                    <textarea    rows="2" class="form-control" ></textarea>
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-6">
                                                                <span>* </span><label>Autor(es)</label>
                                                                <div>
                                                                    <input   type="text" placeholder="" class="form-control" required="">
                                                                </div>
                                                            </div>
                                                            <div class="form-group col-md-6">
                                                                <span>* </span><label>Informacion adicional</label>
                                                                <div>
                                                                    <input   type="text" placeholder="" class="form-control" required="">
                                                                </div>
                                                            </div>

                                                            <div class="form-group col-md-12">
                                                                <div align="center" >
                                                                    <button type="submit" class="btn btn-primary" value="Registrar" name="opcion" ><span class="glyphicon glyphicon-floppy-saved"></span> Guardar</button>
                                                                    <button type="submit" class="btn btn-danger"><span class="glyphicon glyphicon-remove"></span>Cancelar</button>
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
