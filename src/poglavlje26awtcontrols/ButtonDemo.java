package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba dugmadi (Buttons)
public class ButtonDemo extends Frame implements ActionListener {

    String poruka = "";
    Button da, ne, mozda;
    
    public ButtonDemo() {
        //Raspored kontrola tipa FlowLayout
        setLayout(new FlowLayout());
        //Pravimo nekoliko dugmadi
        da = new Button("Da");
        ne = new Button("Ne");
        mozda = new Button("Neodlučan");
        //postavljanje dugmadi u prozor
        add(da);
        add(ne);
        add(mozda);
        //dodavanje prijemnika za akacije u dugmićima
        da.addActionListener(this);
        ne.addActionListener(this);
        mozda.addActionListener(this);

        //anonymous inner class za zatvaranje prozora
        addWindowListener(new WindowAdapter() {
            
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }           
        });
    }    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if(str.equals("Da")){
            poruka = "Pritisnuto je dugme Da.";
        }
        else if(str.equals("Ne")){
            poruka = "Pritisnuto je dugme Ne.";
        }
        else{
            poruka = "Pritisnuto je dugme Neodlučan";
        }
       repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 8, 100);
    }
    
    public static void main(String[] args) {
        ButtonDemo buttonDemo =  new ButtonDemo();
        buttonDemo.setSize(300, 150);
        buttonDemo.setTitle("ButtonDemo");
        buttonDemo.setVisible(true);
    }
}
