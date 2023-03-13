package features.menu;

import features.menu.Home;
import features.menu.Equipos;
import features.menu.Empleados;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);

        Home p1 = new Home();
        p1.setSize(980, 691);
        p1.setLocation(0, 0);

        container.removeAll();
        container.add(p1, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();

        txtUser.setText("Usuario: Adair");

        CConexion conectar = new CConexion();
        conectar.conectarInterfaz();
        txtStatus.setForeground(Color.green);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        txtMenu = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        panelHome = new utils.PanelRound();
        txtHome = new javax.swing.JLabel();
        icHome = new javax.swing.JLabel();
        panelUsuario = new utils.PanelRound();
        icUsuarios = new javax.swing.JLabel();
        panelEmpleados = new utils.PanelRound();
        txtEmpleados = new javax.swing.JLabel();
        icEmpleados = new javax.swing.JLabel();
        panelSolicitante = new utils.PanelRound();
        txtSolicitante = new javax.swing.JLabel();
        icSolicitante = new javax.swing.JLabel();
        panelEquipos = new utils.PanelRound();
        icEquipos = new javax.swing.JLabel();
        txtEquipos = new javax.swing.JLabel();
        panelPrestamoSolicitante = new utils.PanelRound();
        txtPrestamos = new javax.swing.JLabel();
        icPrestamos = new javax.swing.JLabel();
        txt_Prestamo = new javax.swing.JLabel();
        txt_Registro = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        txtStatus = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        Menu.setBackground(new java.awt.Color(77, 77, 196));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setMaximumSize(new java.awt.Dimension(300, 691));
        Menu.setMinimumSize(new java.awt.Dimension(300, 691));
        Menu.setPreferredSize(new java.awt.Dimension(300, 691));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMenu.setBackground(new java.awt.Color(242, 242, 242));
        txtMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtMenu.setForeground(new java.awt.Color(255, 255, 255));
        txtMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMenu.setText("MENU");
        Menu.add(txtMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 60));

        jPanelHome.setOpaque(false);

        panelHome.setBackground(new java.awt.Color(77, 77, 196));
        panelHome.setRoundBottomLeft(20);
        panelHome.setRoundBottomRight(20);
        panelHome.setRoundTopLeft(20);
        panelHome.setRoundTopRight(20);
        panelHome.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelHomeMouseMoved(evt);
            }
        });
        panelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelHomeMousePressed(evt);
            }
        });

        txtHome.setBackground(new java.awt.Color(242, 242, 242));
        txtHome.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtHome.setForeground(new java.awt.Color(255, 255, 255));
        txtHome.setText("Home");
        txtHome.setName(""); // NOI18N
        txtHome.setPreferredSize(new java.awt.Dimension(140, 30));

        icHome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-página-principal-25.png"))); // NOI18N

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icHome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtHome, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(icHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHomeLayout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelHomeLayout.createSequentialGroup()
                    .addGap(0, 5, Short.MAX_VALUE)
                    .addComponent(panelHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        Menu.add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, -1));

        panelUsuario.setBackground(new java.awt.Color(242, 242, 242));
        panelUsuario.setPreferredSize(new java.awt.Dimension(120, 120));
        panelUsuario.setRoundBottomLeft(100);
        panelUsuario.setRoundBottomRight(100);
        panelUsuario.setRoundTopLeft(100);
        panelUsuario.setRoundTopRight(100);
        panelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelUsuarioMouseClicked(evt);
            }
        });

        icUsuarios.setBackground(new java.awt.Color(242, 242, 242));
        icUsuarios.setForeground(new java.awt.Color(240, 240, 240));
        icUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-persona-de-sexo-masculino-94.png"))); // NOI18N

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icUsuarios)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icUsuarios)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Menu.add(panelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        panelEmpleados.setBackground(new java.awt.Color(77, 77, 196));
        panelEmpleados.setRoundBottomLeft(20);
        panelEmpleados.setRoundBottomRight(20);
        panelEmpleados.setRoundTopLeft(20);
        panelEmpleados.setRoundTopRight(20);
        panelEmpleados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelEmpleadosMouseMoved(evt);
            }
        });
        panelEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelEmpleadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelEmpleadosMousePressed(evt);
            }
        });

        txtEmpleados.setBackground(new java.awt.Color(242, 242, 242));
        txtEmpleados.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        txtEmpleados.setText("Empleados");
        txtEmpleados.setMaximumSize(null);
        txtEmpleados.setMinimumSize(null);
        txtEmpleados.setName(""); // NOI18N
        txtEmpleados.setPreferredSize(new java.awt.Dimension(140, 30));

        icEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-tarjeta-de-empleado-25 (1).png"))); // NOI18N

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(icEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(panelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 280, -1));

        panelSolicitante.setBackground(new java.awt.Color(77, 77, 196));
        panelSolicitante.setPreferredSize(new java.awt.Dimension(270, 30));
        panelSolicitante.setRoundBottomLeft(20);
        panelSolicitante.setRoundBottomRight(20);
        panelSolicitante.setRoundTopLeft(20);
        panelSolicitante.setRoundTopRight(20);
        panelSolicitante.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelSolicitanteMouseMoved(evt);
            }
        });
        panelSolicitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelSolicitanteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSolicitanteMousePressed(evt);
            }
        });

        txtSolicitante.setBackground(new java.awt.Color(242, 242, 242));
        txtSolicitante.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtSolicitante.setForeground(new java.awt.Color(255, 255, 255));
        txtSolicitante.setText("Solicitante");
        txtSolicitante.setMaximumSize(null);
        txtSolicitante.setMinimumSize(null);
        txtSolicitante.setName(""); // NOI18N
        txtSolicitante.setPreferredSize(new java.awt.Dimension(140, 30));

        icSolicitante.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icSolicitante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-colaborador-hombre-25.png"))); // NOI18N

        javax.swing.GroupLayout panelSolicitanteLayout = new javax.swing.GroupLayout(panelSolicitante);
        panelSolicitante.setLayout(panelSolicitanteLayout);
        panelSolicitanteLayout.setHorizontalGroup(
            panelSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSolicitanteLayout.setVerticalGroup(
            panelSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(icSolicitante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(panelSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 280, -1));

        panelEquipos.setBackground(new java.awt.Color(77, 77, 196));
        panelEquipos.setRoundBottomLeft(20);
        panelEquipos.setRoundBottomRight(20);
        panelEquipos.setRoundTopLeft(20);
        panelEquipos.setRoundTopRight(20);
        panelEquipos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelEquiposMouseMoved(evt);
            }
        });
        panelEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelEquiposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelEquiposMousePressed(evt);
            }
        });

        icEquipos.setBackground(new java.awt.Color(242, 242, 242));
        icEquipos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        icEquipos.setForeground(new java.awt.Color(255, 255, 255));
        icEquipos.setText("Equipos");
        icEquipos.setMaximumSize(null);
        icEquipos.setMinimumSize(null);
        icEquipos.setName(""); // NOI18N
        icEquipos.setPreferredSize(new java.awt.Dimension(140, 30));

        txtEquipos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-elementos-de-tecnología-25.png"))); // NOI18N

        javax.swing.GroupLayout panelEquiposLayout = new javax.swing.GroupLayout(panelEquipos);
        panelEquipos.setLayout(panelEquiposLayout);
        panelEquiposLayout.setHorizontalGroup(
            panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEquiposLayout.setVerticalGroup(
            panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(panelEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 280, -1));

        panelPrestamoSolicitante.setBackground(new java.awt.Color(77, 77, 196));
        panelPrestamoSolicitante.setRoundBottomLeft(20);
        panelPrestamoSolicitante.setRoundBottomRight(20);
        panelPrestamoSolicitante.setRoundTopLeft(20);
        panelPrestamoSolicitante.setRoundTopRight(20);
        panelPrestamoSolicitante.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelPrestamoSolicitanteMouseMoved(evt);
            }
        });
        panelPrestamoSolicitante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPrestamoSolicitanteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelPrestamoSolicitanteMousePressed(evt);
            }
        });

        txtPrestamos.setBackground(new java.awt.Color(242, 242, 242));
        txtPrestamos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtPrestamos.setForeground(new java.awt.Color(255, 255, 255));
        txtPrestamos.setText("Solicitante");
        txtPrestamos.setMaximumSize(null);
        txtPrestamos.setMinimumSize(null);
        txtPrestamos.setName(""); // NOI18N
        txtPrestamos.setPreferredSize(new java.awt.Dimension(140, 30));

        icPrestamos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        icPrestamos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-colaborador-hombre-25 (1).png"))); // NOI18N

        javax.swing.GroupLayout panelPrestamoSolicitanteLayout = new javax.swing.GroupLayout(panelPrestamoSolicitante);
        panelPrestamoSolicitante.setLayout(panelPrestamoSolicitanteLayout);
        panelPrestamoSolicitanteLayout.setHorizontalGroup(
            panelPrestamoSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrestamoSolicitanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrestamoSolicitanteLayout.setVerticalGroup(
            panelPrestamoSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(icPrestamos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(panelPrestamoSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 280, -1));

        txt_Prestamo.setBackground(new java.awt.Color(242, 242, 242));
        txt_Prestamo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_Prestamo.setForeground(new java.awt.Color(255, 255, 255));
        txt_Prestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Prestamo.setText("Prestamos");
        Menu.add(txt_Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 290, -1));

        txt_Registro.setBackground(new java.awt.Color(242, 242, 242));
        txt_Registro.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txt_Registro.setForeground(new java.awt.Color(255, 255, 255));
        txt_Registro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Registro.setText("Registros");
        Menu.add(txt_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, -1));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setForeground(new java.awt.Color(255, 255, 255));
        txtUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtUser.setText("User: Admin");
        Menu.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, -1));

        txtStatus.setForeground(new java.awt.Color(255, 255, 255));
        txtStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtStatus.setText("conectado");
        Menu.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 220, 290, -1));

        getContentPane().add(Menu, java.awt.BorderLayout.WEST);

        container.setBackground(new java.awt.Color(33, 33, 33));
        container.setMaximumSize(new java.awt.Dimension(980, 691));
        container.setMinimumSize(new java.awt.Dimension(980, 691));
        container.setOpaque(false);
        container.setPreferredSize(new java.awt.Dimension(980, 691));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        getContentPane().add(container, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMouseExited
        panelEmpleados.setBackground(new Color(77, 77, 196));
    }//GEN-LAST:event_panelEmpleadosMouseExited

    private void panelEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMousePressed
        Empleados p1 = new Empleados();
        p1.setSize(980, 691);
        p1.setLocation(0, 0);

        container.removeAll();
        container.add(p1, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_panelEmpleadosMousePressed

    private void panelEmpleadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMouseMoved
        panelEmpleados.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelEmpleadosMouseMoved

    private void panelSolicitanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitanteMouseExited
        panelSolicitante.setBackground(new Color(77, 77, 196));
    }//GEN-LAST:event_panelSolicitanteMouseExited

    private void panelSolicitanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitanteMousePressed
        Solicitante p1 = new Solicitante();
        p1.setSize(980, 691);
        p1.setLocation(0, 0);

        container.removeAll();
        container.add(p1, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_panelSolicitanteMousePressed

    private void panelSolicitanteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitanteMouseMoved
        panelSolicitante.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelSolicitanteMouseMoved

    private void panelEquiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquiposMouseExited
        panelEquipos.setBackground(new Color(77, 77, 196));
    }//GEN-LAST:event_panelEquiposMouseExited

    private void panelEquiposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquiposMousePressed
        Equipos p1 = new Equipos();
        p1.setSize(980, 691);
        p1.setLocation(0, 0);

        container.removeAll();
        container.add(p1, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_panelEquiposMousePressed

    private void panelEquiposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquiposMouseMoved
        panelEquipos.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelEquiposMouseMoved

    private void panelPrestamoSolicitanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoSolicitanteMouseExited
        panelPrestamoSolicitante.setBackground(new Color(77, 77, 196));
    }//GEN-LAST:event_panelPrestamoSolicitanteMouseExited

    private void panelPrestamoSolicitanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoSolicitanteMousePressed
        Solicitante p1 = new Solicitante();
        p1.setSize(980, 691);
        p1.setLocation(0, 0);

        container.removeAll();
        container.add(p1, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_panelPrestamoSolicitanteMousePressed

    private void panelPrestamoSolicitanteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoSolicitanteMouseMoved
        panelPrestamoSolicitante.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelPrestamoSolicitanteMouseMoved

    private void panelHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseMoved
        panelHome.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelHomeMouseMoved

    private void panelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseExited
        panelHome.setBackground(new Color(77, 77, 196));
    }//GEN-LAST:event_panelHomeMouseExited

    private void panelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMousePressed
        Home p1 = new Home();
        p1.setSize(980, 691);
        p1.setLocation(0, 0);

        container.removeAll();
        container.add(p1, BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
    }//GEN-LAST:event_panelHomeMousePressed

    private void panelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMouseClicked

    }//GEN-LAST:event_panelUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel container;
    private javax.swing.JLabel icEmpleados;
    private javax.swing.JLabel icEquipos;
    private javax.swing.JLabel icHome;
    private javax.swing.JLabel icPrestamos;
    private javax.swing.JLabel icSolicitante;
    private javax.swing.JLabel icUsuarios;
    private javax.swing.JPanel jPanelHome;
    private utils.PanelRound panelEmpleados;
    private utils.PanelRound panelEquipos;
    private utils.PanelRound panelHome;
    private utils.PanelRound panelPrestamoSolicitante;
    private utils.PanelRound panelSolicitante;
    private utils.PanelRound panelUsuario;
    private javax.swing.JLabel txtEmpleados;
    private javax.swing.JLabel txtEquipos;
    private javax.swing.JLabel txtHome;
    private javax.swing.JLabel txtMenu;
    private javax.swing.JLabel txtPrestamos;
    private javax.swing.JLabel txtSolicitante;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JLabel txtUser;
    private javax.swing.JLabel txt_Prestamo;
    private javax.swing.JLabel txt_Registro;
    // End of variables declaration//GEN-END:variables
}
