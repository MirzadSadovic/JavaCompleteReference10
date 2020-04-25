package poglavlje33swingmenu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Primjer jednostavnog glavnog menija
public class MenuDemo implements ActionListener {

    JLabel natpis;
    JPopupMenu popupMenu;

    public MenuDemo() {
        //Pravi novi kontenjer tipa JFrame
        JFrame prozor = new JFrame("MenuDemo");
        //prozor.setLayout(new FlowLayout()); Koristi cemo BorderLayaut (defaultni)
        prozor.setSize(360, 200);
        prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        natpis = new JLabel();

        //Pravi paletu menija
        JMenuBar paletaMenija = new JMenuBar();

        //Pravi meni File
        JMenu meniFile = new JMenu("File");
        meniFile.setMnemonic(KeyEvent.VK_F);

        JMenuItem stavkaOpen = new JMenuItem("Open", KeyEvent.VK_O);
        stavkaOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));

        JMenuItem stavkaClose = new JMenuItem("Close", KeyEvent.VK_C);
        stavkaClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));

        JMenuItem stavkaSave = new JMenuItem("Save", KeyEvent.VK_S);
        stavkaSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        JMenuItem stavkaExit = new JMenuItem("Exit", KeyEvent.VK_E);
        stavkaExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));

        meniFile.add(stavkaOpen);
        meniFile.add(stavkaClose);
        meniFile.add(stavkaSave);
        meniFile.addSeparator();
        meniFile.add(stavkaExit);
        paletaMenija.add(meniFile);

        //Pravi meni Options
        JMenu meniOptions = new JMenu("Options");
        meniOptions.setToolTipText("Izbor opcija pomoću Radio i CheckBox buttona");

        //Pravi meni Colors
        //I biranje boja pomocu Checkboxa to omoguđava da se odabere više od jedne stavke
        JMenu meniColors = new JMenu("Colors");
        JCheckBoxMenuItem stavkaRed = new JCheckBoxMenuItem("Red");
        JCheckBoxMenuItem stavkaGreen = new JCheckBoxMenuItem("Green");
        JCheckBoxMenuItem stavkaBlue = new JCheckBoxMenuItem("Blue");
        meniColors.add(stavkaRed);
        meniColors.add(stavkaGreen);
        meniColors.add(stavkaBlue);
        meniOptions.add(meniColors);

        //Pravi podmeni Priority
        //I biranje nivoa prioriteta pomocu RadioButton-a, sa Default odabranim High prioritetom
        JMenu meniPriority = new JMenu("Priority");
        JRadioButtonMenuItem stavkaHigh = new JRadioButtonMenuItem("High", true);
        JRadioButtonMenuItem stavkaLow = new JRadioButtonMenuItem("Low");
        meniPriority.add(stavkaHigh);
        meniPriority.add(stavkaLow);
        meniOptions.add(meniPriority);

        //Kreiranje grupe za Radio button kako bi se moglo odabirati naizmjenično(tj.kad se jedo pritisne drugo se gasi
        ButtonGroup grupa = new ButtonGroup();
        grupa.add(stavkaHigh);
        grupa.add(stavkaLow);

        //Pravi stavke meija Reset
        JMenuItem stavkaReset = new JMenuItem("Reset");
        meniOptions.addSeparator();
        meniOptions.add(stavkaReset);

        //Doodaje cijeli meniOptions na paletu menija
        paletaMenija.add(meniOptions);

        //Pravi meni Help
        JMenu meniHelp = new JMenu("Help");
        JMenuItem stavkaAbout = new JMenuItem("About");
        stavkaAbout.setToolTipText("Informacije o programu MenuDemo");
        meniHelp.add(stavkaAbout);
        paletaMenija.add(meniHelp);

        //Pridružuje stavkama menija osluškivače akcionih događaja
        stavkaOpen.addActionListener(this);
        stavkaClose.addActionListener(this);
        stavkaSave.addActionListener(this);
        stavkaExit.addActionListener(this);
        stavkaRed.addActionListener(this);
        stavkaGreen.addActionListener(this);
        stavkaBlue.addActionListener(this);
        stavkaHigh.addActionListener(this);
        stavkaLow.addActionListener(this);
        stavkaReset.addActionListener(this);
        stavkaAbout.addActionListener(this);

        //Kreiranje popup(iskačućeg) menija
        popupMenu = new JPopupMenu();
        //Pravljenje stavki iskačućeg menija
        JMenuItem stavkaCut = new JMenuItem("Cut");
        JMenuItem stavkaCopy = new JMenuItem("Copy");
        JMenuItem stavkaPaste = new JMenuItem("Paste");
        popupMenu.add(stavkaCut);
        popupMenu.add(stavkaCopy);
        popupMenu.add(stavkaPaste);
        stavkaCut.addActionListener(this);
        stavkaCopy.addActionListener(this);
        stavkaPaste.addActionListener(this);

        //Listener(osluškivač) za popupMenu
        prozor.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        //Postavlja natpis u okno za sadržaje
        prozor.add(natpis);

        //Postavlja paletuMenija u prozor
        prozor.setJMenuBar(paletaMenija);

        //Prikazuje prozor
        prozor.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Učitava akcionu komandu izabrane opcije menija
        String odabir = e.getActionCommand();
        if (odabir.equals("Exit")) {
            System.exit(0);
        } else {
            natpis.setText("Izabrana je opcija: " + odabir);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuDemo());
    }
}
