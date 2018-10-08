package pl.sdacademy.jvm.immutability;

import static pl.sdacademy.jvm.immutability.Currency.*;

public class Runner {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        bookCollection.addBook(new Book(1, "Tytuł", "Autor", new Price(29, PLN)));
        bookCollection.addBook(new Book(2, "Tytuł2", "Autor2", new Price(39, EUR)));
        bookCollection.addBook(new Book(3, "Tytuł3", "Autor3", new Price(49, USD)));

        System.out.println(bookCollection);
        bookCollection.printAllBooks();
        System.out.println(bookCollection.findBookbyTitle("Tytuł3"));
    }
}