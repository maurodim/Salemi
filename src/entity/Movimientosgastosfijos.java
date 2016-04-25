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
@Table(name = "movimientosgastosfijos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientosgastosfijos.findAll", query = "SELECT m FROM Movimientosgastosfijos m"),
    @NamedQuery(name = "Movimientosgastosfijos.findById", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.id = :id"),
    @NamedQuery(name = "Movimientosgastosfijos.findByIdProveedor", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.idProveedor = :idProveedor"),
    @NamedQuery(name = "Movimientosgastosfijos.findByMonto", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.monto = :monto"),
    @NamedQuery(name = "Movimientosgastosfijos.findByFechaVencimiento", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.fechaVencimiento = :fechaVencimiento"),
    @NamedQuery(name = "Movimientosgastosfijos.findByNumeroFactura", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.numeroFactura = :numeroFactura"),
    @NamedQuery(name = "Movimientosgastosfijos.findByPagado", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.pagado = :pagado"),
    @NamedQuery(name = "Movimientosgastosfijos.findByFecha", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.fecha = :fecha"),
    @NamedQuery(name = "Movimientosgastosfijos.findByIdCaja", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.idCaja = :idCaja"),
    @NamedQuery(name = "Movimientosgastosfijos.findByFechaPago", query = "SELECT m FROM Movimientosgastosfijos m WHERE m.fechaPago = :fechaPago")})
public class Movimientosgastosfijos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "idProveedor")
    private int idProveedor;
    @Basic(optional = false)
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "fechaVencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Column(name = "numeroFactura")
    private String numeroFactura;
    @Basic(optional = false)
    @Column(name = "pagado")
    private boolean pagado;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "idCaja")
    private int idCaja;
    @Column(name = "fechaPago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;

    public Movimientosgastosfijos() {
    }

    public Movimientosgastosfijos(Integer id) {
        this.id = id;
    }

    public Movimientosgastosfijos(Integer id, int idProveedor, double monto, Date fechaVencimiento, boolean pagado, Date fecha, int idCaja) {
        this.id = id;
        this.idProveedor = idProveedor;
        this.monto = monto;
        this.fechaVencimiento = fechaVencimiento;
        this.pagado = pagado;
        this.fecha = fecha;
        this.idCaja = idCaja;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public boolean getPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
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
        if (!(object instanceof Movimientosgastosfijos)) {
            return false;
        }
        Movimientosgastosfijos other = (Movimientosgastosfijos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movimientosgastosfijos[ id=" + id + " ]";
    }
    
}
