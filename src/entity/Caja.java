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
@Table(name = "caja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c"),
    @NamedQuery(name = "Caja.findByNumero", query = "SELECT c FROM Caja c WHERE c.numero = :numero"),
    @NamedQuery(name = "Caja.findByNumeroSucursal", query = "SELECT c FROM Caja c WHERE c.numeroSucursal = :numeroSucursal"),
    @NamedQuery(name = "Caja.findByNumeroUsuario", query = "SELECT c FROM Caja c WHERE c.numeroUsuario = :numeroUsuario"),
    @NamedQuery(name = "Caja.findByTipoMovimiento", query = "SELECT c FROM Caja c WHERE c.tipoMovimiento = :tipoMovimiento"),
    @NamedQuery(name = "Caja.findBySaldoinicial", query = "SELECT c FROM Caja c WHERE c.saldoinicial = :saldoinicial"),
    @NamedQuery(name = "Caja.findByEstado", query = "SELECT c FROM Caja c WHERE c.estado = :estado"),
    @NamedQuery(name = "Caja.findByTipo", query = "SELECT c FROM Caja c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Caja.findBySaldofinal", query = "SELECT c FROM Caja c WHERE c.saldofinal = :saldofinal"),
    @NamedQuery(name = "Caja.findByFechacierre", query = "SELECT c FROM Caja c WHERE c.fechacierre = :fechacierre"),
    @NamedQuery(name = "Caja.findByDiferencia", query = "SELECT c FROM Caja c WHERE c.diferencia = :diferencia")})
public class Caja implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "numero")
    private Integer numero;
    @Basic(optional = false)
    @Column(name = "numeroSucursal")
    private int numeroSucursal;
    @Basic(optional = false)
    @Column(name = "numeroUsuario")
    private int numeroUsuario;
    @Basic(optional = false)
    @Column(name = "tipoMovimiento")
    private int tipoMovimiento;
    @Basic(optional = false)
    @Column(name = "saldoinicial")
    private double saldoinicial;
    @Basic(optional = false)
    @Column(name = "estado")
    private int estado;
    @Basic(optional = false)
    @Column(name = "tipo")
    private int tipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "saldofinal")
    private Double saldofinal;
    @Column(name = "fechacierre")
    private String fechacierre;
    @Column(name = "diferencia")
    private Double diferencia;

    public Caja() {
    }

    public Caja(Integer numero) {
        this.numero = numero;
    }

    public Caja(Integer numero, int numeroSucursal, int numeroUsuario, int tipoMovimiento, double saldoinicial, int estado, int tipo) {
        this.numero = numero;
        this.numeroSucursal = numeroSucursal;
        this.numeroUsuario = numeroUsuario;
        this.tipoMovimiento = tipoMovimiento;
        this.saldoinicial = saldoinicial;
        this.estado = estado;
        this.tipo = tipo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public void setNumeroSucursal(int numeroSucursal) {
        this.numeroSucursal = numeroSucursal;
    }

    public int getNumeroUsuario() {
        return numeroUsuario;
    }

    public void setNumeroUsuario(int numeroUsuario) {
        this.numeroUsuario = numeroUsuario;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(double saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Double getSaldofinal() {
        return saldofinal;
    }

    public void setSaldofinal(Double saldofinal) {
        this.saldofinal = saldofinal;
    }

    public String getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(String fechacierre) {
        this.fechacierre = fechacierre;
    }

    public Double getDiferencia() {
        return diferencia;
    }

    public void setDiferencia(Double diferencia) {
        this.diferencia = diferencia;
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
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.numero == null && other.numero != null) || (this.numero != null && !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Caja[ numero=" + numero + " ]";
    }
    
}
