package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("My First FXml implemented application");
        primaryStage.setMinHeight(200);
        primaryStage.setMinWidth(200);
        primaryStage.setResizable(true);
        /*HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.lookup(".top-toolbar").setManaged(false);
        htmlEditor.lookup(".top-toolbar").setVisible(false);
        htmlEditor.lookup(".bottom-toolbar").setManaged(false);
        htmlEditor.lookup(".bottom-toolbar").setVisible(false);
        primaryStage.setScene(new Scene(htmlEditor, 400, 260));*/
        primaryStage.setScene(new Scene(root, 400, 260));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
