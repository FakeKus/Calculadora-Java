module org.alexandre.calculadorajava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens org.alexandre.calculadorajava to javafx.fxml;
    exports org.alexandre.calculadorajava;
    exports org.alexandre.calculadorajava.controller;
    opens org.alexandre.calculadorajava.controller to javafx.fxml;
}