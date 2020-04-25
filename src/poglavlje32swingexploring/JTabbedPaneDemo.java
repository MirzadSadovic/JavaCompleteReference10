package poglavlje32swingexploring;

import java.awt.FlowLayout;
import javax.swing.*;

public class JTabbedPaneDemo {
    
    public JTabbedPaneDemo() {
        JFrame frame = new JFrame("JTabbedPaneDemo");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        //Priprema grupe kartica
        JTabbedPane kartice = new JTabbedPane();
        kartice.addTab("Gradovi", new KarticaGradovi());
        kartice.addTab("Boje", new KarticaBoje());
        kartice.addTab("Ukusi", new KarticaUkusi());
        frame.add(kartice);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JTabbedPaneDemo());
    }    
}
