package poglavlje31swinguvod;

import javax.swing.*;

//Jednostavna swing aplikacija
public class SwingDemo {

    public SwingDemo() {

        //Izrada kontenjera tipa JFrame
        JFrame jFrame = new JFrame("Jednostavna Swing aplikacija");

        //Početna veličina kontenjera
        jFrame.setSize(350, 200);

        //Kada korisnik pritisne(X), prekida se rad programa
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Izrada natpisa koji prikazuje tekst
        JLabel natpis = new JLabel("Swing omogućava izradu moćnih GUI-a.");

        //Natpis postavljen u okno sa sadržajem
        jFrame.add(natpis);

        //Prikaz kontenjera
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        //Glavni kontenjer definišemo u niti gdje se obrađuju događaji
        SwingUtilities.invokeLater(() -> new SwingDemo());
    }
}
