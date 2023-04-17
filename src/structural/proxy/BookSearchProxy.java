package structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class BookSearchProxy implements BookSearchInterface {
    private List<Book> booksInCache;

    public BookSearchProxy() {
        this.booksInCache = new ArrayList<>();

        booksInCache.add(new Book("123", "The Hitchhiker's Guide to the Galaxy"));
        booksInCache.add(new Book("456", "Alice's Adventures in Wonderland"));
        booksInCache.add(new Book("789", "How to be an Alien"));
    }

    @Override
    public Book get(String isbn) {
        Book book = this.getInCache(isbn);

        if (book == null) {
            BookSearch bookSearch = new BookSearch();
            return bookSearch.get(isbn);
        }

        return book;
    }

    private Book getInCache(String isbn) {
        for (Book book : this.booksInCache) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }
}
