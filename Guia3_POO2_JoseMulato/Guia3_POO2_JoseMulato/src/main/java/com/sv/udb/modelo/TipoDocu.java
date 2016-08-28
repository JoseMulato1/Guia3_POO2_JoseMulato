/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/** Modelo para TipoDocu
 *
 * @author joseph 
 * @version 28/08/2016
 */
@Entity
@Table(name = "tipo_docu", catalog = "control3", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoDocu.findAll", query = "SELECT t FROM TipoDocu t WHERE t.esta = 1"),
    @NamedQuery(name = "TipoDocu.findByCodiTipoDocu", query = "SELECT t FROM TipoDocu t WHERE t.codiTipoDocu = :codiTipoDocu"),
    @NamedQuery(name = "TipoDocu.findByNombTipoDocu", query = "SELECT t FROM TipoDocu t WHERE t.nombTipoDocu = :nombTipoDocu"),
    @NamedQuery(name = "TipoDocu.findByFechAlta", query = "SELECT t FROM TipoDocu t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoDocu.findByFechBaja", query = "SELECT t FROM TipoDocu t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoDocu.findByEsta", query = "SELECT t FROM TipoDocu t WHERE t.esta = :esta")})
public class TipoDocu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODI_TIPO_DOCU")
    private Long codiTipoDocu;
    @Size(max = 50)
    @Column(name = "NOMB_TIPO_DOCU")
    private String nombTipoDocu;
    @Column(name = "FECH_ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechAlta;
    @Column(name = "FECH_BAJA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechBaja;
    @Column(name = "ESTA")
    private Integer esta;

    /** constructor vacio
     * 
     */
    public TipoDocu() {
    }
    
    /** constructor para codigo
     * 
     * @param codiTipoDocu codigo de codiTipoDocu 
     */
    public TipoDocu(Long codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }
    
    /** constructor para obtener valor
     * 
     * @return un entero para CodiTipoDocu
     */
    public Long getCodiTipoDocu() {
        return codiTipoDocu;
    }
    
    /** constructor que devuelve el valor
     * 
     * @param codiTipoDocu devuelve un entero para codiTipoDocu 
     */
    public void setCodiTipoDocu(Long codiTipoDocu) {
        this.codiTipoDocu = codiTipoDocu;
    }
    
    /** constructor que obtiene el valor
     * 
     * @return un dato tipo String para NombTipoDocu
     */

    public String getNombTipoDocu() {
        return nombTipoDocu;
    }
    
     /** constructor que devuelve el valor
     * 
     * @param nombTipoDocu devuelve una cadena de texto para nombTipoDocu 
     */
    public void setNombTipoDocu(String nombTipoDocu) {
        this.nombTipoDocu = nombTipoDocu;
    }

     /** constructor que obtiene el valor
     * 
     * @return un dato tipo date para FechAlta 
     */

    public Date getFechAlta() {
        return fechAlta;
    }
    
     /** constructor que devuelve el valor
     * 
     * @param fechAlta devuelve la fecha para fechAlta 
     */
    public void setFechAlta(Date fechAlta) {
        this.fechAlta = fechAlta;
    }

     /** constructor que obtiene el valor
     * 
     * @return un dato tipo date para FechaBaja 
     */

    public Date getFechBaja() {
        return fechBaja;
    }
    
     /** constructor que devuelve el valor
     * 
     * 
     * @param fechBaja  devuelve la fecha para fechBaja
     */

    public void setFechBaja(Date fechBaja) {
        this.fechBaja = fechBaja;
    }
    
     /** constructor que obtiene el valor
     * 
     * @return un dato tipo boolean para Esta 
     */

    public Integer getEsta() {
        return esta;
    }
    
     /** constructor que devuleve el valor
     * 
     * @param esta devuelve el estado para Esta
     */

    public void setEsta(Integer esta) {
        this.esta = esta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiTipoDocu != null ? codiTipoDocu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoDocu)) {
            return false;
        }
        TipoDocu other = (TipoDocu) object;
        if ((this.codiTipoDocu == null && other.codiTipoDocu != null) || (this.codiTipoDocu != null && !this.codiTipoDocu.equals(other.codiTipoDocu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoDocu[ codiTipoDocu=" + codiTipoDocu + " ]";
    }
    
}
