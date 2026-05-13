package SolidPrinciples.Example3.ProblematicCode;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class HTMLConverter {
    public static void main(String[] args) {
        try {
            System.out.println("Please specify the full file path to convert to HTML.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fullFilePath = reader.readLine();
            if (fullFilePath == null || fullFilePath.isEmpty()) {
                return;
            }

            String inputText = readAllText(fullFilePath);
            String[] paragraphs = inputText.split("(\\r\\n?|\\n)");

            StringBuilder sb = new StringBuilder();

            sb.append("<html>\n");
            sb.append("<body>\n");

            for (String paragraph : paragraphs) {

                if (paragraph.trim().isEmpty()) {
                    continue;
                }

                sb.append("<p>");
                sb.append(paragraph);
                sb.append("</p>\n");
            }

            sb.append("</body>\n");
            sb.append("</html>");

            writeToFile(fullFilePath, sb.toString());

            System.out.println("HTML file created successfully.");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Press any key to exit.");
        try {
            System.in.read(); // Wait for a key press to exit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readAllText(String filePath) throws IOException {
        // Code to read all text from the file
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
        return content;
    }

    public static void writeToFile(String fullFilePath, String text) throws IOException {
        // Code to write text to the file
        String outputFilePath = Paths.get(fullFilePath).getFileName().toString().replaceFirst("[.][^.]+$", "");
        System.out.println(outputFilePath);
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFilePath))) {
            writer.write(text);
        }
    }

}
