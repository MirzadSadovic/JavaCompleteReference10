package poglavlje36fxmenu;

//Primjer menija konačna verzija
import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBase;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.control.Separator;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
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

public class FullMenuDemo extends Application {
    
    MenuBar paletaMenija;
    EventHandler<ActionEvent> MEHandler;
    ContextMenu meniEdit;
    ToolBar paletaDebug;
    Label natpis;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("FullMenu");
        BorderPane rootNode = new BorderPane();
        Scene scene = new Scene(rootNode, 300, 300);
        stage.setScene(scene);
        natpis = new Label();

        //Jedan obrađivač akcionih događaja za sve menije
        MEHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                String ime = ((MenuItem) t.getTarget()).getText();
                if (ime.equals("Exit")) {
                    Platform.exit();
                }
                natpis.setText("Izabrana je opcija " + ime);
            }
        };
        //Pravi paletu menija
        paletaMenija = new MenuBar();
        //Pravi meniFile
        makeMeniFile();
        //Pravi meni Options
        makeOptionsMenu();
        //Pravi meni Help
        makeHelpMenu();
        //Pravi kontekstni(popup) meni
        makeContextMenu();

        //Pravi polje za tekst i podešava broj kolona na 20
        TextField textField = new TextField();
        textField.setPrefColumnCount(20);

        //Povezuje kontekstni meni sa poljem za tekst
        textField.setContextMenu(meniEdit);

        //Pravi paletu alatki
        makeToolBar();

        //Povezuje kontekstni meni sa grafom scene
        rootNode.setOnContextMenuRequested(new EventHandler<ContextMenuEvent>() {
            public void handle(ContextMenuEvent ae) {
                //Meni iskače na mjestu pritiskanja desnog tastera miša
                meniEdit.show(rootNode, ae.getScreenX(), ae.getScreenY());
            }
        });
        //Postavlja paletu menija u gornji dio rasporeda BorderPane
        rootNode.setTop(paletaMenija);

        //Pravi okno FlowPane koje će sadržati natpis i polje za tekst
        FlowPane flowPane = new FlowPane(10, 10);
        flowPane.setAlignment(Pos.CENTER);

        //Dodaje separator radi boljeg organizovanja rasporeda kontrola
        Separator separator = new Separator();
        separator.setPrefWidth(260);

        //Dodaje natpis, separator i polje za tekst u okno FlowPane
        flowPane.getChildren().addAll(natpis, separator, textField);

        //Dodaje paletu alatki u donji dio okna BorderPane
        rootNode.setBottom(paletaDebug);

        //Dodaje okno FlowPane u središte okna BorderPane
        rootNode.setCenter(flowPane);

        //Prikazuje pozornicu i njenu scenu
        stage.show();
    }

    //Pravi meni FIle
    private void makeMeniFile() {
        //Pravi File menu, zajedno sa mnemonikom
        Menu meniFile = new Menu("_File");
        //Pravi stavke menija File
        MenuItem stavkaOpen = new MenuItem("Open");
        MenuItem stavkaClose = new MenuItem("Close");
        MenuItem stavkaSave = new MenuItem("Save");
        MenuItem stavkaExit = new MenuItem("Exit");
        //Dodaje stavke meniju FIle zajedno sa separatorom
        meniFile.getItems().addAll(stavkaOpen, stavkaClose, stavkaSave, new SeparatorMenuItem(), stavkaExit);
        //Stavkama menija FIle dodajemo ubrzivače sa tastature
        stavkaOpen.setAccelerator(KeyCombination.keyCombination("shortcut+O"));
        stavkaClose.setAccelerator(KeyCombination.keyCombination("shortcut+C"));
        stavkaSave.setAccelerator(KeyCombination.keyCombination("shortcut+S"));
        stavkaExit.setAccelerator(KeyCombination.keyCombination("shortcut+E"));
        //Zadavanje obrađivača akcionih događaja
        stavkaOpen.setOnAction(MEHandler);
        stavkaClose.setOnAction(MEHandler);
        stavkaSave.setOnAction(MEHandler);
        stavkaExit.setOnAction(MEHandler);
        //Dodaje meni File na paletu alatki
        paletaMenija.getMenus().add(meniFile);        
    }

    //Pravi menu Options
    private void makeOptionsMenu() {
        Menu meniOptions = new Menu("_Options");
        //Pravi podmeni Colors
        Menu meniColors = new Menu("Colors");
        //Boje su stavke manija sa pljem za potvrđivanje(checkbox) to omogućava da izaberemo više od jedne boje
        CheckMenuItem stavkaRed = new CheckMenuItem("Red");
        CheckMenuItem stavkaGreen = new CheckMenuItem("Green");
        CheckMenuItem stavkaBlue = new CheckMenuItem("Blue");
        //Dodavanje meniju Colors stavke sa poljem za potvrđivanje a sam meni Colors dodaje meniju Options
        meniColors.getItems().addAll(stavkaRed, stavkaGreen, stavkaBlue);
        meniOptions.getItems().add(meniColors);
        //Opciju Green podešavamo kao izabranu
        stavkaGreen.setSelected(true);

        //Pravi meni Priority
        Menu meniPriority = new Menu("Priority");
        //Nivoi prioriteta su stavke menija sa radio dugmadima.
        //To omogućava meniju da prikazuje koji je važeći nivo prioriteta, 
        //a obezbjeđuje i biranje jednog i samo jednog nivoa u svakom trenu
        RadioMenuItem stavkaHigh = new RadioMenuItem("High");
        RadioMenuItem stavkaLow = new RadioMenuItem("Low");
        //Pravi grupu za stavke menija sa radio dugmadima
        ToggleGroup toggleGroup = new ToggleGroup();
        stavkaHigh.setToggleGroup(toggleGroup);
        stavkaLow.setToggleGroup(toggleGroup);
        //Podešavanje nivo High kao izabranog
        stavkaHigh.setSelected(true);
        //Stavke menija sa radio dugmadima dodajemo u meni Priority i Separator
        meniPriority.getItems().addAll(stavkaHigh, stavkaLow);
        meniOptions.getItems().addAll(meniPriority, new SeparatorMenuItem());

        //Pravi stavku menija Reset i dodaje ga u Options meni
        MenuItem stavkaReset = new MenuItem("Reset");
        meniOptions.getItems().add(stavkaReset);

        //Zadavanje obrađivača akcionih događaja
        stavkaRed.setOnAction(MEHandler);
        stavkaGreen.setOnAction(MEHandler);
        stavkaBlue.setOnAction(MEHandler);
        stavkaHigh.setOnAction(MEHandler);
        stavkaLow.setOnAction(MEHandler);
        stavkaReset.setOnAction(MEHandler);

        //Zadaje osluškivač događaja promjena stanja u stavkama menija s radio dugmadima
        toggleGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> changed, Toggle oldVal, Toggle newVal) {
                if (newVal == null) {
                    return;
                }
                //Pretvara newVal u tip RadioButton
                RadioMenuItem rmi = (RadioMenuItem) newVal;
                //Prikazuje izabranu opciju
                natpis.setText("Odabran je nivo prioriteta " + rmi.getText());
            }
        });
        //Dodaje meni OPtions na paletu menija
        paletaMenija.getMenus().add(meniOptions);
    }
    
    //Pravi meni Help
    private void makeHelpMenu() {
        //Pravimo objekat tipa image za sliku
        Image imageAbout = new Image(getClass().getResource("icon.png").toExternalForm());
        //Pravimo objekat tipa ImageView za sliku, kako bi ga proslijedili kreiranju buttona
        ImageView aboutImageView = new ImageView(imageAbout);
        //Pravimo menu Help
        Menu meniHelp = new Menu("Help");
        //Pravi stavku menija Help i dodaje je u meni Help
        MenuItem stavkaAbout = new MenuItem("About", aboutImageView);
        meniHelp.getItems().add(stavkaAbout);
        //Zadajemo obrađivač akcionih događaja
        stavkaAbout.setOnAction(MEHandler);
        //Dodaje meni Help na paletu menija
        paletaMenija.getMenus().add(meniHelp);
    }
    
    //Pravi stavke Kontekstnog(Context) menija
    private void makeContextMenu() {
        //Pravljenje stavki kontekstog(popup) menija Edit
        MenuItem stavkaCut = new MenuItem("Cut");
        MenuItem stavkaCopy = new MenuItem("Copy");
        MenuItem stavkaPaste = new MenuItem("Paste");
        //Pravi kontekstni meni s opcijama za rad sa tekstom
        meniEdit = new ContextMenu(stavkaCut, stavkaCopy, stavkaPaste);
        //Zadavanje obrađivača akcionih dogadja
        stavkaCut.setOnAction(MEHandler);
        stavkaCopy.setOnAction(MEHandler);
        stavkaPaste.setOnAction(MEHandler);
    }

    //Pravi paletu alatki (ToolBar )
    private void makeToolBar() {
        //Definiše paletu alatki, prvo pravimo dugmad te palete
        Image imagePostavi = new Image(getClass().getResource("Up-icon.png").toExternalForm()); 
        Image imageUkloni = new Image(getClass().getResource("Down-icon.png").toExternalForm());
        Image imageNastavi = new Image(getClass().getResource("Success-icon.png").toExternalForm());
        
        Button postaviButton = new Button("Postavi", new ImageView(imagePostavi));   
        Button ukloniButton = new Button("Ukloni", new ImageView(imageUkloni));
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
        paletaDebug = new ToolBar(postaviButton, ukloniButton, nastaviButton);
        
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
    }
    
}
