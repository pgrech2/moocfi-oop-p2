package ex2CharacterStringChanger;

import java.util.ArrayList;

public class Changer {

    private ArrayList<Change> changes = new ArrayList<Change>();

    public void addChange(Change change) {
        this.changes.add(change);
    }

    public String change(String characterString) {
        for(Change change : this.changes) {
            characterString = change.change(characterString);
        }
        return characterString;
    }
}
