module com.example.lessson2fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lessson2fx to javafx.fxml;
    exports com.example.lessson2fx;
}