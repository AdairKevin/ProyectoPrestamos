package features.menu;

import typography.Fonts;

public class Empleados extends javax.swing.JPanel {

    Fonts fontType;

    public Empleados() {
        fontType = new Fonts();
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_id = new javax.swing.JPanel();
        lbl_id = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        panel_nombre = new javax.swing.JPanel();
        lbl_nombre = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        panel_apellidoP = new javax.swing.JPanel();
        lbl_apellidoP = new javax.swing.JLabel();
        tf_apellidoP = new javax.swing.JTextField();
        panel_apellidoM = new javax.swing.JPanel();
        lbl_apellidoM = new javax.swing.JLabel();
        tf_apellidoM = new javax.swing.JTextField();
        panel_calle = new javax.swing.JPanel();
        lbl_calle = new javax.swing.JLabel();
        tf_calle = new javax.swing.JTextField();
        panel_colonia = new javax.swing.JPanel();
        lbl_colonia = new javax.swing.JLabel();
        tf_colonia = new javax.swing.JTextField();
        panel_localidad = new javax.swing.JPanel();
        lbl_localidad = new javax.swing.JLabel();
        tf_localidad = new javax.swing.JTextField();
        panel_cp = new javax.swing.JPanel();
        lbl_cp = new javax.swing.JLabel();
        tf_id1 = new javax.swing.JTextField();
        panel_entidad = new javax.swing.JPanel();
        lbl_entidad = new javax.swing.JLabel();
        tf_entidad = new javax.swing.JTextField();
        panel_puesto = new javax.swing.JPanel();
        NoSeQueHace = new javax.swing.JPanel();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        lbl_puesto = new javax.swing.JLabel();
        tf_puesto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        tf_puesto1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(246, 248, 255));
        setInheritsPopupMenu(true);
        setMaximumSize(new java.awt.Dimension(980, 691));
        setMinimumSize(new java.awt.Dimension(980, 691));
        setPreferredSize(new java.awt.Dimension(980, 691));
        setRequestFocusEnabled(false);

        panel_id.setBackground(new java.awt.Color(238, 238, 238));
        panel_id.setOpaque(false);

        lbl_id.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_id.setForeground(new java.awt.Color(0, 0, 0));
        lbl_id.setText("Numero de Empleado");

