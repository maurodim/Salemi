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
@Table(name = "articulos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articulos.findAll", query = "SELECT a FROM Articulos a"),
    @NamedQuery(name = "Articulos.findById", query = "SELECT a FROM Articulos a WHERE a.id = :id"),
    @NamedQuery(name = "Articulos.findByBarras", query = "SELECT a FROM Articulos a WHERE a.barras = :barras"),
    @NamedQuery(name = "Articulos.findByNombre", query = "SELECT a FROM Articulos a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Articulos.findByServicio", query = "SELECT a FROM Articulos a WHERE a.servicio = :servicio"),
    @NamedQuery(name = "Articulos.findByCosto", query = "SELECT a FROM Articulos a WHERE a.costo = :costo"),
    @NamedQuery(name = "Articulos.findByPrecio", query = "SELECT a FROM Articulos a WHERE a.precio = :precio"),
    @NamedQuery(name = "Articulos.findByMinimo", query = "SELECT a FROM Articulos a WHERE a.minimo = :minimo"),
    @NamedQuery(name = "Articulos.findByStock", query = "SELECT a FROM Articulos a WHERE a.stock = :stock"),
    @NamedQuery(name = "Articulos.findByProveedor", query = "SELECT a FROM Articulos a WHERE a.proveedor = :proveedor"),
    @NamedQuery(name = "Articulos.findByRubron", query = "SELECT a FROM Articulos a WHERE a.rubron = :rubron"),
    @NamedQuery(name = "Articulos.findByAlta", query = "SELECT a FROM Articulos a WHERE a.alta = :alta"),
    @NamedQuery(name = "Articulos.findByInhabilitado", query = "SELECT a FROM Articulos a WHERE a.inhabilitado = :inhabilitado"),
    @NamedQuery(name = "Articulos.findByIdRubro", query = "SELECT a FROM Articulos a WHERE a.idRubro = :idRubro"),
    @NamedQuery(name = "Articulos.findByEquivalencia", query = "SELECT a FROM Articulos a WHERE a.equivalencia = :equivalencia"),
    @NamedQuery(name = "Articulos.findByModificaPrecio", query = "SELECT a FROM Articulos a WHERE a.modificaPrecio = :modificaPrecio"),
    @NamedQuery(name = "Articulos.findByModificaServicio", query = "SELECT a FROM Articulos a WHERE a.modificaServicio = :modificaServicio"),
    @NamedQuery(name = "Articulos.findByRecargo", query = "SELECT a FROM Articulos a WHERE a.recargo = :recargo"),
    @NamedQuery(name = "Articulos.findByServicio1", query = "SELECT a FROM Articulos a WHERE a.servicio1 = :servicio1"),
    @NamedQuery(name = "Articulos.findByIdcombo", query = "SELECT a FROM Articulos a WHERE a.idcombo = :idcombo"),
    @NamedQuery(name = "Articulos.findByActualizacion", query = "SELECT a FROM Articulos a WHERE a.actualizacion = :actualizacion"),
    @NamedQuery(name = "Articulos.findByIdsubrubro", query = "SELECT a FROM Articulos a WHERE a.idsubrubro = :idsubrubro")})
public class Articulos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "BARRAS")
    private String barras;
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SERVICIO")
    private Double servicio;
    @Column(name = "COSTO")
    private Double costo;
    @Column(name = "PRECIO")
    private Double precio;
    @Column(name = "MINIMO")
    private Integer minimo;
    @Column(name = "STOCK")
    private Integer stock;
    @Column(name = "PROVEEDOR")
    private Integer proveedor;
    @Column(name = "RUBRON")
    private String rubron;
    @Column(name = "ALTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date alta;
    @Basic(optional = false)
    @Column(name = "INHABILITADO")
    private int inhabilitado;
    @Basic(optional = false)
    @Column(name = "idRubro")
    private int idRubro;
    @Basic(optional = false)
    @Column(name = "equivalencia")
    private double equivalencia;
    @Basic(optional = false)
    @Column(name = "modificaPrecio")
    private int modificaPrecio;
    @Basic(optional = false)
    @Column(name = "modificaServicio")
    private int modificaServicio;
    @Basic(optional = false)
    @Column(name = "recargo")
    private double recargo;
    @Column(name = "servicio1")
    private Double servicio1;
    @Basic(optional = false)
    @Column(name = "idcombo")
    private int idcombo;
    @Basic(optional = false)
    @Column(name = "actualizacion")
    private int actualizacion;
    @Basic(optional = false)
    @Column(name = "idsubrubro")
    private int idsubrubro;

    public Articulos() {
    }

    public Articulos(Integer id) {
        this.id = id;
    }

    public Articulos(Integer id, int inhabilitado, int idRubro, double equivalencia, int modificaPrecio, int modificaServicio, double recargo, int idcombo, int actualizacion, int idsubrubro) {
        this.id = id;
        this.inhabilitado = inhabilitado;
        this.idRubro = idRubro;
        this.equivalencia = equivalencia;
        this.modificaPrecio = modificaPrecio;
        this.modificaServicio = modificaServicio;
        this.recargo = recargo;
        this.idcombo = idcombo;
        this.actualizacion = actualizacion;
        this.idsubrubro = idsubrubro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBarras() {
        return barras;
    }

    public void setBarras(String barras) {
        this.barras = barras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getServicio() {
        return servicio;
    }

    public void setServicio(Double servicio) {
        this.servicio = servicio;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getMinimo() {
        return minimo;
    }

    public void setMinimo(Integer minimo) {
        this.minimo = minimo;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getProveedor() {
        return proveedor;
    }

    public void setProveedor(Integer proveedor) {
        this.proveedor = proveedor;
    }

    public String getRubron() {
        return rubron;
    }

    public void setRubron(String rubron) {
        this.rubron = rubron;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public int getInhabilitado() {
        return inhabilitado;
    }

    public void setInhabilitado(int inhabilitado) {
        this.inhabilitado = inhabilitado;
    }

    public int getIdRubro() {
        return idRubro;
    }

    public void setIdRubro(int idRubro) {
        this.idRubro = idRubro;
    }

    public double getEquivalencia() {
        return equivalencia;
    }

    public void setEquivalencia(double equivalencia) {
        this.equivalencia = equivalencia;
    }

    public int getModificaPrecio() {
        return modificaPrecio;
    }

    public void setModificaPrecio(int modificaPrecio) {
        this.modificaPrecio = modificaPrecio;
    }

    public int getModificaServicio() {
        return modificaServicio;
    }

    public void setModificaServicio(int modificaServicio) {
        this.modificaServicio = modificaServicio;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    public Double getServicio1() {
        return servicio1;
    }

    public void setServicio1(Double servicio1) {
        this.servicio1 = servicio1;
    }

    public int getIdcombo() {
        return idcombo;
    }

    public void setIdcombo(int idcombo) {
        this.idcombo = idcombo;
    }

    public int getActualizacion() {
        return actualizacion;
    }

    public void setActualizacion(int actualizacion) {
        this.actualizacion = actualizacion;
    }

    public int getIdsubrubro() {
        return idsubrubro;
    }

    public void setIdsubrubro(int idsubrubro) {
        this.idsubrubro = idsubrubro;
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
        if (!(object instanceof Articulos)) {
            return false;
        }
        Articulos other = (Articulos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Articulos[ id=" + id + " ]";
    }
    
}
