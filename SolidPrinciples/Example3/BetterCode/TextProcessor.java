package SolidPrinciples.Example3.BetterCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextProcessor {

    private FileProcessor fileProcessor;

    public TextProcessor(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }

    public void convertText() {
        try {
            System.out.println("Please specify the full file path to convert to HTML.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fullFilePath = reader.readLine();
            if (fullFilePath == null || fullFilePath.isEmpty()) {
                return;
            }

            String inputText = this.fileProcessor.readAllText();
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

            this.fileProcessor.writeToFile(sb.toString());

            System.out.println("HTML file created successfully.");

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
