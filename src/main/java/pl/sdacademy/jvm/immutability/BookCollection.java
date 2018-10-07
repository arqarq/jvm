package pl.sdacademy.jvm.immutability;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books = new ArrayList<>();

    void addBook(Book book) {
        books.add(book);
    }

    Book findBookbyTitle(String title) {
        for (Book book : books)
            if (book.getTitle().equals(title)) {
                return book;
            }
            throw new RuntimeException("Nie znaleziono książki!");
    }

    void printAllBooks() {

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Book book : books) {
            stringBuilder.append(book.getTitle()).append("\t");
        }
        return stringBuilder.toString();
    }
}