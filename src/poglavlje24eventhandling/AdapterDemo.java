package poglavlje24eventhandling;

import java.awt.*;
import java.awt.event.*;

//Ilustracija upotrebe Adapterskih klasa
public class AdapterDemo extends Frame {

    String poruka = "";

    public AdapterDemo() {
        addMouseListener(new MojMouseAdapter(this));
        addMouseMotionListener(new MojMouseAdapter(this));
        addWindowListener(new MyWindowAdapter());
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 20, 80);
    }

    //Obrađuje samo događaje pritiskanja tastera
    class MojMouseAdapter extends MouseAdapter {

        AdapterDemo adapterDemo;

        public MojMouseAdapter(AdapterDemo adapterDemo) {
            this.adapterDemo = adapterDemo;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            adapterDemo.poruka = "pritisnut taster miša";
            adapterDemo.repaint();
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            adapterDemo.poruka = "miš prevučen";
            adapterDemo.repaint();
        }
    }

    public static void main(String[] args) {
        AdapterDemo appProzor = new AdapterDemo();
        appProzor.setSize(200, 150);
        appProzor.setTitle("AdapterDemo");
        appProzor.setVisible(true);
    }
}
