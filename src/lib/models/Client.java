package lib.models;

import java.util.ArrayList;
import java.util.List;

public class Client extends People {
    private double amount;
    private List<Book> books;

    public Client(String name, String cpf) {
        super(name, cpf);

        this.amount = 0;
        this.books = new ArrayList<Book>();
    }
}
