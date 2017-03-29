package sample;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.web.HTMLEditor;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private void enterPressed(ActionEvent event) {
        sendReceive();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //htmlEditor.lookup(".top-toolbar").setManaged(false);
        //htmlEditor.lookup(".bottom-toolbar").setManaged(false);
    }

    @FXML
    private TextFlow textFlow;

    @FXML
    Text justText;

    @FXML
    ListView listView;

    @FXML
    private TextField textField;

    @FXML
    private void sendButtonEventListener(ActionEvent event) {
        sendReceive();
    }

    @FXML
    private void focusBack (){
        textField.requestFocus();
    }

    private void sendReceive() {
        ObservableList list = ;
        Text text = new Text(textField.getCharacters().length() > 0 ? textField.getCharacters() + "\n" : "");
        text.setFill(new Color(Math.random()*1,Math.random()*1,Math.random()*1,1));
        text.setFont(new Font("Comic Sans MS",15));
        list.add(text);
        textField.clear();
        textField.requestFocus();
    }

    @FXML
    private MenuItem exitMenu;

    @FXML
    private MenuItem aboutMenu;

    @FXML
    HTMLEditor htmlEditor;


    @FXML
    private void exitOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void aboutOnAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText(null);
        alert.setContentText("Моё первое приложение\nc использованием fxml файла\n\nChat version 0.5b");
        alert.showAndWait();
    }

    @FXML
    private void sendEnterPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.ENTER) {
            sendReceive();
            keyEvent.consume();
        }
    }
}