<%-- 
    Document   : index
    Created on : 03/09/2017, 01:21:21 PM
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
        <jsp:include  page="Header.jsp"></jsp:include>
            <!-- //header -->
            <!-- header-bot -->
            <!-- //header-bot -->
            <!-- navegation-->
        <jsp:include  page="Menu.jsp"></jsp:include>

            <!-- banner -->
            <div class="container">
                <div id="carousel-1" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators" role="listbox">
                        <li data-target="#carousel-1" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-1" data-slide-to="1"></li>
                        <li data-target="#carousel-1" data-slide-to="2"></li>
                        <li data-target="#carousel-1" data-slide-to="3"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="item active">
                            <img src="images/slider1.jpg" class="img-responsive">
                            <div class="container">
                                <div class="carousel-caption">
                                    <h3>Percentage-based sizing</h3></div>
                            </div>
                        </div>
                        <div class="item">
                            <img src="images/slider2.jpg" class="img-responsive">
                            <div class="container">
                                <div class="carousel-caption">
                                    <h3>Percentage-based sizing</h3></div>
                            </div>
                        </div>
                        <div class="item">
                            <img src="images/slider3.jpg" class="img-responsive">
                            <div class="container">
                                <div class="carousel-caption">
                                    <h3>Percentage-based sizing</h3></div>
                            </div>
                        </div>
                        <div class="item">
                            <img src="images/slider4.jpg" class="img-responsive">
                            <div class="container">
                                <div class="carousel-caption">
                                    <h3>Percentage-based sizing</h3></div>
                            </div>
                        </div>
                    </div>
                    <!-- Controls -->
                    <a href="#carousel-1" class="left carousel-control" role="button" data-slide="prev">
                        <span class="icon-prev"></span>
                    </a>
                    <a href="#carousel-1" class="right carousel-control" data-slide="next">
                        <span class="icon-next"></span>
                    </a>  
                </div>
            </div>
            <br>
            <!-- /.carousel -->
            <!-- //banner -->

            <!-- NUEVO-->
            <section>
                <div class="container">
                    <div class="row">
                        <div class="col-md-4">
                            <br>
                            <img src="images/slider1.jpg" alt=" " class="img-responsive" />
                        </div>
                        <div class="col-md-4 agileits_schedule_bottom_right">
                            <div class="w3ls_schedule_bottom_right_grid">
                                <h3>UNPRG en cifras</h3>
                                <p>Nuestra Universidad Nacional Pedro Ruiz Gallo se ha posicionado como una de las mejores universidades del Norte Peruano, y sus cifras lo demuestran.</p>
                                <div class="col-md-4 w3l_schedule_bottom_right_grid1">
                                    <i class="fa fa-user-o" aria-hidden="true"></i>
                                    <h4>Customers</h4>
                                    <h5 class="counter">653</h5>
                                </div>
                                <div class="col-md-4 w3l_schedule_bottom_right_grid1">
                                    <i class="fa fa-calendar-o" aria-hidden="true"></i>
                                    <h4>Events</h4>
                                    <h5 class="counter">823</h5>
                                </div>
                                <div class="col-md-4 w3l_schedule_bottom_right_grid1">
                                    <i class="fa fa-shield" aria-hidden="true"></i>
                                    <h4>Awards</h4>
                                    <h5 class="counter">45</h5>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="linkes linkes-success">
                                <a href="#">Sistema de bibliotecas </a>
                            </div>	
                            <div class="linkes linkes-red">
                                <a href="#">Sistema de bibliotecas </a>
                            </div>	
                            <div class="linkes linkes-blue">
                                <a href="#">Sistema de bibliotecas </a> 
                            </div>	
                            <div class="linkes linkes-red">
                                <a href="#">Sistema de bibliotecas </a> 
                            </div>	
                            <div class="linkes linkes-blue">
                                <a href="#">Sistema de bibliotecas </a>  
                            </div>
                        </div>	  

                    </div>
                </div>
            </section>
            <!--END  NUEVO -->


















            <section>
                <div class="container">
                    <div class="row" >
                        <div class="col-md-8">
                                        <div>
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

                            <!-- //EVENTOS -->
                            <div class="widget-sidebar">
                                <div class="box-title-widget-sidebar"><h2 class="title-widget-sidebar"> EVENTOS</h2></div>
                                <div class="content-widget-sidebar">
                                    <ul>
                                        <li class="recent-post">
                                            <div class="post-img">
                                                <img src="images/slider1.jpg" class="img-responsive">
                                            </div>
                                            <a href="#"><h5>Excepteur sint occaecat cupi non proident laborum.
                                                    Excepteur sint occaecat cupi non proident laborum.
                                                    Excepteur sint occaecat cupi non proident laborum. </h5></a>
                                            <p><small><i class="fa fa-calendar" data-original-title="" title=""></i> 30 Juni 2014</small></p>
                                        </li>


                                        <li class="recent-post">
                                            <div class="post-img">
                                                <img src="https://lh3.googleusercontent.com/-ojLI116-Mxk/WM1ZIwdnuwI/AAAAAAAADeo/4K6VpwIPSfgsmlXJB5o0N8scuI3iW4OpwCJoC/w424-h318-n-rw/thumbnail6.jpg" class="img-responsive">
                                            </div>
                                            <a href="#"><h5>Excepteur sint occaecat cupi non proident laborum.</h5></a>
                                            <p><small><i class="fa fa-calendar" data-original-title="" title=""></i> 30 Juni 2014</small></p>
                                        </li>


                                        <li class="recent-post">
                                            <div class="post-img">
                                                <img src="https://lh3.googleusercontent.com/-TrK1csbtHRs/WM1ZI1SIUNI/AAAAAAAADeo/OkiUjuad6skWl9ugxbiIA_436OwsWKBNgCJoC/w424-h318-n-rw/thumbnail3.jpg" class="img-responsive">
                                            </div>
                                            <a href="#"><h5>Excepteur sint occaecat cupi non proident laborum.</h5></a>
                                            <p><small><i class="fa fa-calendar" data-original-title="" title=""></i> 30 Juni 2014</small></p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- //END EVENTOS -->
                        <div class="clearfix"> </div>


                        </section>
                        <section>
                            <div class="container">
                                <div class="row">
                                    <div class="col-md-8">
                                        <div>
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
                            <!-- //PUBLICACIONES -->
                            <div class="widget-sidebar">
                                <div class="tab-row">
                                    <div class="box-title-widget-sidebar"><h2 class="title-widget-sidebar"> PUBLICACIONES</h2></div>
                                    <div class="befor-widget">
                                        <div class="populat-post-tab">
                                            <!-- Nav tabs -->
                                            <ul class="nav nav-tabs" role="tablist">
                                                <li role="presentation" class="active">
                                                    <a href="#home" aria-controls="home" role="tab"
                                                       data-toggle="tab">Popular</a>
                                                </li>
                                                <li role="presentation">
                                                    <a href="#profile" aria-controls="profile" role="tab"
                                                       data-toggle="tab">Latest</a>
                                                </li>
                                                <li role="presentation">
                                                    <a href="#messages" aria-controls="messages" role="tab"
                                                       data-toggle="tab">Comments</a>
                                                </li>
                                            </ul>

                                            <!-- Tab panes -->
                                            <div class="tab-content">
                                                <div role="tabpanel" class="tab-pane active" id="home">
                                                    <div class="tab-post-list">
                                                        <div class="tab-post-list-wrap clearfix">
                                                            <div class="tab-post-thumb pull-left">
                                                                <figure>
                                                                    <a href="single.html">
                                                                        <img src="http://placehold.it/150x150/018EBB/ffffff/?text=Popular+Post"
                                                                             alt="Post thumb">
                                                                    </a>
                                                                </figure>
                                                            </div>
                                                            <div class="tab-post-title">
                                                                <h6><a href="single.html">Standard Post Type</a>
                                                                </h6>
                                                                <span>May 10, 2014</span>
                                                            </div>
                                                        </div>
                                                        <div class="tab-post-list-wrap clearfix">
                                                            <div class="tab-post-thumb pull-left">
                                                                <figure>
                                                                    <a href="single.html">
                                                                        <img src="http://placehold.it/150x150/018EBB/ffffff/?text=Popular+Post"
                                                                             alt="Post thumb">
                                                                    </a>
                                                                </figure>
                                                            </div>
                                                            <div class="tab-post-title">
                                                                <h6><a href="single.html">Do You Know the ABC</a>
                                                                </h6>
                                                                <span>May 10, 2014</span>
                                                            </div>
                                                        </div>
                                                        <div class="tab-post-list-wrap clearfix">
                                                            <div class="tab-post-thumb pull-left">
                                                                <figure>
                                                                    <a href="single.html">
                                                                        <img src="http://placehold.it/150x150/018EBB/ffffff/?text=Popular+Post"
                                                                             alt="Post thumb">
                                                                    </a>
                                                                </figure>
                                                            </div>
                                                            <div class="tab-post-title">
                                                                <h6><a href="single.html">How to Handle Your Kids
                                                                        Mystery Ailments</a></h6>
                                                                <span>May 10, 2014</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div role="tabpanel" class="tab-pane" id="profile">
                                                    <div class="tab-post-list">
                                                        <div class="tab-post-list-wrap clearfix">
                                                            <div class="tab-post-thumb pull-left">
                                                                <figure>
                                                                    <a href="single.html">
                                                                        <img src="http://placehold.it/150x150/018EBB/ffffff/?text=Popular+Post"
                                                                             alt="Post thumb">
                                                                    </a>
                                                                </figure>
                                                            </div>
                                                            <div class="tab-post-title">
                                                                <h6><a href="single.html">Do You Know the ABC</a>
                                                                </h6>
                                                                <span>May 10, 2014</span>
                                                            </div>
                                                        </div>
                                                        <div class="tab-post-list-wrap clearfix">
                                                            <div class="tab-post-thumb pull-left">
                                                                <figure>
                                                                    <a href="single.html">
                                                                        <img src="http://placehold.it/150x150/018EBB/ffffff/?text=Popular+Post"
                                                                             alt="Post thumb">
                                                                    </a>
                                                                </figure>
                                                            </div>
                                                            <div class="tab-post-title">
                                                                <h6><a href="single.html">Standard Post Type</a>
                                                                </h6>
                                                                <span>May 10, 2014</span>
                                                            </div>
                                                        </div>
                                                        <div class="tab-post-list-wrap clearfix">
                                                            <div class="tab-post-thumb pull-left">
                                                                <figure>
                                                                    <a href="single.html">
                                                                        <img src="http://placehold.it/150x150/018EBB/ffffff/?text=Popular+Post"
                                                                             alt="Post thumb">
                                                                    </a>
                                                                </figure>
                                                            </div>
                                                            <div class="tab-post-title">
                                                                <h6><a href="single.html">How to Handle Your Kids
                                                                        Mystery Ailments</a></h6>
                                                                <span>May 10, 2014</span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div role="tabpanel" class="tab-pane" id="messages">
                                                    <div class="tab-post-list">
                                                        <ul>
                                                            <li class="tab-post-list-wrap">
                                                                <a href="#">raazon</a>
                                                                <span>on</span>
                                                                <a href="#">Standard Post Type</a>
                                                                <small>
                                                                    <abbr title="30-04-2015">12 months ago</abbr>
                                                                </small>
                                                                <p>Donec venenatis feugiat congue. Integer ipsum
                                                                    tellus, accumsan ut purus...</p>
                                                            </li>
                                                            <li class="tab-post-list-wrap">
                                                                <a href="#">wordpress</a>
                                                                <span>on</span>
                                                                <a href="#">Do You Know the ABC of Health Care?</a>
                                                                <small>
                                                                    <abbr title="30-04-2015">12 months ago</abbr>
                                                                </small>
                                                                <p>Donec venenatis feugiat congue. Integer ipsum
                                                                    tellus, accumsan ut purus...</p>
                                                            </li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- //END PUBLICACIONES -->
                            <!-- OTRO -->
                            
                            <!-- END OTRO -->
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
