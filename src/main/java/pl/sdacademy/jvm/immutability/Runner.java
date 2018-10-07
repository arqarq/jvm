package pl.sdacademy.jvm.immutability;

public class Runner {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        bookCollection.addBook(new Book(1, "tytuł", "autor", Currency.PLN));

        System.out.println(bookCollection);
    }
}