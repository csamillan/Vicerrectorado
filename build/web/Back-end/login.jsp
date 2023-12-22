<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="dist/css/login/login.css">
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="dist/css/fonts/fonts.css">
        <title>Login</title>
    </head>
    <body>
        <div class="container" style="margin-top:100px">
            <div class="row">
                <div class="col-sm-4 col-md-4 col-md-offset-4">
                    <div class="panel panel-primary" style=" box-shadow: 2px 2px 5px 5px #e5e0e0; ">
                        <div class="panel-heading">
                            <strong> INGRESO AL SISTEMA</strong>
                        </div>
                        <div class="panel-body">
                            <form role="form" action="#" method="POST">
                                <fieldset>
                                    <div class="row">
                                        <div class="center-block">
                                            <img class="profile-img"
                                                 src="dist/img/vice.jpg" alt="">
                                        </div>
                                    </div>
                                    <div class="row">
                                        <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                                            <div class="form-group">
                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-user"></i>
                                                    </span> 
                                                    <input class="form-control" placeholder="Usuario" name="loginname" type="text" autofocus>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="input-group">
                                                    <span class="input-group-addon">
                                                        <i class="glyphicon glyphicon-lock"></i>
                                                    </span>
                                                    <input class="form-control" placeholder="Contraseña" name="password" type="password" value="">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <button type="button" class="btn btn-lg btn-success btn-block" aria-label="center Align">
                                                    <span class="glyphicon glyphicon-log-in" aria-hidden="true"></span>Ingresar
                                                </button>
                                            </div>
                                        </div>
                                    </div>
                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>