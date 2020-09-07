module com.team9 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.team9 to javafx.fxml;
    exports com.team9;
}