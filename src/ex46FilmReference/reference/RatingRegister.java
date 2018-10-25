package ex46FilmReference.reference;

import ex46FilmReference.reference.domain.*;

import java.util.*;

public class RatingRegister {

    private Map<Person, Map<Film, List<Rating>>> ratingRegister;

    public RatingRegister() {
        this.ratingRegister = new HashMap<>();
    }

    public void addRating(Person person, Film film, Rating rating){
        Map<Film, List<Rating>> filmRatings = new HashMap<>();
        List<Rating> ratings = new ArrayList<>();

        if (ratingRegister.containsKey(person)) {
            filmRatings = ratingRegister.get(person);
            if (filmRatings.containsKey(film)) {
                ratings = filmRatings.get(film);
            }
        }

        ratings.add(rating);
        filmRatings.put(film, ratings);
        ratingRegister.put(person, filmRatings);
    }

    public List<Rating> getRatings(Film film) {
        List<Rating> allRatings = new ArrayList<>();
        Iterator personIterator = ratingRegister.values().iterator();
        while (personIterator.hasNext()){
            Map<Film, List<Rating>> filmRatings = (Map<Film, List<Rating>>) personIterator.next();
            List<Film> films = new ArrayList<Film>(filmRatings.keySet()) ;
            for(Film f : films) {
                if (f == film) {
                    allRatings.addAll(filmRatings.get(f));
                }
            }
        }
        return allRatings;
    }


    public Map<Film, List<Rating>> getPersonalRatings(Person person){
        return ratingRegister.get(person);

    }

    public List<Person> reviewers(){
        return new ArrayList<Person>(ratingRegister.keySet());
    }
}
