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
@Table(name = "detallepedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallepedidos.findAll", query = "SELECT d FROM Detallepedidos d"),
    @NamedQuery(name = "Detallepedidos.findById", query = "SELECT d FROM Detallepedidos d WHERE d.id = :id"),
    @NamedQuery(name = "Detallepedidos.findByIdpedido", query = "SELECT d FROM Detallepedidos d WHERE d.idpedido = :idpedido"),
    @NamedQuery(name = "Detallepedidos.findByIdarticulo", query = "SELECT d FROM Detallepedidos d WHERE d.idarticulo = :idarticulo"),
    @NamedQuery(name = "Detallepedidos.findByDescripcionarticulo", query = "SELECT d FROM Detallepedidos d WHERE d.descripcionarticulo = :descripcionarticulo"),
    @NamedQuery(name = "Detallepedidos.findByIdcliente", query = "SELECT d FROM Detallepedidos d WHERE d.idcliente = :idcliente"),
    @NamedQuery(name = "Detallepedidos.findByCantidad", query = "SELECT d FROM Detallepedidos d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "Detallepedidos.findByPreciounitario", query = "SELECT d FROM Detallepedidos d WHERE d.preciounitario = :preciounitario"),
    @NamedQuery(name = "Detallepedidos.findByDescuento", query = "SELECT d FROM Detallepedidos d WHERE d.descuento = :descuento"),
    @NamedQuery(name = "Detallepedidos.findByObservaciones", query = "SELECT d FROM Detallepedidos d WHERE d.observaciones = :observaciones")})
public class Detallepedidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "idpedido")
    private int idpedido;
    @Basic(optional = false)
    @Column(name = "idarticulo")
    private int idarticulo;
    @Basic(optional = false)
    @Column(name = "descripcionarticulo")
    private String descripcionarticulo;
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idcliente;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @Column(name = "preciounitario")
    private double preciounitario;
    @Basic(optional = false)
    @Column(name = "descuento")
    private int descuento;
    @Basic(optional = false)
    @Column(name = "observaciones")
    private String observaciones;

    public Detallepedidos() {
    }

    public Detallepedidos(Integer id) {
        this.id = id;
    }

    public Detallepedidos(Integer id, int idpedido, int idarticulo, String descripcionarticulo, int idcliente, double cantidad, double preciounitario, int descuento, String observaciones) {
        this.id = id;
        this.idpedido = idpedido;
        this.idarticulo = idarticulo;
        this.descripcionarticulo = descripcionarticulo;
        this.idcliente = idcliente;
        this.cantidad = cantidad;
        this.preciounitario = preciounitario;
        this.descuento = descuento;
        this.observaciones = observaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public String getDescripcionarticulo() {
        return descripcionarticulo;
    }

    public void setDescripcionarticulo(String descripcionarticulo) {
        this.descripcionarticulo = descripcionarticulo;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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
        if (!(object instanceof Detallepedidos)) {
            return false;
        }
        Detallepedidos other = (Detallepedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detallepedidos[ id=" + id + " ]";
    }
    
}
