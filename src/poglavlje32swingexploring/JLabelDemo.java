package poglavlje32swingexploring;

import java.awt.*;
import javax.swing.*;

public class JLabelDemo {

    public JLabelDemo() {
        //Priprema prozora tipa JFrame
        JFrame frame = new JFrame("JLabel Demo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 230);
        
        //Priprema ikonice
        ImageIcon icon = new ImageIcon("Java.jfif");
        
        //Priprema natpisa
        JLabel label = new JLabel("Java", icon, JLabel.CENTER);
        
        //Postavljanje labele u okno sa sadržajem
        frame.add(label);
        
        //Prikazivanje prozora
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        //Glavni kontenjer definišemo u niti gdje se obrađuju događaji
        SwingUtilities.invokeLater(() -> new JLabelDemo());
    }
}
