package typography;

import java.awt.Font;
import java.io.InputStream;

public class Fonts {

    private Font font = null;
    public String lato = "Lato-Regular.ttf";
// Font.PLAIN = 0 , Font.BOLD = 1 , Font.ITALIC = 2

    public Font fuente(String fontName, int style, float size) {
        try {
            InputStream is = getClass().getResourceAsStream(lato);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            System.err.print(fontName + " No pudo cargarse");
            font = new Font("Arial", Font.PLAIN, 5);
        }
        Font tfont = font.deriveFont(style, size);
        return tfont;
    }
}
