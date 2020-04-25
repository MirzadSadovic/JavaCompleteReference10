package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba BorderLayout Managera
public class BorderLayoutDemo extends Frame {

    public BorderLayoutDemo() {
        //U ovoj vrsti prozora BordrLayoutManager je podrazumjevani manager(raspoređivač kontrola)
        add(new Button("Ovo ide u gornji red"), BorderLayout.NORTH);
        add(new Button("Ovaj tekst ide na dno"), BorderLayout.SOUTH);
        add(new Button("Desno"), BorderLayout.EAST);
        add(new Button("Lijevo"), BorderLayout.WEST);

        String text = "Razuman čovjek prilagođava\n"
                + "sebe spoljnom svijetu,\n"
                + "nerazuman neprekidno pokušava\n"
                + "da prilagodi svijet sebi\n"
                + "Prema tome, napredak čovječanstva\n"
                + "zavisi od nerazumnih ljudi.\n\n"
                + "         - George Bernard Shaw\n\n";
        add(new TextArea(text), BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public static void main(String[] args) {
        BorderLayoutDemo borderLayoutDemo = new BorderLayoutDemo();
        borderLayoutDemo.setSize(new Dimension(300, 220));
        borderLayoutDemo.setTitle("BorderLayoutManagerDemo");
        borderLayoutDemo.setVisible(true);
    }
}
