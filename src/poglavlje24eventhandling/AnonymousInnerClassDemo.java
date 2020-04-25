package poglavlje24eventhandling;

import java.awt.*;
import java.awt.event.*;

//Ilustracija upotrebe Anonimne Inner klase
public class AnonymousInnerClassDemo extends Frame {
    
    String poruka = "";
    
    public AnonymousInnerClassDemo() {

        //Anonimna inner klasa za obradu događaja pritiskanje tastera miša
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                poruka = "taster pritisnut";
                repaint();
            }
        });

        //Anonimna inner klasa za obradu događaja zatvaranje prozora
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 20, 80);
    }

    public static void main(String[] args) {
        AnonymousInnerClassDemo apProzor = new AnonymousInnerClassDemo();
        apProzor.setSize(new Dimension(200, 150));
        apProzor.setTitle("AnonymousInnerClassDemo");
        apProzor.setVisible(true);
    }
    
}
