package service;

import bean.Book;
import dao.BookPersistHandler;

public class BookService {
    private BookPersistHandler persistHandler = new BookPersistHandler();

    public void saveBook(Book book) {
        persistHandler.saveBook(book);
    }

    public Book getBookById(String isbn) {
        return persistHandler.getBookById(isbn);
    }
}
