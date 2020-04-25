package poglavlje34fxuvod;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class JavaFXLabelDemo extends Application{
    
    public static void main(String[] args) {
        
        launch(args);  //pokreće JavFX aplikaciju tako što poziva metodu launch();
    }

    @Override
    public void start(Stage stage) {                       //Redefinisanje metode start();
        stage.setTitle("JavaFXLabelDemo");                 //Dodjela naslova stage-u (pozornici)
        FlowPane root = new FlowPane();                    //Raspoređivač za root(korijenski čvor)
        stage.setScene(new Scene(root, 300, 200));         //Kreira i postavlja scenu na stage(pozornicu)
        Label myLabel = new Label("Ovo je JavaFX labela"); //Kreiranje labele(natpisa)
        root.getChildren().add(myLabel);                   //Postavljanje natpisa na graf scene
        stage.show();                                      //prikazivanje pozornice
    }
}
