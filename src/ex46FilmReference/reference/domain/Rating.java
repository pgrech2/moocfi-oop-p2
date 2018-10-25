package ex46FilmReference.reference.domain;

public enum Rating {
    BAD(-5),
    MEDIOCRE(-3),
    NOT_WATCHED(0),
    NEUTRAL(1),
    FINE(3),
    GOOD(5);

    private int rating;

    Rating (int rating) {
        this.rating = rating;
    }

    public int getValue() {
        return this.rating;
    }

}
