module com.retrorewind.retrorewind {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.retrorewind.retrorewind to javafx.fxml;
    exports com.retrorewind.retrorewind;
}