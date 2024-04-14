package lib.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client extends People {
    private double amount;
    private List<Book> books;
    Scanner strScann = new Scanner(System.in);
    Scanner numScann = new Scanner(System.in);

    
    public Client(String name, String cpf, double amount) {
        super(name, cpf);

        this.amount = amount;
        this.books = new ArrayList<Book>();
    }

    public double getAmount(){
        return amount;
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

    public void buyBook(Lib lib){
        String title;
        System.out.print("Informe o titulo do livro: ");
        title = strScann.nextLine();

        Book book = lib.getBook(title);

        if (book == null){
            System.out.println();
            System.out.print("Nao foi possivel encontrar este livro!");
        }else{
            System.out.println();
            System.out.println("Livro disponivel!");
            System.out.println();
            System.out.println(book.getData());
            System.out.print("Quantas copias deseja comprar? ");
            int copies = numScann.nextInt();

            if (copies > book.getAmount()){
                System.out.println();
                System.out.println("Nao temos esta quantidade de copias disponiveis! ");
                System.out.println();
            
            }else if(this.amount < book.getPrice()*copies){
                System.out.println();
                System.out.println("Saldo insuficiente para efetuar a compra! ");
                System.out.println();

            }else{
                System.out.println();
                System.out.println("Compra efetuada com sucesso! ");
                System.out.println();
                book.setAmount(book.getAmount()-copies);
                lib.setAmount(lib.getAmount()+(book.getPrice()*copies));
                this.amount -= (book.getPrice()*copies);
                
                System.out.println();
                System.out.println("Dados atualizados do livro ");
                System.out.println();
                System.out.println(book.getData());
            }
        }
    }
}
