<%-- 
    Document   : noticias
    Created on : 03/09/2017, 04:21:34 PM
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
                            <li class="active"></li><li><a href="index.jsp" ><i class="fa fa-home" aria-hidden="true"></i> Inicio</a></li><li><span>Noticias</span></li>
                        </ul>
                        <div class="line-title">&nbsp;</div>
                    </section>
                    <!-- //HOME SL 1 -->
                    <section class="container cshadow breadcrumbs">
                        <div class="titulo-noticias-h1 text-center">
                            <div class="container">
                                <div class="row ">
                                    <div class="col-md-12">
                                        <h1>Noticias</h1>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="noticias-menu">
                            <div class="nav-noticias">
                                <div class="col-md-offset-3 col-sm-offset-2 not-event-tabs hidden-xs">
                                    <ul class="nav nav-tabs">
                                        <li class="active"><a class="noti"  role="tab"  data-toggle="tab"  href="#">Locales</a></li>
                                        <li><a class="noti"  role="tab"  data-toggle="tab" href="#">Nacionales</a></li>
                                        <li><a class="noti"  role="tab"  data-toggle="tab" href="#">Internacionales</a></li>                        
                                    </ul>
                                </div>
                            </div>
                        </div>
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
                                            <div class="grupo-nav">
                                                <div><h3> Archivo</h3></div>
                                                <div class="panel-group">
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title">
                                                                <a data-toggle="collapse" href="#collapse1"><span class="glyphicon glyphicon-menu-right"></span> 2017</a>
                                                            </h4>
                                                        </div>
                                                        <div id="collapse1" class="panel-collapse collapse">
                                                            <ul class="list-group">
                                                                <li class="list-group-item">Enero(1)</li>
                                                                <li class="list-group-item">Marzo(3)</li>
                                                                <li class="list-group-item">Junio(4)</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel-group">
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title">
                                                                <a data-toggle="collapse" href="#collapse2"><span class="glyphicon glyphicon-menu-right"></span> 2016</a>
                                                            </h4>
                                                        </div>
                                                        <div id="collapse2" class="panel-collapse collapse">
                                                            <ul class="list-group">
                                                                <li class="list-group-item">Enero</li>
                                                                <li class="list-group-item">Marzo</li>
                                                                <li class="list-group-item">Junio</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="panel-group">
                                                    <div class="panel panel-default">
                                                        <div class="panel-heading">
                                                            <h4 class="panel-title">
                                                                <a data-toggle="collapse" href="#collapse3"><span class="glyphicon glyphicon-menu-right"></span> 2015</a>
                                                            </h4>
                                                        </div>
                                                        <div id="collapse3" class="panel-collapse collapse">
                                                            <ul class="list-group">
                                                                <li class="list-group-item">Enero</li>
                                                                <li class="list-group-item">Julio </li>
                                                                <li class="list-group-item">Septiembre</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-9">
                                        <article>
                                            <div class="row container-fluid">
                                                <div class="col-sm-6 col-md-4">
                                                    <figure>
                                                        <img src="images/noticias/noti2.jpg">
                                                    </figure>
                                                </div>
                                                <div class="col-sm-6 col-md-8">
                                                    <div class="direc-text">
                                                        <h4><a href="paginanoticia.jsp">Lambayeque: implementan centro de investigación tecnológica en UNPRG</a></h4>
                                                        <div class="fechanoti"><i class="glyphicon glyphicon-calendar"></i> 04/05/2017</div>
                                                        <p>&nbsp;
                                                            El vicerrector de Investigación, Ernesto Hashimoto Moncayo, indicó que la adquisición de 50 potentes microscopios es una palanca para lograr el desarrollo de la investigación en la universidad nacional…

                                                            El vicerrector de Investigación, Ernesto Hashimoto Moncayo, indicó que la adquisición de 50 potentes microscopios es una palanca para lograr el desarrollo de la investigación en la universidad nacional…
                                                            El vicerrector de Investigación, Ernesto Hashimoto Moncayo, indicó que la adquisición de 50 potentes microscopios es una palanca para lograr el desarrollo de la investigación en la universidad nacional…</p>
                                                    </div>
                                                </div>
                                            </div>

                                        </article>
                                        <br>
                                        <article>
                                            <div class="row container-fluid">
                                                <div class="col-sm-6 col-md-4">
                                                    <figure>
                                                        <img src="images/noticias/noti2.jpg">
                                                    </figure>
                                                </div>
                                                <div class="col-sm-6 col-md-8">
                                                    <div class="direc-text">
                                                        <h4><a href="paginanoticia.jsp">Lambayeque: implementan centro de investigación tecnológica en UNPRG</a></h4>
                                                        <div class="fecha"><i class="glyphicon glyphicon-calendar"></i> 04/05/2017</div>
                                                        <p>&nbsp;
                                                            El vicerrector de Investigación, Ernesto Hashimoto Moncayo, indicó que la adquisición de 50 potentes microscopios es una palanca para lograr el desarrollo de la investigación en la universidad nacional…
                                                            El vicerrector de Investigación, Ernesto Hashimoto Moncayo, indicó que la adquisición de 50 potentes microscopios es una palanca para lograr el desarrollo de la investigación en la universidad nacional…</p>
                                                    </div>
                                                </div>
                                            </div>

                                        </article>
                                        <div class="paginacion text-center"><ul class="pagination"><li class="active"><a>1</a></li><li><a href="#">2</a></li><li><a href="#">3</a></li><li><a> » </a></li></ul></div>
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

