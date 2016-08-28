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

/** Modelo para TipoGafe
 *
 * @author joseph
 * @version 28/08/2016
 */
@Entity
@Table(name = "tipo_gafe", catalog = "control3", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoGafe.findAll", query = "SELECT t FROM TipoGafe t WHERE t.esta = 1"),
    @NamedQuery(name = "TipoGafe.findByCodiTipoGafe", query = "SELECT t FROM TipoGafe t WHERE t.codiTipoGafe = :codiTipoGafe"),
    @NamedQuery(name = "TipoGafe.findByNombTipoGafe", query = "SELECT t FROM TipoGafe t WHERE t.nombTipoGafe = :nombTipoGafe"),
    @NamedQuery(name = "TipoGafe.findByFechAlta", query = "SELECT t FROM TipoGafe t WHERE t.fechAlta = :fechAlta"),
    @NamedQuery(name = "TipoGafe.findByFechBaja", query = "SELECT t FROM TipoGafe t WHERE t.fechBaja = :fechBaja"),
    @NamedQuery(name = "TipoGafe.findByEsta", query = "SELECT t FROM TipoGafe t WHERE t.esta = :esta")})
public class TipoGafe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODI_TIPO_GAFE")
    private Long codiTipoGafe;
    @Size(max = 200)
    @Column(name = "NOMB_TIPO_GAFE")
    private String nombTipoGafe;
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
    public TipoGafe() {
    }
    
     /** constructor para codigo
     * 
     * @param codiTipoGafe codigo de codiTipoGafe
     */

    public TipoGafe(Long codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
    }

     /** constructor para obtener valor
     * 
     * @return un entero para CodiTipoGafe
     */

    public Long getCodiTipoGafe() {
        return codiTipoGafe;
    }
    
     /** constructor que devuelve el valor
     * 
     * @param codiTipoGafe devuelve un entero para codiTipoGafe 
     */

    public void setCodiTipoGafe(Long codiTipoGafe) {
        this.codiTipoGafe = codiTipoGafe;
    }
    
     /** constructor que obtiene el valor
     * 
     * @return un dato tipo String para NombTipoGafe
     */

    public String getNombTipoGafe() {
        return nombTipoGafe;
    }
    
     /** constructor que devuelve el valor
     * 
     * @param nombTipoGafe devuelve una cadena de texto para nombTipoGafe 
     */

    public void setNombTipoGafe(String nombTipoGafe) {
        this.nombTipoGafe = nombTipoGafe;
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
        hash += (codiTipoGafe != null ? codiTipoGafe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoGafe)) {
            return false;
        }
        TipoGafe other = (TipoGafe) object;
        if ((this.codiTipoGafe == null && other.codiTipoGafe != null) || (this.codiTipoGafe != null && !this.codiTipoGafe.equals(other.codiTipoGafe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sv.udb.modelo.TipoGafe[ codiTipoGafe=" + codiTipoGafe + " ]";
    }
    
}
