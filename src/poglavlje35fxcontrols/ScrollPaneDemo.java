package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ScrollPaneDemo extends Application{
    
    ScrollPane scrollPane;
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ScrollPaneDemo");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 200, 200);
        stage.setScene(scene);
        
        Label natpis = new Label("A ScrollPane streamlines the process of\n"
        +"adding scroll bars to window whose\n"
        +"contens exceed the window's dimension.\n"
        +"It also enables a control to fit in a\n"
        +"smaller space than it otherwise would.\n"
        +"As such, it often provides a superior\n"
        +"approach over using individual scroll bars.");
        
        //Okno za pomjeranje sadržaja, čiji sadržaj je natpis
        scrollPane = new ScrollPane(natpis);
        
        //Širina i visina vidnog polja
        scrollPane.setPrefViewportWidth(130);
        scrollPane.setPrefViewportHeight(80);
        
        //Uključuje pomjeranje sadržaja mišem
        scrollPane.setPannable(true);
        
        //Dugme za vraćanje klizača u početni položaj
        Button resetButton = new Button("Klizači na početne položaje");
        
        //Obrada akcionih događaja u dugmetu za vraćanje klizača
        resetButton.setOnAction((ae)-> {
            scrollPane.setVvalue(0); 
            scrollPane.setHvalue(0);
        });
        flowPane.getChildren().addAll(scrollPane, resetButton);
        stage.show();
    }
    
}
