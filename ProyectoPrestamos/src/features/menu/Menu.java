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
        p1.setSize(1000, 700);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
        User.setText("Usuario: Adair");
        
        CConexion conectar = new CConexion();
        conectar.conectarInterfaz();
        conectado.setForeground(Color.green);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelUsuario = new utils.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        panelHome = new utils.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelEmpleados = new utils.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelSolicitante = new utils.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        panelEquipos = new utils.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        panelPrestamoSolicitante = new utils.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        conectado = new javax.swing.JLabel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(59, 66, 191));
        Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(242, 242, 242));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU");
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 60));

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

        jLabel2.setBackground(new java.awt.Color(242, 242, 242));
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-persona-de-sexo-masculino-94.png"))); // NOI18N

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Menu.add(panelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        panelHome.setBackground(new java.awt.Color(59, 66, 191));
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

        jLabel14.setBackground(new java.awt.Color(242, 242, 242));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Home");
        jLabel14.setName(""); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-página-principal-25.png"))); // NOI18N

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(panelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 280, -1));

        panelEmpleados.setBackground(new java.awt.Color(59, 66, 191));
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

        jLabel5.setBackground(new java.awt.Color(242, 242, 242));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Empleados");
        jLabel5.setMaximumSize(null);
        jLabel5.setMinimumSize(null);
        jLabel5.setName(""); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-tarjeta-de-empleado-25 (1).png"))); // NOI18N

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(panelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 280, -1));

        panelSolicitante.setBackground(new java.awt.Color(59, 66, 191));
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

        jLabel6.setBackground(new java.awt.Color(242, 242, 242));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Solicitante");
        jLabel6.setMaximumSize(null);
        jLabel6.setMinimumSize(null);
        jLabel6.setName(""); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-colaborador-hombre-25.png"))); // NOI18N

        javax.swing.GroupLayout panelSolicitanteLayout = new javax.swing.GroupLayout(panelSolicitante);
        panelSolicitante.setLayout(panelSolicitanteLayout);
        panelSolicitanteLayout.setHorizontalGroup(
            panelSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSolicitanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSolicitanteLayout.setVerticalGroup(
            panelSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Menu.add(panelSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 280, -1));

        panelEquipos.setBackground(new java.awt.Color(59, 66, 191));
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

        jLabel8.setBackground(new java.awt.Color(242, 242, 242));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Equipos");
        jLabel8.setMaximumSize(null);
        jLabel8.setMinimumSize(null);
        jLabel8.setName(""); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-elementos-de-tecnología-25.png"))); // NOI18N

        javax.swing.GroupLayout panelEquiposLayout = new javax.swing.GroupLayout(panelEquipos);
        panelEquipos.setLayout(panelEquiposLayout);
        panelEquiposLayout.setHorizontalGroup(
            panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEquiposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEquiposLayout.setVerticalGroup(
            panelEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(panelEquipos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 280, -1));

        panelPrestamoSolicitante.setBackground(new java.awt.Color(59, 66, 191));
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

        jLabel11.setBackground(new java.awt.Color(242, 242, 242));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Solicitante");
        jLabel11.setMaximumSize(null);
        jLabel11.setMinimumSize(null);
        jLabel11.setName(""); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(140, 30));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-colaborador-hombre-25 (1).png"))); // NOI18N

        javax.swing.GroupLayout panelPrestamoSolicitanteLayout = new javax.swing.GroupLayout(panelPrestamoSolicitante);
        panelPrestamoSolicitante.setLayout(panelPrestamoSolicitanteLayout);
        panelPrestamoSolicitanteLayout.setHorizontalGroup(
            panelPrestamoSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrestamoSolicitanteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPrestamoSolicitanteLayout.setVerticalGroup(
            panelPrestamoSolicitanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.add(panelPrestamoSolicitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 280, -1));

        jLabel3.setBackground(new java.awt.Color(242, 242, 242));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Prestamos");
        Menu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 290, -1));

        jLabel4.setBackground(new java.awt.Color(242, 242, 242));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registros");
        Menu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 300, -1));

        User.setBackground(new java.awt.Color(255, 255, 255));
        User.setForeground(new java.awt.Color(255, 255, 255));
        User.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        User.setText("User: Admin");
        Menu.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, -1));

        conectado.setForeground(new java.awt.Color(255, 255, 255));
        conectado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conectado.setText("conectado");
        Menu.add(conectado, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 220, 290, -1));

        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        content.setBackground(new java.awt.Color(33, 33, 33));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMouseExited
        panelEmpleados.setBackground(new Color(59,66,191));
    }//GEN-LAST:event_panelEmpleadosMouseExited

    private void panelEmpleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMousePressed
        Empleados p1 = new Empleados();
        p1.setSize(1000, 700);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_panelEmpleadosMousePressed

    private void panelEmpleadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEmpleadosMouseMoved
        panelEmpleados.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelEmpleadosMouseMoved

    private void panelSolicitanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitanteMouseExited
        panelSolicitante.setBackground(new Color(59,66,191));
    }//GEN-LAST:event_panelSolicitanteMouseExited

    private void panelSolicitanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitanteMousePressed
        Solicitante p1 = new Solicitante();
        p1.setSize(1000, 700);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_panelSolicitanteMousePressed

    private void panelSolicitanteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSolicitanteMouseMoved
        panelSolicitante.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelSolicitanteMouseMoved

    private void panelEquiposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquiposMouseExited
        panelEquipos.setBackground(new Color(59,66,191));
    }//GEN-LAST:event_panelEquiposMouseExited

    private void panelEquiposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquiposMousePressed
        Equipos p1 = new Equipos();
        p1.setSize(1000, 700);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_panelEquiposMousePressed

    private void panelEquiposMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelEquiposMouseMoved
        panelEquipos.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelEquiposMouseMoved

    private void panelPrestamoSolicitanteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoSolicitanteMouseExited
        panelPrestamoSolicitante.setBackground(new Color(59,66,191));
    }//GEN-LAST:event_panelPrestamoSolicitanteMouseExited

    private void panelPrestamoSolicitanteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoSolicitanteMousePressed
        SolicitantePrestamo p1 = new SolicitantePrestamo();
        p1.setSize(1000, 700);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_panelPrestamoSolicitanteMousePressed

    private void panelPrestamoSolicitanteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPrestamoSolicitanteMouseMoved
        panelPrestamoSolicitante.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelPrestamoSolicitanteMouseMoved

    private void panelHomeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseMoved
        panelHome.setBackground(new Color(98, 116, 218));
    }//GEN-LAST:event_panelHomeMouseMoved

    private void panelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMouseExited
        panelHome.setBackground(new Color(59,66,191));
    }//GEN-LAST:event_panelHomeMouseExited

    private void panelHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelHomeMousePressed
        Home p1 = new Home();
        p1.setSize(1000, 700);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_panelHomeMousePressed

    private void panelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUsuarioMouseClicked
        
    }//GEN-LAST:event_panelUsuarioMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel User;
    private javax.swing.JLabel conectado;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private utils.PanelRound panelEmpleados;
    private utils.PanelRound panelEquipos;
    private utils.PanelRound panelHome;
    private utils.PanelRound panelPrestamoSolicitante;
    private utils.PanelRound panelSolicitante;
    private utils.PanelRound panelUsuario;
    // End of variables declaration//GEN-END:variables
}
