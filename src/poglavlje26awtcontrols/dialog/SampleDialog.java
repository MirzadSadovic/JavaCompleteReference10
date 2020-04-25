package poglavlje26awtcontrols.dialog;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class SampleDialog extends Dialog {

    public SampleDialog(Frame parent, String title) {
        super(parent, title, false);
        setLayout(new FlowLayout());
        setSize(300, 200);

        add(new Label("Press this button"));

        Button b;
        add(b = new Button("Cancel"));
        b.addActionListener((ae) -> dispose());

        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Ovo je unutar okvira za dialog", 20, 80);
    }
    
}
