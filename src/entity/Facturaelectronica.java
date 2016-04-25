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
@Table(name = "facturaelectronica")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturaelectronica.findAll", query = "SELECT f FROM Facturaelectronica f"),
    @NamedQuery(name = "Facturaelectronica.findById", query = "SELECT f FROM Facturaelectronica f WHERE f.id = :id"),
    @NamedQuery(name = "Facturaelectronica.findByCae", query = "SELECT f FROM Facturaelectronica f WHERE f.cae = :cae"),
    @NamedQuery(name = "Facturaelectronica.findByCaeVto", query = "SELECT f FROM Facturaelectronica f WHERE f.caeVto = :caeVto"),
    @NamedQuery(name = "Facturaelectronica.findByFechaCae", query = "SELECT f FROM Facturaelectronica f WHERE f.fechaCae = :fechaCae"),
    @NamedQuery(name = "Facturaelectronica.findByAfipqty", query = "SELECT f FROM Facturaelectronica f WHERE f.afipqty = :afipqty"),
    @NamedQuery(name = "Facturaelectronica.findByAfipplastid", query = "SELECT f FROM Facturaelectronica f WHERE f.afipplastid = :afipplastid"),
    @NamedQuery(name = "Facturaelectronica.findByAfipplastcbte", query = "SELECT f FROM Facturaelectronica f WHERE f.afipplastcbte = :afipplastcbte"),
    @NamedQuery(name = "Facturaelectronica.findByIdfactura", query = "SELECT f FROM Facturaelectronica f WHERE f.idfactura = :idfactura"),
    @NamedQuery(name = "Facturaelectronica.findByIdcliente", query = "SELECT f FROM Facturaelectronica f WHERE f.idcliente = :idcliente"),
    @NamedQuery(name = "Facturaelectronica.findByFecha", query = "SELECT f FROM Facturaelectronica f WHERE f.fecha = :fecha"),
    @NamedQuery(name = "Facturaelectronica.findByEstado", query = "SELECT f FROM Facturaelectronica f WHERE f.estado = :estado"),
    @NamedQuery(name = "Facturaelectronica.findByCustomerid", query = "SELECT f FROM Facturaelectronica f WHERE f.customerid = :customerid"),
    @NamedQuery(name = "Facturaelectronica.findByCustomertypedoc", query = "SELECT f FROM Facturaelectronica f WHERE f.customertypedoc = :customertypedoc"),
    @NamedQuery(name = "Facturaelectronica.findByTipoComprobante", query = "SELECT f FROM Facturaelectronica f WHERE f.tipoComprobante = :tipoComprobante"),
    @NamedQuery(name = "Facturaelectronica.findByImporteTotal", query = "SELECT f FROM Facturaelectronica f WHERE f.importeTotal = :importeTotal"),
    @NamedQuery(name = "Facturaelectronica.findByImporteNeto", query = "SELECT f FROM Facturaelectronica f WHERE f.importeNeto = :importeNeto"),
    @NamedQuery(name = "Facturaelectronica.findByImptoLiq", query = "SELECT f FROM Facturaelectronica f WHERE f.imptoLiq = :imptoLiq")})
public class Facturaelectronica implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cae")
    private String cae;
    @Basic(optional = false)
    @Column(name = "cae_vto")
    private String caeVto;
    @Basic(optional = false)
    @Column(name = "fecha_cae")
    private String fechaCae;
    @Basic(optional = false)
    @Column(name = "afipqty")
    private String afipqty;
    @Basic(optional = false)
    @Column(name = "afipplastid")
    private String afipplastid;
    @Basic(optional = false)
    @Column(name = "afipplastcbte")
    private String afipplastcbte;
    @Basic(optional = false)
    @Column(name = "idfactura")
    private int idfactura;
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idcliente;
    @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "customerid")
    private String customerid;
    @Basic(optional = false)
    @Column(name = "customertypedoc")
    private String customertypedoc;
    @Basic(optional = false)
    @Column(name = "tipo_comprobante")
    private String tipoComprobante;
    @Basic(optional = false)
    @Column(name = "importe_total")
    private String importeTotal;
    @Basic(optional = false)
    @Column(name = "importe_neto")
    private String importeNeto;
    @Basic(optional = false)
    @Column(name = "impto_liq")
    private String imptoLiq;

    public Facturaelectronica() {
    }

    public Facturaelectronica(Integer id) {
        this.id = id;
    }

    public Facturaelectronica(Integer id, String cae, String caeVto, String fechaCae, String afipqty, String afipplastid, String afipplastcbte, int idfactura, int idcliente, Date fecha, int estado, String customerid, String customertypedoc, String tipoComprobante, String importeTotal, String importeNeto, String imptoLiq) {
        this.id = id;
        this.cae = cae;
        this.caeVto = caeVto;
        this.fechaCae = fechaCae;
        this.afipqty = afipqty;
        this.afipplastid = afipplastid;
        this.afipplastcbte = afipplastcbte;
        this.idfactura = idfactura;
        this.idcliente = idcliente;
        this.fecha = fecha;
        this.estado = estado;
        this.customerid = customerid;
        this.customertypedoc = customertypedoc;
        this.tipoComprobante = tipoComprobante;
        this.importeTotal = importeTotal;
        this.importeNeto = importeNeto;
        this.imptoLiq = imptoLiq;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCae() {
        return cae;
    }

    public void setCae(String cae) {
        this.cae = cae;
    }

    public String getCaeVto() {
        return caeVto;
    }

    public void setCaeVto(String caeVto) {
        this.caeVto = caeVto;
    }

    public String getFechaCae() {
        return fechaCae;
    }

    public void setFechaCae(String fechaCae) {
        this.fechaCae = fechaCae;
    }

    public String getAfipqty() {
        return afipqty;
    }

    public void setAfipqty(String afipqty) {
        this.afipqty = afipqty;
    }

    public String getAfipplastid() {
        return afipplastid;
    }

    public void setAfipplastid(String afipplastid) {
        this.afipplastid = afipplastid;
    }

    public String getAfipplastcbte() {
        return afipplastcbte;
    }

    public void setAfipplastcbte(String afipplastcbte) {
        this.afipplastcbte = afipplastcbte;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomertypedoc() {
        return customertypedoc;
    }

    public void setCustomertypedoc(String customertypedoc) {
        this.customertypedoc = customertypedoc;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(String importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(String importeNeto) {
        this.importeNeto = importeNeto;
    }

    public String getImptoLiq() {
        return imptoLiq;
    }

    public void setImptoLiq(String imptoLiq) {
        this.imptoLiq = imptoLiq;
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
        if (!(object instanceof Facturaelectronica)) {
            return false;
        }
        Facturaelectronica other = (Facturaelectronica) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Facturaelectronica[ id=" + id + " ]";
    }
    
}
