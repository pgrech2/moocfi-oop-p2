package ex34FileManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<String> read(String fileName) {
        Scanner reader = null;
        File file = new File(fileName);

        try {
            reader  = new Scanner(file);
        } catch (Exception e) {
            System.out.println("Failed to read file: " + e.getMessage());
            return null;
        }

        ArrayList<String> lines = new ArrayList<>();

        while (reader.hasNextLine()){
            String line = reader.nextLine();
            lines.add(line);
        }
        reader.close();

        return lines;
    }

    public void save (String file, String text) {
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to write file: " + e.getMessage());
        }
    }

    public void save (String file, ArrayList<String> lines){
        try {
            FileWriter writer = new FileWriter(file, true);
            for(String line : lines) {
                writer.write(line + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Failed to append file: " + e.getMessage());
        }
    }
}