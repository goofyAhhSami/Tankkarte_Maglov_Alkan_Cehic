package Kassa.control;

import Kassa.model.KassaModel;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ZahlenTankkarteController {
    KassaModel km = new KassaModel();


    private static final double DIESEL_PREIS_PRO_LITER = 1.60;

    @FXML
    Button bezahlen_btn;

    String pan;

    public void setPan(String pan) {
        this.pan = pan;
    }

    @FXML
    public void tankkarteBestaetigen() throws SQLException {
        KassenController kC =  new KassenController();
        km.insertIntoTankung(pan, kC.getMengeInLitern(), DIESEL_PREIS_PRO_LITER, kC.getGesamterBetrag());
        System.exit(0);

    }


}
