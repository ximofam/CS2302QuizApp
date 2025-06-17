package com.ximofam.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MyAlert {
    private static MyAlert myAlert;
    private final Alert alert;

    private MyAlert() {
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Quiz App");
    }

    public static MyAlert getInstance() {
        if (myAlert == null) {
            myAlert = new MyAlert();
        }

        return myAlert;
    }

    public void showMessage(String message) {
        alert.setContentText(message);
        alert.showAndWait();
    }
}
