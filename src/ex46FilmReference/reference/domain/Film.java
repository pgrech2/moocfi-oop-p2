package ex46FilmReference.reference.domain;

public class Film {

    private String name;

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object.getClass() != this.getClass()) {
            return false;
        }

        Film compared = (Film) object;
        if (!compared.name.equals(this.name)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.name == null) {
            return 7;
        }

        return this.name.hashCode();
    }
}
