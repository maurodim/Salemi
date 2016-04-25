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
@Table(name = "recibos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recibos.findAll", query = "SELECT r FROM Recibos r"),
    @NamedQuery(name = "Recibos.findById", query = "SELECT r FROM Recibos r WHERE r.id = :id"),
    @NamedQuery(name = "Recibos.findByIdcliente", query = "SELECT r FROM Recibos r WHERE r.idcliente = :idcliente"),
    @NamedQuery(name = "Recibos.findByMonto", query = "SELECT r FROM Recibos r WHERE r.monto = :monto"),
    @NamedQuery(name = "Recibos.findByFecha", query = "SELECT r FROM Recibos r WHERE r.fecha = :fecha")})
public class Recibos implements Serializable {
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
    @Column(name = "monto")
    private double monto;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    public Recibos() {
    }

    public Recibos(Integer id) {
        this.id = id;
    }

    public Recibos(Integer id, int idcliente, double monto, Date fecha) {
        this.id = id;
        this.idcliente = idcliente;
        this.monto = monto;
        this.fecha = fecha;
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

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        if (!(object instanceof Recibos)) {
            return false;
        }
        Recibos other = (Recibos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Recibos[ id=" + id + " ]";
    }
    
}
