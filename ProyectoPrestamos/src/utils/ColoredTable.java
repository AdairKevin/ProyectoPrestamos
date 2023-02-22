package utils;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ColoredTable extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        setEnabled(table == null || table.isEnabled());
        if ((row % 2) == 0) {
            setBackground(new Color(250, 250, 250));
        } else {
            setBackground(Color.white);
        }
        if ((column == 0)) {
            setBackground(new Color(211, 211, 211));
        }
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }

}
