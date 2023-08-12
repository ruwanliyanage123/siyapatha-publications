package dao;

import bean.Book;

import java.util.HashMap;
import java.util.Map;

public class BookPersistHandler {
    private Map<String, Book> bookMap = new HashMap<>();

    public void saveBook(Book book) {
        bookMap.put(book.getIsbn(), book);
    }

    public Book getBookById(String isbn) {
        return bookMap.get(isbn);
    }
}
