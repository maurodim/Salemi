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
@Table(name = "tipoacceso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoacceso.findAll", query = "SELECT t FROM Tipoacceso t"),
    @NamedQuery(name = "Tipoacceso.findById", query = "SELECT t FROM Tipoacceso t WHERE t.id = :id"),
    @NamedQuery(name = "Tipoacceso.findByDescripcion", query = "SELECT t FROM Tipoacceso t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tipoacceso.findByNivel", query = "SELECT t FROM Tipoacceso t WHERE t.nivel = :nivel"),
    @NamedQuery(name = "Tipoacceso.findByMenu1", query = "SELECT t FROM Tipoacceso t WHERE t.menu1 = :menu1"),
    @NamedQuery(name = "Tipoacceso.findByMenu2", query = "SELECT t FROM Tipoacceso t WHERE t.menu2 = :menu2"),
    @NamedQuery(name = "Tipoacceso.findByMenu3", query = "SELECT t FROM Tipoacceso t WHERE t.menu3 = :menu3"),
    @NamedQuery(name = "Tipoacceso.findByMenu4", query = "SELECT t FROM Tipoacceso t WHERE t.menu4 = :menu4"),
    @NamedQuery(name = "Tipoacceso.findByMenu5", query = "SELECT t FROM Tipoacceso t WHERE t.menu5 = :menu5"),
    @NamedQuery(name = "Tipoacceso.findByMenu6", query = "SELECT t FROM Tipoacceso t WHERE t.menu6 = :menu6"),
    @NamedQuery(name = "Tipoacceso.findByMenu7", query = "SELECT t FROM Tipoacceso t WHERE t.menu7 = :menu7")})
public class Tipoacceso implements Serializable {
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
    @Column(name = "nivel")
    private int nivel;
    @Basic(optional = false)
    @Column(name = "menu1")
    private int menu1;
    @Basic(optional = false)
    @Column(name = "menu2")
    private int menu2;
    @Basic(optional = false)
    @Column(name = "menu3")
    private int menu3;
    @Basic(optional = false)
    @Column(name = "menu4")
    private int menu4;
    @Basic(optional = false)
    @Column(name = "menu5")
    private int menu5;
    @Basic(optional = false)
    @Column(name = "menu6")
    private int menu6;
    @Basic(optional = false)
    @Column(name = "menu7")
    private int menu7;

    public Tipoacceso() {
    }

    public Tipoacceso(Integer id) {
        this.id = id;
    }

    public Tipoacceso(Integer id, String descripcion, int nivel, int menu1, int menu2, int menu3, int menu4, int menu5, int menu6, int menu7) {
        this.id = id;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.menu1 = menu1;
        this.menu2 = menu2;
        this.menu3 = menu3;
        this.menu4 = menu4;
        this.menu5 = menu5;
        this.menu6 = menu6;
        this.menu7 = menu7;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getMenu1() {
        return menu1;
    }

    public void setMenu1(int menu1) {
        this.menu1 = menu1;
    }

    public int getMenu2() {
        return menu2;
    }

    public void setMenu2(int menu2) {
        this.menu2 = menu2;
    }

    public int getMenu3() {
        return menu3;
    }

    public void setMenu3(int menu3) {
        this.menu3 = menu3;
    }

    public int getMenu4() {
        return menu4;
    }

    public void setMenu4(int menu4) {
        this.menu4 = menu4;
    }

    public int getMenu5() {
        return menu5;
    }

    public void setMenu5(int menu5) {
        this.menu5 = menu5;
    }

    public int getMenu6() {
        return menu6;
    }

    public void setMenu6(int menu6) {
        this.menu6 = menu6;
    }

    public int getMenu7() {
        return menu7;
    }

    public void setMenu7(int menu7) {
        this.menu7 = menu7;
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
        if (!(object instanceof Tipoacceso)) {
            return false;
        }
        Tipoacceso other = (Tipoacceso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Tipoacceso[ id=" + id + " ]";
    }
    
}
