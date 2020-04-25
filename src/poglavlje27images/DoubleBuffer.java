package poglavlje27images;

import java.awt.*;
import java.awt.event.*;

public class DoubleBuffer extends Frame {

    int korak = 3;
    int mx;
    int my;
    boolean treperenje = true;
    Image buffer = null;
    int width = 400;
    int height = 400;

    public DoubleBuffer() {

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                treperenje = false;
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                mx = me.getX();
                my = me.getY();
                treperenje = true;
                repaint();
            }
        });
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Graphics ekran = null;
        if (!treperenje) {
            ekran = g;
            g = buffer.getGraphics();
        }
        g.setColor(Color.blue);
        g.fillRect(0, 0, width, height);

        g.setColor(Color.red);
        for (int i = 0; i < width; i += korak) {
            g.drawLine(i, 0, width - i, height);
        }
        for (int i = 0; i < height; i += korak) {
            g.fillRect(0, i, width, height - 1);
        }
        g.setColor(Color.black);
        g.drawString("Pritisni taster miša za dvostruko baferovanje ", width/5, height / 2);

        g.setColor(Color.yellow);
        g.fillOval(mx - korak, my - korak, korak * 2 + 1, korak * 2 + 1);

        if (!treperenje) {
            ekran.drawImage(buffer, 0, 0, null);
        }
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    public static void main(String[] args) {
        DoubleBuffer doubleBuffer = new DoubleBuffer();
        doubleBuffer.setSize(new Dimension(400, 400));
        doubleBuffer.setTitle("Dvostruko baferovanje");
        doubleBuffer.setVisible(true);
        //konstruisanje bafera izvan ekrana
        doubleBuffer.buffer = doubleBuffer.createImage(doubleBuffer.width, doubleBuffer.height);
    }
}
