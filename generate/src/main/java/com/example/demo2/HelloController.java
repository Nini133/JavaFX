package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class HelloController {
    @FXML
    private Label randomNumber;

    @FXML
    private Button Generate;

    Random random = new Random();

    @FXML
    private void onGenerateClick(){
        int number = random.nextInt(1000,2001);
        randomNumber.setText(String.valueOf(number));
//        int sum = 0;
//        int multiplication = 1;
//        while (number != 0) {
//            sum = sum + number % 10;
//            multiplication = multiplication * (number % 10);
//            number = number/10;
        }
//        System.out.println("ციფრთა ჯამი = " +sum);
//        System.out.println("ციფრთა ნამრავლი = " +multiplication);
//    }
    @FXML
    protected void onHelloButtonClick() {
        randomNumber.setText("Welcome to JavaFX Application!");
    }
}