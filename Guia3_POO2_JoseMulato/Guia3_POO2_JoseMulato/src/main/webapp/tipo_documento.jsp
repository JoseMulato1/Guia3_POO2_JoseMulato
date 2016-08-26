<%-- 
    Document   : tipo_documento
    Created on : 08-24-2016, 04:41:52 PM
    Author     : joseph
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="com.sv.udb.controlador.TipoDocuCtrl"%>
<%@page import="com.sv.udb.modelo.TipoDocu"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://displaytag.sf.net/el" prefix="display" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>JSP</title>
    <!-- Core CSS - Include with every page -->
    <link href="plugins/bootstrap/bootstrap.css" rel="stylesheet" />
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
    <link href="plugins/pace/pace-theme-big-counter.css" rel="stylesheet" />
    <link href="css/style.css" rel="stylesheet" />
    <link href="css/main-style.css" rel="stylesheet" />
    <!-- Page-Level CSS -->
    <link href="plugins/morris/morris-0.4.3.min.css" rel="stylesheet" />
    </head>
    <body>
       <div id="wrapper">
        <!-- navbar top -->
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation" id="navbar">
            <center><h1>TIPO DOCUMENTO</h1></center>
            <!-- end navbar-top-links -->

        </nav>
        <!-- end navbar top -->

        <!-- navbar side -->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <!-- sidebar-collapse -->
            <div class="sidebar-collapse">
                <!-- side-menu -->
                <ul class="nav" id="side-menu">
                    <li>
                        <a href="lugar_acceso.jsp"><i class="fa fa-dashboard fa-fw"></i>Lugar Acceso</a>
                    </li>
                    <li>
                        <a href="tipo_documento.jsp"><i class="fa fa-table fa-fw"></i>Tipo Documento</a>
                    </li>
                    <li>
                        <a href="tipo_gafete.jsp"><i class="fa fa-edit fa-fw"></i>Tipo Gafete</a>
                    </li>
                        </ul>
                        <!-- second-level-items -->
                    </li>
                    </ul>
                <!-- end side-menu -->
            </div>
            <!-- end sidebar-collapse -->
        </nav>
    
	        <div id="page-wrapper">

            
            <br>
            <div class="row">
                <div class="col-lg-12">
                    <!-- Form Elements -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            TipoDocumento
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
         <h1>Tipo Documento</h1>
        <h1>${mensAler}</h1>
        <form action="TipoDocuServ" method="Post">    
              
            <div class="form-group">
                    <input type="hidden" name="CodiDocu" value="${CodiDocu}"/>
                    <label for="nomb">Nombre: </label>
                    <input type="text" class="form-control" name="nombDocu" value="${nombDocu}"/>
                </div>
                <div class="btn-group">
                    <input class="btn btn-primary" type="submit" name="TipoDocuBton" value="Guardar" class="btn btn-default" />
                    <input class="btn btn-primary" type="submit" name="TipoDocuBton" value="Modificar"/>
                    <input class="btn btn-primary" type="submit" name="TipoDocuBton" value="Eliminar" onclick="return confirm('¿Estas seguro que deseas eliminar este registro?');"/>
                </div>
       
            
        </form>
                          </div>
          </div>
            </div>
       <div class="row">
                <div class="col-lg-12">
                  <!--   Kitchen Sink -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Tabla
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                       <form method="POST" name="Frm" action="TipoDocuServ">
                    <% request.setAttribute( "demoAttr", new TipoDocuCtrl().ConsTodo()); %>
                <display:table id="Persona" name="demoAttr" class="table table-striped table-bordered table-hover">
                    <display:column property="nombTipoDocu" title="Nombres" sortable="true"/>
                    <display:column property="esta" title="Estado" sortable="true"/>
                    <display:column title="Seleccionar" sortable="true">
                        <input type="radio" name="codiPersRadio" id="${Persona.codiTipoDocu}" value="${Persona.codiTipoDocu}"/><label for="${Persona.codiTipoDocu}"></label>
                    </display:column>
                </display:table>
                    <br/>
                    <div class="row">
                        <div class="col s12">
                           <div class="col s12" id="buton"><button class="btn btn-primary" type="submit" name="TipoDocuBton" value="Consultar">Consultar</button></div>
                        </div>
                    </div>
                </form>
                  
                            
        </div>
        <script src="plugins/jquery-1.10.2.js"></script>
    <script src="plugins/bootstrap/bootstrap.min.js"></script>
    <script src="plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="plugins/pace/pace.js"></script>
    <script src="scripts/siminta.js"></script>
    <!-- Page-Level Plugin Scripts-->
    <script src="plugins/morris/raphael-2.1.0.min.js"></script>
    <script src="plugins/morris/morris.js"></script>
    <script src="scripts/dashboard-demo.js"></script>
    </body>
</html>
