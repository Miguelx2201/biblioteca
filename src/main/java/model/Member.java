package model;

import java.util.ArrayList;

public class Member extends Person {
    private String idMember;
    private ArrayList<Book> booksPosesion;

    public Member(String name, String lastName, String email, String phone, String address, String idMember) {
    super(name, lastName, email, phone, address);
    this.idMember = idMember;
    this.booksPosesion = new ArrayList<>();
    }

    public ArrayList<Book> getBooksPosesion() {
        return booksPosesion;
    }

    public void setBooksPosesion(ArrayList<Book> booksPosesion) {
        this.booksPosesion = booksPosesion;
    }

    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }
}
