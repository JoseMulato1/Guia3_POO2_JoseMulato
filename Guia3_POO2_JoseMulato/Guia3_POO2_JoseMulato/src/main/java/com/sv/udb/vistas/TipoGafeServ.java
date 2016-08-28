/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vistas;

import com.sv.udb.controlador.TipoGafeCtrl;
import com.sv.udb.modelo.TipoGafe;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servelet para TipoGafeServ
 *
 * @author joseph
 * @version 28/08/2016
 */
@WebServlet(name = "TipoGafeServ", urlPatterns = {"/TipoGafeServ"})
public class TipoGafeServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean esValido = request.getMethod().equals("POST");
        if(esValido)
        {
            String mens = "";
            String CRUD = request.getParameter("TipoGafeBton");
            if(CRUD.equals("Guardar"))
            {
                TipoGafe obje = new TipoGafe();
                obje.setNombTipoGafe(request.getParameter("nombGafe"));
                obje.setFechAlta(new Date());
                obje.setEsta(1);
                mens = new TipoGafeCtrl().guar(obje) ? "Datos guardados exitosamente" : "Datos NO guardados";
                request.getRequestDispatcher("/tipo_gafete.jsp").forward(request, response);
            }
            else if(CRUD.equals("Consultar"))
            {
                Long CodiTipoGafe = Long.parseLong(request.getParameter("codiPersRadio") == null ? 
                        "0" : request.getParameter("codiPersRadio"));
                TipoGafe objeLuga = new TipoGafeCtrl().get(CodiTipoGafe);
                if(objeLuga != null)
                {
                    request.setAttribute("CodiGafe", objeLuga.getCodiTipoGafe());
                    request.setAttribute("nombGafe", objeLuga.getNombTipoGafe());
                }
            }
            else if(CRUD.equals("Modificar"))
            {
                TipoGafe obje = new TipoGafe();
                obje.setNombTipoGafe(request.getParameter("nombGafe"));
                obje.setEsta(1);
                obje.setCodiTipoGafe(Long.parseLong(request.getParameter("CodiGafe")));
                mens = new TipoGafeCtrl().modi(obje) ? "Datos modificados" : "Datos no modificados";
            }
            else if(CRUD.equals("Eliminar"))
            {
                TipoGafe obje = new TipoGafe();
                obje.setNombTipoGafe(request.getParameter("nombGafe"));
                obje.setEsta(0);
                obje.setCodiTipoGafe(Long.parseLong(request.getParameter("CodiGafe")));
                mens = new TipoGafeCtrl().elimin(obje) ? "Datos Eliminados" : "Datos no eliminados"; 
            }
            request.setAttribute("mensAler", mens);
            request.getRequestDispatcher("/tipo_gafete.jsp").forward(request, response);
        }
        else
        {
            response.sendRedirect(request.getContextPath() + "/tipo_gafete.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
