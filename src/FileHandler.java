import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {

    public static void readFile(File f) {
        Scanner reader = null;

        try {
            reader  = new Scanner(f);
        } catch (Exception e) {
            System.out.println("Failed to read file: " + e.getMessage());
            return;
        }

        while (reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
        }
        reader.close();
    }

    public static void writeToFile(String pathName, String text) {

        try {
            FileWriter writer = new FileWriter(pathName);
            writer.write(text);
            writer.close();
        } catch (Exception e) {
            System.out.println("Failed to write file: " + e.getMessage());
        }

    }

    public static void appendToFile(String pathName, String text) {
        try {
            FileWriter writer = new FileWriter(pathName, true);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to append file: " + e.getMessage());
        }
    }
}