/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poglavlje32swingexploring;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class KarticaBoje extends JPanel {

    public KarticaBoje() {
        JCheckBox checkBox1 = new JCheckBox("Crvena");
        add(checkBox1);
        JCheckBox checkBox2 = new JCheckBox("Zelena");
        add(checkBox2);
        JCheckBox checkBox3 = new JCheckBox("Plava");
        add(checkBox3);

    }

}
