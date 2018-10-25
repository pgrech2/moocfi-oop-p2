package ex35TwoDirectionDictionary.dictionary;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void add (String word, String translation) {
        if (!this.dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }
    }

    public String translate (String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        }
        return null;
    }

    public void remove (String word) {
        if (this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        }
    }

    public ArrayList<String> words () {
        ArrayList<String> dictKeys = new ArrayList<>();
        for(String key : this.dictionary.keySet()) {
            dictKeys.add(key);
        }
        return dictKeys;
    }
}
