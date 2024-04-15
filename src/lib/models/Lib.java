package lib.models;

import java.util.ArrayList;
import java.util.List;

public class Lib {
    private List<Book> books;
    private float balance;

    public Lib() {
        this.books = new ArrayList<Book>();
    } 

    public void registerBook(Book book) {
        books.add(book);
    }

    public boolean deleteBook(Book book) {
        return books.remove(book);
    }

    public Book getBook(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().equals(title.toLowerCase())) {
                return book;
            }
        }

        return null;
    }

    public void listBooks() {
        if (books.size() == 0) {
            System.out.println();
            System.out.println("A coleção está vazia!");
        } else {
            for (Book book : books) {
                System.out.println();
                System.out.print(book.getData());
                System.out.println();
            }
        }
    }

    public float getbalance() {
      return balance;
    }

    public void setbalance(float balance) {
        this.balance = balance;
    }
}
