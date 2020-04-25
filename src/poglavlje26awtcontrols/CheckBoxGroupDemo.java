package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba grupe polja za check box (Radio button)
public class CheckBoxGroupDemo extends Frame implements ItemListener {

    String poruka = "";
    CheckboxGroup group;

    public CheckBoxGroupDemo() {
        setLayout(new FlowLayout());
        group = new CheckboxGroup();
        Checkbox windows = new Checkbox("Windows", group, true);
        Checkbox android = new Checkbox("Android", group, false);
        Checkbox solaris = new Checkbox("Solaris", group, false);
        Checkbox mac = new Checkbox("MacOS", group, false);
        add(windows);
        add(android);
        add(solaris);
        add(mac);
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
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        poruka = "Trenutni izbor: ";
        poruka += group.getSelectedCheckbox().getLabel();
        g.drawString(poruka, 20, 120);
    }
    
    public static void main(String[] args) {
        CheckBoxGroupDemo checkBoxGroupDemo = new CheckBoxGroupDemo();
        checkBoxGroupDemo.setSize(new Dimension(240, 180));
        checkBoxGroupDemo.setTitle("CheckBoxGroupDemo");
        checkBoxGroupDemo.setVisible(true);
    }
}
