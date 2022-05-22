module com.example.laboratorna_9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laboratorna_9 to javafx.fxml;
    exports com.example.laboratorna_9;
}