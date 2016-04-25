/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "detalleremitos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalleremitos.findAll", query = "SELECT d FROM Detalleremitos d"),
    @NamedQuery(name = "Detalleremitos.findById", query = "SELECT d FROM Detalleremitos d WHERE d.id = :id"),
    @NamedQuery(name = "Detalleremitos.findByIdremito", query = "SELECT d FROM Detalleremitos d WHERE d.idremito = :idremito"),
    @NamedQuery(name = "Detalleremitos.findByIdarticulo", query = "SELECT d FROM Detalleremitos d WHERE d.idarticulo = :idarticulo"),
    @NamedQuery(name = "Detalleremitos.findByCantidadremitida", query = "SELECT d FROM Detalleremitos d WHERE d.cantidadremitida = :cantidadremitida"),
    @NamedQuery(name = "Detalleremitos.findByDescrpcionarticulo", query = "SELECT d FROM Detalleremitos d WHERE d.descrpcionarticulo = :descrpcionarticulo"),
    @NamedQuery(name = "Detalleremitos.findByCantidadFacturada", query = "SELECT d FROM Detalleremitos d WHERE d.cantidadFacturada = :cantidadFacturada"),
    @NamedQuery(name = "Detalleremitos.findByCantidadPedida", query = "SELECT d FROM Detalleremitos d WHERE d.cantidadPedida = :cantidadPedida"),
    @NamedQuery(name = "Detalleremitos.findByIdfactura", query = "SELECT d FROM Detalleremitos d WHERE d.idfactura = :idfactura"),
    @NamedQuery(name = "Detalleremitos.findByIdpedido", query = "SELECT d FROM Detalleremitos d WHERE d.idpedido = :idpedido"),
    @NamedQuery(name = "Detalleremitos.findByFecha", query = "SELECT d FROM Detalleremitos d WHERE d.fecha = :fecha")})
public class Detalleremitos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "idremito")
    private int idremito;
    @Basic(optional = false)
    @Column(name = "idarticulo")
    private int idarticulo;
    @Basic(optional = false)
    @Column(name = "cantidadremitida")
    private double cantidadremitida;
    @Basic(optional = false)
    @Column(name = "descrpcionarticulo")
    private String descrpcionarticulo;
    @Basic(optional = false)
    @Column(name = "cantidadFacturada")
    private double cantidadFacturada;
    @Basic(optional = false)
    @Column(name = "cantidadPedida")
    private double cantidadPedida;
    @Basic(optional = false)
    @Column(name = "idfactura")
    private int idfactura;
    @Basic(optional = false)
    @Column(name = "idpedido")
    private int idpedido;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Detalleremitos() {
    }

    public Detalleremitos(Integer id) {
        this.id = id;
    }

    public Detalleremitos(Integer id, int idremito, int idarticulo, double cantidadremitida, String descrpcionarticulo, double cantidadFacturada, double cantidadPedida, int idfactura, int idpedido, Date fecha) {
        this.id = id;
        this.idremito = idremito;
        this.idarticulo = idarticulo;
        this.cantidadremitida = cantidadremitida;
        this.descrpcionarticulo = descrpcionarticulo;
        this.cantidadFacturada = cantidadFacturada;
        this.cantidadPedida = cantidadPedida;
        this.idfactura = idfactura;
        this.idpedido = idpedido;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdremito() {
        return idremito;
    }

    public void setIdremito(int idremito) {
        this.idremito = idremito;
    }

    public int getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(int idarticulo) {
        this.idarticulo = idarticulo;
    }

    public double getCantidadremitida() {
        return cantidadremitida;
    }

    public void setCantidadremitida(double cantidadremitida) {
        this.cantidadremitida = cantidadremitida;
    }

    public String getDescrpcionarticulo() {
        return descrpcionarticulo;
    }

    public void setDescrpcionarticulo(String descrpcionarticulo) {
        this.descrpcionarticulo = descrpcionarticulo;
    }

    public double getCantidadFacturada() {
        return cantidadFacturada;
    }

    public void setCantidadFacturada(double cantidadFacturada) {
        this.cantidadFacturada = cantidadFacturada;
    }

    public double getCantidadPedida() {
        return cantidadPedida;
    }

    public void setCantidadPedida(double cantidadPedida) {
        this.cantidadPedida = cantidadPedida;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof Detalleremitos)) {
            return false;
        }
        Detalleremitos other = (Detalleremitos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detalleremitos[ id=" + id + " ]";
    }
    
}
