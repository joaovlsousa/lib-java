package lib.models;

public class Book {
    private String title;
    private String author;
    private double price;
    private int amount;

    public Book(String title, String author, double price, int amount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.amount = amount;
    }

    public String getTitle() {
      return title;
    }

    public String getData() {
        return "Titulo: " + title + "\n" +
               "Autor: " + author + "\n" +
               "Preço: " + price + "\n" +
               "Quantidade: " + amount;
    }

    public void setAmount(int amount) {
      this.amount = amount;
    }

    public void setAuthor(String author) {
      this.author = author;
    }

    public void setPrice(double price) {
      this.price = price;
    }

    public void setTitle(String title) {
      this.title = title;
    }
}
