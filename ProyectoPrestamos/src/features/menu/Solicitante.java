package features.menu;

import typography.Fonts;
import utils.ComboBoxStyle;

public class Solicitante extends javax.swing.JPanel {

    Fonts fontType = new Fonts();

    public Solicitante() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JLabel();
        tfApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JLabel();
        tfApellidoMaterno = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JLabel();
        tfMatricula = new javax.swing.JTextField();
        txtTipoSolicitante = new javax.swing.JLabel();
        cbSolicitante = new javax.swing.JComboBox<>();
        jScrollPane = new javax.swing.JScrollPane();
        tablaSolicitante = new javax.swing.JTable();
        txtCoordinacion = new javax.swing.JLabel();
        cbCoordinacion = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tfBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setBackground(new java.awt.Color(246, 248, 255));
        setMaximumSize(new java.awt.Dimension(980, 691));
        setMinimumSize(new java.awt.Dimension(980, 691));

        txtNombre.setFont(fontType.fuente(fontType.lato,0,20));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setText("Nombre");

        tfNombre.setBackground(new java.awt.Color(255, 255, 255));
        tfNombre.setFont(fontType.fuente(fontType.lato,0,12));
        tfNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfNombre.setPreferredSize(new java.awt.Dimension(252, 24));

        txtApellidoPaterno.setFont(fontType.fuente(fontType.lato,0,20));
        txtApellidoPaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoPaterno.setText("Apellido paterno");

        tfApellidoPaterno.setBackground(new java.awt.Color(255, 255, 255));
        tfApellidoPaterno.setFont(fontType.fuente(fontType.lato,0,12));
        tfApellidoPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtApellidoMaterno.setFont(fontType.fuente(fontType.lato,0,20));
        txtApellidoMaterno.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidoMaterno.setText("Apellido materno");

        tfApellidoMaterno.setBackground(new java.awt.Color(255, 255, 255));
        tfApellidoMaterno.setFont(fontType.fuente(fontType.lato,0,12));
        tfApellidoMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtMatricula.setFont(fontType.fuente(fontType.lato,0,20));
        txtMatricula.setForeground(new java.awt.Color(0, 0, 0));
        txtMatricula.setText("Matrícula");

        tfMatricula.setBackground(new java.awt.Color(255, 255, 255));
        tfMatricula.setFont(fontType.fuente(fontType.lato,0,12));
        tfMatricula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatriculaActionPerformed(evt);
            }
        });

        txtTipoSolicitante.setFont(fontType.fuente(fontType.lato,0,20));
        txtTipoSolicitante.setForeground(new java.awt.Color(0, 0, 0));
        txtTipoSolicitante.setText("Tipo Solicitante");

        cbSolicitante.setBackground(new java.awt.Color(255, 255, 255));
        cbSolicitante.setFont(fontType.fuente(fontType.lato,0,12));
        cbSolicitante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Estudiante", "Profesor" }));
        cbSolicitante.setToolTipText("");
        cbSolicitante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cbSolicitante.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbSolicitante.setFocusable(false);
        cbSolicitante.setPreferredSize(new java.awt.Dimension(158, 24));

        tablaSolicitante.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tablaSolicitante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaSolicitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSolicitanteMouseClicked(evt);
            }
        });
        jScrollPane.setViewportView(tablaSolicitante);

        txtCoordinacion.setFont(fontType.fuente(fontType.lato,0,20));
        txtCoordinacion.setForeground(new java.awt.Color(0, 0, 0));
        txtCoordinacion.setText("Coordinación");

        cbCoordinacion.setBackground(new java.awt.Color(255, 255, 255));
        cbCoordinacion.setFont(fontType.fuente(fontType.lato,0,12));
        cbCoordinacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Ingeniería", "CPD", "N/A" }));
        cbCoordinacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cbCoordinacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbCoordinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCoordinacionActionPerformed(evt);
            }
        });

        btnEliminar.setFont(fontType.fuente(fontType.lato,0,20));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setFocusable(false);
        btnEliminar.setPreferredSize(new java.awt.Dimension(129, 47));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(fontType.fuente(fontType.lato,0,20));
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnModificar.setContentAreaFilled(false);
        btnModificar.setFocusable(false);
        btnModificar.setPreferredSize(new java.awt.Dimension(129, 47));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(fontType.fuente(fontType.lato,0,20));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setFocusCycleRoot(true);
        btnGuardar.setFocusable(false);
        btnGuardar.setPreferredSize(new java.awt.Dimension(129, 47));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 237, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(229, 456));

        tfBuscar.setBackground(new java.awt.Color(255, 255, 255));
        tfBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBuscarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(fontType.fuente(fontType.lato,0,20));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 211, 211)));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setFocusable(false);
        btnBuscar.setPreferredSize(new java.awt.Dimension(129, 47));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfBuscar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(tfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfMatricula)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTipoSolicitante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(7, 7, 7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtCoordinacion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbCoordinacion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfApellidoPaterno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(52, 52, 52))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTipoSolicitante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellidoPaterno)
                                    .addComponent(txtApellidoMaterno))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(201, 201, 201))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMatricula)
                                    .addComponent(txtCoordinacion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbCoordinacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        cbSolicitante.setUI(new ComboBoxStyle());
        cbCoordinacion.setUI(new ComboBoxStyle());
    }// </editor-fold>//GEN-END:initComponents

    private void tfMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMatriculaActionPerformed

    private void tablaSolicitanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSolicitanteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaSolicitanteMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cbCoordinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCoordinacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCoordinacionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbCoordinacion;
    private javax.swing.JComboBox<String> cbSolicitante;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable tablaSolicitante;
    private javax.swing.JTextField tfApellidoMaterno;
    private javax.swing.JTextField tfApellidoPaterno;
    private javax.swing.JTextField tfBuscar;
    private javax.swing.JTextField tfMatricula;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JLabel txtApellidoMaterno;
    private javax.swing.JLabel txtApellidoPaterno;
    private javax.swing.JLabel txtCoordinacion;
    private javax.swing.JLabel txtMatricula;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtTipoSolicitante;
    // End of variables declaration//GEN-END:variables
}
