package poglavlje32swingexploring;

import java.awt.*;
import javax.swing.*;

public class JScrollPaneDemo {
    
    public JScrollPaneDemo() {
        JFrame frame = new JFrame("JScrollPaneDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Postavlja 400 dugmadi na pano tipa Jpanel
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(20, 20));
        int b = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                jPanel.add(new JButton("Button " + b));
                ++b;
            }
        }
        //Izrada okna za pomjeranje sadržaja
        JScrollPane jScrollPane = new JScrollPane(jPanel);

        //Okno za pomjeranje sadržaja dodajemo u okno za sadržaj.Pošto se koristi podrazumjevani(default) način
        //razmještanja komponenata (BorderLayout), okno za pomjeranje sadržaja se postavlja na sredinu prozora
        frame.add(jScrollPane); //frame.add(jScrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JScrollPaneDemo());
    }
}
