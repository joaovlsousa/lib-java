package lib.models;

public abstract class Person {
    protected String name;
    protected String cpf;

    public Person(String name, String cpf) {
        super();

        this.name = name;
        this.cpf = cpf;
    }

    public String getData() {
        return "-------------------- \n" + 
               "Nome: " + name + "\n" +
               "CPF: " + cpf + "\n" +
               "-------------------- \n";
    }
}
