package ex6PromissoryNote;

public class ex6PromissoryNote {
    public static void main (String [] args) {
        System.out.println("Promissory Note!");

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30.0);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));

        mattisNote.setLoan("Arto", 10.5);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));

        System.out.println(mattisNote.toString());
    }
}
