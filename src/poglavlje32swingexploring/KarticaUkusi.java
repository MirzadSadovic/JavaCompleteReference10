/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poglavlje32swingexploring;

import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class KarticaUkusi extends JPanel{

    public KarticaUkusi() {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Vanilija");
        comboBox.addItem("Čokolada");
        comboBox.addItem("Jagoda");
        add(comboBox);
    }
    
}
