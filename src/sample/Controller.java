package sample;

import javafx.fxml.FXML;

import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    TextArea mainTextArea;

    public void btnClicked(javafx.event.ActionEvent actionEvent) {
        mainTextArea.setText("text");
    }
}
