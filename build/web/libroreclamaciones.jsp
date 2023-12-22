<%-- 
    Document   : libroreclamaciones
    Created on : 06/09/2017, 09:57:59 PM
    Author     : Edward Mendoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vicerrectorado</title>
        <!--/tags -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Elite Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!--//tags -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/estilos.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <link href="css/easy-responsive-tabs.css" rel='stylesheet' type='text/css'/>
        <!-- //for bootstrap working -->

    </head>
    <body>
        <!-- header -->

        <!-- header-bot -->
        <div class="header-bot  " >
            <div class="header-bot_inner_wthreeinfo_header_mid ">

                <!-- header-bot -->
                <div class="col-md-4 logo_agile">
                    <h1><a href="inicio.html"><img src="images/logounprg.png" class="img-logo"></a></h1>
                </div>
                <div class="col-md-4 logo_agile">

                </div>
                <!-- header-bot -->
                <div class="col-md-4" >
                    <h1><a href="#"><img src="images/libro_reclamacion1.png"   class="img-logo " style="float: right;" ></a></h1>

                </div>
                <div class="clearfix"></div>
            </div>
        </div>
        <div class="header-bot" style="background-color: #005498" >
            <div class="header-bot_inner_wthreeinfo_header_mid ">

                <!-- header-bot -->
                <div class="col-md-2 ">

                </div>
                <div class="col-md-8 ">
                    <p style="color: #fff">Conforme a lo establecido en el Código de Protección y Defensa 
                        del Consumidor este establecimieto cuenta con un
                        Libro de Reclamaciones a tu disposición.</p>

                </div>
                <div class="col-md-2 ">
                </div>

                <div class="clearfix"></div>
            </div>
        </div>
        <!-- //header-bot -->


        <br>
        <!--CONTENT -->
        <section   >
            <div class="container" >
                <div class="container">
                    <div class="row" style="border:1px solid blue; background-color: #ccc;">
                        <div class="form-group col-md-12 " style="background-color: #9ba3ff">
                            <div class="encabezado">
                                <div class="empresa">
                                    Universidad Nacional Pedro Ruiz Gallo
                                </div>
                                <p class="texto_gris">  Calle Juan XXIII 391 Lambayeque, Perú</p>
                                <p class="texto_gris"> R.U.C. 20105685875</p>
                            </div>
                        </div>

                        <div class="form-group col-md-12 ">
                            <div class="form-group col-md-6">
                                <span class="label label-default">Fecha:</span> <label>  02 de Septiembre del 2017</label>

                            </div>
                            <div class="form-group col-md-6">
                                <span class="label label-default">Hoja de Reclamaciones Nro:</span> <label>  0000000091-2017-CUN</label>

                            </div>
                        </div>
                        <div class="form-group col-md-12 bg-primary">
                            <label class="control-label" for="billinginformation">1. IDENTIFICACIÓN DEL USUARIO RECLAMANTE</label>
                        </div>

                        <div class="shipping-info">
                            <div class="form-group col-md-4">
                                <span class="required-lbl">* </span><label class="control-label" >Nombres</label>
                                <div class="controls">
                                    <input  type="text" placeholder="" class="form-control" required="">
                                </div>
                            </div>

                            <div class="form-group col-md-4">
                                <span class="required-lbl">* </span><label class="control-label" for="lastname"> Apellido Paterno</label>
                                <div class="controls">
                                    <input  type="text" placeholder="" class="form-control" required="">
                                </div>
                            </div>

                            <div class="form-group col-md-4">
                                <span class="required-lbl">* </span><label class="control-label" > Apellido Materno</label>
                                <div class="controls">
                                    <input   type="text" placeholder="" class="form-control" required="">
                                </div>
                            </div>
                            <div class="form-group col-md-4">
                                <span class="required-lbl">* </span><label class="control-label" > DNI</label>
                                <div class="controls">
                                    <input   type="text" placeholder="" class="form-control" required="">
                                </div>
                            </div>
                            <div class="form-group col-md-8">
                                <span class="required-lbl">* </span><label class="control-label" > Domicilio</label>
                                <div class="controls">
                                    <input   type="text" placeholder="" class="form-control" required="">
                                </div>
                            </div>
                            <div class="form-group col-md-4">
                                <span class="required-lbl">* </span><label class="control-label" >Teléfono</label>
                                <div class="controls">
                                    <input   type="text" placeholder="" class="form-control" required="">
                                </div>
                            </div>
                            <div class="form-group col-md-6">
                                <span class="required-lbl">* </span><label class="control-label" >Correo electrónico</label>
                                <div class="controls">
                                    <input   type="text" placeholder="" class="form-control" required="">
                                </div>
                            </div>
                        </div>
                        <br>
                        <div class="form-group col-md-12 bg-primary">
                            <label class="control-label" ">2.TIPO Y DETALLE DE  RECLAMACION</label>
                        </div>

                        <div class="shipping-info">
                            <div class="form-group col-md-4">
                                <span class="required-lbl">* </span><label class="control-label" >Tipo incidencia</label>
                                <div class="controls">
                                    <select class="form-control input-sm" id="years">
                                        <option>-- Selecciona el tipo --</option>
                                        <option>Queja</option>
                                        <option>Reclamo</option>

                                    </select>
                                </div>
                            </div>

                            <div class="form-group col-md-4">
                                <span class="required-lbl">* </span><label class="control-label" for="lastname"> Fecha de incidencia</label>
                                <div class="controls">
                                    <input type="date"   class="form-control">
                                </div>
                            </div>

                            <div class="form-group col-md-6">
                                <span class="required-lbl">* </span><label class="control-label" > Detalle</label>
                                <div class="controls">
                                    <textarea class="form-control input-sm"  placeholder="Escriba su reclamo" rows="5"></textarea>
                                </div>
                            </div>
                            <div class="form-group col-md-6">
                                <span class="required-lbl">* </span><label class="control-label" >Pedido</label>
                                <div class="controls">
                                    <textarea class="form-control input-sm" placeholder="Escriba su pedido" rows="5"></textarea>
                                </div>
                            </div>
                            <br>
                            <div class="form-group col-md-12 text-center">
                                <a href="#" class="btn btn-toolbar btn-lg btn-info"><span class="glyphicon glyphicon-arrow-right"></span> Enviar</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- END CONTENT -->

        <br>
        <!-- footer -->
         <jsp:include page="Footer.jsp"></jsp:include>
        <!-- //footer -->




        <a href="#home" class="scroll" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
        <!-- js -->
        <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
        <!-- //js -->
        <script src="js/modernizr.custom.js"></script>
        <!-- Custom-JavaScript-File-Links --> 
        <!-- script for responsive tabs -->						
        <script src="js/easy-responsive-tabs.js"></script>
        <script>
