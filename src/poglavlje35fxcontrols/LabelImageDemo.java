package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class LabelImageDemo extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("LabelImageDemo");
        FlowPane flowPane = new FlowPane();
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 320, 200);
        stage.setScene(scene);
        
        //Slika kao objekat tipa image
        Image image = new Image(getClass().getResource("Java.jfif").toExternalForm());
        
        //Pravi objekat ImageView koji sadrži zadatu sliku.
        ImageView javaView = new ImageView(image);
        
        //Pravi natpis koji sadrži i sliku i tekst
        Label label = new Label("Java", javaView);
        
        //Za prikaz slike iznad teksta, odnosno iznad labele
        label.setContentDisplay(ContentDisplay.TOP);
        
        //Postavlja natpis na graf scene
        flowPane.getChildren().add(label);
        
        stage.show();
    }
    
}
