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
@Table(name = "localidades")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Localidades.findAll", query = "SELECT l FROM Localidades l"),
    @NamedQuery(name = "Localidades.findById", query = "SELECT l FROM Localidades l WHERE l.id = :id"),
    @NamedQuery(name = "Localidades.findByCodigoInterno", query = "SELECT l FROM Localidades l WHERE l.codigoInterno = :codigoInterno"),
    @NamedQuery(name = "Localidades.findByLocalidad", query = "SELECT l FROM Localidades l WHERE l.localidad = :localidad"),
    @NamedQuery(name = "Localidades.findByCodigoPostal", query = "SELECT l FROM Localidades l WHERE l.codigoPostal = :codigoPostal"),
    @NamedQuery(name = "Localidades.findByEliminado", query = "SELECT l FROM Localidades l WHERE l.eliminado = :eliminado"),
    @NamedQuery(name = "Localidades.findByIdProvincia", query = "SELECT l FROM Localidades l WHERE l.idProvincia = :idProvincia")})
public class Localidades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "codigo_interno")
    private int codigoInterno;
    @Basic(optional = false)
    @Column(name = "localidad")
    private String localidad;
    @Column(name = "codigo_postal")
    private String codigoPostal;
    @Column(name = "eliminado")
    private String eliminado;
    @Column(name = "id_provincia")
    private Integer idProvincia;

    public Localidades() {
    }

    public Localidades(Integer id) {
        this.id = id;
    }

    public Localidades(Integer id, int codigoInterno, String localidad) {
        this.id = id;
        this.codigoInterno = codigoInterno;
        this.localidad = localidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getEliminado() {
        return eliminado;
    }

    public void setEliminado(String eliminado) {
        this.eliminado = eliminado;
    }

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
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
        if (!(object instanceof Localidades)) {
            return false;
        }
        Localidades other = (Localidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Localidades[ id=" + id + " ]";
    }
    
}
