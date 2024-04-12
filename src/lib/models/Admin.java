package lib.models;

import java.util.Scanner;

public class Admin extends People {
    private String password;
    private Lib lib;

    Scanner strScann = new Scanner(System.in);
    Scanner numScann = new Scanner(System.in);

    public Admin(String name, String cpf, Lib lib) {
        super(name, cpf);

        this.password = "admin";
        this.lib = lib;
    }

    public String getPassword() {
        return password;
    }

    public void registerBook() {
      String title, author;
      double price;
      int amount;

      System.out.println();
      System.out.print("Informe o titulo: ");
      title = strScann.nextLine();

      System.out.print("Informe o autor: ");
      author = strScann.nextLine();

      System.out.print("Informe o preço: ");
      price = numScann.nextDouble();

      System.out.print("Informe a quantidade de livros: ");
      amount = numScann.nextInt();

      Book book = new Book(title, author, price, amount);
      lib.registerBook(book);
    }

    public void listBooks() {
      lib.listBooks();
    }
}
