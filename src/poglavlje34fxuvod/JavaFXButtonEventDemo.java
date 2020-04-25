package poglavlje34fxuvod;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXButtonEventDemo extends Application {

    Label natpis;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFXButtonEventDemo"); //Dodjeljivanje naslova stage-u
        FlowPane root = new FlowPane(10, 10);  //Raspoređivač FlowPane sa vertikalnim i horizontalnim razmakom 10.
        root.setAlignment(Pos.CENTER); //centriranje kontrola scene
        Scene myScene = new Scene(root, 300, 100); //pravi scenu
        stage.setScene(myScene);//postavlja scenu na stage
        natpis = new Label("Pritisnite neko dugme"); //pravi natpis

        Button buttonAlfa = new Button("Alfa");
        Button buttonBeta = new Button("Beta");

        //Obrada akcionih događaja u dugmetu Alfa
        buttonAlfa.setOnAction((t) -> natpis.setText("Pritisnuto je dugme Alfa."));//Verzija 1 pomoću lambde

        //Obrada akcionih događaja u dugmetu Alfa
        buttonBeta.setOnAction(new EventHandler<ActionEvent>() {  //Verzija 2 anonimna inner klasa
            @Override
            public void handle(ActionEvent t) {
                natpis.setText("Pritisnuto je dugme Beta.");
            }
        });

        root.getChildren().addAll(buttonAlfa, buttonBeta, natpis); //dodaje natpis i dugmad na graf scene
        stage.show(); //prikazivanje stage-a skupa sa scenom i kontrolama u njoj
    }

}
