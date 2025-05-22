module com.example.physics_lub {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.physics_lub to javafx.fxml;
    exports com.example.physics_lub;
}