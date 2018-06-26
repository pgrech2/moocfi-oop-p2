import java.util.Scanner;

public class UserInterface {
    private Scanner reader;

    public UserInterface(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        while (true) {
            String command = reader.nextLine();
            if (command.equals("end")) {
                break;
            }
            handleCommand(command);
        }
    }

    public void handleCommand(String command) {
        if (command.equals("buy")) {
            buyCommand();
        } else if (command.equals("sell")) {
            sellCommand();
        }
    }

    public String readInput(String question) {
        while(true) {
            System.out.print(question);
            String line = reader.nextLine();
            if(line.equals("carrot")) {
                return line;
            }
            System.out.println("Item not found!");
        }
    }

    public void buyCommand() {
        String input = readInput("What to buy: ");
        System.out.println("Bought!");
    }

    public void sellCommand() {
        String input = readInput("What to sell: ");
        System.out.println("Sold!");
    }
}
