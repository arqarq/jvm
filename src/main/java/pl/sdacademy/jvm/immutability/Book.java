package pl.sdacademy.jvm.immutability;

class Book {
    private int id;
    private String title;
    private String author;
    private Currency price;

    Book(int id, String title, String author, Currency price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getTitle() {
        return title;
    }
}