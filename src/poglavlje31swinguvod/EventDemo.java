package poglavlje31swinguvod;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo {

    JLabel natpis;

    public EventDemo() {
        //Izrada novog kontenjera tipa JFrame.
        JFrame jFrame = new JFrame("Primjer obrade događaja");

        //Raspored elemenatau kontenjer je tipa FlowLayout (nizanje)
        jFrame.setLayout(new FlowLayout());

        //Početna veličina glavnog prozora
        jFrame.setSize(220, 90);

        //Program završava rda kada korisnik zatvori aplikaciju
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Definišemo dva dugmeta
        JButton buttonAlfa = new JButton("Alfa");
        JButton buttonBeta = new JButton("Beta");

        //Obrada akcionih događaja dugmeta Alfa. Primjer 1 sa anonimnom inner klasom
        buttonAlfa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                natpis.setText("Pritisnuto je dugme Alfa");
            }
        });
        //Obrada akcionih događaja dugmeta Beta. Primjer 2 sa Lamdom (bolji, laksi, kraci, brzi) :)
        buttonBeta.addActionListener((e) -> natpis.setText("Pritisnuto je dugme Beta"));

        //Postavljanje dugmadi u okno sa sadržajem
        jFrame.add(buttonAlfa);
        jFrame.add(buttonBeta);

        //Natpis za prikazivanj eteksta
        natpis = new JLabel("Pritisnite dugme");

        //Postavljanje natpisa u okno sa sadržajem
        jFrame.add(natpis);

        //Prikazivanje glavnog prozora vidljivim
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        //Glavni kontenjer definišemo u niti gdje se obrađuju događaji
        SwingUtilities.invokeLater(() -> new EventDemo());
    }
}
