package lib.utils;

public class Menu {
    public void mainMenu() {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("1 - Cliente");
        System.out.println("2 - Administrador");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("");

        System.out.print("Escolha uma opção: ");
    }

    public void adminMenu() {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("1 - Cadastrar um novo livro");
        System.out.println("2 - Listar todos os livros");
        System.out.println("3 - Buscar um livro");
        System.out.println("4 - Editar um livro");
        System.out.println("5 - Excluir um livro");
        System.out.println("6 - Ver saldo da biblioteca");
        System.out.println("7 - Ver dados do admin");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("");

        System.out.print("Escolha uma opção: ");
    } 

    public void clientMenu() {
        System.out.println("");
        System.out.println("-----------------------------");
        System.out.println("1 - Ver livros");
        System.out.println("2 - Buscar um livro");
        System.out.println("3 - Comprar um novo livro");
        System.out.println("4 - Ver saldo em conta");
        System.out.println("5 - Depositar dinheiro na conta");
        System.out.println("6 - Ver dados do cliente");
        System.out.println("0 - Sair");
        System.out.println("-----------------------------");
        System.out.println("");

        System.out.print("Escolha uma opção: ");
    } 
}
