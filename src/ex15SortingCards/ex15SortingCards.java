package ex15SortingCards;

import java.util.ArrayList;
import java.util.Collections;

public class ex15SortingCards {

    public static void main (String [] args) {
        System.out.println("Exercise 15");

        Card first = new Card(2, Card.DIAMONDS);
        Card second = new Card(14, Card.CLUBS);
        Card third = new Card(12, Card.HEARTS);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        System.out.println("Exercise 15.2");
        Hand hand1 = new Hand();
        hand1.add( new Card(2, Card.SPADES) );
        hand1.add( new Card(14, Card.CLUBS) );
        hand1.add( new Card(12, Card.HEARTS) );
        hand1.add( new Card(2, Card.CLUBS) );
        hand1.print();
        System.out.println("\n\n");

        System.out.println("Exercise 15.3");
        Hand hand2 = new Hand();
        hand2.add( new Card(2, Card.SPADES) );
        hand2.add( new Card(14, Card.CLUBS) );
        hand2.add( new Card(12, Card.HEARTS) );
        hand2.add( new Card(2, Card.CLUBS) );
        hand2.sort();
        hand2.print();
        System.out.println("\n\n");

        System.out.println("Exercise 15.4");
        Hand hand3 = new Hand();
        hand3.add( new Card(2, Card.SPADES) );
        hand3.add( new Card(14, Card.CLUBS) );
        hand3.add( new Card(12, Card.HEARTS) );
        hand3.add( new Card(2, Card.CLUBS) );

        Hand hand4 = new Hand();
        hand4.add( new Card(11, Card.DIAMONDS) );
        hand4.add( new Card(11, Card.CLUBS) );
        hand4.add( new Card(11, Card.HEARTS) );

        int comparison = hand3.compareTo(hand4);

        if ( comparison < 0 ) {
            System.out.println("the most valuable hand contains the cards");
            hand4.print();
        } else if ( comparison > 0 ){
            System.out.println("the most valuable hand contains the cards");
            hand1.print();
        } else {
            System.out.println("the hands are equally valuable");
        }
        System.out.println("\n\n");

        System.out.println("Exercise 15.5");
        ArrayList<Card> cards = new ArrayList<Card>();

        cards.add( new Card(3, Card.CLUBS) );
        cards.add( new Card(2, Card.DIAMONDS) );
        cards.add( new Card(14, Card.CLUBS) );
        cards.add( new Card(12, Card.HEARTS) );
        cards.add( new Card(2, Card.CLUBS) );

        Collections.sort(cards, new SortAgainstSuit() );

        for (Card c : cards) {
            System.out.println( c );
        }


    }
}
