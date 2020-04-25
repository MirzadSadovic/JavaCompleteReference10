/*
 Jednostavan primjer upotrebe RadioButtona

 Ovaj program obra]uje akcione dogadjaje koji se generisu biranjem radio buttona
 Tako]er pokayuje kako se dugme postavlja u iyabrano stanje pod kontrolom progama
 */
package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application {

    Label natpis;

    public static void main(String[] args) {
        launch(args); //pokreće JavaFX aplikaciju, pozivanjem metode 
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("RadioButtonDemo");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 220, 120);
        stage.setScene(scene);
        natpis = new Label("");

        //Pravimo raddio dugmad
        RadioButton trainButton = new RadioButton("Train");
        RadioButton carButton = new RadioButton("Car");
        RadioButton airplaneButton = new RadioButton("Airplane");

        //Pravi grupu za dugmad
        ToggleGroup group = new ToggleGroup();
        trainButton.setToggleGroup(group);
        carButton.setToggleGroup(group);
        airplaneButton.setToggleGroup(group);

        /*
        //Obrada akicionih događaja u radio-dugmadima         -> NAČIN 1. pojedinačno
        trainButton.setOnAction((action) -> natpis.setText("Izabran je prevoz željeznicom"));
        carButton.setOnAction((action) -> natpis.setText("Izabran je prevoz automobilom"));
        airplaneButton.setOnAction((action) -> natpis.setText("Izabran je prevoz avionom"));

        //Poziva metodu fire() za prvu opciju. 
        //To čini da radio dugme postaje izabrano i generiše akcioni događaj za to dugme
        trainButton.fire();
        */
        
        //Osluškivač događaja promjene koji obrađuje promjenu  -> NAČIN 2 grupno
        //izabrane opcije unutar grupe radio buttona
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
            @Override
            public void changed(ObservableValue<? extends Toggle>changed, Toggle oldVal, Toggle newVal){
                //Pretvara u tip RadioButton
                RadioButton rb = (RadioButton) newVal;
                //Prikazuje izabranu opciju
                natpis.setText("Izabran je prevoz " + rb.getText());
            }
        });
        //Bira prvo dugme.To će generisati događaj promjene stanja same grupe dugmadi
        trainButton.setSelected(true);

        //Postavlja natpis i dugmad na gaf scene
        flowPane.getChildren().addAll(trainButton, carButton, airplaneButton, natpis);
        //Prkazuje pozornicu i scenu
        stage.show();

    }
}
