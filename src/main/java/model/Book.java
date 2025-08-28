package model;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String ISBM;
    private boolean isLended;

    public Book(String title, String author, String publisher, String ISBM) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBM = ISBM;
        this.isLended = false;
    }
    public Book () {    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBM() {
        return ISBM;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public boolean isLended() {
        return isLended;
    }

    public void setLended(boolean lended) {
        isLended = lended;
    }
}
