package poglavlje34fxuvod;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class JavaFXStruktura extends Application{
    public static void main(String[] args) {
        System.out.println("Pokretanje JavaFX aplikacije");
        
        launch(args);
    }

    //Redefinicija metode init();
    @Override
    public void init(){
        System.out.println("Izvršava se metoda init();");
    }
    
    //Redefinicija metode start();
    @Override
    public void start(Stage myStage) throws Exception {
        System.out.println("Izvršava se metoda start();");
        
        //Dodjeljuje naslov pozornici
        myStage.setTitle("JavaFXStruktura");
        //Pravi korijenski čvor. U ovom slučaju koristi se raspored elemenata u nizu, ali postoji i vise drugih
        FlowPane korijenskiCvor  = new FlowPane();
        //Pravi scenu
        Scene myScene = new Scene(korijenskiCvor, 300, 200);
        //Postavlja scenu na pozornicu
        myStage.setScene(myScene);
        //prikazuje pozornicu i scenu
        myStage.show();
    }
    
    //Redefinicija metode stop();
    @Override
    public void stop(){
        System.out.println("Izvršava se metoda stop();");
    }
}
