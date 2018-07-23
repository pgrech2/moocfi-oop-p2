package ex1Smileys;

public class Smileys {
    private String smiley = ":)";

    public void printWithSmileys(String characterString) {

        printSmileyLine();
        System.out.println(this.smiley + " " + characterString + this.smiley);
        printSmileyLine();
    }

    public void printSmileyLine() {
        int i = 0;

        while (i < 5) {
            System.out.print(this.smiley + " ");
            i++;
        }
        System.out.println();
    }
}
