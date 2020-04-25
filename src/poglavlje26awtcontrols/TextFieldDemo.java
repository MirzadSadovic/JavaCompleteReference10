package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Upotreba polja tekst
public class TextFieldDemo extends Frame implements ActionListener {

    TextField name, password;

    public TextFieldDemo() {
        setLayout(new FlowLayout());

        //Definisanje kontrola
        Label nameLabel = new Label("Name: ", Label.RIGHT);
        Label passwordLabel = new Label("Password", Label.RIGHT);
        name = new TextField(12);
        password = new TextField(10);
        password.setEchoChar('*');

        //Postavljanje kontrola u prozor programa
        add(nameLabel);
        add(name);
        add(passwordLabel);
        add(password);

        //Registrovanje za prijem akcionih događaja u poljima za tekst
        name.addActionListener(this);
        password.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    //Korisnik je pritisnuo taster ENTER
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Name: " + name.getText(), 20, 100);
        g.drawString("Označeni tekst u imenu: " + name.getSelectedText(), 20, 120);
        g.drawString("Password:" + password.getText(), 20, 140);
    }
    public static void main(String[] args) {
        TextFieldDemo textFieldDemo = new TextFieldDemo();
        textFieldDemo.setSize(new Dimension(400, 180));
        textFieldDemo.setTitle("LogIn");
        textFieldDemo.setVisible(true);
    }
}
