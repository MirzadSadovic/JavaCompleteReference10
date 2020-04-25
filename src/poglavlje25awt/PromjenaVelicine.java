package poglavlje25awt;

import java.awt.event.*;
import java.awt.*;

//Mijenja veličinu sadrzaja tako da se uklopi u velicinu prozora
public class PromjenaVelicine extends Frame {
    
    final int korak = 25;
    int max = 500;
    int min = 200;
    Dimension d;
    
    public PromjenaVelicine() {
        //Anonimna inner klasa(interna) za obradu događaja otpuštanje tastera miša
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int w = (d.width + korak) > max ? min : (d.width + korak);
                int h = (d.height + korak) > max ? min : (d.height + korak);
                setSize(new Dimension(w, h));
            }            
        });
        //Anonimna inner klasa za obradu događaja zatvaranje prozora
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }            
        });
    }

    @Override
    public void paint(Graphics g) {
        Insets i = getInsets();
        d = getSize();
        
        g.drawLine(i.left, i.top, d.width-i.right, d.height-i.bottom);
        g.drawLine(i.left, d.height-i.bottom, d.width-i.right, i.top);
    }
    
    public static void main(String[] args) {
        PromjenaVelicine apProzor = new PromjenaVelicine();
        apProzor.setSize(new Dimension(200, 200));
        apProzor.setTitle("PromjenaVeličine");
        apProzor.setVisible(true);
    }
}
