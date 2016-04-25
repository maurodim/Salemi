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
@Table(name = "detallefacturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallefacturas.findAll", query = "SELECT d FROM Detallefacturas d"),
    @NamedQuery(name = "Detallefacturas.findById", query = "SELECT d FROM Detallefacturas d WHERE d.id = :id"),
    @NamedQuery(name = "Detallefacturas.findByIdfactura", query = "SELECT d FROM Detallefacturas d WHERE d.idfactura = :idfactura"),
    @NamedQuery(name = "Detallefacturas.findByIdarticulo", query = "SELECT d FROM Detallefacturas d WHERE d.idarticulo = :idarticulo"),
    @NamedQuery(name = "Detallefacturas.findByCantidad", query = "SELECT d FROM Detallefacturas d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detallefacturas.findByDescripcionarticulo", query = "SELECT d FROM Detallefacturas d WHERE d.descripcionarticulo = :descripcionarticulo"),
    @NamedQuery(name = "Detallefacturas.findByPreciounitario", query = "SELECT d FROM Detallefacturas d WHERE d.preciounitario = :preciounitario"),
    @NamedQuery(name = "Detallefacturas.findByDescuento", query = "SELECT d FROM Detallefacturas d WHERE d.descuento = :descuento"),
    @NamedQuery(name = "Detallefacturas.findByCantidadremitida", query = "SELECT d FROM Detallefacturas d WHERE d.cantidadremitida = :cantidadremitida")})
public class Detallefacturas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "idfactura")
    private int idfactura;
    @Basic(optional = false)
    @Column(name = "idarticulo")
    private int idarticulo;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "descripcionarticulo")
    private String descripcionarticulo;
    @Basic(optional = false)
    @Column(name = "preciounitario")
    private double preciounitario;
    @Basic(optional = false)
    @Column(name = "descuento")
    private int descuento;
    @Basic(optional = false)
    @Column(name = "cantidadremitida")
    private double cantidadremitida;

    public Detallefacturas() {
    }

    public Detallefacturas(Integer id) {
        this.id = id;
    }

    public Detallefacturas(Integer id, int idfactura, int idarticulo, int cantidad, double preciounitario, int descuento, double cantidadremitida) {
        this.id = id;
        this.idfactura = idfactura;
        this.idarticulo = idarticulo;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.descuento = descuento;
        this.cantidadremitida = cantidadremitida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcionarticulo() {
        return descripcionarticulo;
    }

    public void setDescripcionarticulo(String descripcionarticulo) {
        this.descripcionarticulo = descripcionarticulo;
    }

    public double getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario) {
        this.preciounitario = preciounitario;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getCantidadremitida() {
        return cantidadremitida;
    }

    public void setCantidadremitida(double cantidadremitida) {
        this.cantidadremitida = cantidadremitida;
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
        if (!(object instanceof Detallefacturas)) {
            return false;
        }
        Detallefacturas other = (Detallefacturas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detallefacturas[ id=" + id + " ]";
    }
    
}
