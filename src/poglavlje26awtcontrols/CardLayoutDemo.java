package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba CardLayoutManagera
public class CardLayoutDemo extends Frame {

    Checkbox windows10, windows8, windows7, android, solaris, mac;
    Panel osCard;
    CardLayout cardLayout;
    Button win, other;

    public CardLayoutDemo() {
        setLayout(new FlowLayout());
        win = new Button("Windows");
        other = new Button("Ostali");
        add(win);
        add(other);

        //U panelu osCard zadajemo raspored CardLayout
        cardLayout = new CardLayout();
        osCard = new Panel(cardLayout);
        //osCard.setLayout(cardLayout);

        windows7 = new Checkbox("Windows 7", true);
        windows8 = new Checkbox("WIndows 8", true);
        windows10 = new Checkbox("Windows 10", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOS");

        //Panaelu dodajemo polja zapotvrđivanje koja važe za Windows.
        Panel winPanel = new Panel();
        winPanel.add(windows7);
        winPanel.add(windows8);
        winPanel.add(windows10);

        //Panelu dodajemo polja za potvrđivanje koja važe za druge operativne sisteme
        Panel otherPanel = new Panel();
        otherPanel.add(android);
        otherPanel.add(solaris);
        otherPanel.add(mac);

        //Panele pojedinačnih kartica dodajemo zajedničkom panelu
        //koji predstavlja paket svih kartica
        osCard.add(winPanel, "Windows");
        osCard.add(otherPanel, "Ostali");

        //Paket kartica postavljamo u novi prozor
        add(osCard);

        //Događaje buttona obrađujemo pomoću lambda izraza
        win.addActionListener((ae) -> cardLayout.show(osCard, "Windows"));
        other.addActionListener((ae) -> cardLayout.show(osCard, "Ostali"));

        //Registracijaprijema događaja miša
        addMouseListener(new MouseAdapter() {
            //Prikazivanje sljedećeg panela
            @Override
            public void mousePressed(MouseEvent e) {
                cardLayout.next(osCard);
            }
        });
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        CardLayoutDemo cardLayoutDemo = new CardLayoutDemo();
        cardLayoutDemo.setSize(new Dimension(300, 220));
        cardLayoutDemo.setTitle("CardLayoutDemo");
        cardLayoutDemo.setVisible(true);
    }
}
