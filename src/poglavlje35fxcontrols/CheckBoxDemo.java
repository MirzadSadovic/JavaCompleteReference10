package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application {
    
    CheckBox cbWeb;
    CheckBox cbDesktop;
    CheckBox cbMobile;
    
    Label natpis;
    Label svaOdredista;
    
    String odredista = "";
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("CheckBoxDemo");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 230, 140);
        stage.setScene(scene);
        
        Label zaglavlje = new Label("Izaberite odredište za instalaciju");

        //Natpis koji prikazuje stanje izabranog polja za potvrđivanje
        natpis = new Label("Nije izabrano odredište");

        //Natpis koji prikazuje sva izabrana odredišta
        svaOdredista = new Label("List odredišta: <nijedno>");

        //Pravi polja za potvrđivanje
        cbWeb = new CheckBox("Web");
        cbDesktop = new CheckBox("Desktop");
        cbMobile = new CheckBox("Mobile");
        
        //Dodavanje neodređenog stanja u CheckBox-e
        cbWeb.setAllowIndeterminate(true);
        cbDesktop.setAllowIndeterminate(true);
        cbMobile.setAllowIndeterminate(true);

        //Obrađuje akcione događaje u poljima za potvrđivanje
        cbWeb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent action) {
                if (cbWeb.isIndeterminate()) { //Metoda za provjeru neodređenog stanja
                    natpis.setText("Distribuiranje na web je neodređeno");
                }
                else if (cbWeb.isSelected()) {
                    natpis.setText("Odabrano je distribuiranje na Webu");
                } else {
                    natpis.setText("Distribuiranje na web je isključeno");
                }
                
                showAll();
            }
        });
        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent action) {
                if (cbDesktop.isIndeterminate()) { //Metoda za provjeru neodređenog stanja
                    natpis.setText("Distribuiranje na desktop je neodređeno");
                }
                else if (cbDesktop.isSelected()) {
                    natpis.setText("Odabrano je distribuiranje na Desktop");
                } else {
                    natpis.setText("Distribuiranje na web je isključeno");
                }
                
                showAll();
            }
        });
        cbMobile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent action) {
                if (cbMobile.isIndeterminate()) { //Metoda za provjeru neodređenog stanja
                    natpis.setText("Distribuiranje na mobile je neodređeno");
                }
                else if (cbMobile.isSelected()) {
                    natpis.setText("Odabrano je distribuiranje na Mobile");
                } else {
                    natpis.setText("Distribuiranje na web je isključeno");
                }
                
                showAll();
            }
        });
        //Separator za bolje organizovanje razmještaja kontrola
        Separator separator = new Separator();
        separator.setPrefWidth(200);

        //Dodaje kontrole na gaf scene
        flowPane.getChildren().addAll(zaglavlje, separator, cbWeb, cbDesktop, cbMobile, natpis, svaOdredista);

        //Prikazuje pozornicu i scenu
        stage.show();
        
    }

    //Ažurira i prikazuje listu odredišta

    void showAll() {
        odredista = "";
        if (cbWeb.isSelected()) {
            odredista = "Web";
        }
        if (cbDesktop.isSelected()) {
            odredista += "Desktop";
        }
        if (cbMobile.isSelected()) {
            odredista += "Mobile";
        }
        if (odredista.equals("")) {
            odredista = "<nijedno>";
        }
        svaOdredista.setText("Liste odredišta: " + odredista);
    }
}
