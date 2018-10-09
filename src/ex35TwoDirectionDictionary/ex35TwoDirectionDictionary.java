package ex35TwoDirectionDictionary;

import ex35TwoDirectionDictionary.dictionary.MindfulDictionary;

public class ex35TwoDirectionDictionary {

    public static void main (String [] args) {
        MindfulDictionary dict = new MindfulDictionary("src/temp");
        dict.add("apina", "monkey");
        dict.add("banaani", "banana");
        dict.add("ohjelmointi", "programming");
        dict.remove("apina");
        dict.remove("banana");

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("monkey") );
        System.out.println( dict.translate("banana") );
        System.out.println( dict.translate("banaani") );
        System.out.println( dict.translate("ohjelmointi") );

        MindfulDictionary dict2 = new MindfulDictionary("src/testdictionary.txt");
        dict2.load();

        System.out.println( dict2.translate("apina") );
        System.out.println( dict2.translate("ohjelmointi") );
        System.out.println( dict2.translate("alla oleva") );

        dict2.add("apina", "monkey");
        dict2.add("banaani", "banana");
        dict2.add("ohjelmointi", "programming");

        dict2.save();
    }
}
