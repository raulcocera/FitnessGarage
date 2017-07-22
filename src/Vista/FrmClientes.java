/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.AdminBaseDatos;
import Modelo.Cliente;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Michelt
 */
public class FrmClientes extends javax.swing.JFrame {

    /**
     * Creates new form FrmClientes
     */
    
    private DefaultTableModel modelo;
    private AdminBaseDatos conexion;
    private FrmMenu frmMenu;
    
    public FrmClientes(AdminBaseDatos conexion, FrmMenu frmMenu) {
        initComponents();
        this.conexion=conexion;
        this.frmMenu = frmMenu;
        this.setTablaCliente(conexion.getClientes());
        tblClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//        JTableHeader header = tblClientes.getTableHeader();
//        header.setBackground(Color.red);
        
        this.modelo = (DefaultTableModel) tblClientes.getModel();
        tblClientes.setDefaultRenderer(Object.class, new MyCellRenderer());
        //modelo.setRowColor(0, Color.RED);
        
    }
    
    public void escuchar(ActionListener manejador){
         this.btnSalir.addActionListener(manejador);
    }
    
    public void setTablaCliente(ArrayList<Cliente> clientes){
       DefaultTableModel modelo = (DefaultTableModel) this.tblClientes.getModel();
       for(Cliente cliente: clientes){
            Object[] tmp={cliente.getIdCliente(),cliente.getDiasVencimiento(),cliente.getNombreCliente(),cliente.getPrimerApellido(),cliente.getSegundoApellido(),
            cliente.getCedula(),cliente.getTelefono(),cliente.getDireccion(),cliente.getEmail(),cliente.getFechaIngreso(),
            cliente.getFechaPago(),cliente.getFechaSigPago(),cliente.getMorosidades(),cliente.getComentarios(),cliente.isTratoEspecial()};
            modelo.addRow(tmp);
       }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 388));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 0));
        jLabel1.setText("Clientes");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Clientes", "Días restantes para vencimiento", "Nombre", "Primer Apellido", "Segundo Apellido", "Cedula", "Telefono", "Dirección", "E-mail", "Fecha de Ingreso", "Fecha de Pago", "Fecha del próximo pago", "Morosidades", "Comentarios", "Trato Especial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblClientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(120);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(110);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(110);
            tblClientes.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(7).setPreferredWidth(330);
            tblClientes.getColumnModel().getColumn(8).setPreferredWidth(140);
            tblClientes.getColumnModel().getColumn(9).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(10).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(11).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(12).setPreferredWidth(150);
            tblClientes.getColumnModel().getColumn(13).setPreferredWidth(200);
            tblClientes.getColumnModel().getColumn(14).setPreferredWidth(100);
        }

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    // End of variables declaration//GEN-END:variables
}
