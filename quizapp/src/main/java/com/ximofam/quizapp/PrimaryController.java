package com.ximofam.quizapp;

import java.io.IOException;

import com.ximofam.utils.MyAlert;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PrimaryController {

    public void handleQuestionManagement(ActionEvent event) throws IOException {
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("questions.fxml")).load());
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Quiz App");
        stage.show();
    }

    public void handlePractice(ActionEvent event) {
        MyAlert.getInstance().showMessage("Practice: Comming soon...");
    }

    public void handleExam(ActionEvent event) {
        MyAlert.getInstance().showMessage("Exam: Comming soon...");
    }

    public void handleRegister(ActionEvent event) {
        MyAlert.getInstance().showMessage("Register: Comming soon...");
    }

    public void handleLogin(ActionEvent event) {
        MyAlert.getInstance().showMessage("Login: Comming soon...");
    }

}