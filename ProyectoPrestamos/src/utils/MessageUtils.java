/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import javax.swing.JOptionPane;

/**
 *
 * @author EliothN
 */
public class MessageUtils {

    private static final String DEFAULT_TITLE = "Control De Prestamos";

    public static void showWarning(String msg, String title) {
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.WARNING_MESSAGE);
    }

    public static void showWarning(String msg) {
        JOptionPane.showMessageDialog(null, msg, DEFAULT_TITLE, JOptionPane.WARNING_MESSAGE);
    }
}
