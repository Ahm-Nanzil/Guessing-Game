package com.example.scenebuilder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static Stage myStage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("game-UI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);


        myStage=stage;
        myStage.setTitle("Guess the number!");
        myStage.setScene(scene);
        myStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void changeScene(Scene fxml) throws IOException {

        myStage.setScene(fxml);
    }

    // we can change scene by this method
//    public void changeScene(String fxml) throws IOException {
//
//        Parent fxmlLoader = FXMLLoader.load(getClass().getResource(fxml));
//        myStage.getScene().setRoot(fxmlLoader);
//    }
}