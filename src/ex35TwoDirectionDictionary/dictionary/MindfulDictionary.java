package ex35TwoDirectionDictionary.dictionary;

import ex34FileManager.FileHandler;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MindfulDictionary {

    private Dictionary dictionaryForward = new Dictionary();
    private Dictionary dictionaryReverse = new Dictionary();
    private String dictionaryPath;

    public MindfulDictionary (String file) {
        this.dictionaryPath = file;
    }

    public boolean load () {
        FileHandler f = new FileHandler();
        ArrayList<String> content = f.read(this.dictionaryPath);

        if (content == null) {
            return false;
        }

        for (String line : content) {
            String [] arrOfStr = line.split(":");
            this.add(arrOfStr[0], arrOfStr[1]);
        }

        return true;
    }

    public boolean save () {
        if (this.dictionaryForward.words() == null) {
            return false;
        }

        ArrayList<String> content = new ArrayList<>();
        for (String word : this.dictionaryForward.words()) {
            content.add(word + ":" + this.dictionaryForward.translate(word));
        }
        FileHandler f = new FileHandler();
        f.save(this.dictionaryPath, content);
        return true;
    }

    public void add (String word, String translation) {
        this.dictionaryForward.add(word, translation);
        this.dictionaryReverse.add(translation, word);
    }

    public String translate (String word) {
        String forward = this.dictionaryForward.translate(word);
        String reverse = this.dictionaryReverse.translate(word);
        if(forward != null) {
            return forward;
        }
        if (reverse != null){
            return reverse;
        }
        return null;
    }

    public void remove (String word) {
        String translation = this.dictionaryForward.translate(word);
        if(translation != null) {
            this.dictionaryForward.remove(word);
            this.dictionaryReverse.remove(translation);
        }

        translation = this.dictionaryReverse.translate(word);
        if(translation != null) {
            this.dictionaryForward.remove(translation);
            this.dictionaryReverse.remove(word);
        }
    }

}
