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
@Table(name = "detallerecibos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallerecibos.findAll", query = "SELECT d FROM Detallerecibos d"),
    @NamedQuery(name = "Detallerecibos.findById", query = "SELECT d FROM Detallerecibos d WHERE d.id = :id"),
    @NamedQuery(name = "Detallerecibos.findByIdrecibo", query = "SELECT d FROM Detallerecibos d WHERE d.idrecibo = :idrecibo"),
    @NamedQuery(name = "Detallerecibos.findByIdcliente", query = "SELECT d FROM Detallerecibos d WHERE d.idcliente = :idcliente"),
    @NamedQuery(name = "Detallerecibos.findByIdformadepago", query = "SELECT d FROM Detallerecibos d WHERE d.idformadepago = :idformadepago"),
    @NamedQuery(name = "Detallerecibos.findByMonto", query = "SELECT d FROM Detallerecibos d WHERE d.monto = :monto"),
    @NamedQuery(name = "Detallerecibos.findByFecha", query = "SELECT d FROM Detallerecibos d WHERE d.fecha = :fecha"),
    @NamedQuery(name = "Detallerecibos.findByIdfactura", query = "SELECT d FROM Detallerecibos d WHERE d.idfactura = :idfactura"),
    @NamedQuery(name = "Detallerecibos.findByIdpedido", query = "SELECT d FROM Detallerecibos d WHERE d.idpedido = :idpedido")})
public class Detallerecibos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "idrecibo")
    private int idrecibo;
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idcliente;
    @Basic(optional = false)
    @Column(name = "idformadepago")
    private int idformadepago;
    @Basic(optional = false)
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "idfactura")
    private int idfactura;
    @Basic(optional = false)
    @Column(name = "idpedido")
    private int idpedido;

    public Detallerecibos() {
    }

    public Detallerecibos(Integer id) {
        this.id = id;
    }

    public Detallerecibos(Integer id, int idrecibo, int idcliente, int idformadepago, double monto, Date fecha, int idfactura, int idpedido) {
        this.id = id;
        this.idrecibo = idrecibo;
        this.idcliente = idcliente;
        this.idformadepago = idformadepago;
        this.monto = monto;
        this.fecha = fecha;
        this.idfactura = idfactura;
        this.idpedido = idpedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdrecibo() {
        return idrecibo;
    }

    public void setIdrecibo(int idrecibo) {
        this.idrecibo = idrecibo;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdformadepago() {
        return idformadepago;
    }

    public void setIdformadepago(int idformadepago) {
        this.idformadepago = idformadepago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallerecibos)) {
            return false;
        }
        Detallerecibos other = (Detallerecibos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Detallerecibos[ id=" + id + " ]";
    }
    
}
