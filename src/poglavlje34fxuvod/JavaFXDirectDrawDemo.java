package poglavlje34fxuvod;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class JavaFXDirectDrawDemo extends Application {

    GraphicsContext graphicsContext;
    Color boje[] = {Color.RED, Color.BLUE, Color.GREEN, Color.BLACK};
    int indexBoje = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("DirectDrawDemo");
        FlowPane flowPane = new FlowPane();
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 450, 450);
        stage.setScene(scene);
        //Pravi platno za iscrtavanje
        Canvas platno = new Canvas(400, 400);
        //Grafički kontekst za platno
        graphicsContext = platno.getGraphicsContext2D();
        Button buttonBoja = new Button("Promijeni boju");

        //Obrada akcionog događaja na dugmetu promijeni boju
        buttonBoja.setOnAction((ActionEvent ae) -> {
            //Zadaje potez i boju ispune
            graphicsContext.setStroke(boje[indexBoje]);
            graphicsContext.setFill(boje[indexBoje]);
            
            //Ponovo iscrtava novom bojom liniju, tekst i ispunjen pravougaonik, to ne utječe na boje drugih čvorova
            graphicsContext.strokeLine(0, 0, 200, 200);
            graphicsContext.fillText("Ovo se iscrtava na platnu", 60, 50);
            graphicsContext.fillRect(100, 320, 300, 40);
            
            //Mijenja boju
            indexBoje++;
            if (indexBoje == boje.length) {
                indexBoje = 0;
            }
        });

        //Crta početne objekte na platnu
        graphicsContext.strokeLine(0, 0, 200, 200);
        graphicsContext.strokeOval(100, 100, 200, 200);
        graphicsContext.strokeRect(0, 200, 50, 200);
        graphicsContext.fillOval(0, 0, 20, 20);
        graphicsContext.fillRect(100, 320, 300, 40);

        //Podešava veličinu fonta na 20 i crta tekst
        graphicsContext.setFont(new Font(20));
        graphicsContext.fillText("Ovo se iscrtava na platnu", 60, 50);

        //Dodaje platno i dugme na fraf scene
        flowPane.getChildren().addAll(platno, buttonBoja);

        //Prikazuje pozornicu i scenu na njoj
        stage.show();
    }
}
