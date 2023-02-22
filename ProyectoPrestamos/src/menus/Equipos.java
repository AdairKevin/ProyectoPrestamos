/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SPARTAN PC
 */
public class Equipos extends javax.swing.JPanel {
    
    int filaseleccionada;
    DefaultTableModel modelo = new DefaultTableModel();
    String dato;
    
    public Equipos() {
        initComponents();
        CConexion conectar = new CConexion();
        conectar.conectarInterfaz();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();
        txtNombreEquipo = new javax.swing.JLabel();
        tfEquipo = new javax.swing.JTextField();
        txtSerie = new javax.swing.JLabel();
        tfNumeroSerie = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JTextField();
        txtExtras = new javax.swing.JLabel();
        tfExtras = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtBuscarMatricula1 = new javax.swing.JLabel();
        tfBuscarEquipo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        setBackground(new java.awt.Color(242, 242, 242));

        tablaEquipos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEquiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEquipos);

        txtNombreEquipo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtNombreEquipo.setText("Nombre del equipo");

        tfEquipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEquipoActionPerformed(evt);
            }
        });

        txtSerie.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtSerie.setText("Numero de serie");

        tfNumeroSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfNumeroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroSerieActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtDescripcion.setText("Descripcion");

        tfDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescripcionActionPerformed(evt);
            }
        });

        txtExtras.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txtExtras.setText("Extras");

        tfExtras.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfExtrasActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtBuscarMatricula1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtBuscarMatricula1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtBuscarMatricula1.setText("EQUIPOS");

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtExtras)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBuscarMatricula1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(172, 172, 172))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(275, 275, 275)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar)
                                    .addComponent(tfBuscarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(64, 64, 64)
                                    .addComponent(tfEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(txtBuscarMatricula1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreEquipo))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerie)
                            .addComponent(tfNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExtras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfBuscarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaEquiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquiposMouseClicked
        
    }//GEN-LAST:event_tablaEquiposMouseClicked

    private void tfEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEquipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEquipoActionPerformed

    private void tfNumeroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNumeroSerieActionPerformed

    private void tfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescripcionActionPerformed

    private void tfExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfExtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfExtrasActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        PreparedStatement ps = null;
        if (tfEquipo.getText().isEmpty() ||tfEquipo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ingresar datos");

        }else{ try {
            CConexion objCon = new CConexion();
            Connection conn = objCon.getConexion();
            ps = conn.prepareStatement("INSERT INTO equipos (nombre_eq, num_serie_eq, descripcion_eq, extras)VALUES(?,?,?,?)");
            ps.setString(1, tfEquipo.getText());
            ps.setString(2, tfNumeroSerie.getText());
            ps.setString(3, tfDescripcion.getText());
            ps.setString(4, tfExtras.getText());
            ps.execute();

            JOptionPane.showMessageDialog(null, "Registro guardado");
            Object[] fila = new Object[9];
            fila[0] = tfEquipo.getText();
            fila[1] = tfNumeroSerie.getText();
            fila[2] = tfDescripcion.getText();
            fila[3] = tfExtras.getText();
            modelo.addRow(fila);

            limpiar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro no guardado");
            System.out.println(ex);
        }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        int Fila = tablaEquipos.getSelectedRow();

        PreparedStatement ps = null;
        try {
            CConexion objCon = new CConexion();
            Connection conn = objCon.getConexion();
            ps = conn.prepareStatement("UPDATE equipos SET  nombre_eq=?, num_serie_eq=?, descripcion_eq=?, extras=?");

            ps.setString(1, tfEquipo.getText());
            ps.setString(2, tfNumeroSerie.getText());
            ps.setString(3, tfDescripcion.getText());
            ps.setString(4, tfExtras.getText());

            ps.execute();

            JOptionPane.showMessageDialog(null, "Registro Modificado");
            tablaEquipos.setValueAt(tfEquipo.getText(), Fila, 0);
            tablaEquipos.setValueAt(tfNumeroSerie.getText(), Fila, 1);
            tablaEquipos.setValueAt(tfDescripcion.getText(), Fila, 2);
            tablaEquipos.setValueAt(tfExtras.getText(), Fila, 3);

            limpiar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro no modificado");
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        PreparedStatement ps = null;
        try {

            CConexion objCon = new CConexion();
            Connection conn = objCon.getConexion();

            int Fila = tablaEquipos.getSelectedRow();
            String nombre = tablaEquipos.getValueAt(Fila, 0).toString();

            ps = conn.prepareStatement("DELETE FROM equipos WHERE  nombre_equipo=?");
            ps.setString(1, nombre);
            ps.execute();

            modelo.removeRow(Fila);
            JOptionPane.showMessageDialog(null, "Registro eliminado");
            limpiar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Registro no eliminado");
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
    
    private void buscar(String buscar){
    Equipos p=new Equipos();

    DefaultTableModel modelo=p.Buscarper(buscar);
    tablaEquipos.setModel(modelo);
    }
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar(tfBuscarEquipo.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void limpiar() {
        tfEquipo.setText("");
        tfNumeroSerie.setText("");
        tfDescripcion.setText("");
        tfExtras.setText("");
    }
    
    public DefaultTableModel Buscarper(String buscar){
    String [] nombreColumna = {"nombre_eq", "num_serie_eq", "descripcion_eq", "extras"};
    String [] registros = new String[3];
    DefaultTableModel modelo = new DefaultTableModel (null, nombreColumna);
    
    String sql="select nombre_eq, num_serie_eq, descripcion_eq, extras from equipos where nombre_eq='"+buscar+"'";
    
     PreparedStatement pst=null;
     ResultSet rs=null;
     
     try{
     CConexion con = new CConexion();
     java.sql.Connection cc=con.getConexion();
     pst=cc.prepareStatement(sql);
     rs=pst.executeQuery();
     while(rs.next()){
     registros[0]=rs.getString("nombre_eq");
     registros[1]=rs.getString("num_serie_eq");
     registros[2]=rs.getString("descripcion_eq");
     registros[3]=rs.getString("extras");
     modelo.addRow(registros);
     }
     }catch(Exception e){
     System.out.println(e);
     }
     return modelo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTextField tfBuscarEquipo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfEquipo;
    private javax.swing.JTextField tfExtras;
    private javax.swing.JTextField tfNumeroSerie;
    private javax.swing.JLabel txtBuscarMatricula1;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtExtras;
    private javax.swing.JLabel txtNombreEquipo;
    private javax.swing.JLabel txtSerie;
    // End of variables declaration//GEN-END:variables
}
