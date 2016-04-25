/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mauro
 */
@Entity
@Table(name = "subrubros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subrubros.findAll", query = "SELECT s FROM Subrubros s"),
    @NamedQuery(name = "Subrubros.findById", query = "SELECT s FROM Subrubros s WHERE s.id = :id"),
    @NamedQuery(name = "Subrubros.findByDescripcion", query = "SELECT s FROM Subrubros s WHERE s.descripcion = :descripcion"),
    @NamedQuery(name = "Subrubros.findByIdrubro", query = "SELECT s FROM Subrubros s WHERE s.idrubro = :idrubro")})
public class Subrubros implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "idrubro")
    private int idrubro;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "subrubros")
    private Rubros rubros;

    public Subrubros() {
    }

    public Subrubros(Integer id) {
        this.id = id;
    }

    public Subrubros(Integer id, String descripcion, int idrubro) {
        this.id = id;
        this.descripcion = descripcion;
        this.idrubro = idrubro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdrubro() {
        return idrubro;
    }

    public void setIdrubro(int idrubro) {
        this.idrubro = idrubro;
    }

    public Rubros getRubros() {
        return rubros;
    }

    public void setRubros(Rubros rubros) {
        this.rubros = rubros;
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
        if (!(object instanceof Subrubros)) {
            return false;
        }
        Subrubros other = (Subrubros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Subrubros[ id=" + id + " ]";
    }
    
}
