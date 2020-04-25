package poglavlje31swinguvod;

import javax.swing.*;

//Ilustruje iscrtavanje linija direktno na panou
public class PaintDemo {

    JLabel natpis;
    PaintPanel pp;

    public PaintDemo() {
        JFrame jFrame = new JFrame("Paint Demo");
        jFrame.setSize(200, 150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Pano na kojem crtamo
        pp = new PaintPanel();

        //Pano dodajemo u okno sa sadržajem. Pošto važi podrazumjevani način raspoređivanja BorderLayout,
        //veličina okna se automatski podešava a pano se postavlja u središnji dio prozora
        jFrame.add(pp);

        //Prikazujemo glavni prozor
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        //Glavni kontenjer definišemo u niti gdje se obrađuju događaji
        SwingUtilities.invokeLater(() -> new PaintDemo());
    }
}
