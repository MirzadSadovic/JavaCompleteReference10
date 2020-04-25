package poglavlje25awt;

import java.awt.event.*;
import java.awt.*;

//Ilustracija režima XOR
public class XOR extends Frame {
    
    int chsX = 100;
    int chsY = 100;
    
    public XOR() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                chsX = x - 10;
                chsY = y - 10;
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
    //Ilustruje XOR način rada

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(20, 40, 60, 70);
        
        g.setColor(Color.blue);
        g.fillRect(110, 40, 60, 70);
        
        g.setColor(Color.black);
        g.fillRect(200, 40, 60, 70);
        
        g.setColor(Color.red);
        g.fillRect(60, 120, 160, 110);
        
        //krstić u režimu XOR
        g.setXORMode(Color.black);
        g.drawLine(chsX-10, chsY, chsX+10, chsY);
        g.drawLine(chsX, chsY-10, chsX, chsY+10);
        g.setPaintMode();
    }
    public static void main(String[] args) {
        XOR prozor = new XOR();
        prozor.setSize(new Dimension(300, 260));
        prozor.setTitle("XOR Demo");
        prozor.setVisible(true);
    }
 
}
