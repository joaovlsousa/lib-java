package lib.utils;

import java.util.Scanner;

import lib.models.Admin;
import lib.models.Client;
import lib.models.Lib;

public class Actions {
    Scanner strScann = new Scanner(System.in);
    Scanner numScann = new Scanner(System.in);
    Menu menus = new Menu();

    public void clientActions(String name, String cpf, Lib lib) {
        Client client = new Client(name, cpf);
        int op;
        
        do {
            menus.clientMenu();
            op = numScann.nextInt();

            switch (op) {
                case 1:
                    lib.list();    
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
                
                case 6:
                    System.out.print(client.getData());
                    break;

                default:
                    break;
            }
        } while(op != 0);

    }

    public void adminActions(String name, String cpf, Lib lib) {
        Admin admin = new Admin(name, cpf, lib);

        System.out.println("");
        System.out.print("Informe a senha de administrador: ");
        String password = strScann.nextLine();

        if (password.equals(admin.getPassword())) {
            int op;

            do {
                menus.adminMenu();
                op = numScann.nextInt();

                switch (op) {
                    case 1:
                        admin.registerBook();
                        break;
                
                    case 2:
                        lib.list();
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

                    case 7:
                        System.out.println();
                        System.out.print("Também deseja ver os dados sensíveis? (1) - sim, (0) - não: ");
                        int getSensiviteData = numScann.nextInt();

                        if (getSensiviteData == 1) {
                            System.out.println(admin.getData(true));
                        } else {
                            System.out.println(admin.getData());
                        }
                        break;
                }
            } while (op != 0);
            
        } else {
            System.out.println("");
            System.out.println("Senha incorreta!");
        }
    }
}
