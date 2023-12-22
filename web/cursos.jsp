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

                    <!-- HOME SL 1 -->
                    <section class="container cshadow breadcrumbs t3-sl t3-sl-1">

                        <ul class="breadcrumb ">
                            <li class="active"></li><li><a href="index.jsp" ><i class="fa fa-home" aria-hidden="true"></i> Inicio</a></li><li><span>Cursos</span></li>
                        </ul>
                        <div class="line-title">&nbsp;</div>
                    </section>
                    <!-- //HOME SL 1 -->
                    <section class="container cshadow breadcrumbs">
                        <div class="titulo-noticias-h1 text-center">
                            <div class="container">
                                <div class="row ">
                                    <div class="col-md-12">
                                        <h1>Cursos y Talleres</h1>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="interna-wrapper">
                            <div class="container">
                                <div class="row interna">
                                    <div class="col-md-3">
                                        <div>
                                            <div class="panel panel-primary">
                                                <div class="panel-heading">
                                                    Filtrar por
                                                </div>
                                                <div class="panel-body">
                                                    <div class="row">
                                                        <div class="col-md-10 col-md-offset-1">
                                                            <form class="form-horizontal">
                                                                <div class="form-group">
                                                                    <label for="location1" class="control-label">Por tipo de programa</label>
                                                                    <select class="form-control" name="" id="location1">
                                                                        <option value="">Elegir opciòn</option>
                                                                        <option value="">Curso</option>
                                                                        <option value="">Taller</option>
                                                                        <option value="">Seminario</option>
                                                                    </select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <label for="type1" class="control-label">Àrea Temàtica</label>
                                                                    <select class="form-control" name="" id="type1">
                                                                        <option value="">Elegir opciòn</option>
                                                                        <option value="">Arquitectura</option>
                                                                        <option value="">Artes</option>
                                                                        <option value="">Ciencias</option>
                                                                        <option value="">Ciencias Agronómicas</option>
                                                                        <option value="">Ciencias Físicas y Matemáticas</option>
                                                                        <option value="">Ciencias Forestales y de la Conservación de la Naturaleza</option>
                                                                        <option value="">Ciencias Químicas y Farmacéuticas</option>
                                                                        <option value="">Ciencias Sociales</option>
                                                                        <option value="">Ciencias Veterinarias </option>
                                                                        <option value="">Derecho</option>
                                                                        <option value="">Economía y Negocios</option>
                                                                        <option value="">Filosofía y Humanidades</option>
                                                                        <option value="">Instituto de Asuntos Públicos</option>
                                                                        <option value="">Instituto de Estudios Internacionales</option>
                                                                        <option value="">Instituto de la Comunicación e Imagen</option>
                                                                        <option value="">Instituto de Nutrición y Tecnología de los Alimentos</option>
                                                                        <option value="">Medicina</option>
                                                                        <option value="">Odontología</option>
                                                                    </select>
                                                                </div>
                                                                <div class="form-group">
                                                                    <label for="location1" class="control-label">Por modalidad</label>
                                                                    <select class="form-control" name="" >
                                                                        <option value="">Elegir opciòn</option>
                                                                        <option value="">Presencial</option>
                                                                        <option value="">Semipresencial</option>
                                                                        <option value="">Virtual</option>
                                                                    </select>
                                                                </div>
                                                            </form>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-9">
                                        <div class="row">
                                            <div class="col-md-10 col-md-offset-1">
                                                <div class="input-group">
                                                    <input type="text" class="form-control SearchBar" placeholder="Buscar...">
                                                    <span class="input-group-btn">
                                                        <button class="btn btn-primary SearchButton" type="button">
                                                            <span class=" glyphicon glyphicon-search SearchIcon" ></span>
                                                        </button>
                                                    </span>
                                                </div><!-- /input-group -->
                                            </div> 
                                        </div>
                                        <div class="row-fluid">
                                            <div class="cursos">
                                                <div class="cursos-caja">
                                                    <h2 class="h2-titulo"><a href="paginacurso.jsp">Curso de Especialización en Ingenieria de la Informaciòn, valor en el Gobierno de TI en el mundo de los negocios.</a> </h2>
                                                    <div class="caja-text-curso">
                                                        <div class="caja-info-curso"><strong>Inicio:</strong> Del 15 de Septiembre del 2017 al 30 de enero del 2018</div>
                                                        <div class="caja-info-curso"><strong>Modalidad:</strong> Virtual</div>
                                                        <div class="inscripcion-curso"><a href="#" >Inscribirme <i class="fa fa-pencil-square-o" aria-hidden="true"></i> <div class="link-btn-icon"></div> </a></div>

                                                    </div>
                                                </div>
                                                <div class="cursos-caja">
                                                    <h2 class="h2-titulo"><a href="paginacurso.jsp">Curso de Especialización en Auditoria de Sistemas con el Ingeniero Celi Arelavo-Universidad Pedro Ruiz Gallo,Lambayeque .</a> </h2>
                                                    <div class="caja-text-curso">
                                                        <div class="caja-info-curso"><strong>Inicio:</strong> Del 15 de Septiembre del 2017 al 1 de enero del 2018</div>
                                                        <div class="caja-info-curso"><strong>Modalidad:</strong>Presencial</div>
                                                        <div class="inscripcion-curso"><a href="#" >Inscribirme <i class="fa fa-pencil-square-o" aria-hidden="true"></i> <div class="link-btn-icon"></div> </a></div>

                                                    </div>
                                                </div>
                                            </div> 
                                        </div>


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
