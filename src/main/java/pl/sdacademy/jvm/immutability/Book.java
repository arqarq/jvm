package pl.sdacademy.jvm.immutability;

public class Book {
    private int id;
    private String title;
    private String author;
    private Currency price;

    public Book(int id, String title, String author, Currency price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
}