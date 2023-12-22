<%-- 
    Document   : index
    Created on : 03/09/2017, 01:21:21 PM
    Author     : Edward Mendoza
--%>
<%@page import="Beans.Slider"%>
<jsp:include page="sSlider?opcion=ListarSlider" />
<jsp:useBean id="ListarSlider" scope="request" class="java.util.ArrayList"/>

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
        <jsp:include  page="Header.jsp"></jsp:include>
            <!-- //header -->
            <!-- header-bot -->
            <!-- //header-bot -->
            <!-- navegation-->
        <jsp:include  page="Menu.jsp"></jsp:include>

            <!-- banner -->
            <div class="container">
                <div id="carousel-1" class="carousel slide" data-ride="carousel">

                    <div class="carousel-inner" role="listbox">
                        <%
                            for (int i = 0; i < ListarSlider.size(); i++) {
                                Slider inv = (Slider) ListarSlider.get(i);

                        %>
                        <div class="item <%if (i == 0) {
                            out.println("active");
                        }%>"  align="center">
                        <img src="Back-end/dist/img/slider/<%out.println(inv.getImagen());%>" class="img-responsive" alt=""  >
                        <div class="container">
                            <div class="carousel-caption">
                                <p class="contenido-slider"><%out.println(inv.getTitulo());%></p></div>
                        </div>
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


        </div>
        <br>
        <!-- /.carousel -->
        <!-- //banner -->
        <br>

        <!-- NUEVO-->
        <section>
            <div class="container" style="background: #A7CCF5">
                <div class="row">
                    <div class="col-md-4">
                        <br>
                        <img src="images/foto.jpg" alt=" " class="img-responsive" />
                    </div>
                    <div class="col-md-4 agileits_schedule_bottom_right">
                        <div class="w3ls_schedule_bottom_right_grid">
                            <h3>UNPRG en cifras</h3>
                            <p>Nuestra Universidad Nacional Pedro Ruiz Gallo se ha posicionado como una de las mejores universidades del Norte Peruano, y sus cifras lo demuestran.</p>
                            <div class="col-md-4 w3l_schedule_bottom_right_grid1">
                                <i class="fa fa-university" aria-hidden="true"></i>
                                <h4>Facultades</h4>
                                <h5 class="counter">14</h5>
                            </div>
                            <div class="col-md-4 w3l_schedule_bottom_right_grid1">
                                <i class="fa fa-address-book-o" aria-hidden="true"></i>
                                <h4>Escuelas </h4>
                                <h5 class="counter">30</h5>
                            </div>
                            <div class="col-md-4 w3l_schedule_bottom_right_grid1">
                                <i class="fa fa-graduation-cap" aria-hidden="true"></i>
                                <h4>Estudiantes</h4>
                                <h5 class="counter">15000</h5>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                    <div class="col-md-4">
                        <div class="linkes linkes-success">
                            <a href="#">Portal UNPRG </a>
                        </div>	
                        <div class="linkes linkes-red">
                            <a href="#">Admisiòn</a>
                        </div>	
                        <div class="linkes linkes-blue">
                            <a href="#">Portal de Transparencia</a> 
                        </div>	
                        <div class="linkes linkes-red">
                            <a href="Bibliotecas.jsp">Biblioteca VRINV </a> 
                        </div>	
                        <div class="linkes linkes-blue">
                            <a href="#">Repositorios </a>  
                        </div>
                    </div>	  

                </div>
            </div>
        </section>
        <!--END  NUEVO -->

        <section>
            <div class="container">
                <div clas class="row">
                    <div class="col-md-8">
                        <div class="col-md-12">
                            <h3 class="widget-title-not"><span>Noticias</span></h3> 
                            <div class="index-content">
                                <div class="">
                                    <div class="col-md-4">
                                        <div class="card">
                                            <img src="images/frontis.jpg">
                                            <h4>Investment Strategy</h4>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                            <a href="blog-ici.html" class="blue-button">Read More</a>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="card">
                                            <img src="images/frontis.jpg">
                                            <h4>Investment Strategy</h4>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                            <a href="blog-ici.html" class="blue-button">Read More</a>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="card">
                                            <img src="images/frontis.jpg">
                                            <h4>Investment Strategy</h4>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                            <a href="blog-ici.html" class="blue-button">Read More</a>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div> 
                        <div class="col-md-12">
                            <h3 class="widget-title-not"><span>Noticias</span></h3> 
                            <div class="index-content">
                                <div class="">
                                    <div class="col-md-4">
                                        <div class="card">
                                            <img src="images/frontis.jpg">
                                            <h4>Investment Strategy</h4>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                            <a href="blog-ici.html" class="blue-button">Read More</a>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="card">
                                            <img src="images/frontis.jpg">
                                            <h4>Investment Strategy</h4>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                            <a href="blog-ici.html" class="blue-button">Read More</a>
                                        </div>
                                    </div>
                                    <div class="col-md-4">
                                        <div class="card">
                                            <img src="images/frontis.jpg">
                                            <h4>Investment Strategy</h4>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
                                            <a href="blog-ici.html" class="blue-button">Read More</a>
                                        </div>
                                    </div>

                                </div>
                            </div>

                        </div> 



                    </div>
                    <div class="col-md-4">
                        <div class="col-md-12">
                            <h3 class="widget-title-not"><span>Revistas</span></h3> 
                            <div class="revista">
                                <div class="col-md-10 col-md-offset-1">
                                    <div id="menCollection" class="carousel slide " data-ride="carousel">
                                        <div class="carousel-inner">
                                            <div class="item active">
                                                <div class="img-revista">
                                                    <a href="revistas.jsp" ><img  src="images/revi1.jpg" class="img-responsive" alt="product 1"></a>
                                                    <h9>Revista cientifica INGENIERIA DE YUKI SYSTEM</h9> 
                                                </div>

                                            </div><!-- End Item -->
                                            <div class="item">
                                                <div class="img-revista">
                                                    <a href="revistas.jsp" ><img  src="images/revi1.jpg" class="img-responsive" alt="product 1"></a>
                                                    <h9>Revista cientifica INGENIERIA DE YUKI SYSTEM</h9> 
                                                </div>                                  
                                            </div><!-- End Item -->
                                            <div class="item">
                                                <div class="img-revista">
                                                    <a href="revistas.jsp" ><img  src="images/revi1.jpg" class="img-responsive" alt="product 1"></a>
                                                    <h9>Revista cientifica INGENIERIA DE YUKI SYSTEM</h9> 
                                                </div>                                    
                                            </div><!-- End Item -->                                
                                        </div><!-- End Carousel Inner -->
                                        <!-- Controls -->
                                        <div>
                                            <a class="left carousel-control" href="#menCollection" role="button" data-slide="prev">
                                                <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                                                <span class="sr-only">Previous</span>
                                            </a>
                                            <a class="right carousel-control" href="#menCollection" role="button" data-slide="next">
                                                <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                                                <span class="sr-only">Next</span>
                                            </a>
                                        </div>

                                    </div><!-- /.carousel -->

                                    <div><a href="revistas.jsp" class="btn btn-block btn-primary">Ver todas</a></div>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-12">
                            <h3 class="widget-title-not"><span>EVENTOS</span></h3> 
                            <div class="revista">
                                <div class="col-md-10 col-md-offset-1">

                                    <div class="row" >
                                        <ul>
                                            <li class="recent-post">
                                                <div class="post-img">
                                                    <img src="images/evento.jpg" class="img-responsive">
                                                </div>
                                                <a href="#"><h5>Proyecto de Investigacion de Paneles solares para la UNPRG.
                                                    </h5></a>
                                                <p><small><i class="fa fa-calendar" data-original-title="" title=""></i> 7 Septiembre 2017</small></p>
                                            </li>
                                            <li class="recent-post">
                                                <div class="post-img">
                                                    <img src="images/evento.jpg" class="img-responsive">
                                                </div>
                                                <a href="#"><h5>Proyecto de Investigacion de Paneles solares para la UNPRG.
                                                    </h5></a>
                                                <p><small><i class="fa fa-calendar" data-original-title="" title=""></i> 7 Septiembre 2017</small></p>
                                            </li>
                                            <li class="recent-post">
                                                <div class="post-img">
                                                    <img src="images/evento.jpg" class="img-responsive">
                                                </div>
                                                <a href="#"><h5>Proyecto de Investigacion de Paneles solares para la UNPRG.
                                                    </h5></a>
                                                <p><small><i class="fa fa-calendar" data-original-title="" title=""></i> 7 Septiembre 2017</small></p>
                                            </li>

                                        </ul>
                                    </div>
                                    <div><a href="eventos.jsp" class="btn btn-block btn-primary">Ver todas</a></div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>
        </section>


        <section class="enlaces">
            <div class="container">
                <div class="row">
                    <!-- Bottom switcher of slider -->

                    <ul class="col-md-12">
                        <li class="col-md-3">
                            <a href="#" class="thumbnail" ><img src="images/enlaces_portal/ministerio_de_educacion.png"></a>
                        </li>

                        <li class="col-md-3">
                            <a href="#" class="thumbnail" ><img src="images/enlaces_portal/portal-estado-peruano.png"></a>
                        </li>

                        <li class="col-md-3">
                            <a href="#" class="thumbnail" ><img src="images/enlaces_portal/sunedu.png"></a>
                        </li>

                        <li class="col-md-3">
                            <a href="#" class="thumbnail" ><img src="images/enlaces_portal/concytec.png"></a>
                        </li> 
                        <li class="col-md-3">
                            <a href="#" class="thumbnail" ><img src="images/enlaces_portal/pronabec.png"></a>
                        </li>

                        <li class="col-md-3">
                            <a href="#" class="thumbnail" ><img src="images/enlaces_portal/Innovate-Peru.png"></a>
                        </li>

                    </ul>
                </div>
            </div>
        </section>





















        <!-- footer -->
        <jsp:include  page="Footer.jsp"></jsp:include>
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
