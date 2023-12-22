<%-- 
    Document   : articulos
    Created on : 08/09/2017, 01:40:32 PM
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
        <link href="css/clndr.css" rel='stylesheet' type="text/css" media="all"/>	
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
            <div class="container  t3-sl t3-sl-1" style="border-bottom: 1px solid #D7D9DF;">		
                <div >
                    <center><h2>Recursos Electrónicos</h2>
                    </center>
                </div>
            </div>
            <br>
            <div class="container">
                <div class="bases-lista base-lista-pe">
                    <div class="formato">
                        <div class="row">
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src="images/recursos electronicos/ingenierias.png" >
                                    <div class="caption">
                                        <h3>Ciencias e Ingenierias</h3>
                                        <p>Aquí podras encontrar libros electronicos de ciencias básicas e ingenierias</p>
                                        <br>
                                        <p><a href="ingenierias.jsp" class="btn btn-primary"  role="button">Ver más <span class="glyphicon glyphicon-eye-open"></span></a></p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src="images/recursos electronicos/cienciassalud.jpg" >
                                    <div class="caption">
                                        <h3>Ciencias de la Salud</h3>
                                        <p>Aquí podras encontrar libros electronicos de ciencias básicas e ingenierias</p>
                                        <br>
                                        <p><a href="ciencias_salud.jsp" class="btn btn-primary"  role="button">Ver más <span class="glyphicon glyphicon-eye-open"></span></a></p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src="images/recursos electronicos/economicos y empresariales.jpg" >
                                    <div class="caption">
                                        <h3>Económicos-Empresariales</h3>
                                        <p>Aquí podras encontrar libros electronicos de ciencias básicas e ingenierias</p>
                                        <br>
                                        <p><a href="economicas_empresariales.jsp" class="btn btn-primary"  role="button">Ver más <span class="glyphicon glyphicon-eye-open"></span></a></p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-6 col-md-4">
                                <div class="thumbnail">
                                    <img src="images/recursos electronicos/sociales_educacion.png" >
                                    <div class="caption">
                                        <h3>Ciencias Sociales y Educación</h3>
                                        <p>Aquí podras encontrar libros electronicos de ciencias básicas e ingenierias</p>
                                        <br>
                                        <p><a href="#" class="btn btn-primary"  role="button">Ver más <span class="glyphicon glyphicon-eye-open"></span></a></p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </div>

                <!-- End main contenido -->

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
