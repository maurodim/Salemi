/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion.pantallas;

import interfaceGraficas.NuevoCliente;
import Pedidos.IngresoDePedidos;
import Conversores.Numeros;
import facturacion.clientes.Clientes;

import interfaceGraficas.Inicio;
import interfacesPrograma.Facturar;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Articulos.Articulos;
import Articulos.Modificable;
import Articulos.Rubrable;
import Articulos.Rubros;
import Articulos.SubRubros;
import FacturaE.FacturaElectronica;
import FacturaE.pdfsJavaGenerador;
import ListasDePrecios.Articulable;
import ListasDePrecios.ArticulosAsignados;
import Pedidos.DetallePedidos;
import Pedidos.Pedable;
import Pedidos.Pedidos;
import Sucursales.ListasDePrecios;
import facturacion.clientes.Facturable;
import facturacion.clientes.Facturas;
import facturacion.clientes.ImprimirFactura;
import static facturacion.pantallas.IngresoDeFacturas.cliT;
import static facturacion.pantallas.IngresoDeFacturas.jTextField1;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.xml.parsers.ParserConfigurationException;
import objetos.Comprobantes;
import objetos.Conecciones;
import org.xml.sax.SAXException;
import tablas.MiModeloTablaBuscarCliente;
import tablas.MiModeloTablaFacturacion;


/**
 *
 * @author hernan
 */
public class ModificacionDeFacturas extends javax.swing.JInternalFrame {

    /**
     * Creates new form IngresoDePedidos
     */
    public static Clientes cliT;
    private ArrayList detalleDelPedido=new ArrayList();
    private Articulos arti;
    private static ArrayList listadoDeBusqueda=new ArrayList();
    private static Double montoTotal=0.00;
    private static Comprobantes comp=new Comprobantes();
    private Facturas factura;
    private Rubros rubro=new Rubros();
    private SubRubros subRubro;
    private ArrayList listadoSubRubros;
    private Rubrable ruble=new Rubros();
    private ArrayList listadoR=new ArrayList();
    private DefaultComboBoxModel combox=new DefaultComboBoxModel();
    private TableColumn columnaCodigo;
    private String valorCargado;
    
