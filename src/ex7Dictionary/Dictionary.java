package ex7Dictionary;

import java.util.HashMap;

public class Dictionary {

    private HashMap<String, String> translator = new HashMap<>();

    public String translate(String word) {
        return translator.get(word);
    }

    public void add(String word, String translation) {
        this.translator.put(word, translation);
    }

    public int amountOfWords() {
        return this.translator.size();
    }
}
