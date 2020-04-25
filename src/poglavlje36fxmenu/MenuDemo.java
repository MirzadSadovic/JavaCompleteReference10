package poglavlje36fxmenu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MenuDemo extends Application {
    
    Label natpis;

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Menu Demo");
        BorderPane rootNode = new BorderPane();
        Scene scene = new Scene(rootNode, 300, 300);
        stage.setScene(scene);
        natpis = new Label("Primjer Menija");
        
        //Pravi paletu menija
        MenuBar paletaMenija = new MenuBar();
        
        //Pravi meni FIle
        Menu meniFile = new Menu("_File");  //definisanje mnemonika sa donjom crtom(_prije naziva)
        MenuItem stavkaOpen = new MenuItem("Open");
        MenuItem stavkaClose = new MenuItem("Close");
        MenuItem stavkaSave = new MenuItem("Save");
        MenuItem stavkaExit = new MenuItem("Exit");
        meniFile.getItems().addAll(stavkaOpen, stavkaClose, stavkaSave, new SeparatorMenuItem(), stavkaExit);
        
        stavkaOpen.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
        stavkaClose.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
        stavkaSave.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
        stavkaExit.setAccelerator(KeyCombination.keyCombination("shortcut+E"));
        
        //Postavlja meni File na paletu menija
        paletaMenija.getMenus().add(meniFile);
        
        //Pravi meni Options
        Menu meniOptions = new Menu("Options");
        
        //Pravi podmeni Colors
        Menu meniColors =  new Menu("Colors");
        CheckMenuItem stavkaRed = new CheckMenuItem("Red");
        CheckMenuItem stavkaGreen = new CheckMenuItem("Green");
        CheckMenuItem stavkaBlue = new CheckMenuItem("Blue");
        meniColors.getItems().addAll(stavkaRed, stavkaGreen, stavkaBlue);
        meniOptions.getItems().add(meniColors);
        
        //Opciju Green podešsava kao izabranu
        stavkaGreen.setSelected(true);
        
        //Pravi podmeni Priority
        Menu meniPriority = new Menu("Priority");
        RadioMenuItem stavkaHigh = new RadioMenuItem("High");
        RadioMenuItem stavkaLow = new RadioMenuItem("Low");
        
        //Pravi grupu za stavke menija sa radio dugmadima
        ToggleGroup tg = new ToggleGroup();
        stavkaHigh.setToggleGroup(tg);
        stavkaLow.setToggleGroup(tg);
        //Nivo High podešsava kao već izabrani
        stavkaHigh.setSelected(true);
        
        meniPriority.getItems().addAll(stavkaHigh, stavkaLow);
        meniOptions.getItems().addAll(meniPriority, new SeparatorMenuItem());
               
        //Pravi stavku menijaReset
        MenuItem stavkaReset = new MenuItem("Reset");
        meniOptions.getItems().add(stavkaReset);
        
        //Dodaje meni Options na paletu menija
        paletaMenija.getMenus().add(meniOptions);
        
        //Kreiranje Image Icone
        Image image = new Image(getClass().getResource("icon.png").toExternalForm());
        ImageView aboutIV = new ImageView(image);
        
        //Pravi meni Help
        Menu meniHelp = new Menu("Help");
        MenuItem stavkaAbout = new MenuItem("About", aboutIV);
        meniHelp.getItems().add(stavkaAbout);
        
        //Dodaje meni Help na paletu menija
        paletaMenija.getMenus().add(meniHelp);
        
        //Jedan obrađivač za sve akcione događaje u menijima.
        EventHandler<ActionEvent> MEHendler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                String ime = ((MenuItem) ae.getTarget()).getText();
                
                //Ako je izabrana opcija Exit rad programa se završava
                if(ime.equals("Exit")){
                    Platform.exit();
                }
                natpis.setText("Izabrana je opcija " + ime);
            }
        };
        
        
       //Zadaje obrađivač događaja za svaku stavku menija
        stavkaOpen.setOnAction(MEHendler);
        stavkaClose.setOnAction(MEHendler);
        stavkaSave.setOnAction(MEHendler);
        stavkaExit.setOnAction(MEHendler);
        stavkaRed.setOnAction(MEHendler);
        stavkaGreen.setOnAction(MEHendler);
        stavkaBlue.setOnAction(MEHendler);
        stavkaHigh.setOnAction(MEHendler);
        stavkaLow.setOnAction(MEHendler);
        stavkaReset.setOnAction(MEHendler);
        stavkaAbout.setOnAction(MEHendler);
        
        //Pravi stavke kontekstnog menija
        MenuItem stavkaCut = new MenuItem("Cut");
        MenuItem stavkaCopy = new MenuItem("Copy");
        MenuItem stavkaPaste = new MenuItem("Paste");
        
        //Pravi kontekstni tj.popup menu sa opcijama za rad sa tekstom
        final ContextMenu meniEdit = new ContextMenu(stavkaCut, stavkaCopy, stavkaPaste);
        
        //Obrađivač događaja za stavke meniEdit
        stavkaCut.setOnAction(MEHendler);
        stavkaCopy.setOnAction(MEHendler);
        stavkaPaste.setOnAction(MEHendler);
        
        //Pravljenje polja za tekst i podešava broj kontrola na 20
        TextField textField = new TextField();
        textField.setPrefColumnCount(20);
        
        //Povezivanje Contexsnog menija - popup sa poljem za tekst
        textField.setContextMenu(meniEdit);
        
        //Dodaje paletu menija u gornji dio prozora a natpis u središte prozora
        rootNode.setTop(paletaMenija);
        
        //Pravi okno FlowPane koje će sadržati i natpis i polje za tekst (TekstFiled)
        FlowPane flowPane = new FlowPane(10, 10);
        //Centrira kontrole na sceni
        flowPane.setAlignment(Pos.CENTER);
        flowPane.getChildren().addAll(natpis, textField);
        
        //Povezivanje Kontekstnog menija (popup) sa grafom scene, ako želimo da popup menu iskace na bilo kojem mjestu
        rootNode.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
            @Override
            public void handle(ContextMenuEvent ae) {
                //Meni iskace na mjestu pritiskanja desnog tastera miša
                meniEdit.show(rootNode, ae.getScreenX(), ae.getScreenY());
            }
        });
        
        //Definiše paletu alatki, prvo pravimo dugmad te palete
        Image imagePostavi = new Image(getClass().getResource("Up-icon.png").toExternalForm()); 
        Button postaviButton = new Button("Postavi", new ImageView(imagePostavi));
        Image imageUkloni = new Image(getClass().getResource("Down-icon.png").toExternalForm());
        Button ukloniButton = new Button("Ukloni", new ImageView(imageUkloni));
        Image imageNastavi = new Image(getClass().getResource("Success-icon.png").toExternalForm());
        Button nastaviButton = new Button("Nastavi", new ImageView(imageNastavi));
        
        //Isključuje prikazivanje teksta na dugmadima
        postaviButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        ukloniButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        nastaviButton.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        
        //Zadaje kratke opise prelaskom miša preko tipke
        postaviButton.setTooltip(new Tooltip("Postavlja prekidnu tačku"));
        ukloniButton.setTooltip(new Tooltip("Uklanja prekidnu tačku"));
        nastaviButton.setTooltip(new Tooltip("Nastavlja izvršavanje programa"));
        
        //Pravi paletu alatki
        ToolBar paletaDebug = new ToolBar(postaviButton, ukloniButton, nastaviButton);
        
        //Obrada događaja u dugmadima na paleti alatki
        EventHandler<ActionEvent> buttonHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                natpis.setText(((Button)t.getTarget()).getText());
            }
        };
        //Zadaje obrađivače događaja u dugmadima
        postaviButton.setOnAction(buttonHandler);
        ukloniButton.setOnAction(buttonHandler);
        nastaviButton.setOnAction(buttonHandler);
        
        //Dodajemo paletu alatki u donji dio rasporeda BorderPane
        rootNode.setBottom(paletaDebug);
       
        //Dodaje okno FlowPane u središte okna BorderPane
        rootNode.setCenter(flowPane);
        
        stage.show();
        
    }
}
