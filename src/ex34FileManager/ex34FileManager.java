package ex34FileManager;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ex34FileManager {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileHandler f = new FileHandler();
        for (String line : f.read("src/testinput1.txt")) {
            System.out.println(line);
        }

        f.save("src/testinput2.txt", "hello world");
        f.save("src/testinput3.txt", f.read("src/testinput1.txt"));
    }

}
