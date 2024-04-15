package lib.models;

import java.util.Scanner;

public class Client extends Person {
    private float balance;

    Scanner strScann = new Scanner(System.in);
    Scanner numScann = new Scanner(System.in);
    
    public Client(String name, String cpf) {
        super(name, cpf);

        this.balance = 0;
    }

    public float getBalance() {
        return balance;
    }

    public void depositMoney() {
        float balance;

        System.out.print("Informe o valor do deposito: ");
        balance = numScann.nextFloat();

        this.balance += balance;
    }

    public void searchBook(Lib lib) {
        String title;

        System.out.println();
        System.out.print("Informe o titulo do livro: ");
        title = strScann.nextLine();

        Book book = lib.getBook(title);

        if (book == null) {
            System.out.println();
            System.out.print("Nao foi possivel encontrar este livro!");
        } else {
          System.out.println();
          System.out.println(book.getData());
        }

    }

    public void buyBook(Lib lib) {
        String title;

        System.out.print("Informe o titulo do livro: ");
        title = strScann.nextLine();

        Book book = lib.getBook(title);

        if (book == null) {
            System.out.println();
            System.out.print("Nao foi possivel encontrar este livro!");
        } else {
            System.out.println();
            System.out.println("Livro disponivel!");
            System.out.println();
            System.out.println(book.getData());
            System.out.print("Quantas copias deseja comprar? ");
            int copies = numScann.nextInt();

            float totalValue = book.getPrice() * copies;

            if (copies > book.getAmount()) {
                System.out.println();
                System.out.println("Nao temos esta quantidade de copias disponiveis! ");
                System.out.println();
            
            } else if (this.balance < totalValue) {
                System.out.println();
                System.out.println("Saldo insuficiente para efetuar a compra! ");
                System.out.println();

            } else {
                System.out.println();
                System.out.println("Compra efetuada com sucesso! ");
                System.out.println();

                book.setAmount(book.getAmount() - copies);
                lib.setbalance(lib.getbalance() + totalValue);
                this.balance -= totalValue;

                System.out.println();
                System.out.println("Dados atualizados do livro ");
                System.out.println();
                System.out.println(book.getData());
            }
        }
    }
}
