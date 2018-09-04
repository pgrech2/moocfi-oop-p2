package ex15SortingCards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{

    private List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print(){
        for(Card card : this.cards) {
            System.out.println(card.toString());
        }
    }

    public int sum() {
        int sum = 0;
        for(Card card : this.cards) {
            sum += card.getValue();
        }
        return sum;

    }

    public void sort() {
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand hand) {
        return sum() - hand.sum();
    }
}
