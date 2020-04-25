package poglavlje26awtcontrols.dialog;

import java.awt.*;
import java.awt.event.*;

//Primjer okvira za dialog
public class DialogBoxDemo extends Frame {

    String poruka = "";
    CheckboxMenuItem debug, test;
    SampleDialog myDialog;

    public DialogBoxDemo() {
        myDialog = new SampleDialog(this, "New Dialog Box");

        MenuBar mainMenu = new MenuBar();
        setMenuBar(mainMenu);
        //Stavke menija
        Menu fileMenu = new Menu("File");
        MenuItem stavka1, stavka2, stavka3, stavka4, stavka5;
        fileMenu.add(stavka1 = new MenuItem("New..."));
        fileMenu.add(stavka2 = new MenuItem("Open..."));
        fileMenu.add(stavka3 = new MenuItem("Close"));
        fileMenu.add(stavka4 = new MenuItem("-"));
        fileMenu.add(stavka5 = new MenuItem("Quit..."));
        mainMenu.add(fileMenu);

        Menu editMenu = new Menu("Edit");
        MenuItem stavka6, stavka7, stavka8, stavka9;
        editMenu.add(stavka6 = new MenuItem("Cut"));
        editMenu.add(stavka7 = new MenuItem("Copy"));
        editMenu.add(stavka8 = new MenuItem("Paste"));
        editMenu.add(stavka9 = new MenuItem("-"));

        Menu subMenu = new Menu("Special");
        MenuItem stavka10, stavka11, stavka12;
        subMenu.add(stavka10 = new MenuItem("First"));
        subMenu.add(stavka11 = new MenuItem("Second"));
        subMenu.add(stavka12 = new MenuItem("Third"));
        editMenu.add(subMenu);
        //Ovo su stavke menija koje se mogu potvrđivati
        debug = new CheckboxMenuItem("Debug");
        editMenu.add(debug);
        test = new CheckboxMenuItem("Testing");
        editMenu.add(test);

        mainMenu.add(editMenu);

        //Objekat za obradu akcionih događaja i događaja u stavkama menija.
        PrijemnikZaMeni prijemnik = new PrijemnikZaMeni();

        //Registrujemo objekat kao prijemnik događaja.
        stavka1.addActionListener(prijemnik);
        stavka2.addActionListener(prijemnik);
        stavka3.addActionListener(prijemnik);
        stavka4.addActionListener(prijemnik);
        stavka5.addActionListener(prijemnik);
        stavka6.addActionListener(prijemnik);
        stavka7.addActionListener(prijemnik);
        stavka8.addActionListener(prijemnik);
        stavka9.addActionListener(prijemnik);
        stavka10.addActionListener(prijemnik);
        stavka11.addActionListener(prijemnik);
        stavka12.addActionListener(prijemnik);
        debug.addItemListener(prijemnik);
        test.addItemListener(prijemnik);

        //Izbor opcije "Quit" obrađujemo pomoću lambda izraza.
        stavka5.addActionListener((ae) -> System.exit(0));

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(poruka, 10, 200);

        if (debug.getState()) {
            g.drawString("Debug is ON", 10, 240);
        } else {
            g.drawString("Debug is OFF", 10, 240);
        }

        if (test.getState()) {
            g.drawString("Testing is ON", 10, 260);
        } else {
            g.drawString("Testing is OFF", 10, 260);
        }
    }

    public static void main(String[] args) {
        DialogBoxDemo dialogBoxDemo = new DialogBoxDemo();
        dialogBoxDemo.setSize(new Dimension(250, 300));
        dialogBoxDemo.setTitle("DialogBoxDemo");
        dialogBoxDemo.setVisible(true);
    }

//Inner klasa za obradu akcionih i drugih događaja u stavkama menija
    class PrijemnikZaMeni implements ActionListener, ItemListener {

        //Obrada akcionih događaja(handle action event)
        @Override
        public void actionPerformed(ActionEvent ae) {
            poruka = "Izabrali ste opciju ";
            String arg = ae.getActionCommand();
            switch (arg) {
                case "New...":
                    poruka += "New.";
                    myDialog.setVisible(true);
                    break;
                case "Open...":
                    poruka += "Open.";
                    myDialog.setVisible(true);
                    break;
                case "Close":
                    poruka += "Close.";
                    break;
                case "Quit...":
                    poruka += "Quit.";
                    break;
                case "Edit":
                    poruka += "Edit.";
                    break;
                case "Cut":
                    poruka += "Cut.";
                    break;
                case "Copy":
                    poruka += "Copy.";
                    break;
                case "Paste":
                    poruka += "Paste.";
                    break;
                case "First":
                    poruka += "First.";
                    break;
                case "Second":
                    poruka += "Second.";
                    break;
                case "Third":
                    poruka += "Third.";
                    break;
                case "Debug":
                    poruka += "Debug.";
                    break;
                case "Testing":
                    poruka += "Testing";
                    break;
            }
            repaint();
        }

        //Obrada događaja u stavkama menija(handle item event)
        @Override
        public void itemStateChanged(ItemEvent ae) {
            repaint();
        }
    }
}
