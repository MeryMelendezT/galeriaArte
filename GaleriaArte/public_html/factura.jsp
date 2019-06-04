<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
  <meta charset="utf-8" />
  <link rel="apple-touch-icon" sizes="76x76" href="assets1/img/apple-icon.png">
  <link rel="icon" type="image/png" href="assets1/img/favicon.png">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>Galeria de Arte</title>
  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />
  <!--     Fonts and icons     -->
  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
  <!-- CSS Files -->
  <link href="assets1/css/material-dashboard.css?v=2.1.1" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="assets1/demo/demo.css" rel="stylesheet" />
</head>
<body>
<div class="wrapper ">
    <div class="sidebar" data-color="azure" data-background-color="white" data-image="assets1/img/sidebar-1.jpg">
      <div class="logo">
        <a href="http://www.creative-tim.com" class="simple-text logo-normal">
          Galeria de arte
        </a>
      </div>
      <html:form action="/navbar">
        <div class="sidebar-wrapper">
          <ul class="nav">
            <li class="nav-item">
              <a class="nav-link" href="./dashboard.jsp">
                <i class="material-icons">palette</i>
                <html:submit property="boton" styleClass="btn btn-default btn-link" value="Artista" />
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./categoria.jsp">
                <i class="material-icons">rate_review</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Categor�a" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./comprador.jsp">
                <i class="material-icons">supervisor_account</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Comprador" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./envio.jsp">
                <i class="material-icons">local_airport</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Env�o" /></p>
              </a>
            </li>
          <li class="nav-item  ">
              <a class="nav-link" href="./exposicion.jsp">
                <i class="material-icons">layers</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Exposici�n" /></p>
              </a>
            </li>
            <li class="nav-item active">
              <a class="nav-link" href="./factura.jsp">
                <i class="material-icons">receipt</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Factura" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./obra.jsp">
                <i class="material-icons">photo_size_select_actual</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Obra" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./orden.jsp">
                <i class="material-icons">image_search</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Orden" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./pago.jsp">
                <i class="material-icons">monetization_on</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Pago" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./propietario.jsp">
                <i class="material-icons">person</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Propietario" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./registroExposicion.jsp">
                <i class="material-icons">view_carousel</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Registro Exposici�n" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./registroObra.jsp">
                <i class="material-icons">vertical_split</i>
                <p><html:submit property="boton" styleClass="btn btn-default btn-link" value="Registro Obra" /></p>
              </a>
            </li>
            <li class="nav-item ">
              <a class="nav-link" href="./salon.jsp">
                <i class="material-icons">store</i>
                <p><html:submit property="boton" value="Sal�n" styleClass="btn btn-default btn-link" /></p>
              </a>
            </li>
            </ul>
        </div>
      </div>
    </html:form>
    
    <div class="main-panel">
      <!-- Navbar -->
      <nav class="navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top ">
        <div class="container-fluid">
          <div class="navbar-wrapper">
            <a class="navbar-brand" href="#pablo">Inicio</a>
          </div>
          <button class="navbar-toggler" type="button" data-toggle="collapse" aria-controls="navigation-index" aria-expanded="false" aria-label="Toggle navigation">
            <span class="sr-only">Toggle navigation</span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
            <span class="navbar-toggler-icon icon-bar"></span>
          </button>
          <div class="collapse navbar-collapse justify-content-end">
            <ul class="navbar-nav">

              <li class="nav-item dropdown">
                <a class="nav-link" href="#pablo" id="navbarDropdownProfile" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  <i class="material-icons">person</i>
                  <p class="d-lg-none d-md-block">
                    Account
                  </p>
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdownProfile">
                  <a class="dropdown-item" href="#">Log out</a>
                </div>
              </li>
            </ul>
          </div>
        </div>
      </nav>
      <!-- End Navbar -->
      <div class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-12">
              <div class="row">
            <div class="col-lg-12 col-md-12">
              <div class="card">
                <div class="card-header card-header-tabs card-header-info">
                  <div class="nav-tabs-navigation">
                    <div class="nav-tabs-wrapper">
                      <ul class="nav nav-tabs" data-tabs="tabs">
                        <li class="nav-item">
                          <a class="nav-link active" href="#altas" data-toggle="tab">
                            <i class="material-icons">playlist_add</i> Altas
                            <div class="ripple-container"></div>
                          </a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#bajas" data-toggle="tab">
                            <i class="material-icons">delete_sweep</i> Bajas
                            <div class="ripple-container"></div>
                          </a>
                        </li>
                        <li class="nav-item">
                          <a class="nav-link" href="#modificaciones" data-toggle="tab">
                            <i class="material-icons">loop</i> Modificaciones
                            <div class="ripple-container"></div>
                          </a>
                        </li>
                      </ul>
                    </div>
                  </div>
                </div>
                <div class="card-body">
                  <div class="tab-content">
                    <div class="tab-pane active" id="altas">
                      <table class="table">
                        <tbody>
                          <tr>
                            <div class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-12">
              <div class="card">
                <div class="card-body">
                  <html:form action="/altasFactura">
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Id</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="id" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Orden</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="orden_id" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-12">
                        <div class="form-group">
                          <label class="bmd-label-floating">Numero Factura</label>
                          <!--<input type="email" class="form-control">-->
                          <html:text property="numeroFactura" styleClass="form-control" />
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Autorizaci�n</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="autorizacion" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Fecha</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="fecha" styleClass="form-control" />
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Apellido</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="apellidoFactura" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Cantidad</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="cantidad" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Descripci�n</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="descripcion" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Importe</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="importe" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Codigo Control</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="codigoControl" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Limite Emision</label>
                          <!--<input type="text" class="form-control">-->
                          <html:text property="limiteEmision" styleClass="form-control" />
                        </div>
                      </div>
                      <div class="col-md-6">
                        <html:submit styleClass="btn btn-info pull-right" value="Registrar" />
                      </div>
                    </div>
                    <!--<button type="submit" class="btn btn-info pull-right">Registrar</button>-->
                  </html:form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      </tr>            
    </tbody>
  </table>
