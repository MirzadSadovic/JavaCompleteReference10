/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poglavlje32swingexploring;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class KarticaGradovi extends JPanel{

    public KarticaGradovi() {
        JButton button1 = new JButton("Sarajevo");
        add(button1);
        JButton button2 = new JButton("Tuzla");
        add(button2);
        JButton button3 = new JButton("Zenica");
        add(button3);
        JButton button4 = new JButton("Mostar");
        add(button4);
    }
    
}
