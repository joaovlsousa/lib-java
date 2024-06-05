package lib.models;

import java.util.Scanner;

public class Admin extends Person {
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

    public String getData(boolean getSensiviteData) {
        if (!getSensiviteData) {
            return super.getData();
        }

        return "-------------------- \n" + 
        "Nome: " + name + "\n" +
        "CPF: " + cpf + "\n" +
        "Senha: " + password + "\n" +
        "-------------------- \n";
    }

    public void registerBook() {
      String title, author;
      float price;
      int amount;

      System.out.println();
      System.out.print("Informe o titulo: ");
      title = strScann.nextLine();

      System.out.print("Informe o autor: ");
      author = strScann.nextLine();

      System.out.print("Informe o preço: ");
      price = numScann.nextFloat();

      System.out.print("Informe a quantidade de livros: ");
      amount = numScann.nextInt();

      Book book = new Book(title, author, price, amount);
      lib.create(book);
    }

    public void searchBook() {
        String title;

        System.out.println();
        System.out.print("Informe o titulo do livro: ");
        title = strScann.nextLine();

        Book book = lib.get(title);

        if (book == null) {
            System.out.println();
            System.out.print("Nao foi possivel encontrar este livro!");
        } else {
          System.out.println();
          System.out.println(book.getData());
        }
    }

    public void updateBook() {
        String title;

        System.out.println();
        System.out.print("Informe o titulo do livro: ");
        title = strScann.nextLine();

        Book book = lib.get(title);

        if (book == null) {
            System.out.println();
            System.out.print("Nao foi possivel encontrar este livro!");
        } else {
            String op;
    
            System.out.println();
            System.out.print("Quer editar o titulo do livro? (s/n) ");
            op = strScann.nextLine();
    
            if (op.toLowerCase().equals("s")) {
                System.out.print("Informe um novo titulo: ");
                book.setTitle(strScann.nextLine());
            }

            System.out.println();
            System.out.print("Quer editar o autor do livro? (s/n) ");
            op = strScann.nextLine();
    
            if (op.toLowerCase().equals("s")) {
                System.out.print("Informe um novo autor: ");
                book.setAuthor(strScann.nextLine());
            }

            System.out.println();
            System.out.print("Quer editar o preco do livro? (s/n) ");
            op = strScann.nextLine();
    
            if (op.toLowerCase().equals("s")) {
                System.out.print("Informe um novo preco: ");
                book.setPrice(numScann.nextFloat());
            }

            System.out.println();
            System.out.print("Quer editar a quantidade de livros? (s/n) ");
            op = strScann.nextLine();
    
            if (op.toLowerCase().equals("s")) {
                System.out.print("Informe uma nova quantidade: ");
                book.setAmount(numScann.nextInt());
            }
        }
    }

    public void deleteBook() {
        String title;

        System.out.println();
        System.out.print("Informe o titulo do livro: ");
        title = strScann.nextLine();

        Book book = lib.get(title);

        if (book == null) {
            System.out.println();
            System.out.print("Nao foi possivel encontrar este livro!");
        } else {
            if (lib.delete(book)) {
              System.out.println("O livro foi excluido com sucesso!");
            } else {
              System.out.println("Falha ao excluir o livro!");
            }
        }
    }
}
