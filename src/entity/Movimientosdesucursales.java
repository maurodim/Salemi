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
@Table(name = "movimientosdesucursales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientosdesucursales.findAll", query = "SELECT m FROM Movimientosdesucursales m"),
    @NamedQuery(name = "Movimientosdesucursales.findById", query = "SELECT m FROM Movimientosdesucursales m WHERE m.id = :id"),
    @NamedQuery(name = "Movimientosdesucursales.findByDepOrigen", query = "SELECT m FROM Movimientosdesucursales m WHERE m.depOrigen = :depOrigen"),
    @NamedQuery(name = "Movimientosdesucursales.findByDepDestino", query = "SELECT m FROM Movimientosdesucursales m WHERE m.depDestino = :depDestino"),
    @NamedQuery(name = "Movimientosdesucursales.findByIdArticulo", query = "SELECT m FROM Movimientosdesucursales m WHERE m.idArticulo = :idArticulo"),
    @NamedQuery(name = "Movimientosdesucursales.findByCantidad", query = "SELECT m FROM Movimientosdesucursales m WHERE m.cantidad = :cantidad"),
    @NamedQuery(name = "Movimientosdesucursales.findByConfirmado", query = "SELECT m FROM Movimientosdesucursales m WHERE m.confirmado = :confirmado"),
    @NamedQuery(name = "Movimientosdesucursales.findByNumeroRemito", query = "SELECT m FROM Movimientosdesucursales m WHERE m.numeroRemito = :numeroRemito"),
    @NamedQuery(name = "Movimientosdesucursales.findByIdUsuario", query = "SELECT m FROM Movimientosdesucursales m WHERE m.idUsuario = :idUsuario"),
    @NamedQuery(name = "Movimientosdesucursales.findByFecha", query = "SELECT m FROM Movimientosdesucursales m WHERE m.fecha = :fecha"),
    @NamedQuery(name = "Movimientosdesucursales.findByDiferencia", query = "SELECT m FROM Movimientosdesucursales m WHERE m.diferencia = :diferencia"),
    @NamedQuery(name = "Movimientosdesucursales.findByIdUsuarioRecep", query = "SELECT m FROM Movimientosdesucursales m WHERE m.idUsuarioRecep = :idUsuarioRecep")})
public class Movimientosdesucursales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "depOrigen")
    private int depOrigen;
    @Basic(optional = false)
    @Column(name = "depDestino")
    private int depDestino;
    @Basic(optional = false)
    @Column(name = "idArticulo")
    private int idArticulo;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private double cantidad;
    @Basic(optional = false)
    @Column(name = "confirmado")
    private int confirmado;
    @Basic(optional = false)
    @Column(name = "numeroRemito")
    private int numeroRemito;
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private int idUsuario;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "diferencia")
    private double diferencia;
    @Basic(optional = false)
    @Column(name = "idUsuarioRecep")
    private int idUsuarioRecep;

    public Movimientosdesucursales() {
    }

    public Movimientosdesucursales(Integer id) {
        this.id = id;
    }

    public Movimientosdesucursales(Integer id, int depOrigen, int depDestino, int idArticulo, double cantidad, int confirmado, int numeroRemito, int idUsuario, Date fecha, double diferencia, int idUsuarioRecep) {
        this.id = id;
        this.depOrigen = depOrigen;
        this.depDestino = depDestino;
        this.idArticulo = idArticulo;
        this.cantidad = cantidad;
        this.confirmado = confirmado;
        this.numeroRemito = numeroRemito;
        this.idUsuario = idUsuario;
        this.fecha = fecha;
        this.diferencia = diferencia;
        this.idUsuarioRecep = idUsuarioRecep;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDepOrigen() {
        return depOrigen;
    }

    public void setDepOrigen(int depOrigen) {
        this.depOrigen = depOrigen;
    }

    public int getDepDestino() {
        return depDestino;
    }

    public void setDepDestino(int depDestino) {
        this.depDestino = depDestino;
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

    public int getConfirmado() {
        return confirmado;
    }

    public void setConfirmado(int confirmado) {
        this.confirmado = confirmado;
    }

    public int getNumeroRemito() {
        return numeroRemito;
    }

    public void setNumeroRemito(int numeroRemito) {
        this.numeroRemito = numeroRemito;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(double diferencia) {
        this.diferencia = diferencia;
    }

    public int getIdUsuarioRecep() {
        return idUsuarioRecep;
    }

    public void setIdUsuarioRecep(int idUsuarioRecep) {
        this.idUsuarioRecep = idUsuarioRecep;
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
        if (!(object instanceof Movimientosdesucursales)) {
            return false;
        }
        Movimientosdesucursales other = (Movimientosdesucursales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movimientosdesucursales[ id=" + id + " ]";
    }
    
}
