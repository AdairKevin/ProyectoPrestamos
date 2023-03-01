/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author josesalazar
 */
public class DialogUtils {

    public static void showDialog(Component parent, String msg, String title, OnClickButton action) {
        int option = JOptionPane.showConfirmDialog(parent, msg, title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (option == JOptionPane.OK_OPTION) {
            action.onClick();
        }
    }
}
