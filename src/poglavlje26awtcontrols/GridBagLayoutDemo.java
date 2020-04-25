package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Ulustracija upotrebe GridBagLayout Managera
public class GridBagLayoutDemo extends Frame implements ItemListener {

    String poruka = "";
    Checkbox windows, android, solaris, mac;

    public GridBagLayoutDemo() {
        //Raspored komponenata u obiku mreže (GridBagLayout)
        GridBagLayout mreza = new GridBagLayout();
        GridBagConstraints ogranicenja = new GridBagConstraints();
        setLayout(mreza);

        //Definicija polja za potvrđivanje
        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("MacOs");

        //Definicaja mreže
        //Prvi red ima podrazumjevanu(default-nu) vrijednost (row weight (0))
        ogranicenja.weightx = 1.0; //column weight of 1
        ogranicenja.ipadx = 200; // dopuna od 200 jedinica
        ogranicenja.insets = new Insets(0, 6, 0, 0); //mali pomjeraj na lijevoj strani

        ogranicenja.anchor = GridBagConstraints.NORTHEAST;

        ogranicenja.gridwidth = GridBagConstraints.RELATIVE;
        mreza.setConstraints(windows, ogranicenja);

        ogranicenja.gridwidth = GridBagConstraints.REMAINDER;
        mreza.setConstraints(android, ogranicenja);

        //Drugi red ima vrijednost 1
        ogranicenja.weighty = 1.0;

        ogranicenja.gridwidth = GridBagConstraints.RELATIVE;
        mreza.setConstraints(solaris, ogranicenja);

        ogranicenja.gridwidth = GridBagConstraints.REMAINDER;
        mreza.setConstraints(mac, ogranicenja);

        //Dodavanje komponenti
        add(windows);
        add(android);
        add(solaris);
        add(mac);

        //Registrovanje za prijem događaja komponenata
        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //Kada se promjeni status nekog polja za potvrđivanje, ponovo iscrtavamo sadržaj prozora
    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();;
    }

    @Override
    public void paint(Graphics g) {
        poruka = "Tekuće stanje: ";
        g.drawString(poruka, 20, 100);
        poruka = "Windows: " + windows.getState();
        g.drawString(poruka, 30, 120);
        poruka = "Andrid: " + android.getState();
        g.drawString(poruka, 30, 140);
        poruka = "Solaris: " + solaris.getState();
        g.drawString(poruka, 30, 160);
        poruka = "MacOS: " + mac.getState();
        g.drawString(poruka, 30, 180);      
    }
    public static void main(String[] args) {
        GridBagLayoutDemo gridBagLayoutDemo = new GridBagLayoutDemo();
        gridBagLayoutDemo.setSize(new Dimension(250, 200));
        gridBagLayoutDemo.setTitle("GridBagLayoutDemo");
        gridBagLayoutDemo.setVisible(true);
    }
}
