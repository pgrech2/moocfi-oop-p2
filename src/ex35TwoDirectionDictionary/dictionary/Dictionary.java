package ex35TwoDirectionDictionary.dictionary;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
         this.dictionary = new HashMap<>();
    }

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

    public List<String> words () {
        List<String> dictKeys = new ArrayList<>();
        dictKeys.addAll(this.dictionary.keySet());
        return dictKeys;
    }
}
