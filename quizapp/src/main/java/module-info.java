module com.ximofam.quizapp {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens com.ximofam.quizapp to javafx.fxml;

    exports com.ximofam.quizapp;
}
