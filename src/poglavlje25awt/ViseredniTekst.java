package poglavlje25awt;

import java.awt.*;
import java.awt.event.*;

//Ilustracija prikazivanja više redova teksta
public class ViseredniTekst extends Frame {

    int tekuciX = 20; //tekući položaj
    int tekuciY = 40;

    public ViseredniTekst() {
        Font f = new Font("SansSerif", Font.PLAIN, 12);
        setFont(f);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        sljedeciRed("Ovo je prvi red. ", g);
        sljedeciRed("Ovo je drugi red. ", g);
        istiRed(" Još uvjek drugi. ", g);
        istiRed(" i Ovo takođe. ", g);
        sljedeciRed("Ovo je treći red. ", g);
        tekuciX = 20;
        tekuciY = 40; //Resetujemo koordinate kad god osvjezavamo sadržaj ekrana
    }

    //prelazak u sljedeći red
    void sljedeciRed(String s, Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        tekuciY += fm.getHeight(); //prelazimo u sljedeći red
        tekuciX = 20;
        g.drawString(s, tekuciX, tekuciY);
        tekuciX += fm.stringWidth(s); //prelazimo na kraj reda
    }
    //prikazivanj eteksta u istom redu
    void istiRed(String s, Graphics g){
        FontMetrics fm = g.getFontMetrics();
        g.drawString(s, tekuciX, tekuciY);
        tekuciX += fm.stringWidth(s); //prelazimo na kraj reda
    }
    public static void main(String[] args) {
        ViseredniTekst prozor = new ViseredniTekst();
        prozor.setSize(new Dimension(300, 120));
        prozor.setTitle("Višeredni tekst");
        prozor.setVisible(true);
    }
}
