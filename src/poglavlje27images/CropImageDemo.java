package poglavlje27images;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

//Upotreba klase CropImageFilter za dijeljenje slike u više manjih komada
public class CropImageDemo extends Frame {

    Image slika;
    Image celija[] = new Image[4 * 4];
    int sirinaSlike;
    int visinaSlike;
    int sirinaPlocice;
    int visinaPlocice;

    public CropImageDemo() throws HeadlessException {
        try {
            File imageFile = new File("Java.jfif");
            //Učitavanje slike
            slika = ImageIO.read(imageFile);

            sirinaSlike = slika.getWidth(null);
            visinaSlike = slika.getHeight(null);
            sirinaPlocice = sirinaSlike / 4;
            visinaPlocice = visinaSlike / 4;

            CropImageFilter f;
            FilteredImageSource fis;

            for (int y = 0; y < 4; y++) {
                for (int x = 0; x < 4; x++) {
                    f = new CropImageFilter(sirinaPlocice * x, visinaPlocice * y, sirinaPlocice, visinaPlocice);
                    fis = new FilteredImageSource(slika.getSource(), f);
                    int i = y * 4 + x;
                    celija[i] = createImage(fis);
                }
            }
            for (int i = 0; i < 32; i++) {
                int si = (int) (Math.random() * 16);
                int di = (int) (Math.random() * 16);
                Image pomocna = celija[si];
                celija[si] = celija[di];
                celija[di] = pomocna;
            }
        } catch (IOException exc) {
            System.out.println("Slika se nemoze ucitati");
            System.exit(0);
        }
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        for (int y = 0; y < 4; y++) {
            for (int x = 0; x < 4; x++) {
                g.drawImage(celija[y * 4 + x], x * sirinaPlocice + getInsets().left,
                                               y * visinaPlocice + getInsets().top, null);
            }
        }
    }
    public static void main(String[] args) {
        CropImageDemo cropImageDemo = new CropImageDemo();
        cropImageDemo.setSize(new Dimension(300, 250));
        cropImageDemo.setTitle("CropImageDemo");
        cropImageDemo.setVisible(true);
    }

}
