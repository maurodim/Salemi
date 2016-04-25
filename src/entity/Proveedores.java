/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "proveedores")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proveedores.findAll", query = "SELECT p FROM Proveedores p"),
    @NamedQuery(name = "Proveedores.findById", query = "SELECT p FROM Proveedores p WHERE p.id = :id"),
    @NamedQuery(name = "Proveedores.findByNombre", query = "SELECT p FROM Proveedores p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Proveedores.findByDomicilio", query = "SELECT p FROM Proveedores p WHERE p.domicilio = :domicilio"),
    @NamedQuery(name = "Proveedores.findByLocalidad", query = "SELECT p FROM Proveedores p WHERE p.localidad = :localidad"),
    @NamedQuery(name = "Proveedores.findByTelefono", query = "SELECT p FROM Proveedores p WHERE p.telefono = :telefono"),
    @NamedQuery(name = "Proveedores.findByInhabilitado", query = "SELECT p FROM Proveedores p WHERE p.inhabilitado = :inhabilitado"),
    @NamedQuery(name = "Proveedores.findByMail", query = "SELECT p FROM Proveedores p WHERE p.mail = :mail"),
    @NamedQuery(name = "Proveedores.findBySaldo", query = "SELECT p FROM Proveedores p WHERE p.saldo = :saldo"),
    @NamedQuery(name = "Proveedores.findByResponsable", query = "SELECT p FROM Proveedores p WHERE p.responsable = :responsable"),
    @NamedQuery(name = "Proveedores.findByCelular", query = "SELECT p FROM Proveedores p WHERE p.celular = :celular")})
public class Proveedores implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "DOMICILIO")
    private String domicilio;
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "INHABILITADO")
    private Integer inhabilitado;
    @Basic(optional = false)
    @Column(name = "mail")
    private String mail;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldo")
    private Double saldo;
    @Basic(optional = false)
    @Column(name = "responsable")
    private String responsable;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;

    public Proveedores() {
    }

    public Proveedores(Integer id) {
        this.id = id;
    }

    public Proveedores(Integer id, String mail, String responsable, String celular) {
        this.id = id;
        this.mail = mail;
        this.responsable = responsable;
        this.celular = celular;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getInhabilitado() {
        return inhabilitado;
    }

    public void setInhabilitado(Integer inhabilitado) {
        this.inhabilitado = inhabilitado;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
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
        if (!(object instanceof Proveedores)) {
            return false;
        }
        Proveedores other = (Proveedores) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Proveedores[ id=" + id + " ]";
    }
    
}
