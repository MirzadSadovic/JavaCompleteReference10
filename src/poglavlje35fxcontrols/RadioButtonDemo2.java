/*
 Ovaj primjer upotrebe radio dugmadi ilustruje kako se pod kontrolom programa može saznati tekuće izabrano dugme
 u grupi, kada to zatreba, umjesto obrađivanja akcionih događaja ili događaja promjene

 U ovom primjeru ne obrađuje se ni jedan događaj koji se tiče radio dugmadi, nego koja je tekuća izabrana opcija
 utvrđujemo kada se pritisne dugme "Potvrdi izbor načina prevoza.
 */
package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonDemo2 extends Application {
    
    Label natpis;
    ToggleGroup grupa;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("RadioButton2");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 200, 140);
        stage.setScene(scene);
        Label choose = new Label("     Izaberi način prevoza     ");
        natpis = new Label("Nije potvrđen način prevoza");

        //Pravi dugme za potvrđivanje načina prevoza
        Button dugmePotvrdi = new Button("Potvrdi izbor načina prevoza");

        //Pravimo raddio dugmad
        RadioButton trainButton = new RadioButton("Train");
        RadioButton carButton = new RadioButton("Car");
        RadioButton airplaneButton = new RadioButton("Airplane");

        //Pravi grupu za radio dugmad i postavlja svako dugme u nju
        grupa = new ToggleGroup();
        trainButton.setToggleGroup(grupa);
        carButton.setToggleGroup(grupa);
        airplaneButton.setToggleGroup(grupa);

        //Početan izbor jednog od radio dugmadi
        trainButton.setSelected(true);

        //Obarda događajau u dugmetu za potvrđivanje načina prevoza
        dugmePotvrdi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                //Učitava tekuće izabrano dugme u grupi
                RadioButton rb = (RadioButton) grupa.getSelectedToggle();
                //Prikazuje izabranu opciju
                natpis.setText("Potvrđen je prevoz " + rb.getText());
            }
        });
        //Separator za bolje razmještanje elemenata u prozor
        Separator separator = new Separator();
        separator.setPrefWidth(180);
        
        //Postavlja natpis i dugmad na graf scene
        flowPane.getChildren().addAll(choose, trainButton, carButton, airplaneButton, separator, dugmePotvrdi, natpis);
        //Prikazuje pozornicu i scenu
        stage.show();
    }
}
