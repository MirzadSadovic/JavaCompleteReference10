package poglavlje25awt;

import java.awt.event.*;
import java.awt.*;

//Prikazuje fontove
public class PrikazFontova extends Frame {

    String poruka = "Prvih pet fontova: ";

    public PrikazFontova() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //Učitava grafičko okruženje
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        //Formira listu fontova
        String[] spisakFontova = ge.getAvailableFontFamilyNames();

        //Izdvaja prvih pet fontova na listi
        for (int i = 0; (i < 5) && i < (spisakFontova.length); i++) {
            poruka += spisakFontova[i] + " ";
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 10, 60);
    }

    public static void main(String[] args) {
        PrikazFontova prozor = new PrikazFontova();
        prozor.setSize(500, 100);
        prozor.setTitle("Prikaz fontova");
        prozor.setVisible(true);
    }
}
