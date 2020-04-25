package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class TreeViewDemo extends Application{
    Label natpis;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("TreeViewDemo");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 310, 460);
        stage.setScene(scene);
        natpis = new Label("Nije ništa izabrano");
        
        //Konstruiše elemente stabla , počev od korijena
        TreeItem<String> treeItemKorijen = new TreeItem<>("Hrana");
        
        //Dodajemo podstabla, počev od podstabla voće
        TreeItem<String> treeItemVoce = new TreeItem<>("Voće");
        //Konstruišemo podstablo Jabuke
        TreeItem<String> treeItemJabuke = new TreeItem<>("Jabuke");
        //Čvoru Jabuke, dodajemo čvorove potomke
        treeItemJabuke.getChildren().add(new TreeItem<>("Idared"));
        treeItemJabuke.getChildren().add(new TreeItem<>("Grenismit"));
        treeItemJabuke.getChildren().add(new TreeItem<>("Jonatan"));
        //Dodaje vrste čvoru voće
        treeItemVoce.getChildren().add(treeItemJabuke);
        treeItemVoce.getChildren().add(new TreeItem<>("Kruške"));
        treeItemVoce.getChildren().add(new TreeItem<>("Narandže"));
        
        //Najzad čvor Voće dodajemo korijenskom stablu
        treeItemKorijen.getChildren().add(treeItemVoce);
        
        //Sve isto za stablo Povrće
        TreeItem<String> treeItemPovrce = new TreeItem<>("Povrće");
        treeItemPovrce.getChildren().add(new TreeItem<>("Krompir"));
        treeItemPovrce.getChildren().add(new TreeItem<>("Grašak"));
        treeItemPovrce.getChildren().add(new TreeItem<>("Brokule"));
        treeItemPovrce.getChildren().add(new TreeItem<>("Pasulj"));
        //Podstablo Povrće dodajemo u korijensko stablo
        treeItemKorijen.getChildren().add(treeItemPovrce);
        
        //Dodavanje podstabla orašasti plodovi
        TreeItem<String> treeItemOrasasti = new TreeItem<>("Orašasti plodovi");
        treeItemOrasasti.getChildren().add(new TreeItem<>("Orasi"));
        treeItemOrasasti.getChildren().add(new TreeItem<>("Kikiriki"));
        treeItemOrasasti.getChildren().add(new TreeItem<>("Lješnjak"));
        //Podstablo orašasti plodovi dodajemo korijenskom stablu
        treeItemKorijen.getChildren().add(treeItemOrasasti);
        
        //Pravi kontrolu TreeView sa upravo formiranom strukturom
        TreeView<String> treeViewHrana = new TreeView<>(treeItemKorijen);
        
        //Učitava mod biranja stavke na stablu
        MultipleSelectionModel<TreeItem<String>> selModel = treeViewHrana.getSelectionModel();
        
//Osluškivač promjene odabrane stavke na stablu
        selModel.selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>() {
            @Override
            public void changed(ObservableValue<? extends TreeItem<String>> changed, TreeItem<String> oldVal, TreeItem<String> newVal) {
                //Prikazuje odabrani element i cijelu njegovu putanju do korijena
                if(newVal != null){
                    //Konstruše cijelu putanju do odabranog elementa
                    String putanja = newVal.getValue();
                    TreeItem<String> tmp = newVal.getParent();
                    while(tmp != null){
                        putanja = tmp.getValue() + " -> " + putanja;
                        tmp = tmp.getParent();
                    }
                    //Prikazuje izabrani element i cijelu putanju do njega
                    natpis.setText("Izabran je element " + newVal.getValue() + "\nKompletna putanja je " + putanja);
                }
            }
        });
        flowPane.getChildren().addAll(treeViewHrana, natpis);
        stage.show();
    }
    
}
