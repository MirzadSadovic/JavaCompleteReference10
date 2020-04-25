package poglavlje24eventhandling;

import java.awt.*;
import java.awt.event.*;

//Prikazuje virtuelne kodove nekih tastera
public class KeyboardEventDemo extends Frame implements KeyListener {

    String poruka = "";
    String tasterStanje = "";

    public KeyboardEventDemo() {
        addKeyListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        poruka += e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        tasterStanje = "pritisnut";

        int taster = e.getKeyCode();
        switch (taster) {
            case KeyEvent.VK_F1:
                poruka += "<F1>";
                break;
            case KeyEvent.VK_F2:
                poruka += "<F2>";
                break;
            case KeyEvent.VK_F3:
                poruka += "<F3>";
                break;
            case KeyEvent.VK_PAGE_DOWN:
                poruka += "<PgDn>";
                break;
            case KeyEvent.VK_PAGE_UP:
                poruka += "<PgUp>";
                break;
            case KeyEvent.VK_LEFT:
                poruka += "<Stelica ulijevo>";
                break;
            case KeyEvent.VK_RIGHT:
                poruka += "<Strelica udesno>";
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        tasterStanje = "otpušten";
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 20, 100);
        g.drawString(tasterStanje, 20, 50);
    }

    public static void main(String[] args) {
        KeyboardEventDemo appProzor = new KeyboardEventDemo();
        appProzor.setSize(new Dimension(300, 250));
        appProzor.setTitle("KeyboardEventDemo");
        appProzor.setVisible(true);
    }
    
}
