package poglavlje24eventhandling;

import java.awt.*;
import java.awt.event.*;

//ilustracija upotrebe Inner klase (interne)
public class InnerClassDemo extends Frame {

    String poruka = "";

    public InnerClassDemo(){
        addMouseListener(new MojMouseAdapter());
        addWindowListener(new MojWindowAdapter());
    }

    //Inner klasa za obradu događaja pritiskanje tastera miša
    class MojMouseAdapter extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent me) {
            poruka = "taster pritisnut";
            repaint();
        }
    }

    //Inner klasa za obradu događaja zatvraranje prozora
    class MojWindowAdapter extends WindowAdapter {

        @Override
        public void windowClosing(WindowEvent we) {
            System.exit(0);
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 20, 80);
    }

    public static void main(String[] args) {
        InnerClassDemo apProzor = new InnerClassDemo();
        apProzor.setSize(200, 150);
        apProzor.setTitle("InnerClassDemo");
        apProzor.setVisible(true);
    }
}
