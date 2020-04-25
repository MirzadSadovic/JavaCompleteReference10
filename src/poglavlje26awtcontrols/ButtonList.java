package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Prepoznavanje objakata klase Button
public class ButtonList extends Frame implements ActionListener {

    String poruka = "";
    Button buttonList[] = new Button[3];

    public ButtonList() {
        setLayout(new FlowLayout());

        Button da = new Button("Da");
        Button ne = new Button("Ne");
        Button mozda = new Button("Neodlučan");

        //kada dodamo novo dugme pamtimo referencu na njega
        buttonList[0] = (Button) add(da);
        buttonList[1] = (Button) add(ne);
        buttonList[2] = (Button) add(mozda);

        //registrovanje na prijem akcionih događaja dugmadi
        for (int i = 0; i < 3; i++) {
            buttonList[i].addActionListener(this);
        }
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        for(int i = 0; i < 3; i ++){
            if(ae.getSource() == buttonList[i]){
                poruka = "Pritisnuto je dugme " + buttonList[i].getLabel();
            }
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 20, 100);
    }
    
    public static void main(String[] args) {
        ButtonList buttonProzor = new ButtonList();
        buttonProzor.setSize(250, 150);
        buttonProzor.setTitle("ButtonList");
        buttonProzor.setVisible(true);
        
    }
}
