package utils;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Utils {

    private static Color colorGris = new Color(233, 233, 233);
    private static Color colorGrisClaro = new Color(247, 247, 247);
    private static Color colorGrisClaro2 = new Color(211, 211, 211);
    private static Color colorGrisOscuro = new Color(112, 112, 112);
    private static Color colorNaranja = new Color(237, 194, 96);
    private static Color colorBlanco = new Color(255, 255, 255);
    private static Color colorGrisOscuro2 = new Color(152, 152, 152);

    public final static void hoverJPanel(java.awt.event.MouseEvent evt, Boolean isEnable) {
        JPanel item = (JPanel) evt.getComponent();
        if (isEnable == true) {
            item.setBackground(colorGris);
        } else {
            item.setBackground(colorGrisClaro);
        }
    }

    public final static void hoverJLabel(java.awt.event.MouseEvent evt, Boolean isEnable) {
        JLabel item = (JLabel) evt.getComponent();
        if (isEnable == true) {
            item.setBackground(colorBlanco);
            item.setForeground(colorNaranja);
            setBorderJLabel(colorNaranja, item);
        } else {
            item.setBackground(colorBlanco);
            item.setForeground(colorGrisOscuro);
            setBorderJLabel(colorGrisClaro2, item);
        }
    }

    public static void setImageJLabel(ImageIcon icon, java.awt.event.MouseEvent evt) {
        JLabel item = (JLabel) evt.getComponent();
        item.setIcon(icon);
    }

    public final static void focusTextField(java.awt.event.FocusEvent evt, Boolean isEnable) {
        JTextField item = (JTextField) evt.getComponent();
        if (isEnable == true) {
            setBorderTextField(colorGrisOscuro2, item);
        } else {
            setBorderTextField(colorGrisClaro2, item);
        }
    }

    public final static void focusPasswordField(java.awt.event.FocusEvent evt, Boolean isEnable) {
        JPasswordField item = (JPasswordField) evt.getComponent();
        if (isEnable == true) {
            setBorderPasswordField(colorGrisOscuro2, item);
        } else {
            setBorderPasswordField(colorGrisClaro2, item);
        }
    }

    public final static void focusComboBox(javax.swing.event.PopupMenuEvent evt, Boolean isEnable) {
        JComboBox item = (JComboBox) evt.getSource();
        if (isEnable == true) {
            setBorderComboBox(colorGrisOscuro2, item);
        } else {
            setBorderComboBox(colorGrisClaro2, item);
        }
    }

    //Metodos Internos---------------------
    private static void setBorderJLabel(Color color, JLabel item) {
        item.setBorder(new javax.swing.border.LineBorder(color, 1, true));
    }

    private static void setBorderTextField(Color color, JTextField item) {
        item.setBorder(new javax.swing.border.LineBorder(color, 1, true));
    }

    private static void setBorderPasswordField(Color color, JPasswordField item) {
        item.setBorder(new javax.swing.border.LineBorder(color, 1, true));
    }

    private static void setBorderComboBox(Color color, JComboBox item) {
        item.setBorder(new javax.swing.border.LineBorder(color, 1, true));
    }
}
