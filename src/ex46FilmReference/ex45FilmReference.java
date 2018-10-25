package ex46FilmReference;

import ex46FilmReference.reference.RatingRegister;
import ex46FilmReference.reference.domain.Film;
import ex46FilmReference.reference.domain.Person;
import ex46FilmReference.reference.domain.Rating;

public class ex45FilmReference {

    public static void main (String [] args) {

        RatingRegister ratings = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film eraserhead = new Film("Eraserhead");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");

        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        ratings.addRating(matti, eraserhead, Rating.FINE);

        ratings.addRating(pekka, goneWithTheWind, Rating.GOOD);
        ratings.addRating(pekka, eraserhead, Rating.GOOD);

        System.out.println("Ratings for Eraserhead: " + ratings.getRatings(eraserhead));
        System.out.println("Matti's ratings: " + ratings.getPersonalRatings(matti));
        System.out.println("Reviewers: " + ratings.reviewers());
    }
}
