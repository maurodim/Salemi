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
@Table(name = "remitos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Remitos.findAll", query = "SELECT r FROM Remitos r"),
    @NamedQuery(name = "Remitos.findById", query = "SELECT r FROM Remitos r WHERE r.id = :id"),
    @NamedQuery(name = "Remitos.findByIdcliente", query = "SELECT r FROM Remitos r WHERE r.idcliente = :idcliente"),
    @NamedQuery(name = "Remitos.findByFecha", query = "SELECT r FROM Remitos r WHERE r.fecha = :fecha"),
    @NamedQuery(name = "Remitos.findByIdcomprobante", query = "SELECT r FROM Remitos r WHERE r.idcomprobante = :idcomprobante"),
    @NamedQuery(name = "Remitos.findByTipocomprobante", query = "SELECT r FROM Remitos r WHERE r.tipocomprobante = :tipocomprobante"),
    @NamedQuery(name = "Remitos.findByObservaciones", query = "SELECT r FROM Remitos r WHERE r.observaciones = :observaciones"),
    @NamedQuery(name = "Remitos.findByArchivo", query = "SELECT r FROM Remitos r WHERE r.archivo = :archivo"),
    @NamedQuery(name = "Remitos.findByNumeroremito", query = "SELECT r FROM Remitos r WHERE r.numeroremito = :numeroremito"),
    @NamedQuery(name = "Remitos.findByDomicilio", query = "SELECT r FROM Remitos r WHERE r.domicilio = :domicilio"),
    @NamedQuery(name = "Remitos.findByLocalidad", query = "SELECT r FROM Remitos r WHERE r.localidad = :localidad"),
    @NamedQuery(name = "Remitos.findByCantidad", query = "SELECT r FROM Remitos r WHERE r.cantidad = :cantidad"),
    @NamedQuery(name = "Remitos.findByTipoBulto", query = "SELECT r FROM Remitos r WHERE r.tipoBulto = :tipoBulto")})
public class Remitos implements Serializable {
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
    @Column(name = "idcomprobante")
    private int idcomprobante;
    @Basic(optional = false)
    @Column(name = "tipocomprobante")
    private int tipocomprobante;
    @Basic(optional = false)
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "archivo")
    private String archivo;
    @Basic(optional = false)
    @Column(name = "numeroremito")
    private String numeroremito;
    @Basic(optional = false)
    @Column(name = "domicilio")
    private String domicilio;
    @Basic(optional = false)
    @Column(name = "localidad")
    private String localidad;
    @Basic(optional = false)
    @Column(name = "cantidad")
    private int cantidad;
    @Basic(optional = false)
    @Column(name = "tipoBulto")
    private int tipoBulto;

    public Remitos() {
    }

    public Remitos(Integer id) {
        this.id = id;
    }

    public Remitos(Integer id, int idcliente, Date fecha, int idcomprobante, int tipocomprobante, String observaciones, String numeroremito, String domicilio, String localidad, int cantidad, int tipoBulto) {
        this.id = id;
        this.idcliente = idcliente;
        this.fecha = fecha;
        this.idcomprobante = idcomprobante;
        this.tipocomprobante = tipocomprobante;
        this.observaciones = observaciones;
        this.numeroremito = numeroremito;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.cantidad = cantidad;
        this.tipoBulto = tipoBulto;
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

    public int getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(int idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public int getTipocomprobante() {
        return tipocomprobante;
    }

    public void setTipocomprobante(int tipocomprobante) {
        this.tipocomprobante = tipocomprobante;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getNumeroremito() {
        return numeroremito;
    }

    public void setNumeroremito(String numeroremito) {
        this.numeroremito = numeroremito;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTipoBulto() {
        return tipoBulto;
    }

    public void setTipoBulto(int tipoBulto) {
        this.tipoBulto = tipoBulto;
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
        if (!(object instanceof Remitos)) {
            return false;
        }
        Remitos other = (Remitos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Remitos[ id=" + id + " ]";
    }
    
}
