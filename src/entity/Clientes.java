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
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findByCodClient", query = "SELECT c FROM Clientes c WHERE c.codClient = :codClient"),
    @NamedQuery(name = "Clientes.findByRazonSoci", query = "SELECT c FROM Clientes c WHERE c.razonSoci = :razonSoci"),
    @NamedQuery(name = "Clientes.findByDomicilio", query = "SELECT c FROM Clientes c WHERE c.domicilio = :domicilio"),
    @NamedQuery(name = "Clientes.findByCondVta", query = "SELECT c FROM Clientes c WHERE c.condVta = :condVta"),
    @NamedQuery(name = "Clientes.findByTelefono1", query = "SELECT c FROM Clientes c WHERE c.telefono1 = :telefono1"),
    @NamedQuery(name = "Clientes.findByListadeprecio", query = "SELECT c FROM Clientes c WHERE c.listadeprecio = :listadeprecio"),
    @NamedQuery(name = "Clientes.findByNumerodecuit", query = "SELECT c FROM Clientes c WHERE c.numerodecuit = :numerodecuit"),
    @NamedQuery(name = "Clientes.findByCupodecredito", query = "SELECT c FROM Clientes c WHERE c.cupodecredito = :cupodecredito"),
    @NamedQuery(name = "Clientes.findByEmpresa", query = "SELECT c FROM Clientes c WHERE c.empresa = :empresa"),
    @NamedQuery(name = "Clientes.findById", query = "SELECT c FROM Clientes c WHERE c.id = :id"),
    @NamedQuery(name = "Clientes.findBySaldo", query = "SELECT c FROM Clientes c WHERE c.saldo = :saldo"),
    @NamedQuery(name = "Clientes.findBySaldoactual", query = "SELECT c FROM Clientes c WHERE c.saldoactual = :saldoactual"),
    @NamedQuery(name = "Clientes.findByTipoIva", query = "SELECT c FROM Clientes c WHERE c.tipoIva = :tipoIva"),
    @NamedQuery(name = "Clientes.findByCoeficiente", query = "SELECT c FROM Clientes c WHERE c.coeficiente = :coeficiente"),
    @NamedQuery(name = "Clientes.findByResponsable", query = "SELECT c FROM Clientes c WHERE c.responsable = :responsable"),
    @NamedQuery(name = "Clientes.findByFantasia", query = "SELECT c FROM Clientes c WHERE c.fantasia = :fantasia"),
    @NamedQuery(name = "Clientes.findByCelular", query = "SELECT c FROM Clientes c WHERE c.celular = :celular"),
    @NamedQuery(name = "Clientes.findByLocalidad", query = "SELECT c FROM Clientes c WHERE c.localidad = :localidad"),
    @NamedQuery(name = "Clientes.findByFax", query = "SELECT c FROM Clientes c WHERE c.fax = :fax"),
    @NamedQuery(name = "Clientes.findByDireccionfantasia", query = "SELECT c FROM Clientes c WHERE c.direccionfantasia = :direccionfantasia"),
    @NamedQuery(name = "Clientes.findByEmail", query = "SELECT c FROM Clientes c WHERE c.email = :email"),
    @NamedQuery(name = "Clientes.findByDentrega", query = "SELECT c FROM Clientes c WHERE c.dentrega = :dentrega")})
public class Clientes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "COD_CLIENT")
    private String codClient;
    @Column(name = "RAZON_SOCI")
    private String razonSoci;
    @Column(name = "DOMICILIO")
    private String domicilio;
    @Column(name = "COND_VTA")
    private Integer condVta;
    @Column(name = "TELEFONO_1")
    private String telefono1;
    @Column(name = "LISTADEPRECIO")
    private Integer listadeprecio;
    @Column(name = "NUMERODECUIT")
    private String numerodecuit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CUPODECREDITO")
    private Double cupodecredito;
    @Column(name = "empresa")
    private String empresa;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "saldo")
    private Double saldo;
    @Basic(optional = false)
    @Column(name = "saldoactual")
    private double saldoactual;
    @Basic(optional = false)
    @Column(name = "TIPO_IVA")
    private int tipoIva;
    @Column(name = "COEFICIENTE")
    private Double coeficiente;
    @Column(name = "responsable")
    private String responsable;
    @Column(name = "fantasia")
    private String fantasia;
    @Column(name = "celular")
    private String celular;
    @Basic(optional = false)
    @Column(name = "localidad")
    private int localidad;
    @Column(name = "fax")
    private String fax;
    @Column(name = "direccionfantasia")
    private String direccionfantasia;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "dentrega")
    private String dentrega;

    public Clientes() {
    }

    public Clientes(Integer id) {
        this.id = id;
    }

    public Clientes(Integer id, double saldoactual, int tipoIva, int localidad, String dentrega) {
        this.id = id;
        this.saldoactual = saldoactual;
        this.tipoIva = tipoIva;
        this.localidad = localidad;
        this.dentrega = dentrega;
    }

    public String getCodClient() {
        return codClient;
    }

    public void setCodClient(String codClient) {
        this.codClient = codClient;
    }

    public String getRazonSoci() {
        return razonSoci;
    }

    public void setRazonSoci(String razonSoci) {
        this.razonSoci = razonSoci;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getCondVta() {
        return condVta;
    }

    public void setCondVta(Integer condVta) {
        this.condVta = condVta;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public Integer getListadeprecio() {
        return listadeprecio;
    }

    public void setListadeprecio(Integer listadeprecio) {
        this.listadeprecio = listadeprecio;
    }

    public String getNumerodecuit() {
        return numerodecuit;
    }

    public void setNumerodecuit(String numerodecuit) {
        this.numerodecuit = numerodecuit;
    }

    public Double getCupodecredito() {
        return cupodecredito;
    }

    public void setCupodecredito(Double cupodecredito) {
        this.cupodecredito = cupodecredito;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(double saldoactual) {
        this.saldoactual = saldoactual;
    }

    public int getTipoIva() {
        return tipoIva;
    }

    public void setTipoIva(int tipoIva) {
        this.tipoIva = tipoIva;
    }

    public Double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getLocalidad() {
        return localidad;
    }

    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDireccionfantasia() {
        return direccionfantasia;
    }

    public void setDireccionfantasia(String direccionfantasia) {
        this.direccionfantasia = direccionfantasia;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDentrega() {
        return dentrega;
    }

    public void setDentrega(String dentrega) {
        this.dentrega = dentrega;
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
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Clientes[ id=" + id + " ]";
    }
    
}
