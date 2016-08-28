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

/** Modelo para LugaAcce
 *
 * @author joseph
 * @version 28/08/2016
 */

@Entity
@Table(name = "luga_acce", catalog = "control3", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LugaAcce.findAll", query = "SELECT l FROM LugaAcce l WHERE l.esta = 1"),
    @NamedQuery(name = "LugaAcce.findByCodiLugaAcce", query = "SELECT l FROM LugaAcce l WHERE l.codiLugaAcce = :codiLugaAcce"),
    @NamedQuery(name = "LugaAcce.findByNombLugaAcce", query = "SELECT l FROM LugaAcce l WHERE l.nombLugaAcce = :nombLugaAcce"),
    @NamedQuery(name = "LugaAcce.findByFechAlta", query = "SELECT l FROM LugaAcce l WHERE l.fechAlta = :fechAlta"),
    @NamedQuery(name = "LugaAcce.findByFechBaja", query = "SELECT l FROM LugaAcce l WHERE l.fechBaja = :fechBaja"),
    @NamedQuery(name = "LugaAcce.findByEsta", query = "SELECT l FROM LugaAcce l WHERE l.esta = :esta")})
public class LugaAcce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODI_LUGA_ACCE")
    private Long codiLugaAcce;
    @Size(max = 100)
    @Column(name = "NOMB_LUGA_ACCE")
    private String nombLugaAcce;
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
    public LugaAcce() {
    }
    
    /** constructor para codigo
     * 
     * @param codiLugaAcce codigo de LugaAcce 
     */
    public LugaAcce(Long codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }

    /** constructor para obtener valor
     * 
     * @return un entero para CodiLugaAcce
     */
    public Long getCodiLugaAcce() {
        return codiLugaAcce;
    }

    /** constructor que devuelve el valor
     * 
     * @param codiLugaAcce devuelve un entero para codiLugaAcce 
     */
    public void setCodiLugaAcce(Long codiLugaAcce) {
        this.codiLugaAcce = codiLugaAcce;
    }
    
    /** constructor que obtiene el valor
     * 
     * @return un dato tipo String para NombLugaAcce 
     */

    public String getNombLugaAcce() {
        return nombLugaAcce;
    }
    
    /** constructor que devuelve el valor
     * 
     * @param nombLugaAcce devuelve una cadena de texto para nombLugaAcce 
     */
    public void setNombLugaAcce(String nombLugaAcce) {
        this.nombLugaAcce = nombLugaAcce;
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
        hash += (codiLugaAcce != null ? codiLugaAcce.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LugaAcce)) {
            return false;
        }
        LugaAcce other = (LugaAcce) object;
        if ((this.codiLugaAcce == null && other.codiLugaAcce != null) || (this.codiLugaAcce != null && !this.codiLugaAcce.equals(other.codiLugaAcce))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.LugaAcce[ codiLugaAcce=" + codiLugaAcce + " ]";
    }
    
}
