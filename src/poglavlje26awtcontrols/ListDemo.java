package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba komponenata tipa List
public class ListDemo extends Frame implements ActionListener {

    List os, browser;
    String poruka = "";
    
    public ListDemo() throws HeadlessException {
        setLayout(new FlowLayout());

        //lista na kojij se moze odabrati vise stavki
        os = new List(4, true);

        //lista na kojij se moze odabrati samo jedna stavka
        browser = new List(4);
        
        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("MacOS");
        
        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");

        //Inicijalni izbor na listama
        os.select(0);
        browser.select(1);
        
        add(os);
        add(browser);
        
        os.addActionListener(this);
        browser.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }            
        });        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    //Prikazivanje trenutno odabranih stavki
    @Override
    public void paint(Graphics g) {
        int index[];
        
        poruka = "Trenutno odabrani OS je: ";
        index = os.getSelectedIndexes();
        for(int i =0; i <index.length; i ++){
            poruka += os.getItem(index[i]) + " ";
        }
        g.drawString(poruka, 8, 120);
        poruka = "Odabrani Browser: ";
        poruka += browser.getSelectedItem();
        g.drawString(poruka, 8, 140);
    }
    
    public static void main(String[] args) {
        ListDemo listDemo = new ListDemo();
        listDemo.setSize(new Dimension(300, 180));
        listDemo.setTitle("ListDemo");
        listDemo.setVisible(true);
    }
}
