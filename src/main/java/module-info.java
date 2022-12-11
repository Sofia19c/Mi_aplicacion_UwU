module com.mycompany.miapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.miapp to javafx.fxml;
    exports com.mycompany.miapp;
}
