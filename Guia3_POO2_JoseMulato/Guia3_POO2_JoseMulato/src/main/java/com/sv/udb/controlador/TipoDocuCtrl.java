/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.controlador;

import com.sv.udb.modelo.TipoDocu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/** Clase TipoDocuCtrl
 *
 * @author joseph
 * @version 28/08/2016
 */

public class TipoDocuCtrl {
    
    /** Metodo que sirve para guardar los datos introduccidos que seran enviados a la base de datos
     * 
     * @param obje objeto para TipoDocu
     * @return boolean si guarda los datos
     * @exception si no guarda los datos activa la exception
     * @since 1.0
     */
    
    public boolean guar(TipoDocu obje)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try
        {
            em.persist(obje);
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    }
    
    /** Metodo para consultar todos los datos de la base para TipoDocu
    * 
    * @return devuelve la lista TipoDocu
    * @exception los datos no se pudieron consultar
    * @since 1.0
    */
     public List<TipoDocu>  ConsTodo()
    {
        List<TipoDocu> resp = new ArrayList<>();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        try
        {
          TypedQuery<TipoDocu> query =em.createNamedQuery("TipoDocu.findAll", TipoDocu.class);
           resp = query.getResultList();
        }
        catch(Exception ex)
        {
            
        }
        em.close();
        emf.close();
        return resp;  
    }
     
     /** Metodo para seleccionar un registro que se encuentra en la base
     * 
     * @param empId parametro de identificacion
     * @return devuelve la informacion del TipoDocu seleccionada
     * @exception error al consultar el dato seleccionado
     */

     public TipoDocu get(Long empId)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        TipoDocu resp = null;
        
        try{
            resp = em.find(TipoDocu.class, empId);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        em.close();
        emf.close();
        return resp;
    }
    
     /** Metodo para modificar un registro TipoDocu de la base de datos
      * 
      * @param obje objeto para TipoDocu
      * @return boolean si modifica los datos
      * @exception  si no modifica los datos
      * @since 1.0
      */
    public boolean modi(TipoDocu obje)
    {
        boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try
        {
            em.merge(obje);
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    } 
    
     /** Metodo para eliminar un registro TipoDocu de la base de datos
     * 
     * @param obje objeto para TipoDocu
     * @return boolean si elimina los datos
     * @exception si no elimina los datos
     * @since 1.0
     */

    public boolean elimin(TipoDocu obje)
    {
         boolean resp = false;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("POOPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try
        {
            em.merge(obje);
            tx.commit();
            resp = true;
        }
        catch(Exception ex)
        {
            tx.rollback();
        }
        em.close();
        emf.close();
        return resp;
    }
}
