package poglavlje32swingexploring;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListDemo {

    //Formiranje niza gradova
    String Gradovi[] = {"New York", "Chicago", "Houston", "Denver",
                        "Los Angeles", "Seattle", "London", "Paris",
                        "Hon Kong", "Tokyo", "Sydney", "Sarajevo"};

    public JListDemo() {
        JFrame frame = new JFrame("JListDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 200);
        
        JList<String> list = new JList<>(Gradovi);
        
        //Način biranja stavki na listi podešava se na biranej samo jedne stavke
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        //Postavlja listu u okno za pomjeranje sadržaja
        JScrollPane scrollPane = new JScrollPane(list);
        //Zadajemo poželjnu veličinu okna za pomjeranje sadržaja
        scrollPane.setPreferredSize(new Dimension(130, 100));
        
        //Natpis koji prikazuje tekst izabrane stavke
        JLabel natpis = new JLabel("Izaberite Grad");
        
        //Obrada događaja biranja stavke na listi
        list.addListSelectionListener((ListSelectionEvent e) -> {           
            int index = list.getSelectedIndex();//Utvrđuje index izabrane stavke            
            if(index != -1){//Prikazuje tekst izabrane stavke, ako postoji
                natpis.setText("Izabrali ste: " + Gradovi[index]);               
            }else{//Ako ne postoji prikazujemo početni tekst
                natpis.setText("Izaberite Grad");
            }
        });
        
        frame.add(scrollPane);
        frame.add(natpis);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->new JListDemo());
    }
}
