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
@Table(name = "movimientosproveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientosproveedores.findAll", query = "SELECT m FROM Movimientosproveedores m"),
    @NamedQuery(name = "Movimientosproveedores.findById", query = "SELECT m FROM Movimientosproveedores m WHERE m.id = :id"),
    @NamedQuery(name = "Movimientosproveedores.findByNumeroProveedor", query = "SELECT m FROM Movimientosproveedores m WHERE m.numeroProveedor = :numeroProveedor"),
    @NamedQuery(name = "Movimientosproveedores.findByFecha", query = "SELECT m FROM Movimientosproveedores m WHERE m.fecha = :fecha"),
    @NamedQuery(name = "Movimientosproveedores.findByMonto", query = "SELECT m FROM Movimientosproveedores m WHERE m.monto = :monto"),
    @NamedQuery(name = "Movimientosproveedores.findByPagado", query = "SELECT m FROM Movimientosproveedores m WHERE m.pagado = :pagado"),
    @NamedQuery(name = "Movimientosproveedores.findByNumeroComprobante", query = "SELECT m FROM Movimientosproveedores m WHERE m.numeroComprobante = :numeroComprobante"),
    @NamedQuery(name = "Movimientosproveedores.findByIdRemito", query = "SELECT m FROM Movimientosproveedores m WHERE m.idRemito = :idRemito"),
    @NamedQuery(name = "Movimientosproveedores.findByIdUsuario", query = "SELECT m FROM Movimientosproveedores m WHERE m.idUsuario = :idUsuario"),
    @NamedQuery(name = "Movimientosproveedores.findByIdCaja", query = "SELECT m FROM Movimientosproveedores m WHERE m.idCaja = :idCaja"),
    @NamedQuery(name = "Movimientosproveedores.findByFechaPago", query = "SELECT m FROM Movimientosproveedores m WHERE m.fechaPago = :fechaPago"),
    @NamedQuery(name = "Movimientosproveedores.findByTipoComprobante", query = "SELECT m FROM Movimientosproveedores m WHERE m.tipoComprobante = :tipoComprobante"),
    @NamedQuery(name = "Movimientosproveedores.findByIdSucursal", query = "SELECT m FROM Movimientosproveedores m WHERE m.idSucursal = :idSucursal")})
public class Movimientosproveedores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numeroProveedor")
    private int numeroProveedor;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "pagado")
    private boolean pagado;
    @Basic(optional = false)
    @Column(name = "numeroComprobante")
    private String numeroComprobante;
    @Basic(optional = false)
    @Column(name = "idRemito")
    private int idRemito;
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private int idUsuario;
    @Basic(optional = false)
    @Column(name = "idCaja")
    private int idCaja;
    @Column(name = "fechaPago")
    @Temporal(TemporalType.DATE)
    private Date fechaPago;
    @Basic(optional = false)
    @Column(name = "tipoComprobante")
    private int tipoComprobante;
    @Basic(optional = false)
    @Column(name = "idSucursal")
    private int idSucursal;

    public Movimientosproveedores() {
    }

    public Movimientosproveedores(Integer id) {
        this.id = id;
    }

    public Movimientosproveedores(Integer id, int numeroProveedor, Date fecha, double monto, boolean pagado, String numeroComprobante, int idRemito, int idUsuario, int idCaja, int tipoComprobante, int idSucursal) {
        this.id = id;
        this.numeroProveedor = numeroProveedor;
        this.fecha = fecha;
        this.monto = monto;
        this.pagado = pagado;
        this.numeroComprobante = numeroComprobante;
        this.idRemito = idRemito;
        this.idUsuario = idUsuario;
        this.idCaja = idCaja;
        this.tipoComprobante = tipoComprobante;
        this.idSucursal = idSucursal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNumeroProveedor() {
        return numeroProveedor;
    }

    public void setNumeroProveedor(int numeroProveedor) {
        this.numeroProveedor = numeroProveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean getPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public int getIdRemito() {
        return idRemito;
    }

    public void setIdRemito(int idRemito) {
        this.idRemito = idRemito;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public int getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(int tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
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
        if (!(object instanceof Movimientosproveedores)) {
            return false;
        }
        Movimientosproveedores other = (Movimientosproveedores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movimientosproveedores[ id=" + id + " ]";
    }
    
}
