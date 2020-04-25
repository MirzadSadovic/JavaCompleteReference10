package poglavlje26awtcontrols;

import java.awt.*;
import java.awt.event.*;

//Primjer za GridLayoutManager
public class GridLayoutDemo extends Frame {

    static final int n = 4;

    public GridLayoutDemo() {
        setLayout(new GridLayout(n, n)); //Raspored komponenata u obliku tabele
        setFont(new Font("SansSerif", Font.BOLD, 24));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i * n + j;
                if (k > 0) {
                    add(new Button("" + k));
                }
            }
        }
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public Insets getInsets() {
        return new Insets(35, 10, 10, 10);
    }
    
    public static void main(String[] args) {
        GridLayoutDemo gridLayoutDemo = new GridLayoutDemo();
        gridLayoutDemo.setSize(new Dimension(300, 220));
        gridLayoutDemo.setTitle("GridLayoutDemo");
        gridLayoutDemo.setVisible(true);
    }
}
