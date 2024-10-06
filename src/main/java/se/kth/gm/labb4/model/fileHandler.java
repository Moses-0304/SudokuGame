package se.kth.gm.labb4.model;

import java.io.*;
import java.util.List;

/**
 * This class provides utilities for file operations related to the {@code SudokuModel}.
 */
public class fileHandler {
    /**
     * Serializes the provided {@code SudokuModel} to the specified file.
     *
     * @param model    The SudokuModel instance to be serialized.
     * @param filePath The path to the file where the model will be saved.
     * @throws IOException If there's an issue with the file writing process.
     */
    public static void serializeToFile(SudokuModel model, String filePath) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(model);
        }
    }

    /**
     * Deserializes a {@code SudokuModel} from the specified file.
     *
     * @param filePath The path to the file from which the model will be loaded.
     * @return The deserialized SudokuModel.
     * @throws IOException            If there's an issue with the file reading process.
     * @throws ClassNotFoundException If the file content does not match the expected SudokuModel structure.
     */
    public static SudokuModel deSerializeFromFile(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            return (SudokuModel) in.readObject();
        }
    }

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private fileHandler() {}
}
