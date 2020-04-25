package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba scroll bara (kliznih traka)
public class ScrollBarDemo extends Frame implements AdjustmentListener {
    
    String poruka = "";
    Scrollbar vertikalni, horizontalni;
    
    public ScrollBarDemo() throws HeadlessException {
        setLayout(new FlowLayout());
        //Formiranje scrollbara i zadavanje željene veličine
        vertikalni = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 200);
        vertikalni.setPreferredSize(new Dimension(20, 100));
        horizontalni = new Scrollbar(Scrollbar.HORIZONTAL, 0, 1, 0, 100);
        horizontalni.setPreferredSize(new Dimension(100, 20));
        add(vertikalni);
        add(horizontalni);
        //Registrovanje na listnera
        vertikalni.addAdjustmentListener(this);
        horizontalni.addAdjustmentListener(this);

        //Registrovanje programa na prijem događaja pomjeranja misa
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) { //Ažurira položaj klizača na scrollbaru
                int x = e.getX();
                int y = e.getY();
                vertikalni.setValue(y);
                horizontalni.setValue(x);
                repaint();
            }
        });
        addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        poruka = "Vertikalni scroll bar " + vertikalni.getValue();
        poruka += ", Horizontalni scroll bar " + horizontalni.getValue();
        g.drawString(poruka, 20, 160);
        
        //Prikazuje tekući položaj tokom prevlačenja miša
        g.drawString("*", horizontalni.getValue(), vertikalni.getValue());
    }
    public static void main(String[] args) {
        ScrollBarDemo scrollBarDemo = new ScrollBarDemo();
        scrollBarDemo.setSize(new Dimension(300, 180));
        scrollBarDemo.setTitle("ScrollBarDemo");
        scrollBarDemo.setVisible(true);
    }
 
}
