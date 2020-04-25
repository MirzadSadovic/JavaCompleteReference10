package poglavlje25awt;

import java.awt.event.*;
import java.awt.*;

//Crtanje grafičkih elemenata
public class GraphicsDemo extends Frame {
    
    public GraphicsDemo() {
        //Anonimna interna klasa za obradu događaja zatvranje prozora
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {    
        //Crtanje linija
        g.drawLine(20, 40, 100, 00);
        g.drawLine(20, 90, 100, 40);
        g.drawLine(40, 45, 250, 80);
        //crtanje pravougaonika
        g.drawRect(20, 150, 60, 50);
        g.fillRect(110, 150, 60, 50);
        g.drawRoundRect(200, 150, 60, 50, 15, 15);
        g.fillRoundRect(290, 150, 60, 50, 30, 40);
        //crtanje elipsa i krugova
        g.drawOval(20, 50, 50, 50);
        g.fillOval(100, 250, 75, 50);
        g.drawOval(200, 260, 100, 40);
        //crtanje kružnog luka
        g.drawArc(20, 350, 70, 70, 0, 180);
        g.fillArc(70, 350, 70, 70, 0, 180);
        //crtanje poligona
        int xKoord[] = {20, 200, 20, 200, 20};
        int yKoord[] = {450, 450, 650, 650, 450};
        int num = 5;
        g.drawPolygon(xKoord, yKoord, num);
    }
    public static void main(String[] args) {
        GraphicsDemo appWin = new GraphicsDemo();
        appWin.setSize(370, 700);
        appWin.setTitle("GraphicsDemo");
        appWin.setVisible(true);
    }
   
}
