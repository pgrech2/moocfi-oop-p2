import java.io.Serializable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Book One", 1900);
        Book book2 = new Book("Book Two", 1901);

        System.out.println(book1.getName() + " was published in " + book1.getPublishingYear());

        /* 33.6 OBJECT */
        Person paul = new Person("Paul");
        Person lauren = new Person("Lauren");

        Account salaryAccount = new Account("sal-act");
        Account householdAccount = new Account("hh-act");

        paul.addAccount(salaryAccount);
        paul.addAccount(householdAccount);
        lauren.addAccount(householdAccount);

        System.out.println("Money on Paul's accounts: " + paul.totalMoney());
        System.out.println("Money on lauren's accounts: " + lauren.totalMoney());
        System.out.println();

        salaryAccount.deposit(150000);

        System.out.println("Money on Paul's accounts: " + paul.totalMoney());
        System.out.println("Money on lauren's accounts: " + lauren.totalMoney());
        System.out.println();

        householdAccount.deposit(10000);

        System.out.println("Money on Paul's accounts: " + paul.totalMoney());
        System.out.println("Money on lauren's accounts: " + lauren.totalMoney());
        System.out.println();

        /* 33.7 The structure of a program */
        Scanner reader = new Scanner(System.in);
        UserInterface ui = new UserInterface(reader);
        // ui.start();

        /* 35.1 */
        Person matti = new Person("Matti");
        if (matti.enoughMoneyForSingleTicket()) {
            System.out.println("Let's buy!");
        } else {
            System.out.println("I'm broke : (");
        }

        System.out.println("\n");
        String string = "string";
        System.out.println("String: " + string);
        Serializable serializableString = string;
        CharSequence charSequenceString = string;
        Comparable<String> comparableString = string;

        System.out.println(charSequenceString.subSequence(1, 4));


    }
}
