package lib.interfaces;

import lib.models.Book;

public interface LibRepository {
    public void registerBook(Book book);
    public Book getBook(String title);
    public void listBooks();
    public boolean deleteBook(Book book);
}
