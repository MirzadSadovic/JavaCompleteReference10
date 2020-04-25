package poglavlje32swingexploring;

import java.awt.*;
import javax.swing.*;

public class JTextFieldDemo {

    public JTextFieldDemo() {
        JFrame frame = new JFrame(("JTextFieldDemo"));
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 120);

        //Kreira polje za tekst i stavlja ga u okno sa sadržajem
        JTextField polje = new JTextField(15);
        frame.add(polje);

        JLabel natpis = new JLabel();
        frame.add(natpis);

        //Obrada akcionih događaja
        //Prikazuje test kada korisnik pritisne enter
        polje.addActionListener((e) -> natpis.setText(polje.getText()));

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JTextFieldDemo());
    }
}
