public class Book {
    private String name;
    private int datePublication;
    private Author author;


    public Book(String name, int datePublication, Author author) {
        this.name = name;
        this.datePublication = datePublication;
        this.author = author;
    }

    public String getName() {
        return this.name;
    }

    public int getDatePublication() {
        return this.datePublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }
}
