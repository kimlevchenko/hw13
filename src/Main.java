public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Diane", "Setterfield");
        Book book1 = new Book("Once upon a river", 2018, author1);
        Author author2 = new Author("Scarlett", "Thomas");
        Book book2 = new Book("Our tragic universe", 2010, author2);
        System.out.println("Book 1 = " + book1.getAuthor().getName() + " " + book1.getAuthor().getLastName() + " " + book1.getName() + " " + book1.getDatePublication());
        System.out.println("Book 2 = " + book2.getAuthor().getName() + " " + book2.getAuthor().getLastName() + " " + book2.getName() + " " + book2.getDatePublication());

        book1.setDatePublication(2020);
        System.out.println("book1.getDatePublication() = " + book1.getDatePublication());
    }
}