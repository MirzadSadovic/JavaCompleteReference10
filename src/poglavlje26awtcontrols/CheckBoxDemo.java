package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba polja za potvrđivanje(check box-a)
public class CheckBoxDemo extends Frame implements ItemListener {

    String poruka = "";
    Checkbox windows, android, solaris, mac;

    public CheckBoxDemo() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        windows = new Checkbox("Windows", true);
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("Mac OS");

        add(windows);
        add(android);
        add(solaris);
        add(mac);

        //prijemnici za događaje
        windows.addItemListener(this);
        android.addItemListener(this);
        solaris.addItemListener(this);
        mac.addItemListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    //Prikazuje tekuće stanje polja za potvrđivanje
    @Override
    public void paint(Graphics g) {
        poruka = "Tekuće stanje: ";
        g.drawString(poruka, 20, 120);
        poruka = " Windows: " + windows.getState();
        g.drawString(poruka, 20, 140);
        poruka = " Android: " + android.getState();
        g.drawString(poruka, 20, 160);
        poruka = " Solaris: " + solaris.getState();
        g.drawString(poruka, 20, 180);
        poruka = " MacOS: " + mac.getState();
        g.drawString(poruka, 20, 200);
    }
    public static void main(String[] args) {
        CheckBoxDemo checkBoxDemo = new CheckBoxDemo();
        checkBoxDemo.setSize(new Dimension(240, 220));
        checkBoxDemo.setTitle("CheckBoxDemo");
        checkBoxDemo.setVisible(true);
    }
}
