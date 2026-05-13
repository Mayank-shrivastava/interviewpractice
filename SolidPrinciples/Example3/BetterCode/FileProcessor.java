package SolidPrinciples.Example3.BetterCode;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {
    private String filePath;

    public FileProcessor(String filePath) {
        this.filePath = filePath;
    }

    public String readAllText() throws IOException {
        // Code to read all text from the file
        String content = new String(Files.readAllBytes(Paths.get(this.filePath)));
        return content;
    }

     public void writeToFile(String text) throws IOException {
        // Code to write text to the file
        String outputFilePath = Paths.get(this.filePath).getFileName().toString().replaceFirst("[.][^.]+$", "");
        System.out.println(outputFilePath);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {
            writer.write(text);
        }
    }

}
