<%-- 
    Document   : eventos
    Created on : 03/09/2017, 04:13:09 PM
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

                    <!-- HOME SL 1 -->
                    <section class="container cshadow breadcrumbs t3-sl t3-sl-1">

                        <ul class="breadcrumb ">
                            <li class="active"></li><li><a href="index.jsp" ><i class="fa fa-home" aria-hidden="true"></i> Inicio</a></li><li><span>Eventos</span></li>
                        </ul>
                        <div class="line-title">&nbsp;</div>
                    </section>
                    <!-- //HOME SL 1 -->

                    <section class="container cshadow breadcrumbs">
                        <div class="titulo-noticias-h1 text-center">
                            <div class="container">
                                <div class="row ">
                                    <div class="col-md-12">
                                        <h1>Eventos</h1>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!--fin noticias-menu-->	
                        <div class="interna-wrapper">
                            <div class="container">
                                <div class="row interna">

                                    <div class="col-md-3">
                                        <div class="nav-interna">
                                            <div class="row" id="buscar">
                                                <div class="col-sm-12">
                                                    <div class="input-group custom-search-form">
                                                        <input type="text" class="form-control" placeholder="Buscar...">
                                                        <span class="input-group-btn">
                                                            <button class="btn btn-primary" type="button">
                                                                <span class="glyphicon glyphicon-search"></span>
                                                            </button>
                                                        </span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="group-nav">
                                                <div class="item">
                                                    <div class="">FILTRAR EVENTOS:</div>
                                                    <div class="checks-item checkbox">
                                                        <div><label><input name="tipo" type="checkbox" value="">Conferencias</label></div><div><label><input name="tipo" type="checkbox" value="">Charlas</label></div><div><label><input name="tipo" type="checkbox" value="">Concursos y premios</label></div><div><label><input name="tipo" type="checkbox" value="">Talleres y actividades</label></div>        
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- canlendario-->
                                            <div class="line-title">&nbsp;</div>
                                            <br>
                                            <div ><strong>CALENDARIO DE EVENTOS</strong></div>
                                            <div class="cal1 cal_2 calendar"><div class="clndr"><div class="clndr-controls"><div class="clndr-control-button"><p class="clndr-previous-button">previous</p></div><div class="month">July 2015</div><div class="clndr-control-button rightalign"><p class="clndr-next-button">next</p></div></div><table class="clndr-table" border="0" cellspacing="0" cellpadding="0"><thead><tr class="header-days"><td class="header-day">S</td><td class="header-day">M</td><td class="header-day">T</td><td class="header-day">W</td><td class="header-day">T</td><td class="header-day">F</td><td class="header-day">S</td></tr></thead><tbody><tr><td class="day adjacent-month last-month calendar-day-2015-06-28"><div class="day-contents">28</div></td><td class="day adjacent-month last-month calendar-day-2015-06-29"><div class="day-contents">29</div></td><td class="day adjacent-month last-month calendar-day-2015-06-30"><div class="day-contents">30</div></td><td class="day calendar-day-2015-07-01"><div class="day-contents">1</div></td><td class="day calendar-day-2015-07-02"><div class="day-contents">2</div></td><td class="day calendar-day-2015-07-03"><div class="day-contents">3</div></td><td class="day calendar-day-2015-07-04"><div class="day-contents">4</div></td></tr><tr><td class="day calendar-day-2015-07-05"><div class="day-contents">5</div></td><td class="day calendar-day-2015-07-06"><div class="day-contents">6</div></td><td class="day calendar-day-2015-07-07"><div class="day-contents">7</div></td><td class="day calendar-day-2015-07-08"><div class="day-contents">8</div></td><td class="day calendar-day-2015-07-09"><div class="day-contents">9</div></td><td class="day calendar-day-2015-07-10"><div class="day-contents">10</div></td><td class="day calendar-day-2015-07-11"><div class="day-contents">11</div></td></tr><tr><td class="day calendar-day-2015-07-12"><div class="day-contents">12</div></td><td class="day calendar-day-2015-07-13"><div class="day-contents">13</div></td><td class="day calendar-day-2015-07-14"><div class="day-contents">14</div></td><td class="day calendar-day-2015-07-15"><div class="day-contents">15</div></td><td class="day calendar-day-2015-07-16"><div class="day-contents">16</div></td><td class="day calendar-day-2015-07-17"><div class="day-contents">17</div></td><td class="day calendar-day-2015-07-18"><div class="day-contents">18</div></td></tr><tr><td class="day calendar-day-2015-07-19"><div class="day-contents">19</div></td><td class="day calendar-day-2015-07-20"><div class="day-contents">20</div></td><td class="day calendar-day-2015-07-21"><div class="day-contents">21</div></td><td class="day calendar-day-2015-07-22"><div class="day-contents">22</div></td><td class="day calendar-day-2015-07-23"><div class="day-contents">23</div></td><td class="day calendar-day-2015-07-24"><div class="day-contents">24</div></td><td class="day calendar-day-2015-07-25"><div class="day-contents">25</div></td></tr><tr><td class="day calendar-day-2015-07-26"><div class="day-contents">26</div></td><td class="day calendar-day-2015-07-27"><div class="day-contents">27</div></td><td class="day calendar-day-2015-07-28"><div class="day-contents">28</div></td><td class="day calendar-day-2015-07-29"><div class="day-contents">29</div></td><td class="day calendar-day-2015-07-30"><div class="day-contents">30</div></td><td class="day calendar-day-2015-07-31"><div class="day-contents">31</div></td><td class="day adjacent-month next-month calendar-day-2015-08-01"><div class="day-contents">1</div></td></tr></tbody></table></div></div>
                                            <!-- canlendario-->
                                        </div>
                                    </div>

                                    <div class="col-md-9">
                                        <article class="pb-70 margen">
                                            <div class="nav-eventos">
                                                <ul  class="nav nav-tabs nav-tabs" >
                                                    <li class="active"><a role="tab" data-toggle="tab">Hoy</a></li>
                                                    <li><a  role="tab"  data-toggle="tab" >Semana</a></li>
                                                    <li><a  role="tab"  data-toggle="tab" >Mes</a></li>

                                                </ul>	
                                            </div>



                                            <div class="cursos-lista">
                                                <div class="listado-ev" id="#">
                                                    <div class="agenda">
                                                        <span class="dia">Miercoles</span>
                                                        <span class="num">21</span>
                                                        <span class="hora">10:00 a.m.</span> </div>
                                                    <div class="agen-foto"><img src="images/eventos/evento1.png"></div>
                                                    <div class="agen-texto">
                                                        <h2><a href="#" alt="#" title="#">Capacitaciones de uso de base de datos: E-libro y Pro-Quest</a></h2>
                                                        <p>21 Junio del 2017</p>
                                                        <p>Auditorio Ficsa</p>
                                                    </div>
                                                </div>
                                                <div class="listado-ev" id="#">
                                                    <div class="agenda">
                                                        <span class="dia">Miercoles</span>
                                                        <span class="num">21</span>
                                                        <span class="hora">10:00 a.m.</span> </div>
                                                    <div class="agen-foto"><img src="images/noticias/noti2.jpg"></div>
                                                    <div class="agen-texto">
                                                        <h2><a href="#" alt="#" title="#">Capacitaciones de uso de base de datos: E-libro y Pro-Quest</a></h2>
                                                        <p>21 Junio del 2017</p>
                                                        <p>Auditorio Ficsa</p>
                                                    </div>
                                                </div>
                                                <div class="listado-ev" id="#">
                                                    <div class="agenda">
                                                        <span class="dia">Miercoles</span>
                                                        <span class="num">21</span>
                                                        <span class="hora">10:00 a.m.</span> </div>
                                                    <div class="agen-foto"><img src="images/noticias/noti2.jpg"></div>
                                                    <div class="agen-texto">
                                                        <h2><a href="#" alt="#" title="#">Capacitaciones de uso de base de datos: E-libro y Pro-Quest</a></h2>
                                                        <p>21 Junio del 2017</p>
                                                        <p>Auditorio Ficsa</p>
                                                    </div>
                                                </div>

                                                <div class="paginacion text-center"><ul class="pagination"><li class="active"><a>1</a></li><li><a href="#">2</a></li><li><a href="#">3</a></li><li><a> » </a></li></ul></div>                        
                                        </article>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>

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

