package ex46FilmReference;

import ex46FilmReference.reference.RatingRegister;
import ex46FilmReference.reference.comparator.FilmComparator;
import ex46FilmReference.reference.comparator.PersonComparator;
import ex46FilmReference.reference.domain.Film;
import ex46FilmReference.reference.domain.Person;
import ex46FilmReference.reference.domain.Rating;

import java.util.*;

public class ex45FilmReference {

    public static void main (String [] args) {
        // Exercise 46.1: Person and Film
//        Person p = new Person("Pekka");
//        Film f = new Film("Eraserhead");
//        System.out.println(p.getName() + " and " + f.getName());


        // Exercise 46.2: Rating
//        Rating given = Rating.GOOD;
//        System.out.println("Rating " + given + ", value " + given.getValue());
//        given = Rating.NEUTRAL;
//        System.out.println("Rating " + given + ", value " + given.getValue());


        // Exercise 46.3: RatingRegister, Part 1
//        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
//        Film eraserhead = new Film("Eraserhead");
//
//        RatingRegister reg = new RatingRegister();
//        reg.addRating(eraserhead, Rating.BAD);
//        reg.addRating(eraserhead, Rating.BAD);
//        reg.addRating(eraserhead, Rating.GOOD);
//
//        reg.addRating(theBridgesOfMadisonCounty, Rating.GOOD);
//        reg.addRating(theBridgesOfMadisonCounty, Rating.FINE);
//
//        System.out.println("All ratings: " + reg.filmRatings());
//        System.out.println("Ratings for Eraserhead: " + reg.getRatings(eraserhead));

        // EXERCISE 46.4: RATING REGISTER, PART 2
//        RatingRegister ratings = new RatingRegister();
//
//        Film goneWithTheWind = new Film("Gone with the Wind");
//        Film eraserhead = new Film("Eraserhead");
//
//        Person matti = new Person("Matti");
//        Person pekka = new Person("Pekka");
//
//        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
//        ratings.addRating(matti, eraserhead, Rating.FINE);
//
//        ratings.addRating(pekka, goneWithTheWind, Rating.GOOD);
//        ratings.addRating(pekka, eraserhead, Rating.GOOD);
//
//        System.out.println("Ratings for Eraserhead: " + ratings.getRatings(eraserhead));
//        System.out.println("Matti's ratings: " + ratings.getPersonalRatings(matti));
//        System.out.println("Reviewers: " + ratings.reviewers());

        // Exercise 46.5 Person Comparator
//        Person matti = new Person("Matti");
//        Person pekka = new Person("Pekka");
//        Person mikke = new Person("Mikke");
//        Person thomas = new Person("Thomas");
//
//        Map<Person, Integer> peopleIdentities = new HashMap<Person, Integer>();
//        peopleIdentities.put(matti, 42);
//        peopleIdentities.put(pekka, 134);
//        peopleIdentities.put(mikke, 8);
//        peopleIdentities.put(thomas, 82);
//
//        List<Person> ppl = Arrays.asList(matti, pekka, mikke, thomas);
//        System.out.println("People before sorting: " + ppl);
//
//        Collections.sort(ppl, new PersonComparator(peopleIdentities));
//        System.out.println("People after sorting: " + ppl);

        // Exercise 46.6 FilmComparator
        RatingRegister ratings = new RatingRegister();

        Film goneWithTheWind = new Film("Gone with the Wind");
        Film theBridgesOfMadisonCounty = new Film("The Bridges of Madison County");
        Film eraserhead = new Film("Eraserhead");

        Person matti = new Person("Matti");
        Person pekka = new Person("Pekka");
        Person mikke = new Person("Mikke");

        ratings.addRating(matti, goneWithTheWind, Rating.BAD);
        ratings.addRating(matti, theBridgesOfMadisonCounty, Rating.GOOD);
        ratings.addRating(matti, eraserhead, Rating.FINE);

        ratings.addRating(pekka, goneWithTheWind, Rating.FINE);
        ratings.addRating(pekka, theBridgesOfMadisonCounty, Rating.BAD);
        ratings.addRating(pekka, eraserhead, Rating.MEDIOCRE);

        ratings.addRating(mikke, eraserhead, Rating.BAD);

        Map<Film, List<Rating>> filmRatings = ratings.filmRatings();

        List<Film> films = Arrays.asList(goneWithTheWind, theBridgesOfMadisonCounty, eraserhead);
        System.out.println("The films before sorting: " + films);

        Collections.sort(films, new FilmComparator(filmRatings));
        System.out.println("The films after sorting: " + films);

    }
}
