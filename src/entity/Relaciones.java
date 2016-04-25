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
@Table(name = "relaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Relaciones.findAll", query = "SELECT r FROM Relaciones r"),
    @NamedQuery(name = "Relaciones.findById", query = "SELECT r FROM Relaciones r WHERE r.id = :id"),
    @NamedQuery(name = "Relaciones.findByIdcotizacion", query = "SELECT r FROM Relaciones r WHERE r.idcotizacion = :idcotizacion"),
    @NamedQuery(name = "Relaciones.findByIdpedido", query = "SELECT r FROM Relaciones r WHERE r.idpedido = :idpedido"),
    @NamedQuery(name = "Relaciones.findByIdfactura", query = "SELECT r FROM Relaciones r WHERE r.idfactura = :idfactura"),
    @NamedQuery(name = "Relaciones.findByIdremito", query = "SELECT r FROM Relaciones r WHERE r.idremito = :idremito"),
    @NamedQuery(name = "Relaciones.findByIdrecibo", query = "SELECT r FROM Relaciones r WHERE r.idrecibo = :idrecibo"),
    @NamedQuery(name = "Relaciones.findByIdcliente", query = "SELECT r FROM Relaciones r WHERE r.idcliente = :idcliente"),
    @NamedQuery(name = "Relaciones.findByFecha", query = "SELECT r FROM Relaciones r WHERE r.fecha = :fecha")})
public class Relaciones implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "idcotizacion")
    private int idcotizacion;
    @Basic(optional = false)
    @Column(name = "idpedido")
    private int idpedido;
    @Basic(optional = false)
    @Column(name = "idfactura")
    private int idfactura;
    @Basic(optional = false)
    @Column(name = "idremito")
    private int idremito;
    @Basic(optional = false)
    @Column(name = "idrecibo")
    private int idrecibo;
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idcliente;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Relaciones() {
    }

    public Relaciones(Integer id) {
        this.id = id;
    }

    public Relaciones(Integer id, int idcotizacion, int idpedido, int idfactura, int idremito, int idrecibo, int idcliente, Date fecha) {
        this.id = id;
        this.idcotizacion = idcotizacion;
        this.idpedido = idpedido;
        this.idfactura = idfactura;
        this.idremito = idremito;
        this.idrecibo = idrecibo;
        this.idcliente = idcliente;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(int idcotizacion) {
        this.idcotizacion = idcotizacion;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getIdremito() {
        return idremito;
    }

    public void setIdremito(int idremito) {
        this.idremito = idremito;
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
        if (!(object instanceof Relaciones)) {
            return false;
        }
        Relaciones other = (Relaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Relaciones[ id=" + id + " ]";
    }
    
}
