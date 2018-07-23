package ex2CharacterStringChanger;

public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change (char fromCharacter, char toCharacter) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharacter;
    }

    public String change(String characterString) {
        return characterString.replace(this.fromCharacter, this.toCharacter);
    }

    public String iterativeChange(String characterString) {
        String replacedString = "";
        for (int i=0; i <characterString.length(); ++i){
            char character = characterString.charAt(i);
            if (character == this.fromCharacter) {
                replacedString += this.toCharacter;
            } else {
                replacedString += character;
            }
        }
        return replacedString;
    }
}
