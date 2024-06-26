package lib.models;

public class Book {
    private String title;
    private String author;
    private float price;
    private int amount;

    public Book(String title, String author, float price, int amount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public int getAmount(){
        return amount;
    }

    public float getPrice(){
        return price;
    }

    public String getData() {
        return "-------------------- \n" + 
               "Titulo: " + title + "\n" +
               "Autor: " + author + "\n" +
               "Preço: R$" + price + "\n" +
               "Quantidade: " + amount + "\n" +
               "-------------------- \n";
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPrice(float price) {
        this.price = price;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }



}
