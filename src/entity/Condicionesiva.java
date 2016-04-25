/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "condicionesiva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Condicionesiva.findAll", query = "SELECT c FROM Condicionesiva c"),
    @NamedQuery(name = "Condicionesiva.findById", query = "SELECT c FROM Condicionesiva c WHERE c.id = :id"),
    @NamedQuery(name = "Condicionesiva.findByDescripcion", query = "SELECT c FROM Condicionesiva c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Condicionesiva.findByTipocomprobante", query = "SELECT c FROM Condicionesiva c WHERE c.tipocomprobante = :tipocomprobante")})
public class Condicionesiva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "tipocomprobante")
    private int tipocomprobante;

    public Condicionesiva() {
    }

    public Condicionesiva(Integer id) {
        this.id = id;
    }

    public Condicionesiva(Integer id, String descripcion, int tipocomprobante) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipocomprobante = tipocomprobante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(int tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Condicionesiva)) {
            return false;
        }
        Condicionesiva other = (Condicionesiva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Condicionesiva[ id=" + id + " ]";
    }
    
}
