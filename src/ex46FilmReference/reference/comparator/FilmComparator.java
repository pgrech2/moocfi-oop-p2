package ex46FilmReference.reference.comparator;

import ex46FilmReference.reference.domain.Film;
import ex46FilmReference.reference.domain.Rating;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FilmComparator implements Comparator<Film> {

    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings) {
        this.ratings = ratings;
    }

    private int average(Film film) {
        List<Rating> filmRatings = ratings.get(film);
        int sum = 0;
        for (Rating rating : filmRatings) {
            sum = sum + rating.getValue();
        }
        return sum / filmRatings.size();
    }

    public int compare(Film film1, Film film2) {
        return average(film2) - average(film1);
    }

}
