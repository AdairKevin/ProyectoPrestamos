package features.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import typography.Fonts;

public class Equipos extends javax.swing.JPanel {

    Fonts fontType = new Fonts();
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
        jPanel1 = new javax.swing.JPanel();
        tfBuscarEquipo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 248, 255));
        setMaximumSize(new java.awt.Dimension(980, 691));
        setMinimumSize(new java.awt.Dimension(980, 691));
        setPreferredSize(new java.awt.Dimension(980, 691));

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

        txtNombreEquipo.setFont(fontType.fuente(fontType.lato,0,20));
        txtNombreEquipo.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreEquipo.setText("Nombre del equipo");

        tfEquipo.setBackground(new java.awt.Color(255, 255, 255));
        tfEquipo.setFont(fontType.fuente(fontType.lato,0,12));
        tfEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEquipoActionPerformed(evt);
            }
        });

        txtSerie.setFont(fontType.fuente(fontType.lato,0,20));
        txtSerie.setForeground(new java.awt.Color(0, 0, 0));
        txtSerie.setText("Numero de serie");

        tfNumeroSerie.setBackground(new java.awt.Color(255, 255, 255));
        tfNumeroSerie.setFont(fontType.fuente(fontType.lato,0,12));
        tfNumeroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroSerieActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(fontType.fuente(fontType.lato,0,20));
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        txtDescripcion.setText("Descripcion");

        tfDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        tfDescripcion.setFont(fontType.fuente(fontType.lato,0,12));
        tfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescripcionActionPerformed(evt);
            }
        });

        txtExtras.setFont(fontType.fuente(fontType.lato,0,20));
        txtExtras.setForeground(new java.awt.Color(0, 0, 0));
        txtExtras.setText("Extras");

        tfExtras.setBackground(new java.awt.Color(255, 255, 255));
        tfExtras.setFont(fontType.fuente(fontType.lato,0,12));
        tfExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfExtrasActionPerformed(evt);
            }
        });

        btnGuardar.setFont(fontType.fuente(fontType.lato,0,20));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusable(false);
        btnGuardar.setRequestFocusEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setFont(fontType.fuente(fontType.lato,0,20));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btnModificar.setContentAreaFilled(false);
        btnModificar.setFocusable(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(fontType.fuente(fontType.lato,0,20));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusable(false);
        btnEliminar.setOpaque(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 237, 255));

        tfBuscarEquipo.setBackground(new java.awt.Color(255, 255, 255));
        tfBuscarEquipo.setFont(fontType.fuente(fontType.lato,0,12));

        btnBuscar.setFont(fontType.fuente(fontType.lato,0,20));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setOpaque(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tfBuscarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tfBuscarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEquipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtNombreEquipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNumeroSerie, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtSerie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEquipo)
                            .addComponent(txtSerie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(txtDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtExtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfExtras, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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

    private void buscar(String buscar) {
        Equipos p = new Equipos();

        DefaultTableModel modelo = p.Buscarper(buscar);
        tablaEquipos.setModel(modelo);
    }

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar(tfBuscarEquipo.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        PreparedStatement ps = null;
        if (tfEquipo.getText().isEmpty() || tfEquipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresar datos");

        } else {
            try {
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

    private void limpiar() {
        tfEquipo.setText("");
        tfNumeroSerie.setText("");
        tfDescripcion.setText("");
        tfExtras.setText("");
    }

    public DefaultTableModel Buscarper(String buscar) {
        String[] nombreColumna = {"nombre_eq", "num_serie_eq", "descripcion_eq", "extras"};
        String[] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, nombreColumna);

        String sql = "select nombre_eq, num_serie_eq, descripcion_eq, extras from equipos where nombre_eq='" + buscar + "'";

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            CConexion con = new CConexion();
            java.sql.Connection cc = con.getConexion();
            pst = cc.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("nombre_eq");
                registros[1] = rs.getString("num_serie_eq");
                registros[2] = rs.getString("descripcion_eq");
                registros[3] = rs.getString("extras");
                modelo.addRow(registros);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTextField tfBuscarEquipo;
    private javax.swing.JTextField tfDescripcion;
    private javax.swing.JTextField tfEquipo;
    private javax.swing.JTextField tfExtras;
    private javax.swing.JTextField tfNumeroSerie;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtExtras;
    private javax.swing.JLabel txtNombreEquipo;
    private javax.swing.JLabel txtSerie;
    // End of variables declaration//GEN-END:variables
}
