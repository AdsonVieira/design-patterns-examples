package creational.proxy;

import java.util.ArrayList;
import java.util.List;

public class BookSearch implements BookSearchInterface {
    private List<Book> books;

    public BookSearch() {
        this.books = new ArrayList<>();

        books.add(new Book("101", "A Short History of Nearly Everything."));
        books.add(new Book("112", "Alice's Adventures in Wonderland"));
        books.add(new Book("1233", "How to be an Alien"));
    }

    public Book get(String isbn) {
        for (Book book : this.books) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }
}
