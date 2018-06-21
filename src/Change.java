public class Change {
    private char fromCharacter;
    private char toCharacter;

    public Change (char fromCharacter, char toCharater) {
        this.fromCharacter = fromCharacter;
        this.toCharacter = toCharater;
    }

    public String change (String characterString) {
        return characterString.replace(this.fromCharacter, this.toCharacter);
    }

    public String manualChange (String characterString){
        String returnString = "";
        for (int i = 0; i < characterString.length(); ++i) {
            char character = characterString.charAt(i);
            if (character == this.fromCharacter) {
                returnString += this.toCharacter;
            } else {
                returnString += character;
            }
        }
        return returnString;
    }
}
