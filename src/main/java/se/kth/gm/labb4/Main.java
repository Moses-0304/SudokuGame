/*package se.kth.gm.labb4;

import se.kth.gm.labb4.model.*;
import se.kth.gm.labb4.view.SudokuView;

public class Main {
        public static void main(String[] args) {

            int[][] initialSudoku = new int[9][9];
            int[][] correctSudoku = new int[9][9];
            int[][][] generatedSudoku = SudokuUtilities.generateSudokuMatrix(SudokuUtilities.SudokuLevel.EASY);

            // Extract only initial values from generated Sudoku
            for (int i = 0; i < SudokuUtilities.GRID_SIZE; i++) {
                for (int j = 0; j < SudokuUtilities.GRID_SIZE; j++) {
                    initialSudoku[i][j] = generatedSudoku[i][j][0];
                    correctSudoku[i][j] = generatedSudoku[i][j][1];
                }
            }

            // Use the second constructor to initialize SudokuModel with initial values from generated Sudoku
            SudokuModel model = new SudokuModel(initialSudoku, correctSudoku);
            SudokuView sudokuView = new SudokuView(model);
            // Print initial Sudoku state
            printSudoku(model);

            // Let's try to place a number
            /*if (model.placeValue(0, 1, 5)) {
                model.setValue(0, 1, 5);
            }

            // Print Sudoku after placing the number
            System.out.println("\nAfter placing value:");
            printSudoku(model);

            System.out.println("\nIs the Sudoku complete? " + model.isComplete());

            printSudoku1(model);
        }

        private static void printSudoku(SudokuModel model) {
            for (int i = 0; i < SudokuUtilities.GRID_SIZE; i++) {
                for (int j = 0; j < SudokuUtilities.GRID_SIZE; j++) {
                    System.out.print(model.getValue(i, j) + " ");
                }
                System.out.println();
            }
        }

        private static void printSudoku1(SudokuModel model) {
        for (int i = 0; i < SudokuUtilities.GRID_SIZE; i++) {
            for (int j = 0; j < SudokuUtilities.GRID_SIZE; j++) {
                System.out.print(model.getValue(i, j));
                if (model.getCell(i, j).isShownFirst()) {
                    System.out.print("(F) ");  // 'F' indicates it was shown first
                } else {
                    System.out.print("    ");  // Spacing for alignment
                }
            }
            System.out.println();
        }
    }
}*/
