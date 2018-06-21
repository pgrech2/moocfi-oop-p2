import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        String pathName = "filename.txt";
        FileHandler handler = new FileHandler();
        File file = new File(pathName);


        handler.writeToFile(pathName, "Writing First Time");
        handler.readFile(file);

        handler.writeToFile(pathName, "Writing Second Time");
        handler.readFile(file);
    }
}
