package pl.sdacademy.jvm.immutability;

import static pl.sdacademy.jvm.immutability.Currency.*;

public class Runner {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        bookCollection.addBook(new Book(1, "tytuł", "autor", new Price(29, PLN)));
        bookCollection.addBook(new Book(1, "tytuł2", "autor2", new Price(39, EUR)));
        bookCollection.addBook(new Book(1, "tytuł3", "autor3", new Price(49, USD)));

        System.out.println(bookCollection);
    }
}