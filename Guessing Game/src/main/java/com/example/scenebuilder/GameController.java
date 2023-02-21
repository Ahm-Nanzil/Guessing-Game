package com.example.scenebuilder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class GameController implements  Initializable {

    private int generatedNumber;
    private String userName="";
    private int clickOncircle=2;
    @FXML
    private Label labelof;
    @FXML
    private Label attemp;
    @FXML
    private Button number;
    @FXML
    private Label message;
    @FXML
    private TextField name;



    Main helloApplication=new Main();

    FXMLLoader loader = new FXMLLoader(getClass().getResource("result-view.fxml"));
        Parent root;

    {
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    ResultController resultControllerMessage= loader.getController();
    void changeTheScene(){
        Main.myStage.setScene(new Scene(root, 600, 400));
        Main.myStage.show();
    }
    void attempCheck(){
        if (clickOncircle<=0){
            resultControllerMessage.resultMesssage.setText(userName+ " YOU LOST!!!");
            changeTheScene();

        }
    }

    @FXML
    protected void generateNumber() throws IOException {
        Random random= new Random();
        generatedNumber = random.nextInt(3)+1;
        message.setText("Your Number is Generated. Guess the number and select the proper Circle.");


    }


    @FXML
    protected void pressedOne() throws IOException {
        clickOncircle--;
        attempCheck();
        attemp.setText("Attempts Left: "+ clickOncircle);
        if(generatedNumber==1){
            resultControllerMessage.resultMesssage.setText(userName+ " YOU WON!!!");
            changeTheScene();
        }
    }

    @FXML
    protected void pressedTwo() throws IOException {
        clickOncircle--;
        attempCheck();
        attemp.setText("Attempts Left: "+ clickOncircle);
        if(generatedNumber==2){
            resultControllerMessage.resultMesssage.setText(userName+ " YOU WON!!!");
            changeTheScene();
        }
    }

    @FXML
    protected void pressedThree() throws IOException {
        clickOncircle--;
        attempCheck();
        attemp.setText("Attempts Left: "+ clickOncircle);
        if(generatedNumber==3){
            resultControllerMessage.resultMesssage.setText(userName+ " YOU WON!!!");
            changeTheScene();
        }
    }

    public void nameSave() {

        userName=name.getText().toString();

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}