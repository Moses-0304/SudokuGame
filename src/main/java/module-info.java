module se.kth.gm.labb4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens se.kth.gm.labb4 to javafx.fxml;
    exports se.kth.gm.labb4;
    exports se.kth.gm.labb4.view;
    opens se.kth.gm.labb4.view to javafx.fxml;
    exports se.kth.gm.labb4.model;
    opens se.kth.gm.labb4.model to javafx.fxml;
}