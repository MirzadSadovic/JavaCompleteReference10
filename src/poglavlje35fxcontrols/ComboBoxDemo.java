package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application {

    Label natpis;

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ComboBoxDemo");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 280, 120);
        stage.setScene(scene);
        natpis = new Label();
        
        //Pravi listu tipa ObservableList stavki za prikazivanje na listi.
        ObservableList<String> nacinPrevoza = FXCollections.observableArrayList("Train", "Car", "Airplane");
        
        //Pravi padajuću listu
        ComboBox comboBoxTransport = new ComboBox(nacinPrevoza);
        //Zadaje defaultnu vrijednost
        comboBoxTransport.setValue("Train");
        comboBoxTransport.setEditable(true);  //Editabilni ComboBox
        
        //Podešava natpis tako da prikazuje defaultni izbor
        natpis.setText("Izabran je prevoz " + comboBoxTransport.getValue());
        
        //Obrada akcionih događaja u padajućoj listi
        comboBoxTransport.setOnAction((ae)-> natpis.setText("Izabran je prevoz " + comboBoxTransport.getValue()));
        
        flowPane.getChildren().addAll(comboBoxTransport, natpis);
        stage.show();
    }
    
}
