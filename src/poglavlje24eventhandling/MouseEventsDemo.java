package poglavlje24eventhandling;

//Ilustracija obrade nekoliko događaja čiji je izvor miš

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener{
    
    String poruka = "";
    int mouseX = 0; //koordinate pokazivača miša
    int mouseY = 0; //koordinate pokazivača miša

    public MouseEventsDemo(){
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }    
    //Događaj: taster miša je pritisnut i otpušten   
    @Override
    public void mouseClicked(MouseEvent e) {
        poruka = poruka + " -- Događaj Click";
        repaint();
    }
    //Događaj: pritisnut taster miša
    @Override
    public void mousePressed(MouseEvent e) {
        //pamtimo tekuće koordinate
        mouseX = e.getX();
        mouseY = e.getY();
        poruka = "Taster pritisnut";
        repaint();
    }
    //Događaj: otpušten taster miša
    @Override
    public void mouseReleased(MouseEvent e) {
        //pamtimo tekuće koordinate
        mouseX = e.getX();
        mouseY = e.getY();
        poruka = "Taster otpušten";
        repaint();
    }
    //Pokazivač miša je ušao u oblast prozora
    @Override
    public void mouseEntered(MouseEvent e) {
        mouseX = 100;
        mouseY = 100;
        poruka = "Pokazivač miša je ušao u prozor";
        repaint();
    }
    //Pokazivač miša je izašao iz prozora
    @Override
    public void mouseExited(MouseEvent e) {
        mouseX = 100;
        mouseY = 100;
        poruka = "Pokazivač miša je izašao iz prozora";
        repaint();       
    }
    //Događaj: prevlačenje mišem
    @Override
    public void mouseDragged(MouseEvent e) {
        //pamtimo tekuće koordinate
        mouseX = e.getX();
        mouseY = e.getY();
        poruka = "*" + " miš na " + mouseX + ", " + mouseY;
        repaint();
    }
    //Događaj: pomjeranje miša
    @Override
    public void mouseMoved(MouseEvent e) {
        //prikazujemo status
        poruka = "Miš pomjeren na " + e.getX() + ", " + e.getY();
        repaint();
    }
    //Prikazujemo poruku u prozoru na tekućim koordinatama X, Y.
    @Override
    public void paint(Graphics g){
       g.drawString(poruka, mouseX, mouseY);
    }
    
    public static void main(String[] args) {
       MouseEventsDemo appProzor = new MouseEventsDemo();
       
       appProzor.setSize(new Dimension(300, 300));
       appProzor.setTitle("MouseEventDemo");
       appProzor.setVisible(true);
    }
}
