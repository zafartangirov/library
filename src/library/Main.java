package library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // creating books
        Book b1 = new Book(1, "Java Asoslari", "Zafar Tangirov");
        Book b2 = new Book(2, "Spring Boot", "PDP Academy");
        Book b3 = new Book(3, "Clean Code", "Robert C. Martin");

        // adding book
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b1); // adding again test

        // Print all books
        library.getAllBooks();

        // searching by id
        library.getBookById(2);
        library.getBookById(5);

        // deleting the book by id
        library.removeBook(1);
        library.removeBook(10);

        // show list after deleting
        library.getAllBooks();
    }
}
