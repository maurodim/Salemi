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
@Table(name = "movimientosusuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimientosusuarios.findAll", query = "SELECT m FROM Movimientosusuarios m"),
    @NamedQuery(name = "Movimientosusuarios.findByNumero", query = "SELECT m FROM Movimientosusuarios m WHERE m.numero = :numero"),
    @NamedQuery(name = "Movimientosusuarios.findByNumeroUsuario", query = "SELECT m FROM Movimientosusuarios m WHERE m.numeroUsuario = :numeroUsuario"),
    @NamedQuery(name = "Movimientosusuarios.findByTipoacceso", query = "SELECT m FROM Movimientosusuarios m WHERE m.tipoacceso = :tipoacceso"),
    @NamedQuery(name = "Movimientosusuarios.findByFecha", query = "SELECT m FROM Movimientosusuarios m WHERE m.fecha = :fecha"),
    @NamedQuery(name = "Movimientosusuarios.findBySalida", query = "SELECT m FROM Movimientosusuarios m WHERE m.salida = :salida"),
    @NamedQuery(name = "Movimientosusuarios.findByEstado", query = "SELECT m FROM Movimientosusuarios m WHERE m.estado = :estado")})
public class Movimientosusuarios implements Serializable {
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
    @Column(name = "tipoacceso")
    private int tipoacceso;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date salida;
    @Basic(optional = false)
    @Column(name = "estado")
    private boolean estado;

    public Movimientosusuarios() {
    }

    public Movimientosusuarios(Integer numero) {
        this.numero = numero;
    }

    public Movimientosusuarios(Integer numero, int numeroUsuario, int tipoacceso, Date fecha, boolean estado) {
        this.numero = numero;
        this.numeroUsuario = numeroUsuario;
        this.tipoacceso = tipoacceso;
        this.fecha = fecha;
        this.estado = estado;
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

    public int getTipoacceso() {
        return tipoacceso;
    }

    public void setTipoacceso(int tipoacceso) {
        this.tipoacceso = tipoacceso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getSalida() {
        return salida;
    }

    public void setSalida(Date salida) {
        this.salida = salida;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
        if (!(object instanceof Movimientosusuarios)) {
            return false;
        }
        Movimientosusuarios other = (Movimientosusuarios) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Movimientosusuarios[ numero=" + numero + " ]";
    }
    
}
