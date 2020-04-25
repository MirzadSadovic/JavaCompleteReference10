package poglavlje32swingexploring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Ilustracija upotrebe dugmeta tipa JButton sa ikonicom
public class JButtonDemo implements ActionListener{
     
    JLabel natpis;

    public JButtonDemo() {
        JFrame frame = new JFrame("JButtonDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        //Kreiranje dugmadi i dodavanje u okno za sadržaj
        ImageIcon bird = new ImageIcon("Bird.gif");
        JButton button = new JButton(bird);
        button.setActionCommand("Ptica");
        button.addActionListener(this);
        frame.add(button);
        
        ImageIcon cat = new ImageIcon("Cat.gif");
        button = new JButton(cat);
        button.setActionCommand("Mačka");
        button.addActionListener(this);
        frame.add(button);
        
        ImageIcon dog = new ImageIcon("Dog.gif");
        button = new JButton(dog);
        button.setActionCommand("Pas");
        button.addActionListener(this);
        frame.add(button);
        
        ImageIcon rabbit = new ImageIcon("Rabbit.gif");
        button = new JButton(rabbit);
        button.setActionCommand("Zec");
        button.addActionListener(this);
        frame.add(button);
        
        natpis = new JLabel("Izaberite sliku");
        frame.add(natpis);
        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        natpis.setText("Odabran/a je " + ae.getActionCommand());
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JButtonDemo());
    }
}
