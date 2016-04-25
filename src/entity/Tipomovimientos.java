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
@Table(name = "tipomovimientos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipomovimientos.findAll", query = "SELECT t FROM Tipomovimientos t"),
    @NamedQuery(name = "Tipomovimientos.findById", query = "SELECT t FROM Tipomovimientos t WHERE t.id = :id"),
    @NamedQuery(name = "Tipomovimientos.findByDescripcion", query = "SELECT t FROM Tipomovimientos t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tipomovimientos.findByDestinooperacion", query = "SELECT t FROM Tipomovimientos t WHERE t.destinooperacion = :destinooperacion"),
    @NamedQuery(name = "Tipomovimientos.findByMultiploop", query = "SELECT t FROM Tipomovimientos t WHERE t.multiploop = :multiploop")})
public class Tipomovimientos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "DESTINOOPERACION")
    private int destinooperacion;
    @Basic(optional = false)
    @Column(name = "MULTIPLOOP")
    private int multiploop;

    public Tipomovimientos() {
    }

    public Tipomovimientos(Integer id) {
        this.id = id;
    }

    public Tipomovimientos(Integer id, String descripcion, int destinooperacion, int multiploop) {
        this.id = id;
        this.descripcion = descripcion;
        this.destinooperacion = destinooperacion;
        this.multiploop = multiploop;
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

    public int getDestinooperacion() {
        return destinooperacion;
    }

    public void setDestinooperacion(int destinooperacion) {
        this.destinooperacion = destinooperacion;
    }

    public int getMultiploop() {
        return multiploop;
    }

    public void setMultiploop(int multiploop) {
        this.multiploop = multiploop;
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
        if (!(object instanceof Tipomovimientos)) {
            return false;
        }
        Tipomovimientos other = (Tipomovimientos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tipomovimientos[ id=" + id + " ]";
    }
    
}
