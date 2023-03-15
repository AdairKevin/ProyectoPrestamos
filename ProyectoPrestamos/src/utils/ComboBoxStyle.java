package utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.ComboPopup;

/**
 *
 * @author EliothN
 */
public class ComboBoxStyle extends BasicComboBoxUI {

    @Override
    protected ComboPopup createPopup() {
        BasicComboPopup basicComboPopup = new BasicComboPopup(comboBox);
        basicComboPopup.setBorder(new LineBorder(new Color(152, 152, 152)));
        return basicComboPopup;
    }

    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        btn.setIcon(new ImageIcon(getClass().getResource("/img/ic_caret_down.png")));
        btn.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 5));
        btn.setContentAreaFilled(false);
        return btn;
    }

    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(new Color(255, 255, 255));
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }

    @Override
    protected ListCellRenderer createRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
                list.setSelectionBackground(new Color(233, 233, 233));
                return this;
            }
        };
    }
}
