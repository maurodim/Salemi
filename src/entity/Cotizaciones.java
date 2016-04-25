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
@Table(name = "cotizaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotizaciones.findAll", query = "SELECT c FROM Cotizaciones c"),
    @NamedQuery(name = "Cotizaciones.findById", query = "SELECT c FROM Cotizaciones c WHERE c.id = :id"),
    @NamedQuery(name = "Cotizaciones.findByIdcliente", query = "SELECT c FROM Cotizaciones c WHERE c.idcliente = :idcliente"),
    @NamedQuery(name = "Cotizaciones.findByFecha", query = "SELECT c FROM Cotizaciones c WHERE c.fecha = :fecha"),
    @NamedQuery(name = "Cotizaciones.findByVencimiento", query = "SELECT c FROM Cotizaciones c WHERE c.vencimiento = :vencimiento"),
    @NamedQuery(name = "Cotizaciones.findByTotal", query = "SELECT c FROM Cotizaciones c WHERE c.total = :total"),
    @NamedQuery(name = "Cotizaciones.findByIdusuario", query = "SELECT c FROM Cotizaciones c WHERE c.idusuario = :idusuario"),
    @NamedQuery(name = "Cotizaciones.findByEstado", query = "SELECT c FROM Cotizaciones c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cotizaciones.findByArchivo", query = "SELECT c FROM Cotizaciones c WHERE c.archivo = :archivo"),
    @NamedQuery(name = "Cotizaciones.findByIdpedido", query = "SELECT c FROM Cotizaciones c WHERE c.idpedido = :idpedido")})
public class Cotizaciones implements Serializable {
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
    @Column(name = "vencimiento")
    @Temporal(TemporalType.DATE)
    private Date vencimiento;
    @Basic(optional = false)
    @Column(name = "total")
    private double total;
    @Basic(optional = false)
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Column(name = "archivo")
    private String archivo;
    @Basic(optional = false)
    @Column(name = "idpedido")
    private int idpedido;

    public Cotizaciones() {
    }

    public Cotizaciones(Integer id) {
        this.id = id;
    }

    public Cotizaciones(Integer id, int idcliente, Date fecha, Date vencimiento, double total, int idusuario, int estado, int idpedido) {
        this.id = id;
        this.idcliente = idcliente;
        this.fecha = fecha;
        this.vencimiento = vencimiento;
        this.total = total;
        this.idusuario = idusuario;
        this.estado = estado;
        this.idpedido = idpedido;
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

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
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
        if (!(object instanceof Cotizaciones)) {
            return false;
        }
        Cotizaciones other = (Cotizaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cotizaciones[ id=" + id + " ]";
    }
    
}
