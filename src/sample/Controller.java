package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.*;


public class Controller {

    @FXML
    TextArea allMessages;
    @FXML
    TextField sendingText;


    public void sendMessageClicked(ActionEvent actionEvent) {
        String text = sendingText.getText();
        if (text.isEmpty()) {
            return;
        }
        allMessages.appendText(text + " \n");
        sendingText.clear();
    }
}
