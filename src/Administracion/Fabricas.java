/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;

import interfaces.Componable;
import interfaces.Editables;
import interfaces.Transaccionable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import objetos.Conecciones;

/**
 *
 * @author mauro
 */
public class Fabricas implements Componable,Editables{
    private Integer id;
    private String nombre;
    private String mail;
    private String sql;
    private Transaccionable tra=new Conecciones();

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    @Override
    public DefaultListModel LlenarList(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel LlenarTabla(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ComboBoxModel LlenarCombo(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultListModel LlenarListConArray(ArrayList listado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel LlenarTablaConArray(ArrayList listado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer AltaObjeto(Object objeto) {
        Fabricas fabrica=(Fabricas)objeto;
        Integer ver=0;
        sql="insert into fabricas (nombre,mail) values ('"+fabrica.getNombre()+"','"+fabrica.getMail()+"')";
        if(tra.guardarRegistro(sql)){
            sql="select last_insert_id()";
            ResultSet rs=tra.leerConjuntoDeRegistros(sql);
            try {
                while(rs.next()){
                    ver=rs.getInt(1);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Fabricas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return ver;
    }

    @Override
    public Boolean ModificaionObjeto(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean EliminacionDeObjeto(Object objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean MovimientoDeAjusteDeCantidades(Object objeto, Double cantidadMovimiento, String observaciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList ListarPorSucursal() {
        ArrayList listado=new ArrayList();
        sql="select * from fabricas order by nombre";
        ResultSet rs=tra.leerConjuntoDeRegistros(sql);
        Fabricas fab=null;
        try {
            while(rs.next()){
               fab=new Fabricas();
               fab.setId(rs.getInt("id"));
               fab.setNombre(rs.getString("nombre"));
               fab.setMail(rs.getString("mail"));
               listado.add(fab);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Fabricas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listado;
    }

    @Override
    public DefaultComboBoxModel LlenarComboConArray(ArrayList listado) {
        DefaultComboBoxModel modelo=new DefaultComboBoxModel();
        Iterator it=listado.listIterator();
        Fabricas fab;
        while(it.hasNext()){
            fab=(Fabricas)it.next();
            modelo.addElement(fab.getNombre());
        }
        return modelo;
    }
    
    
}
