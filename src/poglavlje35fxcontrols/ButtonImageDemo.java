package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonImageDemo extends Application {
    
    Label response;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ButtonImageDemo");
        //Raspored elemenata FlowPane u korijenskom čvoru. U ovom slučaju, zadajemo vgap i hgap razmak od 10
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 300, 300);
        stage.setScene(scene);
        response = new Label("Pritisni dugme");
        
        //Slika kao objekat tipa image
        Image image = new Image(getClass().getResource("Java.jfif").toExternalForm());
        
        //Pravi dugme sa slikom
        Button buttonJava = new Button("Java", new ImageView(image));
        
        //Postavlja tekst ispod slike(odnosno sliku iznad teksta)
        buttonJava.setContentDisplay(ContentDisplay.TOP);
        
        //Obrada dogaaja u dugmetu s pješčanikom
        buttonJava.setOnAction((akcija) -> response.setText("Pritisnut je Button Java"));
        
        //Dodaje natpis i dugme na graf scenu
        flowPane.getChildren().addAll(buttonJava, response);
        
        stage.show();
        
    }
    
}
