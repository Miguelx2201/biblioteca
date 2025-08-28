package model;

public class Manager extends Person {
    private String username;
    private String numAccount;
    private double salary;

    public Manager(String name, String lastName, String email, String phone, String address, String username, String numAccount, double salary) {
        super(name, lastName, email, phone, address);
        this.username = username;
        this.numAccount = numAccount;
        this.salary = salary;
    }
}
