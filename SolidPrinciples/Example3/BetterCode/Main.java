package SolidPrinciples.Example3.BetterCode;

public class Main {
    public static void main(String[] args) {
        FileProcessor fp = new FileProcessor("..//..");
        TextProcessor tp = new TextProcessor(fp);
        tp.convertText();
    }
}
