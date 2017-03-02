package ru.geekbrains.java.Lesson24;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Launcher extends Application implements Runnable{

    public void run (){
        System.out.println("Begin");
        launch();
    }

    public void start (Stage primaryStage){
        primaryStage.setTitle("JavaFX chat");
        primaryStage.setResizable(false);
        GridPane gridPane = new GridPane();
        Button send = new Button("Send");
        Label label = new Label("Main room");
        TextArea textArea = new TextArea();
        //textArea.setPrefColumnCount(9);
        //textArea.setPrefRowCount(8);
        TextField textField = new TextField("Messages write here");
        gridPane.add(label,0,0,1,1);
        gridPane.add(textArea,0,1,14,14);
        gridPane.add(textField,0,15, 13,1);
        gridPane.add(send,13,15,1,1);
        Scene scene = new Scene(gridPane, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
