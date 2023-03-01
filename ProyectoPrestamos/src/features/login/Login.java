package features.login;

import menus.Home;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import utils.*;

public class Login extends javax.swing.JFrame {

    //Establece la conexion con mysql
    menus.CConexion conexion = new menus.CConexion();
    Connection con = conexion.estableceConexion();

    public Login() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        shadow = new utils.RoundedPanel(8, new java.awt.Color(0, 0, 0, 20));
        options = new utils.RoundedPanel(8, new java.awt.Color(255, 255, 255));
        txt_user = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        btn_recovery = new javax.swing.JLabel();
        Image = new javax.swing.JPanel();
        image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Control de Prestamos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        setMinimumSize(new java.awt.Dimension(931, 573));
        setName("FLogin"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(931, 573));

        background.setBackground(new java.awt.Color(89, 57, 94));
        background.setPreferredSize(new java.awt.Dimension(931, 573));

        shadow.setBackground(new java.awt.Color(0, 0, 0, 30));
        shadow.setOpaque(false);
        shadow.setPreferredSize(new java.awt.Dimension(435, 472));

        options.setBackground(new java.awt.Color(255, 255, 255));
        options.setOpaque(false);
        options.setPreferredSize(new java.awt.Dimension(435, 472));

        txt_user.setFont(new java.awt.Font("Lato Light", 0, 25)); // NOI18N
        txt_user.setForeground(new java.awt.Color(152, 152, 152));
        txt_user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        txt_user.setCaretColor(new java.awt.Color(237, 194, 96));
        txt_user.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_user.setMinimumSize(new java.awt.Dimension(355, 40));
        txt_user.setPreferredSize(new java.awt.Dimension(355, 40));
        new utils.TextPrompt("Usuario", txt_user);

        txt_password.setFont(new java.awt.Font("Lato Light", 0, 25)); // NOI18N
        txt_password.setForeground(new java.awt.Color(152, 152, 152));
        txt_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        txt_password.setCaretColor(new java.awt.Color(237, 194, 96));
        txt_password.setEchoChar('\u00b7');
        txt_password.setMinimumSize(new java.awt.Dimension(355, 40));
        txt_password.setPreferredSize(new java.awt.Dimension(355, 40));
        new utils.TextPrompt("Contraseña", txt_password);

        btn_login.setFont(new java.awt.Font("Lato", 0, 25)); // NOI18N
        btn_login.setForeground(new java.awt.Color(112, 112, 112));
        btn_login.setText("Iniciar sesion");
        btn_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(211, 211, 211), 1, true));
        btn_login.setContentAreaFilled(false);
        btn_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_login.setFocusable(false);
        btn_login.setPreferredSize(new java.awt.Dimension(220, 45));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("D:\\farid\\Documents\\Interfaz\\Mysqljava\\src\\main\\java\\Avatar-modified (1).png")); // NOI18N

        btn_recovery.setBackground(new java.awt.Color(152, 152, 152));
        btn_recovery.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        btn_recovery.setForeground(new java.awt.Color(152, 152, 152));
        btn_recovery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_recovery.setText("¿Olvidaste tu contraseña?");

        javax.swing.GroupLayout optionsLayout = new javax.swing.GroupLayout(options);
        options.setLayout(optionsLayout);
        optionsLayout.setHorizontalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(optionsLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(optionsLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btn_recovery, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(123, 123, 123))
        );
        optionsLayout.setVerticalGroup(
            optionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logo)
                .addGap(18, 18, 18)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_recovery)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout shadowLayout = new javax.swing.GroupLayout(shadow);
        shadow.setLayout(shadowLayout);
        shadowLayout.setHorizontalGroup(
            shadowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shadowLayout.createSequentialGroup()
                .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                .addContainerGap())
        );
        shadowLayout.setVerticalGroup(
            shadowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, shadowLayout.createSequentialGroup()
                .addComponent(options, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );

        image.setIcon(new javax.swing.ImageIcon("D:\\farid\\Documents\\Interfaz\\Mysqljava\\src\\main\\java\\Base.png")); // NOI18N

        javax.swing.GroupLayout ImageLayout = new javax.swing.GroupLayout(Image);
        Image.setLayout(ImageLayout);
        ImageLayout.setHorizontalGroup(
            ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ImageLayout.setVerticalGroup(
            ImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ImageLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(shadow, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(shadow, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

// Agrega un usuario a la base de datos 
//    public void agregarUsuario() {
//        String SQL = "insert into Usuarios (user_name,pass) values(?,?)";
//        try {
//            PreparedStatement pst=con.prepareStatement(SQL);
//                    pst.setString(1, txt_usuario.getText);
//                    pst.setString(2,pass);
//                    pst.executeUpdate();
//                    
//                    JOptionPane.showMessageDialog(null, "Registro Exitoso");
//        } catch (Exception e) {
//             JOptionPane.showMessageDialog(null, "Error de registro");
//        }
//    }
    public void validarUsuario() {
        int resultado = 0;
        String pass = String.valueOf(txt_password.getPassword());
        String usuario = txt_user.getText();
        String SQL = "select  * from Usuarios where user_name= '" + usuario + "' and pass= '" + pass + "'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            if (rs.next()) {
                resultado = 1;
            }
            if (resultado == 1) {
                goToInterfazP();
            } else {
                MessageUtils.showWarning("Datos Incorrectos");
            }

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error " + e.getMessage());
        }
    }
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        validarUsuario();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void goToInterfazP() {
        new Home().setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Image;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel btn_recovery;
    private javax.swing.JLabel image;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel options;
    private javax.swing.JPanel shadow;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
