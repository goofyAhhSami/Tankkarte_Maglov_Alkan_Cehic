package Kassa.control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ZahlungsController {
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
    }

}
