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
@Table(name = "depositos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Depositos.findAll", query = "SELECT d FROM Depositos d"),
    @NamedQuery(name = "Depositos.findByNumero", query = "SELECT d FROM Depositos d WHERE d.numero = :numero"),
    @NamedQuery(name = "Depositos.findByDescripcion", query = "SELECT d FROM Depositos d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "Depositos.findByDireccion", query = "SELECT d FROM Depositos d WHERE d.direccion = :direccion"),
    @NamedQuery(name = "Depositos.findByTelefono", query = "SELECT d FROM Depositos d WHERE d.telefono = :telefono")})
public class Depositos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numero")
    private Integer numero;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @Column(name = "telefono")
    private String telefono;

    public Depositos() {
    }

    public Depositos(Integer numero) {
        this.numero = numero;
    }

    public Depositos(Integer numero, String descripcion, String direccion, String telefono) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depositos)) {
            return false;
        }
        Depositos other = (Depositos) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Depositos[ numero=" + numero + " ]";
    }
    
}
