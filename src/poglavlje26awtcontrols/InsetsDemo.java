package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Border Layout sa umetcima(Insets)
public class InsetsDemo extends Frame{

    public InsetsDemo() {
        
        //Podešavanje boje pozadine tako da se umeci lakše uocavaju
        setBackground(Color.cyan);
        
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
    //Redefinišemo metodu getInsets() da bi dodali umetke
    @Override
    public Insets getInsets(){
        return new Insets(40, 15, 15, 15);
    }
    
    public static void main(String[] args) {
        InsetsDemo insetsDemo =  new InsetsDemo();
        insetsDemo.setSize(new Dimension(300, 220));
        insetsDemo.setTitle("InsetsDemo");
        insetsDemo.setVisible(true);
    }
}
