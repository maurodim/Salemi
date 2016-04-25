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
@Table(name = "billetes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Billetes.findAll", query = "SELECT b FROM Billetes b"),
    @NamedQuery(name = "Billetes.findById", query = "SELECT b FROM Billetes b WHERE b.id = :id"),
    @NamedQuery(name = "Billetes.findByDescripcion", query = "SELECT b FROM Billetes b WHERE b.descripcion = :descripcion"),
    @NamedQuery(name = "Billetes.findByValor", query = "SELECT b FROM Billetes b WHERE b.valor = :valor")})
public class Billetes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "valor")
    private double valor;

    public Billetes() {
    }

    public Billetes(Integer id) {
        this.id = id;
    }

    public Billetes(Integer id, String descripcion, double valor) {
        this.id = id;
        this.descripcion = descripcion;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
        if (!(object instanceof Billetes)) {
            return false;
        }
        Billetes other = (Billetes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Billetes[ id=" + id + " ]";
    }
    
}
