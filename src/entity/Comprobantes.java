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
@Table(name = "comprobantes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comprobantes.findAll", query = "SELECT c FROM Comprobantes c"),
    @NamedQuery(name = "Comprobantes.findByNumero", query = "SELECT c FROM Comprobantes c WHERE c.numero = :numero"),
    @NamedQuery(name = "Comprobantes.findByDescripcion", query = "SELECT c FROM Comprobantes c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "Comprobantes.findByDestinatarioCondicion", query = "SELECT c FROM Comprobantes c WHERE c.destinatarioCondicion = :destinatarioCondicion"),
    @NamedQuery(name = "Comprobantes.findByDescargaStock", query = "SELECT c FROM Comprobantes c WHERE c.descargaStock = :descargaStock")})
public class Comprobantes implements Serializable {
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
    @Column(name = "destinatarioCondicion")
    private int destinatarioCondicion;
    @Basic(optional = false)
    @Column(name = "descargaStock")
    private int descargaStock;

    public Comprobantes() {
    }

    public Comprobantes(Integer numero) {
        this.numero = numero;
    }

    public Comprobantes(Integer numero, String descripcion, int destinatarioCondicion, int descargaStock) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.destinatarioCondicion = destinatarioCondicion;
        this.descargaStock = descargaStock;
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

    public int getDestinatarioCondicion() {
        return destinatarioCondicion;
    }

    public void setDestinatarioCondicion(int destinatarioCondicion) {
        this.destinatarioCondicion = destinatarioCondicion;
    }

    public int getDescargaStock() {
        return descargaStock;
    }

    public void setDescargaStock(int descargaStock) {
        this.descargaStock = descargaStock;
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
        if (!(object instanceof Comprobantes)) {
            return false;
        }
        Comprobantes other = (Comprobantes) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Comprobantes[ numero=" + numero + " ]";
    }
    
}