$(document).ready(function () {
    $('#horizontalTab').easyResponsiveTabs({
        type: 'default', //Types: default, vertical, accordion           
        width: 'auto', //auto or any width like 600px
        fit: true, // 100% fit in a container
        closed: 'accordion', // Start closed if in accordion view
        activate: function (event) { // Callback function if tab is switched
            var $tab = $(this);
            var $info = $('#tabInfo');
            var $name = $('span', $info);
            $name.text($tab.text());
            $info.show();
        }
    });
    $('#verticalTab').easyResponsiveTabs({
        type: 'vertical',
        width: 'auto',
        fit: true
    });
});
        </script>
        <!-- //script for responsive tabs -->		
        <!-- stats -->
        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/jquery.countup.js"></script>
        <script>
$('.counter').countUp();
        </script>
        <!-- //stats -->
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/jquery.easing.min.js"></script>
        <script type="text/javascript">
jQuery(document).ready(function ($) {
    $(".scroll").click(function (event) {
        event.preventDefault();
        $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
    });
});
        </script>
        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function () {
                /*
                 var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear' 
                 };
                 */

                $().UItoTop({easingType: 'easeOutQuart'});

            });
        </script>
        <!-- //here ends scrolling icon -->


        <!-- for bootstrap working -->
        <script type="text/javascript" src="js/bootstrap.js"></script>
    </body>
</html>
