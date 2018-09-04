package ex15SortingCards;

public class Card implements Comparable<Card>{
    public static final int SPADES  = 0;
    public static final int DIAMONDS  = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS   = 3;

    private int suit;
    private int value;

    public Card (int value, int suit) {
        if (value > 1 && value < 15) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Invalid card value");
        }
        this.suit = suit;
    }

    public int getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    private String getStringSuit() {
        switch(this.suit){
            case 0:
                return "SPADES";
            case 1:
                return "DIAMONDS";
            case 2:
                return "HEARTS";
            case 3:
                return "CLUBS";
            default:
                return null;
        }
    }

    private String getStringValue () {
        switch(this.value){
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
            case 14:
                return "A";
            default:
                return Integer.toString(this.value);
        }
    }

    @Override
    public String toString () {
        return this.getStringValue() + " of " + this.getStringSuit();
    }

    @Override
    public int compareTo(Card card) {
        if(card.getValue() == this.value) {
            return this.suit - card.getSuit();
        } else {
            return this.value - card.getValue();
        }
    }
}
