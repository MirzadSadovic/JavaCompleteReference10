package poglavlje32swingexploring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Upotreba JToggleButtona
public class JToggleButtonDemo {
    
    public JToggleButtonDemo() {
        JFrame frame = new JFrame("JToggleButtonDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        
        JLabel natpis = new JLabel("Dugme je isključeno");

        //Priprema preklopno dugme
        JToggleButton toggleButton = new JToggleButton("On/Off");

        //Obrada događaja u toggleButton-u.
        toggleButton.addItemListener((ItemEvent e) -> {
            if (toggleButton.isSelected()) {
                natpis.setText("Dugme je uključeno");
            } else {
                natpis.setText("Dugme je isključeno");
            }
        });
        //Postavlja toggleButton i natpis u okno sa sadržajem
        frame.add(toggleButton);
        frame.add(natpis);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Prozor formiramo u niti za obradu događaja
        SwingUtilities.invokeLater(() -> new JToggleButtonDemo());
    }
}
