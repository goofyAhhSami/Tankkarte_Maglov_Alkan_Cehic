package Kassa.control;

import Kassa.model.TankkarteModel;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class TankkarteController implements Initializable {

    @FXML
    private TextField txf_kNummer, txf_Anzahl, txf_Produkt, txf_anzahlMonate, txf_anzahlLimit, txf_tfAusgestellt;

    @FXML
    private Slider s_gueltigkeit;

    @FXML
    private Slider s_limit;

    private TankkarteModel tm = new TankkarteModel();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        StringConverter<Number> converter = new NumberStringConverter();
        Bindings.bindBidirectional(txf_anzahlLimit.textProperty(), s_limit.valueProperty(), converter);
        Bindings.bindBidirectional(txf_anzahlMonate.textProperty(), s_gueltigkeit.valueProperty(), converter);
    }

    @FXML
    public void openKassa() throws IOException {
        Stage stage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Kassa/view/Kassa.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root, 882, 702));
        stage.show();
    }

    public void createTankkarte() throws SQLException {
        String ausgestelltAuf = txf_tfAusgestellt.getText();
        String gueltigBisText = txf_anzahlMonate.getText();
        int monateToAdd = Integer.parseInt(gueltigBisText);
        LocalDate now = LocalDate.now();

        LocalDate gueltigBisDate = now.plusMonths(monateToAdd);

        String gueltigBis = gueltigBisDate.toString();

        String kNr = String.valueOf(Integer.parseInt(txf_kNummer.getText()));
        String kartenlimit = txf_anzahlLimit.getText();

        String pan = generatePAN();

        System.out.println(ausgestelltAuf + gueltigBis + kNr + kartenlimit + pan);

        tm.insertIntoTankkarte(pan, ausgestelltAuf, gueltigBis, kNr, true, kartenlimit);
    }


    private String generatePAN() throws SQLException {
        int nextNumber = tm.getNextPANNumber();
        return String.format("Fahrer%04d", nextNumber);
    }
}
