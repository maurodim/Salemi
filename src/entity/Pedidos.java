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
@Table(name = "pedidos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedidos.findAll", query = "SELECT p FROM Pedidos p"),
    @NamedQuery(name = "Pedidos.findById", query = "SELECT p FROM Pedidos p WHERE p.id = :id"),
    @NamedQuery(name = "Pedidos.findByIdcliente", query = "SELECT p FROM Pedidos p WHERE p.idcliente = :idcliente"),
    @NamedQuery(name = "Pedidos.findByFecha", query = "SELECT p FROM Pedidos p WHERE p.fecha = :fecha"),
    @NamedQuery(name = "Pedidos.findByTotal", query = "SELECT p FROM Pedidos p WHERE p.total = :total"),
    @NamedQuery(name = "Pedidos.findByIdusuario", query = "SELECT p FROM Pedidos p WHERE p.idusuario = :idusuario"),
    @NamedQuery(name = "Pedidos.findByIdcotizacion", query = "SELECT p FROM Pedidos p WHERE p.idcotizacion = :idcotizacion"),
    @NamedQuery(name = "Pedidos.findByIdfactura", query = "SELECT p FROM Pedidos p WHERE p.idfactura = :idfactura"),
    @NamedQuery(name = "Pedidos.findByIdremito", query = "SELECT p FROM Pedidos p WHERE p.idremito = :idremito"),
    @NamedQuery(name = "Pedidos.findByArchivo", query = "SELECT p FROM Pedidos p WHERE p.archivo = :archivo"),
    @NamedQuery(name = "Pedidos.findByEstado", query = "SELECT p FROM Pedidos p WHERE p.estado = :estado")})
public class Pedidos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idcliente;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "total")
    private double total;
    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Column(name = "idcotizacion")
    private Integer idcotizacion;
    @Basic(optional = false)
    @Column(name = "idfactura")
    private int idfactura;
    @Basic(optional = false)
    @Column(name = "idremito")
    private int idremito;
    @Column(name = "archivo")
    private String archivo;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;

    public Pedidos() {
    }

    public Pedidos(Integer id) {
        this.id = id;
    }

    public Pedidos(Integer id, int idcliente, Date fecha, double total, int idusuario, int idfactura, int idremito, int estado) {
        this.id = id;
        this.idcliente = idcliente;
        this.fecha = fecha;
        this.total = total;
        this.idusuario = idusuario;
        this.idfactura = idfactura;
        this.idremito = idremito;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdcotizacion() {
        return idcotizacion;
    }

    public void setIdcotizacion(Integer idcotizacion) {
        this.idcotizacion = idcotizacion;
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

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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
        if (!(object instanceof Pedidos)) {
            return false;
        }
        Pedidos other = (Pedidos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Pedidos[ id=" + id + " ]";
    }
    
}
