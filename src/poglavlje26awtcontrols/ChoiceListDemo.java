package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba padajuće liste
public class ChoiceListDemo extends Frame implements ItemListener {

    Choice os, browser;
    String poruka = "";
    
    public ChoiceListDemo() throws HeadlessException {
        setLayout(new FlowLayout());
        
        os = new Choice();
        browser = new Choice();
        
        os.add("Windows");
        os.add("Android");
        os.add("Solaris");
        os.add("MacOS");
        
        browser.add("Internet Explorer");
        browser.add("Firefox");
        browser.add("Chrome");

        //postavljanje listi u prozor programa
        add(os);
        add(browser);
        
        os.addItemListener(this);
        browser.addItemListener(this);
        
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
        poruka = "Odabrani OS je: ";
        poruka += os.getSelectedItem();
        g.drawString(poruka, 20, 120);
        poruka = "Odabrani Browser je: ";
        poruka += browser.getSelectedItem();
        g.drawString(poruka, 20, 140);
    }
    
    public static void main(String[] args) {
        ChoiceListDemo choiceListDemo = new ChoiceListDemo();
        choiceListDemo.setSize(new Dimension(250, 200));
        choiceListDemo.setTitle("ChoiceListDemo");
        choiceListDemo.setVisible(true);
    }
}
