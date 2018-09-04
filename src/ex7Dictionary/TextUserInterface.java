package ex7Dictionary;

import java.util.Scanner;

public class TextUserInterface {

    private Dictionary dictionary;
    private Scanner scanner;

    public TextUserInterface (Dictionary dictionary, Scanner scanner) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }

    public void start () {
        printHelp();
        while (true) {
            String statement = getIO("Statement: ");

            if (statement.equals("quit")) {
                System.out.println("Goodbye!");
                break;

            } else if (statement.equals("add")) {
                addTranslation();

            } else if (statement.equals("translate")) {
                String word = getIO("Given a Word: ");
                String translation = this.dictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word does not exist.");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else if (statement.equals("help")){
                printHelp();
            } else{
                System.out.println("Unknown Statement");
            }
            System.out.println("\n");
        }
    }

    private void printHelp () {
        System.out.println("Statements: ");
        System.out.println("    add - adds a word pair to the dictionary");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");
        System.out.println("    help - print valid statements");
    }

    private void addTranslation () {
        String word = getIO("Word: ");
        String translation = getIO("Translation: ");
        this.dictionary.add(word, translation);
    }

    private String getIO (String prompt) {
        System.out.print(prompt);
        return this.scanner.nextLine();
    }
}
