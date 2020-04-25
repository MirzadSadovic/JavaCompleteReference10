package poglavlje24eventhandling;

import java.awt.*;
import java.awt.event.*;
//Ilustracija obrade događaja ćiji je izvor tastatura

public class SimpleKey extends Frame implements KeyListener {
    
    String poruka = "";
    String tasterStanje = "";
    
    public SimpleKey() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    //Događaj: otkucano nešto
    @Override
    public void keyTyped(KeyEvent e) {
        poruka += e.getKeyChar();
        repaint();
    }
    //Događaj: taster pritisnut
    @Override
    public void keyPressed(KeyEvent e) {
        tasterStanje = "pritisnut";
        repaint();
    }
    //Događaj: taster otpušten
    @Override
    public void keyReleased(KeyEvent e) {
        tasterStanje = "otpušten";
        repaint();
    }
    
    //Prikazujemo pritisnute tastere
    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 20, 100);
        g.drawString(tasterStanje, 20, 50);
    }
    
    public static void main(String[] args) {
        SimpleKey appProzor = new SimpleKey();
        appProzor.setSize(new Dimension(300, 250));
        appProzor.setTitle("SimpleKey");
        appProzor.setVisible(true);
    }
}
