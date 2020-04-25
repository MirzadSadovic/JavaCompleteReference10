package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ToggleButtonDemo extends Application {

    ToggleButton preklopDugme;
    Label natpis;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ToggleButtonDemo");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 220, 120);
        stage.setScene(scene);
        natpis = new Label("Pritisni dugme");

        //Pravi preklopno dugme
        preklopDugme = new ToggleButton("On/Of");

        //Obrada događaja na preklopnom dugmetu
        preklopDugme.setOnAction((akcija) -> {
            if (preklopDugme.isSelected()) {
                natpis.setText("Dugme je pritisnuto");
            } else {
                natpis.setText("Dugme je otpušteno");
            }
        });
        flowPane.getChildren().addAll(preklopDugme, natpis);
        stage.show();
    }
}
