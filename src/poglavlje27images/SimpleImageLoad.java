package poglavlje27images;


import java.awt.event.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;

public class SimpleImageLoad extends Frame {

    Image slika;

    public SimpleImageLoad() {
        try {
            File datoteka = new File("Java.jfif");
            //Učitavanje slike
            slika = ImageIO.read(datoteka);
        } catch (IOException exc) {
            System.out.println("Slika se nemože učitati iz datoteke.");
            System.exit(0);
        }
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(slika, getInsets().left, getInsets().top, null);
    }
    
    public static void main(String[] args) {
        SimpleImageLoad simpleImage = new SimpleImageLoad();
        simpleImage.setSize(new Dimension(300, 250));
        simpleImage.setTitle("Učitavanje slike");
        simpleImage.setVisible(true);
    }
}
