package ex46FilmReference.reference;

import ex46FilmReference.reference.domain.Film;
import ex46FilmReference.reference.domain.Person;
import ex46FilmReference.reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {

    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> personalRatings;

    public RatingRegister() {
        this.filmRatings = new HashMap<>();
        this.personalRatings = new HashMap<>();
    }

    // RATING REGISTER PART 1;
    public void addRating(Film film, Rating rating) {
        List<Rating> ratings = new ArrayList<>();
        if (filmRatings.containsKey(film)) {
            ratings = filmRatings.get(film);
        }
        ratings.add(rating);
        filmRatings.put(film, ratings);
    }

    public List<Rating> getRatings(Film film) {
        return filmRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings() {
        return filmRatings;
    }

    // RATING REGISTER PART 2;
    public void addRating(Person person, Film film, Rating rating){
        Map<Film, Rating> personalFilmRatings = new HashMap<>();
        if (personalRatings.containsKey(person)) {
            personalFilmRatings = personalRatings.get(person);
        }
        if (!personalFilmRatings.containsKey(film)) {
            personalFilmRatings.put(film, rating);
            personalRatings.put(person, personalFilmRatings);
            addRating(film, rating);
        }
    }

    public Rating getRating(Person person, Film film){
        Rating rating = personalRatings.get(person).get(film);
        if (rating == null) {
            rating = Rating.NOT_WATCHED;
        }
        return rating;
    }

    public Map<Film, Rating> getPersonalRatings(Person person){
        return personalRatings.get(person);
    }

    public List<Person> reviewers(){
        return new ArrayList<Person>(personalRatings.keySet());
    }

}
