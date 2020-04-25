package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ListViewDemo extends Application {

    Label natpis;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ListViewDemo");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 200, 120);
        stage.setScene(scene);
        natpis = new Label("Select transport type");

        //Pravi listu tipa ObservableList stavki za prikazivanje na listi.
        ObservableList<String> nacinPrevoza = FXCollections.observableArrayList("Train", "Car", "Airplane", "Bicycle", "Walk");

        //Pravi listu za prikazivanje
        ListView<String> listView = new ListView<>(nacinPrevoza);
        
        //Biranje više stavki na listi
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);        

        //Podešava poželjnu visinu i širinu
        listView.setPrefSize(80, 80);

        //Učitava važeći model biranja stavki na listi
        MultipleSelectionModel<String> multipleSelectionModel = listView.getSelectionModel();

        //Osluškivač promjena na listi radi obrade događaja promjene izabrane stavke
        multipleSelectionModel.selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {
                
                String izabraneStavke = "";
                ObservableList<String> selected = listView.getSelectionModel().getSelectedItems();
                for(int i =0; i < selected.size();i++){
                    izabraneStavke += "\n             " + selected.get(i);
                    
                    natpis.setText("Izabrani načini prijevoza " + izabraneStavke);
                }               
            }
        });
        //Stavljanje labele i liste u graf scene
        flowPane.getChildren().addAll(listView, natpis);
        //Prikazivanje pozornice i scene
        stage.show();
    }

}