    public ModificacionDeFacturas() {
        //Articulos.CargarMap();
        cliT=new Clientes("130");
        //cliT=(ClientesTango)oob;
        //comp.setCliente(cliT);
        initComponents();
        this.jCheckBox2.setEnabled(true);
        this.jCheckBox2.isSelected();
        this.jLabel6.setText(cliT.getRazonSocial());
        this.jLabel7.setVisible(false);
        this.jTextField4.setVisible(false);
        this.jCheckBox1.setVisible(false);
        this.jCheckBox2.setEnabled(false);
        this.jTextField5.requestFocus();
        //this.jPanel2.requestFocus();
        
    }
    public ModificacionDeFacturas(Object ped){
        factura=new Facturas();
        Pedidos pedido=new Pedidos();
        ArrayList listadoPed=new ArrayList();
        pedido=(Pedidos)ped;
        Facturar fact=new Clientes();
        Pedable peda=new Pedidos();
        DetallePedidos detallePedido=new DetallePedidos();
        Pedable detP=new DetallePedidos();
        factura.setIdPedido(pedido.getId());
        cliT=new Clientes();
        //ListasDePrecios lista=new ListasDePrecios(cliT.getListaDePrecios());
        cliT=(Clientes)fact.cargarPorCodigoAsignado(pedido.getIdCliente());
        listadoPed=detP.cargarDetallePedido(pedido.getId());
        detalleDelPedido=detP.convertirAArticulos(listadoPed);
        
//cliT=(ClientesTango)oob;
        //comp.setCliente(cliT);
        initComponents();
        
        Iterator irP=detalleDelPedido.listIterator();
        int fil=0;
        ArrayList paraEliminar=new ArrayList();
        Articulos arrrt;
        while(irP.hasNext()){
            arrrt=new Articulos();
            arrrt=(Articulos) irP.next();
            //fila[0]=pedidos.getCodigo();
            if(arrrt.getNumeroId()==0){
               paraEliminar.add(fil);
            }
            fil++;
        }
        if(paraEliminar.size() > 0){
            Iterator iEl=paraEliminar.listIterator();
            int pos=0;
            while(iEl.hasNext()){
                pos=(Integer)iEl.next();
                detalleDelPedido.remove(pos);
            }
        }
        
        agregarRenglonTabla();
        this.jButton3.setVisible(false);
        this.jButton5.setVisible(false);
        //this.jCheckBox2.isSelected();
        this.jLabel6.setText(cliT.getRazonSocial());
        this.jLabel7.setVisible(false);
        this.jTextField4.setVisible(false);
        this.jCheckBox1.setVisible(false);
        //this.jCheckBox2.setEnabled(false);
        this.jTextField1.requestFocus();
        //this.jPanel2.requestFocus();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MiModeloTablaFacturacion facturas=new MiModeloTablaFacturacion();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Facturacion - Ingreso de Articulos");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jTable1.setModel(facturas);
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("TOTAL FACTURA :");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/printer32.png"))); // NOI18N
        jButton1.setText("FACT ELECT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/mac_trashcan_full_new.png"))); // NOI18N
        jButton2.setText("Eliminar Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField3.setEnabled(false);

        jLabel5.setText("FECHA");
        jLabel5.setEnabled(false);

        jCheckBox2.setText("PAGADO");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/currency_black_dollar.png"))); // NOI18N
        jButton6.setText("Modificar Precio");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(3, 3, 3)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBox2)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setMaximumSize(new java.awt.Dimension(507, 207));

        jLabel3.setText("Descripcion");

        jLabel4.setText("CANTIDAD :");

        jTextField1.requestFocus();
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.setPreferredSize(new java.awt.Dimension(40, 20));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jLabel6.setText("<HTML><strong>jLabel6</strong></html>");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/groups_black.png"))); // NOI18N
        jButton3.setText("Ingresar Cliente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/folder_new.png"))); // NOI18N
        jButton5.setText("Nuevo Cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("PRECIO :");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("iNCLUYE SERVICIO ?");
        jCheckBox1.setEnabled(false);
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setText("Rubro");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jLabel10.setText("SubRubro");

        jComboBox2.setModel(combox);
        jComboBox2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBox2KeyPressed(evt);
            }
        });

        jLabel12.setText("<html>PRESIONE F1 PARA CONSULTAR POR DESCRIPCION<br>\nPRESIONE F3 PARA FILTRAR POR SUBRUBRO<br>\nPRESIONE F4 PARA IMPRIMIR\n</html>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addGap(12, 12, 12))
        );

        DefaultTableModel modelo=new DefaultTableModel();
        jTable2.setModel(modelo);
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            //System.out.println("ENTRO CON EL ENTER¡¡¡¡¡¡");
            listadoDeBusqueda.clear();
            Facturar fart=new Articulos();
            arti=new Articulos();
            arti=(Articulos)fart.cargarPorCodigoDeBarra(jTextField1.getText());
            if(arti.getCodigoDeBarra().equals("")){
                
             jTextField1.setText("");   
            }else{
            listadoDeBusqueda.add(arti);
            //jTextField1.setText(arti.getCodigoAsignado());
            jTextField2.setText("1");
            this.jLabel8.setText(arti.getDescripcionArticulo());
            if(arti.getModificaPrecio()){
                this.jLabel7.setVisible(true);
                this.jTextField4.setVisible(true);
                //this.jTextField4.setEnabled(true);
               // this.jCheckBox1.setVisible(false);
                
            }else{
            
                this.jLabel7.setVisible(false);
                this.jTextField4.setVisible(false);
                

                if(arti.getPrecioServicio() > 0){
                    this.jLabel7.setVisible(true);
                    this.jTextField4.setVisible(true);
                    
                    this.jTextField4.setText(Numeros.ConvertirNumero(arti.getPrecioServicio()));
                    //this.jTextField4.setEnabled(false);
                    this.jCheckBox1.setVisible(true);
                    Calendar calendario=new GregorianCalendar();
                    int hora=calendario.get(Calendar.HOUR_OF_DAY);
                    //System.out.println("LA HORA ACTUAL ES :"+hora);
                    if(hora >= 0 || hora < 8){
                        if(arti.getModificaServicio()){
                         //System.err.println("SI TIENE QUE MODIFICAR EL SERVICIO");  
                         this.jCheckBox1.setEnabled(false);
                        }else{
                        //System.err.println("NO DEBE MODIFICAR EL SERVICIO");
                            this.jCheckBox1.setEnabled(true);
                        }
                        }
                }
            }
            
            if(cliT.getCondicionDeVenta()==2)this.jCheckBox2.setEnabled(true);
            this.jTextField2.selectAll();
            this.jTextField2.requestFocus();
            }
        }
        if(evt.getKeyCode()==KeyEvent.VK_F1){
            valorCargado=jTextField1.getText();
        Facturar fart=new Articulos();
        this.jTable2.removeAll();
            Modificable modiA=new Articulos();
            Articulable modi=new ArticulosAsignados();
            listadoDeBusqueda.clear();
            listadoDeBusqueda=modi.convertirListadoEnArticulos(modi.filtradorDeFormularios(listadoSubRubros, listadoR, cliT,this.jTextField1.getText()));
            //listadoDeBusqueda=modi.filtrador(listadoSubRubros,listadoR);
            this.jTable2.setModel(modiA.mostrarListadoBusqueda(listadoDeBusqueda));
            columnaCodigo=this.jTable2.getColumn("Precio");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
                columnaCodigo=this.jTable2.getColumn("Stock");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
            this.jTable2.requestFocus();
        }else{
            Facturar fart=new Articulos();
            this.jTable2.removeAll();
            Modificable modiA=new Articulos();
            Articulable modi=new ArticulosAsignados();
            listadoDeBusqueda.clear();
            listadoDeBusqueda=modi.convertirListadoEnArticulos(modi.filtradorDeFormularios(listadoSubRubros, listadoR, cliT,this.jTextField1.getText()));
            //listadoDeBusqueda=modi.filtrador(listadoSubRubros,listadoR);
            this.jTable2.setModel(modiA.mostrarListadoBusqueda(listadoDeBusqueda));
            columnaCodigo=this.jTable2.getColumn("Precio");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
                columnaCodigo=this.jTable2.getColumn("Stock");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
        }
        if(evt.getKeyCode()==KeyEvent.VK_F4){
                    //verificar();
        //Impresora imp=new Impresora();        
        String cadena=cliT.getCodigoCliente()+" - "+cliT.getRazonSocial()+"\n"+cliT.getDireccion();
        //comp.setCliente(cliT);
        //VisorDeHojaDeRuta
        
        //comp.setVendedor(VisorDeHojaDeRuta.tG.getOperador());
        if(this.jCheckBox1.isSelected()){
        //    comp.setReparto(1);
        //    comp.setEntrega(String.valueOf(this.jTextField3.getText()));
        }
        
        //comp.setArticulos(detalleDelPedido);
        DecimalFormat fr=new DecimalFormat("00");
        Calendar c1=Calendar.getInstance();
	Calendar c2=new GregorianCalendar();
	String dia=Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
	String mes=Integer.toString(c2.get(Calendar.MONTH));
	String ano=Integer.toString(c2.get(Calendar.YEAR));
	
        int da=Integer.parseInt(dia);
        int me=Integer.parseInt(mes);
        me++;
        dia=fr.format(da);
        mes=fr.format(me);
        String fecha=dia+"/"+mes+"/"+ano;
        String fecha2=ano+"-"+mes+"-"+dia;
        //comp.setFechaComprobante(fecha2);
        //comp.setFechaComprobante(fecha);
        Integer comprobanteTipo=(Integer) Inicio.sucursal.getTipoComprobantes().get(0);
        //System.out.println("COMPROBANTEEEEEEE "+comprobanteTipo);
        if(cliT.getCondicionIva().equals("RI "))comprobanteTipo=(Integer)Inicio.sucursal.getTipoComprobantes().get(1);
        Comprobantes comprobante=new Comprobantes();
        comprobante.setCliente(cliT);
        comprobante.setTipoMovimiento(1);
        comprobante.setTipoComprobante(comprobanteTipo);
        comprobante.setFechaEmision((Date.valueOf(fecha2)));
        comprobante.setListadoDeArticulos(detalleDelPedido);
        comprobante.setUsuarioGenerador(Inicio.usuario.getNumero());
        comprobante.setIdSucursal(Inicio.sucursal.getNumero());
        comprobante.setIdDeposito(Inicio.deposito.getNumero());
        comprobante.setIdCaja(Inicio.caja.getNumero());
        if(montoTotal == 0.00){
            String sqM="usuario :"+Inicio.usuario.getNombre()+" sucursal "+Inicio.sucursal.getNumero()+" idcaja "+Inicio.caja.getNumero();
            JOptionPane.showMessageDialog(this,"OJO EL MONTO DE ESTE COMPROBANTE ES $ 0, AVISE PARA DETECTAR EL ERROR");
            FileWriter fichero=null;
            PrintWriter pw=null;
            try {
                fichero = new FileWriter("C:\\Gestion\\"+Inicio.fechaDia+" - errores en comprobantes.txt",true);
                pw=new PrintWriter(fichero);
                pw.println(sqM);
            } catch (IOException ex1) {
                Logger.getLogger(IngresoDePedidos.class.getName()).log(Level.SEVERE, null, ex1);
            }finally{
                         try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
            }
        }
        comprobante.setMontoTotal(montoTotal);
        int noFacturar=0;
        if(this.jCheckBox2.isSelected()){
            comprobante.setPagado(1);
        }else{
            comprobante.setPagado(0);
            /*
             * ACA DEBO COMPROBAR EL LIMITE DEL CLIENTE Y SI LO SUPERA LA COMPRA RECHAZAR LA VENTA
             * 
             */
            Double limite=cliT.getCupoDeCredito();
            Double saldo=cliT.getSaldo();
            Double totalGral=montoTotal + saldo;
            if(limite < totalGral)noFacturar=1;
            
        }
        if(noFacturar==0){
        Facturar fat=new Comprobantes();
        fat.guardar(comprobante);
        /*
         * ACA DEVO LIMPIAR TODOS LOS CAMPOS Y VARIABLES DE LA PANTALLA
         * 
         */
        //comp.setTipoComprobante(comprobanteTipo);
        //comp.setMontoTotal(montoTotal);
        detalleDelPedido.clear();
        agregarRenglonTabla();
        this.jCheckBox2.setSelected(true);
        //this.jCheckBox2.setEnabled(false);
        this.jTable2.removeAll();
        listadoDeBusqueda.clear();
        cargarLista(listadoDeBusqueda);
        cliT=new Clientes("999999");
        this.jLabel6.setText(cliT.getRazonSocial());
        this.jTextField2.setText("");
        jTextField1.setText("");
        jTextField1.requestFocus();
        
        }else{
            JOptionPane.showMessageDialog(this,"El cliente supera el límite de crédito, debe abonar la venta");
            noFacturar=0;
        }
        }
        if(evt.getKeyCode()==KeyEvent.VK_F3)this.jComboBox2.requestFocus();
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double cantt=Double.parseDouble(this.jTextField2.getText());
            Double precioUni=0.00;
            if(cantt < 1000){
            if(arti.getModificaPrecio()){
                this.jTextField4.requestFocus();
            }else{
                if(arti.getPrecioServicio()>0){
                 this.jTextField4.requestFocus();   
                }else{
                    Articulos articul=new Articulos();
                    articul.setCantidad(cantt);
                    articul.setCodigoAsignado(arti.getCodigoAsignado());
                    
                    articul.setCodigoDeBarra(arti.getCodigoDeBarra());
                    articul.setDescripcionArticulo(arti.getDescripcionArticulo());
                    articul.setNumeroId(arti.getNumeroId());
                    articul.setPrecioDeCosto(arti.getPrecioDeCosto());
                    articul.setPrecioUnitario(arti.getPrecioUnitarioNeto());
                    articul.setPrecioUnitarioNeto(arti.getPrecioUnitarioNeto());
                    articul.setIdCombo(arti.getIdCombo());
                    articul.setCombo(arti.getCombo());
            detalleDelPedido.add(articul);
            agregarRenglonTabla();
//                Double montoTotalX=(arti.getPrecioUnitario() * arti.getCantidad());
//                montoTotal=montoTotal + montoTotalX;
                 montrarMonto();
                 //System.err.println("MONTO TOTAL "+montoTotal);
                 this.jLabel8.setText("");
                 this.jTable2.removeAll();
                this.jButton1.setVisible(true);
            jTextField1.setText(valorCargado);
            this.jTextField5.selectAll();
            this.jTextField2.setText("");
            this.jTextField5.requestFocus();
                }
                }
            }else{
                JOptionPane.showMessageDialog(this,"LA CANTIDAD INGRESADA ES EXCESIVA, POR FAVOR VERIFÍQUELA");
            }
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        detalleDelPedido.clear();
        listadoDeBusqueda.clear();
        montoTotal=0.00;
    }//GEN-LAST:event_formComponentHidden

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        detalleDelPedido.clear();
        listadoDeBusqueda.clear();
        montoTotal=0.00;
    }//GEN-LAST:event_formInternalFrameClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //verificar();
        //Impresora imp=new Impresora();        
        String cadena=cliT.getCodigoCliente()+" - "+cliT.getRazonSocial()+"\n"+cliT.getDireccion();
        //comp.setCliente(cliT);
        //VisorDeHojaDeRuta
        
        //comp.setVendedor(VisorDeHojaDeRuta.tG.getOperador());
        if(this.jCheckBox1.isSelected()){
        //    comp.setReparto(1);
        //    comp.setEntrega(String.valueOf(this.jTextField3.getText()));
        }
        
        //comp.setArticulos(detalleDelPedido);
        DecimalFormat fr=new DecimalFormat("00");
        Calendar c1=Calendar.getInstance();
	Calendar c2=new GregorianCalendar();
	String dia=Integer.toString(c2.get(Calendar.DAY_OF_MONTH));
	String mes=Integer.toString(c2.get(Calendar.MONTH));
	String ano=Integer.toString(c2.get(Calendar.YEAR));
	
        int da=Integer.parseInt(dia);
        int me=Integer.parseInt(mes);
        me++;
        dia=fr.format(da);
        mes=fr.format(me);
        String fecha=dia+"/"+mes+"/"+ano;
        String fecha2=ano+"-"+mes+"-"+dia;
        //comp.setFechaComprobante(fecha2);
        //comp.setFechaComprobante(fecha);
        int comprobanteTipo=cliT.getTipoComprobante();
        
        
        Comprobantes comprobante=new Comprobantes();
        comprobante.setFe(true);
        comprobante.setCliente(cliT);
        comprobante.setTipoMovimiento(1);
        comprobante.setTipoComprobante(comprobanteTipo);
        comprobante.setFechaEmision((Date.valueOf(fecha2)));
        comprobante.setListadoDeArticulos(detalleDelPedido);
        comprobante.setUsuarioGenerador(Inicio.usuario.getNumero());
        comprobante.setIdSucursal(Inicio.sucursal.getNumero());
        comprobante.setIdDeposito(Inicio.deposito.getNumero());
        Integer numeroCaja=Inicio.caja.getNumero();
        //System.out.println("EL NUMERO DE CAJA ESSSSSSSS "+numeroCaja);
        comprobante.setIdCaja(numeroCaja);
        if(montoTotal == 0.00){
            String sqM="usuario :"+Inicio.usuario.getNombre()+" sucursal "+Inicio.sucursal.getNumero()+" idcaja "+Inicio.caja.getNumero();
            JOptionPane.showMessageDialog(this,"OJO EL MONTO DE ESTE COMPROBANTE ES $ 0, AVISE PARA DETECTAR EL ERROR");
            FileWriter fichero=null;
            PrintWriter pw=null;
            try {
                fichero = new FileWriter("C:\\Gestion\\"+Inicio.fechaDia+" - errores en comprobantes.txt",true);
                pw=new PrintWriter(fichero);
                pw.println(sqM);
            } catch (IOException ex1) {
                Logger.getLogger(IngresoDePedidos.class.getName()).log(Level.SEVERE, null, ex1);
            }finally{
                         try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
            }
        }
        comprobante.setMontoTotal(montoTotal);
        int noFacturar=0;
        if(this.jCheckBox2.isSelected()){
            comprobante.setPagado(1);
        }else{
            comprobante.setPagado(0);
            /*
            * ACA DEBO COMPROBAR EL LIMITE DEL CLIENTE Y SI LO SUPERA LA COMPRA RECHAZAR LA VENTA
            *
            */
            Double limite=cliT.getCupoDeCredito();
            //Double saldo=cliT.getSaldo();
            //Double totalGral=montoTotal + saldo;
            Double totalGral=montoTotal;
            if(limite < totalGral)noFacturar=1;
            
        }
        if(noFacturar==0){
        Facturar fat=new Comprobantes();
        comprobante=(Comprobantes)fat.guardar(comprobante);
        // aqui hago el envio a factura  electronica, si aprueba no imprime
        
        FacturaElectronica fe=new FacturaElectronica();
        try {
            
           fe=(FacturaElectronica) fe.leer(comprobante);
           if(fe.getRespuesta().equals("OK")){
               //JOptionPane.showMessageDialog(this,"aprobada id: "+fe.getId());
               pdfsJavaGenerador pdf=new pdfsJavaGenerador();
               pdf.setDoc(fe);
               pdf.setCliente(cliT);
               pdf.run();
              /*         
        ImprimirFactura imprimir=new ImprimirFactura();
            try {
                imprimir.ImprimirFactura(comprobante.getNumero(),comprobante.getTipoComprobante());
            } catch (IOException ex) {
                Logger.getLogger(IngresoDeFacturas.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
            
           }else{
               if(fe.getRespuesta().equals("PARAMETROS"))JOptionPane.showMessageDialog(this,"Error en los parametros del cliente, modifiquelos en cae pendientes");
                              JOptionPane.showMessageDialog(this,"error en la coneccion, intentelo mas tarde");
           }
        } catch (IOException ex) {
            Logger.getLogger(IngresoDeFacturas.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(IngresoDeFacturas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(IngresoDeFacturas.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
         * ACA DEBO LIMPIAR TODOS LOS CAMPOS Y VARIABLES DE LA PANTALLA
         * 
         */
        //comp.setTipoComprobante(comprobanteTipo);
        //comp.setMontoTotal(montoTotal);
        detalleDelPedido.clear();
        agregarRenglonTabla();
        this.jCheckBox2.setSelected(true);
        //this.jCheckBox2.setEnabled(false);
        this.jTable2.removeAll();
        listadoDeBusqueda.clear();
        cargarLista(listadoDeBusqueda);
        //cliT=new Clientes("99");
        this.jLabel6.setText(cliT.getRazonSocial());
        this.jTextField2.setText("");
        jTextField1.setText("");
        jTextField1.requestFocus();
        }else{
            JOptionPane.showMessageDialog(this,"El cliente supera el límite de crédito, debe abonar la venta");
            noFacturar=0;
        }
         
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int posicion=this.jTable1.getSelectedRow();
        detalleDelPedido.remove(posicion);
        //detalleDelPedido.clear();
        agregarRenglonTabla();
        jTextField1.setText("");
        jTextField1.requestFocus();
        //listadoDeBusqueda.clear();
        //montoTotal=0.00;        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SeleccionDeClientes selCli=new SeleccionDeClientes();
        Inicio.jDesktopPane1.add(selCli);
        selCli.setVisible(true);
        selCli.toFront();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jTextField5.requestFocus();
    }//GEN-LAST:event_formComponentShown

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        NuevoCliente nCli=new NuevoCliente();
        Inicio.jDesktopPane1.add(nCli);
        nCli.setVisible(true);
        nCli.toFront();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Double servicio;
            //Articulos articuloss=new Articulos();
            if(this.jCheckBox1.isSelected()){
                servicio=arti.getPrecioServicio();
            }else{
                servicio=0.00;
            }
            if(arti.getModificaPrecio())servicio=Numeros.ConvertirStringADouble(String.valueOf(this.jTextField4.getText()));
            Double tota=arti.getPrecioUnitarioNeto() + servicio;
            //arti.setPrecioUnitarioNeto(tota);
            //arti.setPrecioServicio(servicio);
            Double cantt=Double.parseDouble(this.jTextField2.getText());
            Articulos articul=new Articulos();
                    articul.setCantidad(cantt);
                    articul.setCodigoAsignado(arti.getCodigoAsignado());
                    articul.setPrecioServicio(servicio);
                    articul.setCodigoDeBarra(arti.getCodigoDeBarra());
                    articul.setDescripcionArticulo(arti.getDescripcionArticulo());
                    articul.setNumeroId(arti.getNumeroId());
                    articul.setPrecioDeCosto(arti.getPrecioDeCosto());
                    articul.setPrecioUnitario(arti.getPrecioUnitarioNeto());
                    articul.setPrecioUnitarioNeto(tota);
                    articul.setModificaPrecio(arti.getModificaPrecio());
                    articul.setIdCombo(arti.getIdCombo());
                    articul.setCombo(arti.getCombo());
                        detalleDelPedido.add(articul);
            agregarRenglonTabla();
//                Double montoTotalX=(arti.getPrecioUnitario() * arti.getCantidad());
//                montoTotal=montoTotal + montoTotalX;
                 montrarMonto();
                 //System.err.println("MONTO TOTAL "+montoTotal);
                 this.jLabel8.setText("");
                 this.jTable2.removeAll();
                this.jButton1.setVisible(true);
            this.jTextField1.setText("");
            this.jTextField2.setText("");
            this.jTextField1.requestFocus();
            this.jLabel7.setVisible(false);
            this.jTextField4.setVisible(false);
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
       this.jTextField4.requestFocus();
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    //MODIFICAR PRECIO
      int posicion=this.jTable1.getSelectedRow();
      Articulos pedidos;
        pedidos=(Articulos)detalleDelPedido.get(posicion);
        Double precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el nuevo valor unitario s/iva",pedidos.getPrecioUnitarioNeto()));
        pedidos.setPrecioUnitarioNeto(precio);
//detalleDelPedido.clear();
        agregarRenglonTabla();
        System.out.println("total "+montoTotal);
        montrarMonto();
        jTextField1.setText("");
        jTextField1.requestFocus();
          
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            rubro=new Rubros();
            Rubrable subRuble=new SubRubros();
            Iterator iR=listadoR.listIterator();
            while(iR.hasNext()){
                rubro=(Rubros)iR.next();
                listadoSubRubros=subRuble.listarPorRubro(rubro.getId());
            }
            Modificable modiA=new Articulos();
            Articulable modi=new ArticulosAsignados();
            listadoDeBusqueda=modi.convertirListadoEnArticulos(modi.filtrador(listadoSubRubros, listadoR, cliT));
            //listadoDeBusqueda=modi.filtrador(listadoSubRubros,listadoR);
            this.jTable2.setModel(modiA.mostrarListadoBusqueda(listadoDeBusqueda));
            columnaCodigo=this.jTable2.getColumn("Precio");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
                columnaCodigo=this.jTable2.getColumn("Stock");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
            this.jLabel10.setVisible(true);
            this.jComboBox2.setVisible(true);
            this.jComboBox2.setModel(subRuble.mostrarEnBox(listadoSubRubros));
            jTextField1.selectAll();
            jTextField1.requestFocus();
        }else{
            String rub=this.jTextField5.getText();

            listadoR=ruble.buscar(rub);

            //this.jTable2.setModel(ruble.mostrarEnCombo(listadoR));
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jComboBox2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBox2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            subRubro=(SubRubros)listadoSubRubros.get(this.jComboBox2.getSelectedIndex());
            listadoSubRubros.clear();
            listadoSubRubros.add(subRubro);
            this.jTable2.removeAll();
            Modificable modiA=new Articulos();
            Articulable modi=new ArticulosAsignados();
            listadoDeBusqueda=modi.convertirListadoEnArticulos(modi.filtradorDeFormularios(listadoSubRubros, listadoR, cliT,jTextField1.getText()));
            //listadoDeBusqueda=modi.filtrador(listadoSubRubros,listadoR);
            this.jTable2.setModel(modiA.mostrarListadoBusqueda(listadoDeBusqueda));
            columnaCodigo=this.jTable2.getColumn("Precio");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
                columnaCodigo=this.jTable2.getColumn("Stock");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
            this.jTextField1.requestFocus();
        }

    }//GEN-LAST:event_jComboBox2KeyPressed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            int posicion=this.jTable2.getSelectedRow();
            arti=(Articulos)listadoDeBusqueda.get(posicion);
            //System.err.println("ARTICULO SELECCIONADO :"+arti.getDescripcionArticulo()+" "+arti.getCodigoDeBarra());
            String codBar=arti.getCodigoDeBarra();
            jTextField1.setText(codBar.trim());

            this.jLabel8.setText(arti.getDescripcionArticulo());

            this.jTextField1.requestFocus();

        }
    }//GEN-LAST:event_jTable2KeyPressed
