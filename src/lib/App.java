package lib;

import java.util.Scanner;

import lib.models.Lib;
import lib.utils.Actions;
import lib.utils.Menu;

public class App {
    public static void main(String[] args) {
        Scanner strScann = new Scanner(System.in);
        Scanner numScann = new Scanner(System.in);

        Menu menus = new Menu();
        Actions actions = new Actions();
        Lib lib = new Lib();

        String name, cpf;
        int op;

        System.out.println("");
        System.out.print("Digite seu nome: ");
        name = strScann.nextLine();

        System.out.print("Digite seu cpf: ");
        cpf = strScann.nextLine();

        do {
            menus.mainMenu();
            op = numScann.nextInt();

            switch (op) {
                case 1:
                    actions.clientActions(name, cpf, lib);
                    break;
            
                case 2:
                    actions.adminActions(name, cpf, lib);
                    break;
            }
        } while (op != 0);

        System.out.println("Encerrando...");
        strScann.close();
        numScann.close();
    }
}
