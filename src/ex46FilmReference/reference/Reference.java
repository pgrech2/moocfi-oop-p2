package ex46FilmReference.reference;

import ex46FilmReference.reference.domain.Film;
import ex46FilmReference.reference.domain.Person;

public class Reference {

    private RatingRegister ratingRegister;

    public Reference (RatingRegister ratingRegister) {
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person) {
        return new Film("a");
    }

}
