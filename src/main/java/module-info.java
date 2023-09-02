module com.lho.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.lho.demo to javafx.fxml;
    exports com.lho.demo;
}