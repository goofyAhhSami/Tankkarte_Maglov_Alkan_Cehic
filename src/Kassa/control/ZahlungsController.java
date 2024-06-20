package Kassa.control;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class ZahlungsController {
    @FXML
    TextField txf_bar;



    @FXML
    public void barZahlen(){
        System.out.println("Barzahlung ausgewählt, Zahlung beendet");
        System.exit(0);
    }

    @FXML
    public void zahlenMitTankkarte() throws IOException {
        Stage stage3 = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Kassa/view/ZahlungTankkarte.fxml"));
        Parent root = loader.load();
        stage3.setScene(new Scene(root, 600, 220));
        stage3.show();
    }




}
