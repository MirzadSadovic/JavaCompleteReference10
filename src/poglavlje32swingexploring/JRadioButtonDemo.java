package poglavlje32swingexploring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButtonDemo implements ActionListener {

    JLabel natpis;
    
    public JRadioButtonDemo() {
        JFrame frame = new JFrame("JRadioButton");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 100);

        //Izrada dugmadi i postavljanje u okno sa sadržajem
        JRadioButton radioButton1 = new JRadioButton("A");
        radioButton1.addActionListener(this);
        frame.add(radioButton1);
        
        JRadioButton radioButton2 = new JRadioButton("B");
        radioButton2.addActionListener(this);
        frame.add(radioButton2);
        
        JRadioButton radioButton3 = new JRadioButton("C");
        radioButton3.addActionListener(this);
        frame.add(radioButton3);

        //Definisanje grupe dugmadi
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        
        natpis = new JLabel("Izaberite opciju");
        frame.add(natpis);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        natpis.setText("Izarbali ste opciju " + e.getActionCommand());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JRadioButtonDemo());
    }
}
