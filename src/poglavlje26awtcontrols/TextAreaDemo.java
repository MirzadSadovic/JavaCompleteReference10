package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba komponente TextArea
public class TextAreaDemo extends Frame {

    public TextAreaDemo() {
        setLayout(new FlowLayout());
        String poruka = "Java 9 je verzija najpopularnijeg\n"
                + "jezika za programiranje internet aplikacija.\n"
                + "Nastavljajući bogato naslijeđe Java je unaprijedila\n"
                + "programiranje. Jedan od razloga stalnog uspjeha Jave je\n"
                + "njena neprekidna evoluacija. Java nikad ne miruje\n"
                + "nego se neprekidno prilagođava umreženom svijetu\n"
                + "čije se okruženje brzo mijenja. Štaviše, Java je često\n"
                + "predvodnik i drugima označava put koji treba da slijede.";
        TextArea text = new TextArea(poruka, 10, 30);
        add(text);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        TextAreaDemo textAreaDemo = new TextAreaDemo();
        textAreaDemo.setSize(new Dimension(300, 220));
        textAreaDemo.setTitle("TextAreaDemo");
        textAreaDemo.setVisible(true);
    }
}