private void cargarLista(ArrayList lista){
    DefaultTableModel modelo=new DefaultTableModel();
    Iterator il=lista.listIterator();
    Articulos art=new Articulos();
    modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        Object [] fila=new Object[3];
        while(il.hasNext()){
            art=(Articulos)il.next();
            fila[0]=art.getDescripcionArticulo();
            fila[1]=" $"+Numeros.ConvertirNumero(art.getPrecioUnitarioNeto());
            fila[2]=String.valueOf(art.getStockActual());
            //modelo.addElement(articulo.getDescripcionArticulo()+" $"+Numeros.ConvertirNumero(articulo.getPrecioUnitarioNeto()));
            modelo.addRow(fila);
        }
    
    
    this.jTable2.setModel(modelo);
            columnaCodigo=this.jTable2.getColumn("Precio");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
                columnaCodigo=this.jTable2.getColumn("Stock");
        columnaCodigo.setPreferredWidth(60);
        columnaCodigo.setMaxWidth(60);
}
private void agregarRenglonTabla(){
        MiModeloTablaFacturacion busC=new MiModeloTablaFacturacion();
        this.jTable1.removeAll();
        montoTotal=0.00;
        //ArrayList listadoPedidos=new ArrayList();
        this.jTable1.setModel(busC);
        Articulos pedidos;
        busC.addColumn("CODIGO");
        busC.addColumn("DESCRIPCION");
        busC.addColumn("CANTIDAD");
        busC.addColumn("PRECIO TOTAL");
        busC.addColumn("PRECIO UNITARIO S/IVA");
        busC.addColumn("COSTO");
        busC.addColumn("IVA");
        busC.addColumn("PRECIO FINAL");
        Object[] fila=new Object[8];
        Iterator irP=detalleDelPedido.listIterator();
        while(irP.hasNext()){
            pedidos=new Articulos();
            pedidos=(Articulos) irP.next();
            //fila[0]=pedidos.getCodigo();
            String codig=pedidos.getCodigoAsignado();
            String desc=pedidos.getDescripcionArticulo();
            String cant=String.valueOf(pedidos.getCantidad());
            
            fila[0]=codig;
            fila[1]=desc;
            fila[2]=cant;
            Double precioUnitario=pedidos.getPrecioUnitarioNeto();
            
            //precioUnitario=precioUnitario * cliT.getCoeficienteListaDeprecios();
            
            Double valor=precioUnitario * pedidos.getCantidad();
            //precioUnitario= pedidos.getPrecioUnitario() * cliT.getCoeficienteListaDeprecios();
            //Double valor=(pedidos.getCantidad() * precioUnitario);
            //valor=valor * cliT.getCoeficienteListaDeprecios();
            pedidos.setPrecioUnitario(valor);
            String val=Numeros.ConvertirNumero(valor);
            montoTotal=montoTotal + valor;
            //precioUnitario=precioUnitario * cliT.getCoeficienteListaDeprecios();
            fila[3]=val;
            fila[4]=Numeros.ConvertirNumero(precioUnitario);
            fila[5]=Numeros.ConvertirNumero(pedidos.getPrecioDeCosto());
            Double iva=valor * 0.21;
            fila[6]=Numeros.ConvertirNumero(iva);
            Double pFinal=valor + iva;
            fila[7]=Numeros.ConvertirNumero(pFinal);
            busC.addRow(fila);
        }
        columnaCodigo=this.jTable1.getColumn("CODIGO");
        columnaCodigo.setPreferredWidth(40);
        columnaCodigo.setMaxWidth(40);
        columnaCodigo=this.jTable1.getColumn("DESCRIPCION");
        columnaCodigo.setPreferredWidth(400);
        //columnaCodigo.setMaxWidth(400);
        columnaCodigo.setMinWidth(300);
        columnaCodigo=this.jTable1.getColumn("CANTIDAD");
        columnaCodigo.setPreferredWidth(80);
        columnaCodigo.setMaxWidth(80);
        montoTotal=montoTotal * 1.21;
        String total=String.valueOf(montoTotal);
        this.jLabel1.setText("TOTAL COTIZACION:  "+total);
        listadoDeBusqueda.clear();
        cargarLista(listadoDeBusqueda);
        this.jCheckBox1.setSelected(true);
        this.jCheckBox1.setVisible(false);
        if(detalleDelPedido.size()==0){
            this.jButton1.setEnabled(false);
        }else{
            this.jButton1.setEnabled(true);
        }
}
private void montrarMonto(){
    //System.err.println("DESCUENTO :"+cliT.getDescuento());
    String total1=Numeros.ConvertirNumero(montoTotal);
    String total="";
    if(cliT.getTipoIva()==1){
        String bruto=Numeros.ConvertirNumero( montoTotal /1.21);
        String iva=Numeros.ConvertirNumero(montoTotal * 0.21);
        total="<html>Bruto :"+bruto+" <br>IVA 21% "+iva+" <br>Neto "+total1+"</html>";
    }else{
        total="<html>Neto "+total1+"</html>";
    }
    //Double total=montoTotal * cliT.getDescuento();
    //comp.setMontoTotal(total);
    this.jLabel1.setText(total);
}
private void verificar(){
    int cantidad=this.jTable1.getRowCount();
    Articulos art=new Articulos();
    cantidad=cantidad - 1;
    for(int ah=0;ah < cantidad;ah++){
        
        art=(Articulos)detalleDelPedido.get(ah);
        //ah++;
        String descripcion=(String) this.jTable1.getValueAt(ah,1);
        art.setDescripcionArticulo(descripcion);
        String cant=String.valueOf(this.jTable1.getValueAt(ah, 2));
        Double cantida=Double.valueOf(cant).doubleValue();
        art.setCantidad(cantida);
        Double precioUni=(Double) this.jTable1.getValueAt(ah,3);
        Double tot=precioUni;
        art.setPrecioUnitario(tot);
        //montoTotal=montoTotal + tot;
        //System.err.println("nimero "+ah+" decripcion "+descripcion+" limite "+cantidad);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    public static javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
