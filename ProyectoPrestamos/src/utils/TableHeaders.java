/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author EliothN
 */
public final class TableHeaders extends JLabel implements TableCellRenderer {

    public TableHeaders() {
        setFont(new Font("Lato Light", 0, 13));
        setForeground(new Color(112, 112, 112));
        setBackground(new Color(233, 233, 233));
        setBorder(BorderFactory.createLineBorder(new Color(211, 211, 211)));
        setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        setPreferredSize(new java.awt.Dimension(44, 32));
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        setText(value.toString());
        return this;
    }

}
