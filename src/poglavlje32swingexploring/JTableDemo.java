package poglavlje32swingexploring;

import java.awt.*;
import javax.swing.*;

public class JTableDemo {
    
    String[] zaglavljeKolona = {"Ime", "Lokal", "ID#"};
    Object[][] podaci = {
        {"Mirzad", "4567", "987"},
        {"Elma", "8521", "125"},
        {"Uma", "2154", "745"},
        {"Hadija", "8574", "564"},
        {"Nusret", "3658", "847"},
        {"Mirzad", "4567", "987"},
        {"Elma", "8521", "125"},
        {"Uma", "2154", "745"},
        {"Hadija", "8574", "564"},
        {"Nusret", "3658", "847"},
    };
    
    public JTableDemo() {
        JFrame frame = new JFrame("JTableDemo"); //defaultni raspoređivač BorderLayout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);

        //Izrada tabele
        JTable tabela = new JTable(podaci, zaglavljeKolona);

        //Postavlja tabelu u okno za pomjeranje sadržaja
        JScrollPane scrollPane = new JScrollPane(tabela);

        //Okno za pomjeranje sadržaja postavljamo u okno sa sadržajem
        frame.add(scrollPane);
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JTableDemo());
    }
}
