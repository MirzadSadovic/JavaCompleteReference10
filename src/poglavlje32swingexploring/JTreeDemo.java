package poglavlje32swingexploring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.*;

public class JTreeDemo {
    
    public JTreeDemo() {
        //Priprema prozora tipa JFrame, važi podrazumjevni način raspoređivanja(BorderLayout)
        JFrame frame = new JFrame("JTreeDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 250);

        //Čvor najvišeg nivoa na stablu 
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Options");

        //Grupa "A"
        DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
        root.add(a);
        DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
        a.add(a2);

        //Grupa "B"
        DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
        root.add(b);
        DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
        b.add(b2);
        DefaultMutableTreeNode b3 = new DefaultMutableTreeNode("B3");
        b.add(b3);

        //Izrada stabla
        JTree stablo = new JTree(root);

        //Postavlja stabla u okno za pomjeranje sadržaja
        JScrollPane scrollPane = new JScrollPane(stablo);

        //Postavlja okno za pomjeranje sadržaja u okno za sadržaj
        frame.add(scrollPane);

        //Postavlja natpis u oknu sa sadržajem 
        JLabel natpis = new JLabel();
        frame.add(natpis, BorderLayout.SOUTH);

        //Obrada događaja biranje elemenata na stablu.
        stablo.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent tse) {
                natpis.setText("Izabrana je putanja " + tse.getPath());
            }
        });
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JTreeDemo());
    }
}
