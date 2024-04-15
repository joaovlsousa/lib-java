package lib;

import java.util.Scanner;

import lib.models.Admin;
import lib.models.Client;
import lib.models.Lib;

public class App {
    public static void mainMenu() {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("1 - Cliente");
        System.out.println("2 - Administrador");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("");

        System.out.print("Escolha uma opção: ");
    }

    public static void adminMenu() {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("1 - Cadastrar um novo livro");
        System.out.println("2 - Listar todos os livros");
        System.out.println("3 - Buscar um livro");
        System.out.println("4 - Editar um livro");
        System.out.println("5 - Excluir um livro");
        System.out.println("6 - Ver saldo da biblioteca");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("");

        System.out.print("Escolha uma opção: ");
    } 

    public static void clientMenu() {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("1 - Ver livros");
        System.out.println("2 - Buscar um livro");
        System.out.println("3 - Comprar um novo livro");
        System.out.println("4 - Ver saldo em conta");
        System.out.println("5 - Depositar dinheiro na conta");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("");

        System.out.print("Escolha uma opção: ");
    } 

    public static void clientActions(
        String name,
        String cpf,
        Lib lib,
        Scanner strScann,
        Scanner numScann
    ) {
        Client client = new Client(name, cpf);
        
        int op;
        
        do {
            clientMenu();
            op = numScann.nextInt();

            switch (op) {
                case 1:
                    lib.listBooks();    
                    break;

                case 2:
                    client.searchBook(lib);
                    break;

                case 3:
                    client.buyBook(lib);
                    break;
                
                case 4:
                    System.out.println("Seu saldo é de R$"+ client.getBalance());
                    break;
                
                case 5:
                    client.depositMoney();
                    break;

                default:
                    break;
            }
        } while(op != 0);

    }

    public static void adminActions(
        String name,
        String cpf,
        Lib lib,
        Scanner strScann,
        Scanner numScann
    ) {
        Admin admin = new Admin(name, cpf, lib);

        System.out.println("");
        System.out.print("Informe a senha de administrador: ");
        String password = strScann.nextLine();

        if (password.equals(admin.getPassword())) {
            int op;

            do {
                adminMenu();
                op = numScann.nextInt();

                switch (op) {
                    case 1:
                        admin.registerBook();
                        break;
                
                    case 2:
                        lib.listBooks();
                        break;
                    case 3:
                        admin.searchBook();
                        break;

                    case 4:
                        admin.updateBook();
                        break;

                    case 5:
                        admin.deleteBook();
                        break;

                    case 6:
                        System.out.println();
                        System.out.println("Saldo da biblioteca: " + lib.getbalance());
                        break;
                }
            } while (op != 0);
            
        } else {
            System.out.println("");
            System.out.println("Senha incorreta!");
        }
    }

    public static void main(String[] args) {
        Scanner strScann = new Scanner(System.in);
        Scanner numScann = new Scanner(System.in);

        Lib lib = new Lib();
        String name, cpf;
        int op;

        System.out.println("");
        System.out.print("Digite seu nome: ");
        name = strScann.nextLine();

        System.out.print("Digite seu cpf: ");
        cpf = strScann.nextLine();

        do {
            mainMenu();
            op = numScann.nextInt();

            switch (op) {
                case 1:
                    clientActions(name, cpf, lib, strScann, numScann);
                    break;
            
                case 2:
                    adminActions(name, cpf, lib, strScann, numScann);
                    break;
            }
        } while (op != 0);
    }
}
