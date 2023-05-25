import java.util.Objects;

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

    public String toString() {
        return "Наименование книги: " + this.name + ". Год публикации: " + this.datePublication + ". " + author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
