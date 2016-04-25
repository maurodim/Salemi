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
@Table(name = "cheques")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cheques.findAll", query = "SELECT c FROM Cheques c"),
    @NamedQuery(name = "Cheques.findById", query = "SELECT c FROM Cheques c WHERE c.id = :id"),
    @NamedQuery(name = "Cheques.findByBanco", query = "SELECT c FROM Cheques c WHERE c.banco = :banco"),
    @NamedQuery(name = "Cheques.findByFecha", query = "SELECT c FROM Cheques c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Cheques.findByIdcliente", query = "SELECT c FROM Cheques c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Cheques.findByMonto", query = "SELECT c FROM Cheques c WHERE c.monto = :monto"),
    @NamedQuery(name = "Cheques.findByEmision", query = "SELECT c FROM Cheques c WHERE c.emision = :emision"),
    @NamedQuery(name = "Cheques.findByVencimiento", query = "SELECT c FROM Cheques c WHERE c.vencimiento = :vencimiento"),
    @NamedQuery(name = "Cheques.findByNumero", query = "SELECT c FROM Cheques c WHERE c.numero = :numero"),
    @NamedQuery(name = "Cheques.findByEstado", query = "SELECT c FROM Cheques c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cheques.findByIdrecibo", query = "SELECT c FROM Cheques c WHERE c.idrecibo = :idrecibo"),
    @NamedQuery(name = "Cheques.findByIdProveedor", query = "SELECT c FROM Cheques c WHERE c.idProveedor = :idProveedor"),
    @NamedQuery(name = "Cheques.findByIdReciboProveedor", query = "SELECT c FROM Cheques c WHERE c.idReciboProveedor = :idReciboProveedor")})
public class Cheques implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "banco")
    private String banco;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idcliente;
    @Basic(optional = false)
    @Column(name = "monto")
    private double monto;
    @Column(name = "emision")
    @Temporal(TemporalType.DATE)
    private Date emision;
    @Basic(optional = false)
    @Column(name = "vencimiento")
    @Temporal(TemporalType.DATE)
    private Date vencimiento;
    @Basic(optional = false)
    @Column(name = "numero")
    private String numero;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "idrecibo")
    private int idrecibo;
    @Basic(optional = false)
    @Column(name = "idProveedor")
    private int idProveedor;
    @Basic(optional = false)
    @Column(name = "idReciboProveedor")
    private int idReciboProveedor;

    public Cheques() {
    }

    public Cheques(Integer id) {
        this.id = id;
    }

    public Cheques(Integer id, String banco, Date fecha, int idcliente, double monto, Date vencimiento, String numero, int estado, int idrecibo, int idProveedor, int idReciboProveedor) {
        this.id = id;
        this.banco = banco;
        this.fecha = fecha;
        this.idcliente = idcliente;
        this.monto = monto;
        this.vencimiento = vencimiento;
        this.numero = numero;
        this.estado = estado;
        this.idrecibo = idrecibo;
        this.idProveedor = idProveedor;
        this.idReciboProveedor = idReciboProveedor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getEmision() {
        return emision;
    }

    public void setEmision(Date emision) {
        this.emision = emision;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdrecibo() {
        return idrecibo;
    }

    public void setIdrecibo(int idrecibo) {
        this.idrecibo = idrecibo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdReciboProveedor() {
        return idReciboProveedor;
    }

    public void setIdReciboProveedor(int idReciboProveedor) {
        this.idReciboProveedor = idReciboProveedor;
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
        if (!(object instanceof Cheques)) {
            return false;
        }
        Cheques other = (Cheques) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cheques[ id=" + id + " ]";
    }
    
}
