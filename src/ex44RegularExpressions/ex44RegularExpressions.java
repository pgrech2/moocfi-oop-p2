package ex44RegularExpressions;

import java.util.Scanner;

public class ex44RegularExpressions {

    public static void main (String [] args) {
        System.out.println("hello world");
        Scanner reader = new Scanner(System.in);

        System.out.print("Write a verb: ");
        String verb = reader.nextLine();
        System.out.print("\nWrite a form of " + verb + ": ");
        String verbForm = reader.nextLine();
        System.out.println(verbForm.matches(verb + "(|s|ed|ing|er)"));

        System.out.println("All vowels: " + isAWeekDay("MOnday"));
        System.out.println("All vowels: " + allVowels("aezi"));
    }

    private static boolean isAWeekDay(String string) {
        if (string != null){
            return string.toLowerCase().matches("(mon|tues|wed|thurs|fri)(.*)");
        }
        return false;
    }

    public static boolean allVowels(String string) {
        if (string != null) {
            return string.toLowerCase().matches("[aeiou]{1,}");
        }
        return false;
    }
}
