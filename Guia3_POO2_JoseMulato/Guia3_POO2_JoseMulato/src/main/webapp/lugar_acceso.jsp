<%-- 
    Document   : lugar_acceso
    Created on : 08-24-2016, 04:41:38 PM
    Author     : joseph
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@page import="com.sv.udb.controlador.LugaAcceCtrl"%>
<%@page import="com.sv.udb.modelo.LugaAcce"%>
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
            <center><h1>LUGAR DE ACCESO</h1></center>
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
                            Lugar Acceso
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
         <h1>Acceso</h1>
        <h1>${mensAler}</h1>
        <form action="LugaAcceServ" method="Post">    
              
            <div class="form-group">
                    <input type="hidden" name="CodiLuga" value="${CodiLuga}"/>
                    <label for="nomb">Nombre: </label>
                     <input type="text" class="form-control" name="nombLuga" id="nombLuga" value="${nombLuga}">
                </div>
                    <input type="submit" class="btn btn-primary" name="lugaAcceBton" value="Guardar" class="btn btn-default" />
                    <input class="btn btn-primary" type="submit" name="lugaAcceBton" value="Modificar"/>
                    <input class="btn btn-primary" type="submit" name="lugaAcceBton" value="Eliminar" onclick="return confirm('¿Estas seguro que deseas eliminar este registro?');"/>
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
                            <form method="POST" action="LugaAcceServ">
                    <% request.setAttribute( "demoAttr", new LugaAcceCtrl().ConsTodo()); %>
                <display:table class="table table-striped table-bordered table-hover" id="Persona" name="demoAttr" >
                    <display:column property="nombLugaAcce" title="Nombres" sortable="true"/>
                    <display:column property="esta" title="Estado" sortable="true"/>
                    <display:column title="Seleccionar" sortable="true">
                        <input type="radio" name="codiPersRadio" id="${Persona.codiLugaAcce}" value="${Persona.codiLugaAcce}"/><label for="${Persona.codiLugaAcce}"></label>
                    </display:column>
                </display:table>
                    <br/>
                    <div class="row">
                        <div class="col s12">
                           <div class="col s12" id="buton"><button class="btn btn-primary" type="submit" name="lugaAcceBton" value="Consultar">Consultar</button></div>
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
