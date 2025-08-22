package library;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> books = new HashMap<>();

    // adding book method
    public void addBook(Book book) {
        if (books.containsKey(book.getId())) {
            System.out.println("Already exists: " + book.getId());
        } else {
            books.put(book.getId(), book);
            System.out.println("✅ Book added: " + book);
        }
    }

    // get all books method
    public void getAllBooks() {
        if (books.isEmpty()) {
            System.out.println("📚 Library empty.");
        } else {
            System.out.println("📚 Books list:");
            for (Book book : books.values()) {
                System.out.println(book);
            }
        }
    }

    // get book by id method
    public void getBookById(int id) {
        Book book = books.get(id);
        if (book != null) {
            System.out.println("🔍 Found: " + book);
        } else {
            System.out.println("❌ Not found: " + id);
        }
    }

    // remove book method
    public void removeBook(int id) {
        Book removed = books.remove(id);
        if (removed != null) {
            System.out.println("🗑️ Removed: " + removed);
        } else {
            System.out.println("❌ Not found: " + id);
        }
    }
}