        tf_id.setBackground(new java.awt.Color(255, 255, 255));
        tf_id.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_id)
            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addComponent(lbl_id)
                .addGap(5, 5, 5)
                .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_nombre.setBackground(new java.awt.Color(238, 238, 238));
        panel_nombre.setOpaque(false);

        lbl_nombre.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_nombre.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombre.setText("Nombre");

        tf_nombre.setFont(fontType.fuente(fontType.lato,0,15));
        tf_nombre.setBackground(new java.awt.Color(255, 255, 255));
        tf_nombre.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_nombreLayout = new javax.swing.GroupLayout(panel_nombre);
        panel_nombre.setLayout(panel_nombreLayout);
        panel_nombreLayout.setHorizontalGroup(
            panel_nombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_nombre)
            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_nombreLayout.setVerticalGroup(
            panel_nombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nombreLayout.createSequentialGroup()
                .addComponent(lbl_nombre)
                .addGap(5, 5, 5)
                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_apellidoP.setBackground(new java.awt.Color(238, 238, 238));
        panel_apellidoP.setOpaque(false);

        lbl_apellidoP.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_apellidoP.setForeground(new java.awt.Color(0, 0, 0));
        lbl_apellidoP.setText("Apellido Paterno");

        tf_apellidoP.setBackground(new java.awt.Color(255, 255, 255));
        tf_apellidoP.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_apellidoPLayout = new javax.swing.GroupLayout(panel_apellidoP);
        panel_apellidoP.setLayout(panel_apellidoPLayout);
        panel_apellidoPLayout.setHorizontalGroup(
            panel_apellidoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_apellidoP)
            .addComponent(tf_apellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        panel_apellidoPLayout.setVerticalGroup(
            panel_apellidoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_apellidoPLayout.createSequentialGroup()
                .addComponent(lbl_apellidoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(tf_apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_apellidoM.setBackground(new java.awt.Color(238, 238, 238));
        panel_apellidoM.setOpaque(false);

        lbl_apellidoM.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_apellidoM.setForeground(new java.awt.Color(0, 0, 0));
        lbl_apellidoM.setText("Apellido Materno");

        tf_apellidoM.setBackground(new java.awt.Color(255, 255, 255));
        tf_apellidoM.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_apellidoMLayout = new javax.swing.GroupLayout(panel_apellidoM);
        panel_apellidoM.setLayout(panel_apellidoMLayout);
        panel_apellidoMLayout.setHorizontalGroup(
            panel_apellidoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_apellidoM)
            .addComponent(tf_apellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        panel_apellidoMLayout.setVerticalGroup(
            panel_apellidoMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_apellidoMLayout.createSequentialGroup()
                .addComponent(lbl_apellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(tf_apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_calle.setBackground(new java.awt.Color(238, 238, 238));
        panel_calle.setOpaque(false);

        lbl_calle.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_calle.setForeground(new java.awt.Color(0, 0, 0));
        lbl_calle.setText("Calle");

        tf_calle.setBackground(new java.awt.Color(255, 255, 255));
        tf_calle.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_calleLayout = new javax.swing.GroupLayout(panel_calle);
        panel_calle.setLayout(panel_calleLayout);
        panel_calleLayout.setHorizontalGroup(
            panel_calleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_calle)
            .addComponent(tf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_calleLayout.setVerticalGroup(
            panel_calleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_calleLayout.createSequentialGroup()
                .addComponent(lbl_calle)
                .addGap(5, 5, 5)
                .addComponent(tf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_colonia.setBackground(new java.awt.Color(238, 238, 238));
        panel_colonia.setOpaque(false);

        lbl_colonia.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_colonia.setForeground(new java.awt.Color(0, 0, 0));
        lbl_colonia.setText("Colonia");

        tf_colonia.setBackground(new java.awt.Color(255, 255, 255));
        tf_colonia.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_coloniaLayout = new javax.swing.GroupLayout(panel_colonia);
        panel_colonia.setLayout(panel_coloniaLayout);
        panel_coloniaLayout.setHorizontalGroup(
            panel_coloniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_colonia)
            .addComponent(tf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_coloniaLayout.setVerticalGroup(
            panel_coloniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_coloniaLayout.createSequentialGroup()
                .addComponent(lbl_colonia)
                .addGap(5, 5, 5)
                .addComponent(tf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        panel_localidad.setBackground(new java.awt.Color(238, 238, 238));
        panel_localidad.setOpaque(false);

        lbl_localidad.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_localidad.setForeground(new java.awt.Color(0, 0, 0));
        lbl_localidad.setText("Localidad");

        tf_localidad.setBackground(new java.awt.Color(255, 255, 255));
        tf_localidad.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_localidadLayout = new javax.swing.GroupLayout(panel_localidad);
        panel_localidad.setLayout(panel_localidadLayout);
        panel_localidadLayout.setHorizontalGroup(
            panel_localidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_localidad)
            .addComponent(tf_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_localidadLayout.setVerticalGroup(
            panel_localidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_localidadLayout.createSequentialGroup()
                .addComponent(lbl_localidad)
                .addGap(5, 5, 5)
                .addComponent(tf_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_cp.setBackground(new java.awt.Color(238, 238, 238));
        panel_cp.setOpaque(false);

        lbl_cp.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_cp.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cp.setText("Codigo Postal");

        tf_id1.setBackground(new java.awt.Color(255, 255, 255));
        tf_id1.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_cpLayout = new javax.swing.GroupLayout(panel_cp);
        panel_cp.setLayout(panel_cpLayout);
        panel_cpLayout.setHorizontalGroup(
            panel_cpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cp)
            .addComponent(tf_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_cpLayout.setVerticalGroup(
            panel_cpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_cpLayout.createSequentialGroup()
                .addComponent(lbl_cp)
                .addGap(5, 5, 5)
                .addComponent(tf_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panel_entidad.setBackground(new java.awt.Color(238, 238, 238));
        panel_entidad.setOpaque(false);

        lbl_entidad.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_entidad.setForeground(new java.awt.Color(0, 0, 0));
        lbl_entidad.setText("Entidad Federativa");

        tf_entidad.setBackground(new java.awt.Color(255, 255, 255));
        tf_entidad.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout panel_entidadLayout = new javax.swing.GroupLayout(panel_entidad);
        panel_entidad.setLayout(panel_entidadLayout);
        panel_entidadLayout.setHorizontalGroup(
            panel_entidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_entidad)
            .addComponent(tf_entidad, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panel_entidadLayout.setVerticalGroup(
            panel_entidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_entidadLayout.createSequentialGroup()
                .addComponent(lbl_entidad)
                .addGap(5, 5, 5)
                .addComponent(tf_entidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_puesto.setBackground(new java.awt.Color(238, 238, 238));
        panel_puesto.setOpaque(false);

        javax.swing.GroupLayout panel_puestoLayout = new javax.swing.GroupLayout(panel_puesto);
        panel_puesto.setLayout(panel_puestoLayout);
        panel_puestoLayout.setHorizontalGroup(
            panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        panel_puestoLayout.setVerticalGroup(
            panel_puestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        NoSeQueHace.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout NoSeQueHaceLayout = new javax.swing.GroupLayout(NoSeQueHace);
        NoSeQueHace.setLayout(NoSeQueHaceLayout);
        NoSeQueHaceLayout.setHorizontalGroup(
            NoSeQueHaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
        );
        NoSeQueHaceLayout.setVerticalGroup(
            NoSeQueHaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        btn_agregar.setFont(fontType.fuente(fontType.lato,0,20));
        btn_agregar.setForeground(new java.awt.Color(112, 112, 112));
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btn_agregar.setContentAreaFilled(false);
        btn_agregar.setFocusable(false);
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregarMouseExited(evt);
            }
        });

        btn_modificar.setFont(fontType.fuente(fontType.lato,0,20));
        btn_modificar.setForeground(new java.awt.Color(112, 112, 112));
        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btn_modificar.setContentAreaFilled(false);
        btn_modificar.setFocusable(false);

        btn_borrar.setFont(fontType.fuente(fontType.lato,0,20));
        btn_borrar.setForeground(new java.awt.Color(112, 112, 112));
        btn_borrar.setText("Borrar");
        btn_borrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btn_borrar.setContentAreaFilled(false);
        btn_borrar.setFocusable(false);

        lbl_puesto.setFont(fontType.fuente(fontType.lato,0,20));
        lbl_puesto.setForeground(new java.awt.Color(0, 0, 0));
        lbl_puesto.setText("Puesto");

        tf_puesto.setBackground(new java.awt.Color(255, 255, 255));
        tf_puesto.setFont(fontType.fuente(fontType.lato,0,12));
        tf_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_puestoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(233, 237, 255));

        btn_buscar.setFont(fontType.fuente(fontType.lato,0,20));
        btn_buscar.setForeground(new java.awt.Color(112, 112, 112));
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setFocusable(false);

        tf_puesto1.setBackground(new java.awt.Color(255, 255, 255));
        tf_puesto1.setFont(fontType.fuente(fontType.lato,0,12));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_puesto1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(tf_puesto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NoSeQueHace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(panel_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panel_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panel_entidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(panel_apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(264, 264, 264)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_puesto)
                                    .addComponent(panel_apellidoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_puesto))))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_puesto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tf_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel_puesto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_apellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_apellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(panel_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_localidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_entidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(NoSeQueHace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseExited
        // TODO add your handling code here:
        btn_agregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));;
    }//GEN-LAST:event_btn_agregarMouseExited

    private void tf_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_puestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_puestoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NoSeQueHace;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_apellidoM;
    private javax.swing.JLabel lbl_apellidoP;
    private javax.swing.JLabel lbl_calle;
    private javax.swing.JLabel lbl_colonia;
    private javax.swing.JLabel lbl_cp;
    private javax.swing.JLabel lbl_entidad;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_localidad;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JPanel panel_apellidoM;
    private javax.swing.JPanel panel_apellidoP;
    private javax.swing.JPanel panel_calle;
    private javax.swing.JPanel panel_colonia;
    private javax.swing.JPanel panel_cp;
    private javax.swing.JPanel panel_entidad;
    private javax.swing.JPanel panel_id;
    private javax.swing.JPanel panel_localidad;
    private javax.swing.JPanel panel_nombre;
    private javax.swing.JPanel panel_puesto;
    private javax.swing.JTextField tf_apellidoM;
    private javax.swing.JTextField tf_apellidoP;
    private javax.swing.JTextField tf_calle;
    private javax.swing.JTextField tf_colonia;
    private javax.swing.JTextField tf_entidad;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_id1;
    private javax.swing.JTextField tf_localidad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_puesto;
    private javax.swing.JTextField tf_puesto1;
    // End of variables declaration//GEN-END:variables
}
