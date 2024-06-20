/*
erstellt am: 04.06.2024
erstellt von: Sami Cehic, Erkan Alkan, Lind Shatri
Beschreibung: Projekt: Tankstelle
 */

package Main;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Kassa/view/Tankkarte.fxml"));
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root, 600, 538));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
