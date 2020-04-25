package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ImageDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("ImageDemo");
        FlowPane flowPane = new FlowPane();
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 300, 200);
        stage.setScene(scene);

        //Slika kao objekat tipa image
        Image image = new Image(getClass().getResource("Java.jfif").toExternalForm());

        //Pravi objekat tipa ImageView koji radi sa slikom
        ImageView iv = new ImageView(image);

        //Dodaje sliku na graf scene
        flowPane.getChildren().add(iv);

        stage.show();
    }

}
