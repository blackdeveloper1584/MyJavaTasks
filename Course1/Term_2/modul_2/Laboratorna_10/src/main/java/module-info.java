module com.example.laboratorna_10 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.laboratorna_10 to javafx.fxml;
    exports com.example.laboratorna_10;
}