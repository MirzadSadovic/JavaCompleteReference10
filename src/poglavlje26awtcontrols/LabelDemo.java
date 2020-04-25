package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Prikazivanje upotrebe Labele (natpisa)
public class LabelDemo extends Frame {
    
    public LabelDemo() {
        setLayout(new FlowLayout());
        //kontrole raspoređujemo jedne za drugom u redove
        Label jedan = new Label("Jedan");
        Label dva = new Label("Dva");
        Label tri = new Label("Tri");
        //dodavanje labela u prozor
        add(jedan);
        add(dva);
        add(tri);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }           
        });
    }
    public static void main(String[] args) {
        LabelDemo labelDemo = new LabelDemo();
        labelDemo.setSize(new Dimension(300, 100));
        labelDemo.setTitle("LabelDemo");
        labelDemo.setVisible(true);
    }
}
