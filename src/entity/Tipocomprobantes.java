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
@Table(name = "tipocomprobantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocomprobantes.findAll", query = "SELECT t FROM Tipocomprobantes t"),
    @NamedQuery(name = "Tipocomprobantes.findById", query = "SELECT t FROM Tipocomprobantes t WHERE t.id = :id"),
    @NamedQuery(name = "Tipocomprobantes.findByDescripcion", query = "SELECT t FROM Tipocomprobantes t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tipocomprobantes.findByNumeroActivo", query = "SELECT t FROM Tipocomprobantes t WHERE t.numeroActivo = :numeroActivo"),
    @NamedQuery(name = "Tipocomprobantes.findByNumeroSucursal", query = "SELECT t FROM Tipocomprobantes t WHERE t.numeroSucursal = :numeroSucursal")})
public class Tipocomprobantes implements Serializable {
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
    @Column(name = "numeroActivo")
    private int numeroActivo;
    @Basic(optional = false)
    @Column(name = "numeroSucursal")
    private int numeroSucursal;

    public Tipocomprobantes() {
    }

    public Tipocomprobantes(Integer id) {
        this.id = id;
    }

    public Tipocomprobantes(Integer id, String descripcion, int numeroActivo, int numeroSucursal) {
        this.id = id;
        this.descripcion = descripcion;
        this.numeroActivo = numeroActivo;
        this.numeroSucursal = numeroSucursal;
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

    public int getNumeroActivo() {
        return numeroActivo;
    }

    public void setNumeroActivo(int numeroActivo) {
        this.numeroActivo = numeroActivo;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
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
        if (!(object instanceof Tipocomprobantes)) {
            return false;
        }
        Tipocomprobantes other = (Tipocomprobantes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tipocomprobantes[ id=" + id + " ]";
    }
    
}
