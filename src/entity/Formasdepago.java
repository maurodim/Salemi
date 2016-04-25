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
@Table(name = "formasdepago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Formasdepago.findAll", query = "SELECT f FROM Formasdepago f"),
    @NamedQuery(name = "Formasdepago.findById", query = "SELECT f FROM Formasdepago f WHERE f.id = :id"),
    @NamedQuery(name = "Formasdepago.findByDescripcion", query = "SELECT f FROM Formasdepago f WHERE f.descripcion = :descripcion"),
    @NamedQuery(name = "Formasdepago.findByDestino", query = "SELECT f FROM Formasdepago f WHERE f.destino = :destino")})
public class Formasdepago implements Serializable {
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
    @Column(name = "destino")
    private int destino;

    public Formasdepago() {
    }

    public Formasdepago(Integer id) {
        this.id = id;
    }

    public Formasdepago(Integer id, String descripcion, int destino) {
        this.id = id;
        this.descripcion = descripcion;
        this.destino = destino;
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

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
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
        if (!(object instanceof Formasdepago)) {
            return false;
        }
        Formasdepago other = (Formasdepago) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Formasdepago[ id=" + id + " ]";
    }
    
}
