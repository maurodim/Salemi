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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "fallas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fallas.findAll", query = "SELECT f FROM Fallas f"),
    @NamedQuery(name = "Fallas.findByEstado", query = "SELECT f FROM Fallas f WHERE f.estado = :estado"),
    @NamedQuery(name = "Fallas.findById", query = "SELECT f FROM Fallas f WHERE f.id = :id")})
public class Fallas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Lob
    @Column(name = "st")
    private String st;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Fallas() {
    }

    public Fallas(Integer id) {
        this.id = id;
    }

    public Fallas(Integer id, String st, int estado) {
        this.id = id;
        this.st = st;
        this.estado = estado;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Fallas)) {
            return false;
        }
        Fallas other = (Fallas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Fallas[ id=" + id + " ]";
    }
    
}
