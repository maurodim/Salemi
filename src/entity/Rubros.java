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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "rubros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rubros.findAll", query = "SELECT r FROM Rubros r"),
    @NamedQuery(name = "Rubros.findById", query = "SELECT r FROM Rubros r WHERE r.id = :id"),
    @NamedQuery(name = "Rubros.findByDescripcion", query = "SELECT r FROM Rubros r WHERE r.descripcion = :descripcion")})
public class Rubros implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Subrubros subrubros;

    public Rubros() {
    }

    public Rubros(Integer id) {
        this.id = id;
    }

    public Rubros(Integer id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
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

    public Subrubros getSubrubros() {
        return subrubros;
    }

    public void setSubrubros(Subrubros subrubros) {
        this.subrubros = subrubros;
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
        if (!(object instanceof Rubros)) {
            return false;
        }
        Rubros other = (Rubros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Rubros[ id=" + id + " ]";
    }
    
}
