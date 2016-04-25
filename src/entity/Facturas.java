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
@Table(name = "facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f"),
    @NamedQuery(name = "Facturas.findById", query = "SELECT f FROM Facturas f WHERE f.id = :id"),
    @NamedQuery(name = "Facturas.findByIdcliente", query = "SELECT f FROM Facturas f WHERE f.idcliente = :idcliente"),
    @NamedQuery(name = "Facturas.findByFecha", query = "SELECT f FROM Facturas f WHERE f.fecha = :fecha"),
    @NamedQuery(name = "Facturas.findByTotal", query = "SELECT f FROM Facturas f WHERE f.total = :total"),
    @NamedQuery(name = "Facturas.findByTipo", query = "SELECT f FROM Facturas f WHERE f.tipo = :tipo"),
    @NamedQuery(name = "Facturas.findByIdusuario", query = "SELECT f FROM Facturas f WHERE f.idusuario = :idusuario"),
    @NamedQuery(name = "Facturas.findByIdpedido", query = "SELECT f FROM Facturas f WHERE f.idpedido = :idpedido"),
    @NamedQuery(name = "Facturas.findByIdremito", query = "SELECT f FROM Facturas f WHERE f.idremito = :idremito"),
    @NamedQuery(name = "Facturas.findByArchivo", query = "SELECT f FROM Facturas f WHERE f.archivo = :archivo"),
    @NamedQuery(name = "Facturas.findByNumerofactura", query = "SELECT f FROM Facturas f WHERE f.numerofactura = :numerofactura"),
    @NamedQuery(name = "Facturas.findByEstado", query = "SELECT f FROM Facturas f WHERE f.estado = :estado"),
    @NamedQuery(name = "Facturas.findBySaldo", query = "SELECT f FROM Facturas f WHERE f.saldo = :saldo")})
public class Facturas implements Serializable {
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
    @Column(name = "tipo")
    private int tipo;
    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "idpedido")
    private int idpedido;
    @Basic(optional = false)
    @Column(name = "idremito")
    private int idremito;
    @Column(name = "archivo")
    private String archivo;
    @Basic(optional = false)
    @Column(name = "numerofactura")
    private int numerofactura;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "saldo")
    private double saldo;

    public Facturas() {
    }

    public Facturas(Integer id) {
        this.id = id;
    }

    public Facturas(Integer id, int idcliente, Date fecha, double total, int tipo, int idusuario, int idpedido, int idremito, int numerofactura, int estado, double saldo) {
        this.id = id;
        this.idcliente = idcliente;
        this.fecha = fecha;
        this.total = total;
        this.tipo = tipo;
        this.idusuario = idusuario;
        this.idpedido = idpedido;
        this.idremito = idremito;
        this.numerofactura = numerofactura;
        this.estado = estado;
        this.saldo = saldo;
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
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

    public int getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(int numerofactura) {
        this.numerofactura = numerofactura;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
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
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Facturas[ id=" + id + " ]";
    }
    
}
