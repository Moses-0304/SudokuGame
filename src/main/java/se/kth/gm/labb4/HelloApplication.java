package se.kth.gm.labb4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import se.kth.gm.labb4.model.SudokuModel;
import se.kth.gm.labb4.model.SudokuUtilities;
import se.kth.gm.labb4.view.SudokuView;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        SudokuModel model = new SudokuModel(SudokuUtilities.SudokuLevel.EASY);
        SudokuView sudokuView = new SudokuView(model);

        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        Scene scene = new Scene(sudokuView, 420, 420);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sudoku Game");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
