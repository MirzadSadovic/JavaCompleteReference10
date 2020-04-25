package poglavlje25awt;

import java.awt.event.*;
import java.awt.*;

//Prikazuje podatke o fontu
public class FontInfo extends Frame {

    public FontInfo() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }           
        });
    }

    @Override
    public void paint(Graphics g) {
        Font font = g.getFont();
        String imeFonta = font.getName();
        String imePorodice = font.getFamily();
        int velicinaFonta = font.getSize();
        int stil = font.getStyle();
        
        String poruka = "Porodica " + imePorodice;
        
        poruka += ", Font: " + imeFonta;
        poruka += ", velicinaFonta: " + velicinaFonta + "stil: ";
        
        if((stil & Font.BOLD) == Font.BOLD)
            poruka += "Bold";
        if((stil & Font.ITALIC) == Font.ITALIC)
            poruka += "Bold";
        if((stil & Font.PLAIN) == Font.PLAIN)
            poruka += "Bold";
        
        g.drawString(poruka, 10, 60);
    }
    public static void main(String[] args) {
        FontInfo appProzor = new FontInfo();
        appProzor.setSize(new Dimension(400, 100));
        appProzor.setTitle("Font Info");
        appProzor.setVisible(true);
    }
}
