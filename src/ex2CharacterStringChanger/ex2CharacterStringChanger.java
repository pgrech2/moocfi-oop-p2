package ex2CharacterStringChanger;

public class ex2CharacterStringChanger {

    public static void main(String[] args) {

        // Exercise 2.1 Change - Class
        String word = "carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);

        System.out.println(word);

        Change Change2 = new Change('r', 'x');
        word = Change2.iterativeChange(word);

        System.out.println(word);

        // Exercise 2.2 Changer - Class
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('ä', 'a'));
        scandiesAway.addChange(new Change('ö', 'o'));
        System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));
    }
}
