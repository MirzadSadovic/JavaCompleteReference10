package poglavlje32swingexploring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBoxDemo implements ItemListener {

    JLabel natpis;
    
    public JCheckBoxDemo() {
        JFrame frame = new JFrame("JCheckBoxDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 100);

        //Kreiranje i postavljanje JCheckBoxa u okno sa sadržajem
        JCheckBox checkBox = new JCheckBox("C");
        checkBox.addItemListener(this);
        frame.add(checkBox);
        
        checkBox = new JCheckBox("C++");
        checkBox.addItemListener(this);
        frame.add(checkBox);
        
        checkBox = new JCheckBox("Java");
        checkBox.addItemListener(this);
        frame.add(checkBox);
        
        checkBox = new JCheckBox("Perl");
        checkBox.addItemListener(this);
        frame.add(checkBox);
        
        natpis = new JLabel("Izaberite programski jezik");
        frame.add(natpis);
        
        frame.setVisible(true);
    }

    //Obrada događaja "biranje stavke" u poljima za potvrđivanje
    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox checkBox = (JCheckBox) e.getItem();
        if (checkBox.isSelected()) {
            natpis.setText("Odabran je programski jezik " + checkBox.getText());
        } else {
            natpis.setText(checkBox.getText() + " je isključen");
        }
    }

    public static void main(String[] args) {
        //Prozor formiramo u niti za obradu događaja
        SwingUtilities.invokeLater(() -> new JCheckBoxDemo());
    }
}
