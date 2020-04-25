package poglavlje35fxcontrols;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

//Primjena rotacije, skaliranja, svjetlucanja i interne sjenke
public class EffectTransformationDemo extends Application {

    double ugaoRotacije = 0.0;
    double nivoSvjetlucanja = 0.0;
    boolean sjenka = false;
    double koefSkal = 1.0;

    //Definiše početne efekte i transformacije
    Glow svjetlucanje = new Glow(0.0);
    InnerShadow unutrasnjaSjenka = new InnerShadow(10.0, Color.RED);
    Rotate rotacija = new Rotate();
    Scale skaliranje = new Scale(koefSkal, koefSkal);

    //Kreiranje četiri dugmića
    Button rotacijaButton = new Button("Rotate");
    Button svjetlucanjeButton = new Button("Glow");
    Button sjenkaButton = new Button("Shadow off");
    Button skaliranjeButton = new Button("Scale");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("EffectAndTransformation");
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(flowPane, 300, 100);
        stage.setScene(scene);

        //Zadaje početni efekt svjetlucanja
        svjetlucanjeButton.setEffect(svjetlucanje);

        //Dodaje rotaciju na listu transformacija dugmeta Rotate
        rotacijaButton.getTransforms().add(rotacija);

        //Dodaje skaliranje na listu transformacija dugmeta Scale
        skaliranjeButton.getTransforms().add(skaliranje);
        
        //Dodavanje kratkih opisa na dugmicima (Tooltip)
        rotacijaButton.setTooltip(new Tooltip("Kada pritisnete ovo dugme ono se rotira 30 stepeni oko svog centra"));
        skaliranjeButton.setTooltip(new Tooltip("Kad god pritisnete ovo dugme mijenja se njegova velicina"));
        svjetlucanjeButton.setTooltip(new Tooltip("Kad god pritisnete ovo dugme mijenja se nivo svjetlucanja"));
        sjenkaButton.setTooltip(new Tooltip("Kad pritisnete ovo dugme mijenja se status sjenke"));

        //Obrada akcionih događaja u dugmetu Rotate
        rotacijaButton.setOnAction((ae) -> {
            //Kada korisnik pritisne ovo dugme ono se rotira 30 stepeni oko svog centra
            ugaoRotacije += 30.0;
            
            rotacija.setAngle(ugaoRotacije);
            rotacija.setPivotX(rotacijaButton.getWidth() / 2);
            rotacija.setPivotY(rotacijaButton.getHeight() / 2);
        });

        skaliranjeButton.setOnAction((ae) -> {
            //Kad god korisnik pritisne ovo dugme mijenja se njegova velicina
            koefSkal += 0.1;
            if (koefSkal > 1.0) {
                koefSkal = 0.4;
            }
            skaliranje.setX(koefSkal);
            skaliranje.setY(koefSkal);

        });

        svjetlucanjeButton.setOnAction((ae) -> {
            //Kad god korisnik pritisne ovo dugme mijenja se nivo svjetlucanja
            nivoSvjetlucanja += 0.1;
            if (nivoSvjetlucanja > 1.0) {
                nivoSvjetlucanja = 0.0;
            }
            //Zadaje nivo svjetlucanja dugmeta
            svjetlucanje.setLevel(nivoSvjetlucanja);
        });
        
        sjenkaButton.setOnAction((ae) -> {
            //Kad korisnik pritisne ovo dugme mijenja se status sjenke
            sjenka = !sjenka;
            if(sjenka){
                sjenkaButton.setEffect(unutrasnjaSjenka);
                sjenkaButton.setText("Shadow On");
            }else{
                sjenkaButton.setEffect(null);
                sjenkaButton.setText("Shadow Off");
            }
        });
        flowPane.getChildren().addAll(rotacijaButton, skaliranjeButton, svjetlucanjeButton, sjenkaButton);
        stage.show();
    }
}
