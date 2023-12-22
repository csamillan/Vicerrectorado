<%-- 
    Document   : basededatos
    Created on : 07/09/2017, 12:56:57 PM
    Author     : Edward Mendoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Vicerrectorado-Objetivos</title>
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
        <link href="css/css-f4b41.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <link href="css/easy-responsive-tabs.css" rel='stylesheet' type='text/css'/>
        <style type="text/css">
            /*---------------------------BASE DE DATOS-----------------------------------*/
            /*-- team --*/  

            .w3_agileits {

                border: 0.1px solid #e5e3e3;
                padding: 10px;
            }
            .w3_agileits img {
                width: 120px; 
                height:60px;
            }


            .bases-item-text h2 a{
                font-family: "Robotoweb", Arial, sans-serif;
                font-size: 16px ;
                color: #000;


            }



            /*---------------------------END BASE DE DATOS-----------------------------------*/
        </style>
        <!-- //for bootstrap working -->

    </head>
    <body>
        <!-- //header -->
        <jsp:include  page="Header.jsp"></jsp:include>


            <!-- navegation-->
        <jsp:include  page="Menu.jsp"></jsp:include>

            <section>
                <!-- main contenido -->
                <div class="container">

                    <!-- HOME SL 1 -->
                    <section class="container cshadow breadcrumbs t3-sl t3-sl-1">

                        <ul class="breadcrumb ">
                            <li class="active"></li><li><a href="index.jsp" ><i class="fa fa-home" aria-hidden="true"></i> Inicio</a></li><li><span>Bases de datos</span></li>
                        </ul>
                        <div class="line-title">&nbsp;</div>

                    </section>
                    <!-- //HOME SL 1 -->

                    <section class="container cshadow breadcrumbs t3-sl ">
                        <div class="cshadow">
                            <div class="cpad">
                                <!-- MAIN CONTENT -->
                                <!-- CONTENT-->
                                <section>

                                    <div class="col-md-3">
                                        <div class="nav-side-menu">
                                            <div class="brand">Filtrar</div>
                                            <i aria-expanded="true" data-target="#menu-content" data-toggle="collapse" class="fa fa-filter fa-2x toggle-btn"></i>

                                            <div class="menu-list">

                                                <ul class="menu-content collapse in" id="menu-content">


                                                    <li class="collapsed active" data-target="#categorias" data-toggle="collapse">
                                                        <a href="#"><i class="fa fa-square" aria-hidden="true"></i><strong>CATEGORIAS</strong> <span class="arrow"></span></a>
                                                    </li>

                                                    <ul id="categorias" class="sub-menu collapse ">
                                                        <li class="active"><a href="#">Ciencias e Ingenierias</a></li>
                                                        <li><a href="#">Educacion</a></li>
                                                        <li><a href="#">Ciencias Sociales</a></li>
                                                        <li><a href="#">Humanidades</a></li>
                                                        <li><a href="#">Arte y Arquitectura</a></li>
                                                        <li><a href="#">Economia y Finanzas</a></li>
                                                        <li><a href="#">Administración, Contabilidad y Gestión</a></li>
                                                    </ul>


                                                    <li class="collapsed" data-target="#service" data-toggle="collapse">
                                                        <a href="#"><i class="fa fa-square" aria-hidden="true"></i><strong>Tipo </strong> <span class="arrow"></span></a>
                                                    </li>

                                                    <ul id="service" class="sub-menu collapse">
                                                        <div class="item-filtro-lista">
                                                            <div class="">Filtrar por:</div>
                                                            <div class="checks-item checkbox">
                                                                <div><label><input name="tipo" type="checkbox" value="">Conferencias</label></div>
                                                                <div><label><input name="tipo" type="checkbox" value="">Charlas</label></div>
                                                                <div><label><input name="tipo" type="checkbox" value="">Concursos y premios</label></div>
                                                                <div><label><input name="tipo" type="checkbox" value="">Talleres y actividades</label></div>        
                                                            </div>
                                                        </div>

                                                    </ul>

                                                </ul>
                                            </div>
                                            <br>
                                        </div>
                                    </div>
                                    <div class="col-md-9">

                                        <!-- main contenido -->

                                        <div class="container row-fluid  t3-sl t3-sl-1" style="border-bottom: 1px solid #D7D9DF;">		
                                            <div >
                                                <center><h3>Base de datos</h3>
                                                </center>
                                            </div>
                                        </div>
                                        <br>


                                        <div class="row ">

                                            <div class="col-md-6   w3_agileits">
                                                <img class="col-md-4  img-responsive" src="images/bd/EBSCO_Discovery-80x80.jpg" alt="">
                                                <div class="col-md-8 bases-item-text">
                                                    <h2><a href="#">EBSCO Discovery Service (EDS)</a></h2>
                                                    <a href="#"  class="btn btn-primary consultar">Consultar</a>									
                                                    <a class="ver-mas" href="#">Más información <span class="glyphicon glyphicon-menu-right"></span></a>
                                                </div>	
                                            </div>
                                            <div class="col-md-6   w3_agileits">
                                                <img class="col-md-4  img-responsive" src="images/bd/EBSCO_Research_Databases-150x43.jpg" alt="">
                                                <div class="col-md-8 bases-item-text">
                                                    <h2><a href="#">Ebsco Research Database</a></h2>
                                                    <a href="#"  class="btn btn-primary consultar">Consultar</a>									
                                                    <a class="ver-mas" href="#">Más información <span class="glyphicon glyphicon-menu-right"></span></a>
                                                </div>	
                                            </div>
                                            <div class="col-md-6   w3_agileits">
                                                <img class="col-md-4  img-responsive" src="images/bd/proquest-150x57.jpg" alt="">
                                                <div class="col-md-8 bases-item-text">
                                                    <h2><a href="#">ProQuest</a></h2>
                                                    <a href="#"  class="btn btn-primary consultar">Consultar</a>									
                                                    <a class="ver-mas" href="#">Más información <span class="glyphicon glyphicon-menu-right"></span></a>
                                                </div>	
                                            </div>
                                            <div class="col-md-6   w3_agileits">
                                                <img class="col-md-4 img-responsive" src="images/bd/E-Libro-80x80.png" alt="">
                                                <div class="col-md-8 bases-item-text">
                                                    <h2><a href="#">E-Libro</a></h2>
                                                    <a href="#"  class="btn btn-primary consultar">Consultar</a>									
                                                    <a class="ver-mas" href="#">Más información <span class="glyphicon glyphicon-menu-right"></span></a>
                                                </div>	
                                            </div>
                                            <div class="col-md-6   w3_agileits">
                                                <img class="col-md-4 img-responsive" src="images/bd/Vlex.jpg" alt="">
                                                <div class="col-md-8 bases-item-text">
                                                    <h2><a href="#">Vlex</a></h2>
                                                    <a href="#"  class="btn btn-primary consultar">Consultar</a>									
                                                    <a class="ver-mas" href="#">Más información <span class="glyphicon glyphicon-menu-right"></span></a>
                                                </div>	
                                            </div>
                                            <div class="col-md-6   w3_agileits">
                                                <img class="col-md-4 img-responsive" src="images/bd/wiley_stacked-150x53.jpg" alt="">
                                                <div class="col-md-8 bases-item-text">
                                                    <h2><a href="#">Wiley Online Library</a></h2>
                                                    <a href="#"  class="btn btn-primary consultar">Consultar</a>									
                                                    <a class="ver-mas" href="#">Más información <span class="glyphicon glyphicon-menu-right"></span></a>
                                                </div>	
                                            </div>


                                        </div>
                                        <br>
                                    </div>



                                        <!-- End main contenido -->
                                        </section>
                                    </div>
                                </section>
                                <!-- END CONTENT-->

                            </div>
                    </section> 
             

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
