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
@Table(name = "movimientosarticulos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientosarticulos.findAll", query = "SELECT m FROM Movimientosarticulos m"),
    @NamedQuery(name = "Movimientosarticulos.findByTipoMovimiento", query = "SELECT m FROM Movimientosarticulos m WHERE m.tipoMovimiento = :tipoMovimiento"),
    @NamedQuery(name = "Movimientosarticulos.findByIdArticulo", query = "SELECT m FROM Movimientosarticulos m WHERE m.idArticulo = :idArticulo"),
    @NamedQuery(name = "Movimientosarticulos.findByCantidad", query = "SELECT m FROM Movimientosarticulos m WHERE m.cantidad = :cantidad"),
    @NamedQuery(name = "Movimientosarticulos.findByNumeroDeposito", query = "SELECT m FROM Movimientosarticulos m WHERE m.numeroDeposito = :numeroDeposito"),
    @NamedQuery(name = "Movimientosarticulos.findByTipoComprobante", query = "SELECT m FROM Movimientosarticulos m WHERE m.tipoComprobante = :tipoComprobante"),
    @NamedQuery(name = "Movimientosarticulos.findByNumeroComprobante", query = "SELECT m FROM Movimientosarticulos m WHERE m.numeroComprobante = :numeroComprobante"),
    @NamedQuery(name = "Movimientosarticulos.findByNumeroCliente", query = "SELECT m FROM Movimientosarticulos m WHERE m.numeroCliente = :numeroCliente"),
    @NamedQuery(name = "Movimientosarticulos.findByFechaComprobante", query = "SELECT m FROM Movimientosarticulos m WHERE m.fechaComprobante = :fechaComprobante"),
    @NamedQuery(name = "Movimientosarticulos.findByNumeroUsuario", query = "SELECT m FROM Movimientosarticulos m WHERE m.numeroUsuario = :numeroUsuario"),
    @NamedQuery(name = "Movimientosarticulos.findByPrecioDeCosto", query = "SELECT m FROM Movimientosarticulos m WHERE m.precioDeCosto = :precioDeCosto"),
    @NamedQuery(name = "Movimientosarticulos.findByPrecioDeVenta", query = "SELECT m FROM Movimientosarticulos m WHERE m.precioDeVenta = :precioDeVenta"),
    @NamedQuery(name = "Movimientosarticulos.findByPrecioServicio", query = "SELECT m FROM Movimientosarticulos m WHERE m.precioServicio = :precioServicio"),
    @NamedQuery(name = "Movimientosarticulos.findByEstado", query = "SELECT m FROM Movimientosarticulos m WHERE m.estado = :estado"),
    @NamedQuery(name = "Movimientosarticulos.findByFecha", query = "SELECT m FROM Movimientosarticulos m WHERE m.fecha = :fecha"),
    @NamedQuery(name = "Movimientosarticulos.findByIdcaja", query = "SELECT m FROM Movimientosarticulos m WHERE m.idcaja = :idcaja"),
    @NamedQuery(name = "Movimientosarticulos.findById", query = "SELECT m FROM Movimientosarticulos m WHERE m.id = :id")})
public class Movimientosarticulos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "tipoMovimiento")
    private int tipoMovimiento;
    @Basic(optional = false)
    @Column(name = "idArticulo")
    private int idArticulo;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @Column(name = "numeroDeposito")
    private int numeroDeposito;
    @Basic(optional = false)
    @Column(name = "tipoComprobante")
    private int tipoComprobante;
    @Basic(optional = false)
    @Column(name = "numeroComprobante")
    private int numeroComprobante;
    @Basic(optional = false)
    @Column(name = "numeroCliente")
    private int numeroCliente;
    @Basic(optional = false)
    @Column(name = "fechaComprobante")
    private String fechaComprobante;
    @Basic(optional = false)
    @Column(name = "numeroUsuario")
    private int numeroUsuario;
    @Basic(optional = false)
    @Column(name = "precioDeCosto")
    private double precioDeCosto;
    @Basic(optional = false)
    @Column(name = "precioDeVenta")
    private double precioDeVenta;
    @Basic(optional = false)
    @Column(name = "precioServicio")
    private double precioServicio;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "idcaja")
    private int idcaja;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public Movimientosarticulos() {
    }

    public Movimientosarticulos(Integer id) {
        this.id = id;
    }

    public Movimientosarticulos(Integer id, int tipoMovimiento, int idArticulo, double cantidad, int numeroDeposito, int tipoComprobante, int numeroComprobante, int numeroCliente, String fechaComprobante, int numeroUsuario, double precioDeCosto, double precioDeVenta, double precioServicio, int idcaja) {
        this.id = id;
        this.tipoMovimiento = tipoMovimiento;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.numeroDeposito = numeroDeposito;
        this.tipoComprobante = tipoComprobante;
        this.numeroComprobante = numeroComprobante;
        this.numeroCliente = numeroCliente;
        this.fechaComprobante = fechaComprobante;
        this.numeroUsuario = numeroUsuario;
        this.precioDeCosto = precioDeCosto;
        this.precioDeVenta = precioDeVenta;
        this.precioServicio = precioServicio;
        this.idcaja = idcaja;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public int getNumeroDeposito() {
        return numeroDeposito;
    }

    public void setNumeroDeposito(int numeroDeposito) {
        this.numeroDeposito = numeroDeposito;
    }

    public int getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(int tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public int getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(int numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getFechaComprobante() {
        return fechaComprobante;
    }

    public void setFechaComprobante(String fechaComprobante) {
        this.fechaComprobante = fechaComprobante;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public double getPrecioDeCosto() {
        return precioDeCosto;
    }

    public void setPrecioDeCosto(double precioDeCosto) {
        this.precioDeCosto = precioDeCosto;
    }

    public double getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(double precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public double getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(double precioServicio) {
        this.precioServicio = precioServicio;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdcaja() {
        return idcaja;
    }

    public void setIdcaja(int idcaja) {
        this.idcaja = idcaja;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Movimientosarticulos)) {
            return false;
        }
        Movimientosarticulos other = (Movimientosarticulos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movimientosarticulos[ id=" + id + " ]";
    }
    
}
