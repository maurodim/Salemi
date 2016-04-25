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
@Table(name = "movimientoscaja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientoscaja.findAll", query = "SELECT m FROM Movimientoscaja m"),
    @NamedQuery(name = "Movimientoscaja.findByNumero", query = "SELECT m FROM Movimientoscaja m WHERE m.numero = :numero"),
    @NamedQuery(name = "Movimientoscaja.findByNumeroUsuario", query = "SELECT m FROM Movimientoscaja m WHERE m.numeroUsuario = :numeroUsuario"),
    @NamedQuery(name = "Movimientoscaja.findByFecha", query = "SELECT m FROM Movimientoscaja m WHERE m.fecha = :fecha"),
    @NamedQuery(name = "Movimientoscaja.findByNumeroSucursal", query = "SELECT m FROM Movimientoscaja m WHERE m.numeroSucursal = :numeroSucursal"),
    @NamedQuery(name = "Movimientoscaja.findByNumeroComprobante", query = "SELECT m FROM Movimientoscaja m WHERE m.numeroComprobante = :numeroComprobante"),
    @NamedQuery(name = "Movimientoscaja.findByTipoComprobante", query = "SELECT m FROM Movimientoscaja m WHERE m.tipoComprobante = :tipoComprobante"),
    @NamedQuery(name = "Movimientoscaja.findByMonto", query = "SELECT m FROM Movimientoscaja m WHERE m.monto = :monto"),
    @NamedQuery(name = "Movimientoscaja.findByTipoMovimiento", query = "SELECT m FROM Movimientoscaja m WHERE m.tipoMovimiento = :tipoMovimiento"),
    @NamedQuery(name = "Movimientoscaja.findByIdCaja", query = "SELECT m FROM Movimientoscaja m WHERE m.idCaja = :idCaja"),
    @NamedQuery(name = "Movimientoscaja.findByCantidad", query = "SELECT m FROM Movimientoscaja m WHERE m.cantidad = :cantidad"),
    @NamedQuery(name = "Movimientoscaja.findByIdCliente", query = "SELECT m FROM Movimientoscaja m WHERE m.idCliente = :idCliente"),
    @NamedQuery(name = "Movimientoscaja.findByTipoCliente", query = "SELECT m FROM Movimientoscaja m WHERE m.tipoCliente = :tipoCliente"),
    @NamedQuery(name = "Movimientoscaja.findByPagado", query = "SELECT m FROM Movimientoscaja m WHERE m.pagado = :pagado"),
    @NamedQuery(name = "Movimientoscaja.findByObservaciones", query = "SELECT m FROM Movimientoscaja m WHERE m.observaciones = :observaciones")})
public class Movimientoscaja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numero")
    private Integer numero;
    @Basic(optional = false)
    @Column(name = "numeroUsuario")
    private int numeroUsuario;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "numeroSucursal")
    private int numeroSucursal;
    @Basic(optional = false)
    @Column(name = "numeroComprobante")
    private int numeroComprobante;
    @Basic(optional = false)
    @Column(name = "tipoComprobante")
    private int tipoComprobante;
    @Basic(optional = false)
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "tipoMovimiento")
    private int tipoMovimiento;
    @Basic(optional = false)
    @Column(name = "idCaja")
    private int idCaja;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "idCliente")
    private int idCliente;
    @Basic(optional = false)
    @Column(name = "tipoCliente")
    private int tipoCliente;
    @Basic(optional = false)
    @Column(name = "pagado")
    private int pagado;
    @Basic(optional = false)
    @Column(name = "observaciones")
    private String observaciones;

    public Movimientoscaja() {
    }

    public Movimientoscaja(Integer numero) {
        this.numero = numero;
    }

    public Movimientoscaja(Integer numero, int numeroUsuario, Date fecha, int numeroSucursal, int numeroComprobante, int tipoComprobante, double monto, int tipoMovimiento, int idCaja, int cantidad, int idCliente, int tipoCliente, int pagado, String observaciones) {
        this.numero = numero;
        this.numeroUsuario = numeroUsuario;
        this.fecha = fecha;
        this.numeroSucursal = numeroSucursal;
        this.numeroComprobante = numeroComprobante;
        this.tipoComprobante = tipoComprobante;
        this.monto = monto;
        this.tipoMovimiento = tipoMovimiento;
        this.idCaja = idCaja;
        this.cantidad = cantidad;
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.pagado = pagado;
        this.observaciones = observaciones;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(int numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public int getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(int tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(int tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
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
        hash += (numero != null ? numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimientoscaja)) {
            return false;
        }
        Movimientoscaja other = (Movimientoscaja) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movimientoscaja[ numero=" + numero + " ]";
    }
    
}
