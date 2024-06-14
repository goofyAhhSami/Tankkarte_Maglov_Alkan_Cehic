package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Kassa/view/Kassa.fxml"));
        Parent root = loader.load();
        //  Letter_Adventure_File_Control controller = loader.getController();
        //controller.setMenuStage(primaryStage); // Initialisiere menuStage
        primaryStage.setScene(new Scene(root, 882, 702));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
