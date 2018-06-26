import java.util.HashMap;
import java.util.Scanner;

public class ex7Dictionary {

    public static void main (String[] args) {

        // Exercise 7.1
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));

        // Exercise 7.2
        System.out.println(dictionary.amountOfWords());
        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());
        System.out.println("\n");

        // Exercise 7.3
        HashMap<String, String> wordPairs = new HashMap<String, String>();

        wordPairs.put("monkey", "animal");
        wordPairs.put("South", "compass point");
        wordPairs.put("sauerkraut", "food");

        for (String string : wordPairs.keySet()) {
            System.out.println(string + "  :  " + wordPairs.get(string));
        }
        System.out.println("\n");

        // Exercise 7.4
        Dictionary dict = new Dictionary();
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(dict, reader);
        ui.start();

    }

}
