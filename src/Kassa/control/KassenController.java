package Kassa.control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class KassenController {

    private static final double DIESEL_PREIS_PRO_LITER = 1.60;
    private double gesamterBetrag = 0.0;
    private double gesamtPreis = 0.0;
    private static final String produkt = "Diesel";



    @FXML
    Button btn_s1;
    @FXML
    Button btn_s2;
    @FXML
    Button btn_s3;
    @FXML
    Button btn_s4;
    @FXML
    Button btn_s5;
    @FXML
    Button btn_s6;
    @FXML
    VBox vBox_s1;
    @FXML
    VBox vBox_s2;
    @FXML
    VBox vBox_s3;
    @FXML
    VBox vBox_s4;
    @FXML
    VBox vBox_s5;
    @FXML
    VBox vBox_s6;

    @FXML
    TextArea textArea_Info;

    public void changeSelectedColor1(){
        vBox_s1.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, null)));
    }

    public void changeSelectedColor2(){
        vBox_s2.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, null)));
    }

    public void changeSelectedColor3(){
        vBox_s3.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, null)));
    }

    public void changeSelectedColor4(){
        vBox_s4.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, null)));
    }

    public void changeSelectedColor5(){
        vBox_s5.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, null)));
    }

    public void changeSelectedColor6(){
        vBox_s6.setBackground(new Background(new BackgroundFill(Color.CORNFLOWERBLUE, CornerRadii.EMPTY, null)));
    }

    public void auswahlAufheben(){
    vBox_s1.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, null)));
    vBox_s2.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, null)));
    vBox_s3.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, null)));
    vBox_s4.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, null)));
    vBox_s5.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, null)));
    vBox_s6.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, null)));
    textArea_Info.clear();
    gesamterBetrag = 0.0;
    gesamtPreis = 0.0;
    }

    @FXML
    public void zahlen() throws IOException {
        Stage stage2 = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Kassa/view/Zahlung.fxml"));
        Parent root = loader.load();
        //  Letter_Adventure_File_Control controller = loader.getController();
        //controller.setMenuStage(primaryStage); // Initialisiere menuStage
        stage2.setScene(new Scene(root, 354, 112));
        stage2.show();
    }

    @FXML
    public void generateFueling() {
        Random random = new Random();
        // Zufällige Menge zwischen 5 und 100 Litern generieren
        double mengeInLitern = 5 + (95 * random.nextDouble()); // 5 + (0 bis 95) ergibt 5 bis 100
        // Gesamtpreis berechnen
        gesamtPreis = mengeInLitern * DIESEL_PREIS_PRO_LITER;

        mengeInLitern = Math.round(mengeInLitern * 100.0) / 100.0;
        gesamtPreis = Math.round(gesamtPreis * 100.0) / 100.0;

        gesamterBetrag += gesamtPreis;
        gesamterBetrag = Math.round(gesamterBetrag * 100.0) / 100.0;


        textArea_Info.setText("Produkt: " + produkt + "\nGetankte Menge: "  + mengeInLitern + " Liter\n" + "Gesamtpreis: " + gesamterBetrag + " €\n");


    }


}
