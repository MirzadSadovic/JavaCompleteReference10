package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application {

    TextField poljeZaTekst;
    Label natpis;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TextFielDemo");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 230, 140);
        stage.setScene(scene);
        
        //Natpis koji će prikazivati polja za tekst
        natpis = new Label("Pojam za taženje");
        
        //Dugme koje učitava tekst
        Button tekstButton = new Button("Pretraga");
        
        //Definiše polje za tekst
        poljeZaTekst = new TextField();
        
        //Uvodna poruka u polju za tekst
        poljeZaTekst.setPromptText("Upiši pojam za traženje");
        
        //Podešava poželjan broj kolona u polju
        poljeZaTekst.setPrefColumnCount(15);
        
        //Obrađuje akcione događaje u polju za tekst. 
        //Akcioni događaji se generišu kada korisnik pritisne ENTER dok polje za tekst ima ulazni fokus. 
        //U ovom slučaju, tada učitavamo tekst u polju i prikazujemo ga kao natpis
        poljeZaTekst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                natpis.setText("Pojam za traženje: " + poljeZaTekst.getText());
            }
        });
        
        //Učitava i prikazuje tekst iz polja kada korisnik pritisne dugme
        tekstButton.setOnAction((ae)->natpis.setText("Pojam za traženje: " + poljeZaTekst.getText()));
        
        //Separator za bolje organizovanje sadržaja u prozoru
        Separator separator = new Separator();
        separator.setPrefWidth(180);
        
        flowPane.getChildren().addAll(poljeZaTekst, tekstButton, separator, natpis);
        stage.show();
    }
}
