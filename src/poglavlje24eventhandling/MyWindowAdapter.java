package poglavlje24eventhandling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Kada se pritisne dugme za zatvaranje prozora, 
//zatvoriti prozor i prekinuti sa radom
public class MyWindowAdapter extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}
