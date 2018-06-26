public class Book implements ToBeStored{

    private String writer = null;
    private String name;
    private String content = null;
    private double weight = 0.0;
    private int publishingYear = 0;


    public Book(String name, int publishingYear) {
        this.name = name;
        this.publishingYear = publishingYear;
    }

    public Book(String name, int publishingYear, String content) {
        this.name = name;
        this.publishingYear = publishingYear;
        this.content = content;
    }

    // Used for exercise 11.1
    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    // GETTER METHODS
    public String getWriter() {
        return this.writer;
    }

    public String getName() {
        return this.name;
    }

    public String getContent() {
        return this.content;
    }

    public double weight() {
        return this.weight;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    // SETTER METHODS
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }


}