</div>
                    <div class="tab-pane" id="bajas">
                        <div class="col-md-12">
                          <div class="card card-plain">
                            <div class="card-body">
                              <div class="table-responsive">
                                <table class="table table-hover">
                                  <thead class="">
                                    <th>ID</th>
                                    <th>Orden</th>
                                    <th>Numero Factura</th>
                                    <th>Autorizacion</th>
                                    <th>Fecha</th>
                                    <th>Apellido</th>
                                    <th>Cantidad</th>
                                    <th>Descripcion</th>
                                    <th>Importe</th>
                                    <th>Codigo de Control</th>
                                    <th>Limite de Emision</th>
                                    <th></th>
                                  </thead>
                                  <tbody>
                                    <logic:iterate id="tabla" indexId="index" name="listados" property="tabla">
                                      <tr>
                                        <td><bean:write name="tabla" property="id" /></td>
                                        <td><bean:write name="tabla" property="orden_id" /></td>
                                        <td><bean:write name="tabla" property="numeroFactura" /></td>
                                        <td><bean:write name="tabla" property="autorizacion" /></td>
                                        <td><bean:write name="tabla" property="fecha" /></td>
                                        <td><bean:write name="tabla" property="apellidoFactura" /></td>
                                        <td><bean:write name="tabla" property="cantidad" /></td>
                                        <td><bean:write name="tabla" property="descripcion" /></td>
                                        <td><bean:write name="tabla" property="importe" /></td>
                                        <td><bean:write name="tabla" property="codigoControl" /></td>
                                        <td><bean:write name="tabla" property="limiteEmision" /></td>
                                        <td class="td-actions text-right">
                                            <button type="button" rel="tooltip" title="Edit Task" class="btn btn-primary btn-link btn-sm">
                                              <i class="material-icons">edit</i>
                                            </button>
                                            <button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-link btn-sm">
                                              <i class="material-icons">close</i>
                                            </button>
                                        </td>
                                      </tr>
                                    </logic:iterate>
                                  </tbody>
                                </table>
                              </div>
                            </div>
                          </div>
                        </div>
                      </div>  

  <div class="tab-pane" id="modificaciones">
    <table class="table">
      <tbody>
        <tr>
           <td>
             </td>
               <div class="content">
        <div class="container-fluid">
          <div class="row">
            <div class="col-md-12">
              <div class="card">
                <div class="card-body">
                  <form>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Nombre</label>
                          <input type="text" class="form-control">
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Apellido</label>
                          <input type="text" class="form-control">
                        </div>
                      </div>
                      <div class="col-md-12">
                        <div class="form-group">
                          <label class="bmd-label-floating">Direccion</label>
                          <input type="email" class="form-control">
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Correo</label>
                          <input type="text" class="form-control">
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Celular</label>
                          <input type="text" class="form-control">
                        </div>
                      </div>
                    </div>
                    <div class="row">
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">Ciudad</label>
                          <input type="text" class="form-control">
                        </div>
                      </div>
                      <div class="col-md-6">
                        <div class="form-group">
                          <label class="bmd-label-floating">CI</label>
                          <input type="text" class="form-control">
                        </div>
                      </div>
                    </div>
                    <button type="submit" class="btn btn-info pull-right">Registrar</button>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      </tr>            
    </tbody>
                </table>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      </div>
    </div>
    </div>
  </div>
 <!--   Core JS Files   -->
  <script src="assets1/js/core/jquery.min.js"></script>
  <script src="assets1/js/core/popper.min.js"></script>
  <script src="assets1/js/core/bootstrap-material-design.min.js"></script>
  <script src="assets1/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!-- Plugin for the momentJs  -->
  <script src="assets1/js/plugins/moment.min.js"></script>
  <!--  Plugin for Sweet Alert -->
  <script src="assets1/js/plugins/sweetalert2.js"></script>
  <!-- Forms Validations Plugin -->
  <script src="assets1/js/plugins/jquery.validate.min.js"></script>
  <!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->
  <script src="assets1/js/plugins/jquery.bootstrap-wizard.js"></script>
  <!--  Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->
  <script src="assets1/js/plugins/bootstrap-selectpicker.js"></script>
  <!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->
  <script src="assets1/js/plugins/bootstrap-datetimepicker.min.js"></script>
  <!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->
  <script src="assets1/js/plugins/jquery.dataTables.min.js"></script>
  <!--  Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->
  <script src="assets1/js/plugins/bootstrap-tagsinput.js"></script>
  <!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->
  <script src="assets1/js/plugins/jasny-bootstrap.min.js"></script>
  <!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->
  <script src="assets1/js/plugins/fullcalendar.min.js"></script>
  <!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->
  <script src="assets1/js/plugins/jquery-jvectormap.js"></script>
  <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->
  <script src="assets1/js/plugins/nouislider.min.js"></script>
  <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js"></script>
  <!-- Library for adding dinamically elements -->
  <script src="assets1/js/plugins/arrive.min.js"></script>
  <!-- Chartist JS -->
  <script src="assets1/js/plugins/chartist.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="assets1/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="assets1/js/material-dashboard.js?v=2.1.1" type="text/javascript"></script>
  <!-- Material Dashboard DEMO methods, don't include it in your project! -->
  <script src="assets1/demo/demo.js"></script>
</body>
</html>
