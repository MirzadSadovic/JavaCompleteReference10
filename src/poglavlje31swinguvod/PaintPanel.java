package poglavlje31swinguvod;

import java.awt.*;
import javax.swing.*;
import java.util.*;

//Ova klasa prosiruje(nasljeđuje) klasu JPanel
//Redefiniše metodu paintComponent() tako da se na panou iscrtavaju nasumično raspoređene linije
class PaintPanel extends JPanel {

    Insets ivice; //sadrži ivice panoa
    Random rand;  //služi za generisanje nasumičnih brojeva

    //Izrada panoa
    public PaintPanel() {
        //Definišemo ivice panoa
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));

        rand = new Random();
    }

    //Redefinisana verzija metode paintComponent().
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  //Uvjek prvo pozivamo istoimenu metodu natklase

        int x, y, x2, y2;

        //Utvrđujemo visinu i širinu komponente
        int visina = getHeight();
        int sirina = getWidth();

        //Ivice komponente
        ivice = getInsets();

        //Iscrtavamo deset linija čije završne tačke određujemo nasumično
        for (int i = 0; i < 10; i++) {
            //Izračunavamo nasumične koordinate koje određuju završne tačke svake linije
            x = rand.nextInt(sirina - ivice.left);
            y = rand.nextInt(visina - ivice.bottom);
            x2 = rand.nextInt(sirina - ivice.left);
            y2 = rand.nextInt(visina - ivice.bottom);

            //Crtanje linije.
            g.drawLine(x, y, x2, y2);
        }
    }
}
