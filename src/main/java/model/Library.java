package model;

import java.util.ArrayList;

public class Library {
    private String name;
    private String location;
    private String nit;
    private ArrayList<Book> listBooks;
    private ArrayList<Member> listMembers;
    private Manager manager;

    public Library(String name, String location, String nit) {
        this.name = name;
        this.location = location;
        this.nit = nit;
        this.listBooks = new ArrayList<>();
        this.listMembers = new ArrayList<>();
    }
    public Library(){    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public ArrayList<Book> getListBooks() {
        return listBooks;
    }

    public void setListBooks(ArrayList<Book> listBooks) {
        this.listBooks = listBooks;
    }

    public ArrayList<Member> getListMembers() {
        return listMembers;
    }

    public void setListMembers(ArrayList<Member> listMembers) {
        this.listMembers = listMembers;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String addBook(Book book) {
        String result = "";
        Book foundBook = searchBook(book.getISBM());
        if(foundBook == null){
            listBooks.add(book);
            result = "Book added";
        } else {
            result = "Book already exists";
        }
        return result;
    }

    public String deleteBook(String ISBM) {
        String result = "";
        Book foundBook = searchBook(ISBM);
        if(foundBook != null){
            listBooks.remove(foundBook);
            result = "Book deleted";
        } else {
            result = "Book not found";
        }
        return result;
    }

    public Book searchBook(String ISBM) {
        Book foundBook = null;
        for (Book book : listBooks) {
            if(book.getISBM().equals(ISBM)){
                foundBook = book;
            }
        }
        return foundBook;
    }
}
