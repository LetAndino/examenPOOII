module edu.snpp.examenits {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens edu.snpp.examenits to javafx.fxml;
    exports edu.snpp.examenits;
}
