module com.example.lv_78 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lv_78 to javafx.fxml;
    exports com.example.lv_78;
}