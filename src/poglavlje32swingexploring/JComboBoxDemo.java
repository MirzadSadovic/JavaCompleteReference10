package poglavlje32swingexploring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxDemo {
    
    String slike[] = {"Ptica", "Mačka", "Pas", "Zec"};

    public JComboBoxDemo() {
        JFrame frame = new JFrame("JComboBoxDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        
        //Izrad kombinovane liste(JComboBox) i dodavanje u okno sa sadržajem
        JComboBox<String> jComboBox = new JComboBox<>(slike);
        frame.add(jComboBox);
        
        //Izrada natpisa(Labele) i postavljanje u okno sa sadržajem
        JLabel jLabel = new JLabel(new ImageIcon("Bird.gif"));
        frame.add(jLabel);
        
        //Obrada događaja biranja slike
        jComboBox.addActionListener((ActionEvent ae) -> {
            String slika = (String) jComboBox.getSelectedItem();
            jLabel.setIcon(new ImageIcon(slika + ".gif"));
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()-> new JComboBoxDemo());
    }
}
