<%-- 
    Document   : Bibliotecas
    Created on : 07/09/2017, 10:56:02 PM
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
        <link href="css/biblioteca.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/css-f4b41.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/font-awesome.css" rel="stylesheet"> 
        <link href="css/easy-responsive-tabs.css" rel='stylesheet' type='text/css'/>

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
                            <li class="active"><span class="divider hasTooltip" data-original-title="" title=""><i class="icon-user" data-toggle="tooltip" title="Está aquí: "></i></span></li><li><a href="/" class="pathway">Inicio</a></li><li><span>Bibliotecas</span></li>
                        </ul>
                        <div class="line-title">&nbsp;</div>

                    </section>
                    <!-- //HOME SL 1 -->

                    <section class="container cshadow breadcrumbs t3-sl ">
                        <div class="cshadow">
                            <div class="cpad">
                                <!-- MAIN CONTENT -->
                                <div class="row">
                                    <div class="cabecera-sb">
                                        <div class="col-md-4"><h4>Servicios de Investigación y Biblioteca</h4>
                                        </div>
                                        <div class="col-md-8"> 
                                            <div class="form-group">
                                                <div class="input-group">
                                                    <input class="form-control busqueda1" type="text" name="search" placeholder="Buscar..." required/>
                                                    <span class="input-group-btn">
                                                        <button class="btn btn-primary" type="submit"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
                                                    </span>

                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-md-8">
                                            <div class="row module-biblioteca">
                                                <div class="col-md-6 md-1" >
                                                    <div class="col-md-12 caja-modulo-b">
                                                        <div class="col-md-4 ">
                                                            <h2>Biblioteca Digital</h2>    
                                                        </div>
                                                        <div class="col-md-8">
                                                            <div class="caja-modulo-contenidob">
                                                                <p><a href="#"  class="">Todos los recursos de información de la UNPRG</a></p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12 caja-modulo-b caja-repositorio">
                                                        <div class="col-md-6 ">
                                                            <h2>Base de datos cientificas</h2>  
                                                        </div>
                                                        <div class="col-md-6 caja-modulo-contenido1">
                                                            <div class="caja-modulo-contenidob ">
                                                                <ul>
                                                                    <li><a href="basededatos.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> EBSCO Discovery Service(EDS)</a></li>
                                                                    <li><a href="basededatos.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> ProQuest</a></li>
                                                                    <li><a href="basededatos.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Y más bases de datos</a></li>
                                                                  
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12 caja-modulo-b caja-repositorio">
                                                        <div class="col-md-6 ">
                                                            <h2>Repositorios académicos</h2> 
                                                            
                                                        </div>
                                                        <div class="col-md-6 caja-modulo-contenido1">
                                                            <div class="caja-modulo-contenidob ">
                                                                <ul>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Repositorio UNPRG</a></li>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Repositorios VRINV</a></li>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Y más repositorios</a></li>
                                                                  
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12 caja-modulo-b caja-repositorio">
                                                        <div class="col-md-6 ">
                                                            <h2>Repositorios de Tesis</h2> 
                                                            
                                                        </div>
                                                        <div class="col-md-6 caja-modulo-contenido1">
                                                            <div class="caja-modulo-contenidob ">
                                                                <ul>
                                                                    <li><a href="tesis.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Tesis UNPRG</a></li>
                                                                    <li><a href="tesis.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Tesis Nacionales</a></li>
                                                                    <li><a href="tesis.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Y más </a></li>
                                                                  
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                  
                                                </div>

                                                <div class="col-md-6 md-2" >
                                                    <div class="col-md-12 caja-modulo-b">
                                                        <div class="col-md-4 ">
                                                            <h2>Catalogo en Linea</h2>
                                                        </div>
                                                        <div class="col-md-8">
                                                            <div class="caja-modulo-contenidob">
                                                                <p><a href="#"  class="">Colecciones de bibliotecas y archivos</a></p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12 caja-modulo-b caja-repositorio">
                                                        <div class="col-md-6 ">
                                                            <h2>Revistas</h2> 
                                                            
                                                        </div>
                                                        <div class="col-md-6 caja-modulo-contenido1">
                                                            <div class="caja-modulo-contenidob ">
                                                                <ul>
                                                                    <li><a href="revistas.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Revistas UNPRG</a></li>
                                                                    <li><a href="revistas.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Revistas Electronicas</a></li>
                                                                    <li><a href="revistas.jsp"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Y más </a></li>
                                                                  
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12 caja-modulo-b caja-repositorio">
                                                        <div class="col-md-6 ">
                                                            <h2>Libros Electrónicos</h2> 
                                                            
                                                        </div>
                                                        <div class="col-md-6 caja-modulo-contenido1">
                                                            <div class="caja-modulo-contenidob ">
                                                                <ul>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Librode Biblioteca UNPRG</a></li>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Libros Digitales</a></li>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Y más libros </a></li>
                                                                  
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="col-md-12 caja-modulo-b caja-repositorio">
                                                        <div class="col-md-6 ">
                                                            <h2>Guias Temáticas</h2> 
                                                            
                                                        </div>
                                                        <div class="col-md-6 caja-modulo-contenido1">
                                                            <div class="caja-modulo-contenidob ">
                                                                <ul>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Enlaces a sitios web</a></li>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Buscadores por temas</a></li>
                                                                    <li><a href="#"  class=""><i class="fa fa-caret-right" aria-hidden="true"></i> Y enlaces academicas </a></li>
                                                                  
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    
                                                </div>



                                            </div>
                                        </div>
                                        <div class="col-md-4">
                                            <br>
                                            
                                            <div >
    <div class="thumbnail">
        <div style="background-color: #0548E3; color: #fff">BIBLIOTECA UNPRG</div>
        <img src="images/slider1.jpg" >
      <div class="caption">
        <a href="#" class="btn btn-block btn-info">Biblioteca Central</a>
        <a href="#" class="btn btn-block btn-info">Bibliotecas por Facultad</a>
        <a href="#" class="btn btn-block btn-info">Bibliotecas Nacionales</a>
      </div>
    </div>
  </div>
                                        </div>

                                    </div>
                                </div>
                                <!-- end CONTENT-->
                                <br>
                            </div>
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
