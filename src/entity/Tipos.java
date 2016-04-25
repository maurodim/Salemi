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
@Table(name = "tipos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipos.findAll", query = "SELECT t FROM Tipos t"),
    @NamedQuery(name = "Tipos.findById", query = "SELECT t FROM Tipos t WHERE t.id = :id"),
    @NamedQuery(name = "Tipos.findByTipo", query = "SELECT t FROM Tipos t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "Tipos.findByEtiqueta", query = "SELECT t FROM Tipos t WHERE t.etiqueta = :etiqueta"),
    @NamedQuery(name = "Tipos.findByEliminado", query = "SELECT t FROM Tipos t WHERE t.eliminado = :eliminado"),
    @NamedQuery(name = "Tipos.findByIdClasificacion", query = "SELECT t FROM Tipos t WHERE t.idClasificacion = :idClasificacion"),
    @NamedQuery(name = "Tipos.findByDescripcion", query = "SELECT t FROM Tipos t WHERE t.descripcion = :descripcion")})
public class Tipos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tipo")
    private String tipo;
    @Basic(optional = false)
    @Column(name = "etiqueta")
    private String etiqueta;
    @Basic(optional = false)
    @Column(name = "eliminado")
    private String eliminado;
    @Basic(optional = false)
    @Column(name = "id_clasificacion")
    private int idClasificacion;
    @Column(name = "descripcion")
    private String descripcion;

    public Tipos() {
    }

    public Tipos(Integer id) {
        this.id = id;
    }

    public Tipos(Integer id, String tipo, String etiqueta, String eliminado, int idClasificacion) {
        this.id = id;
        this.tipo = tipo;
        this.etiqueta = etiqueta;
        this.eliminado = eliminado;
        this.idClasificacion = idClasificacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEliminado() {
        return eliminado;
    }

    public void setEliminado(String eliminado) {
        this.eliminado = eliminado;
    }

    public int getIdClasificacion() {
        return idClasificacion;
    }

    public void setIdClasificacion(int idClasificacion) {
        this.idClasificacion = idClasificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        if (!(object instanceof Tipos)) {
            return false;
        }
        Tipos other = (Tipos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tipos[ id=" + id + " ]";
    }
    
}
