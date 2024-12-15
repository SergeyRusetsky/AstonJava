package ru.aston.LibraryManager;

public class Main {
    public static void main (String [] args) {
        Library library = new Library();
        Book book;

        /* Checking for correct work for having no null-pointer exception */
        book = null;
        library.addBook(book);

        /* No-argument constructor */
        book = new Book();
        book.setTitle("Ask Your System Administrator");
        book.setAuthor("Sarah Buchman");
        book.setYear(2000);
        library.addBook(book);

        /* Constructor to fill all fields */
        book = new Book(
            "What Are The Civilian Applications",
            "Sarah Buchman",
            2001,
            false
        );

        library.addBook(book);

        /* Constructor to fill some values with default */
        book = new Book(
            "Just Wait Until After School",
            "Wendy Heydemark"
        );

        System.out.println("Checking the default year to be 0:");
        book.displayInfo();

        book.setYear(2003); //
        library.addBook(book);

        /* */
        book = new Book(
            "How About Never?",
            "Sarah Buchman",
            2006,
            true
        );

        System.out.println("Checking book properties changes:");
        System.out.println("After book creation:");
        book.displayInfo();

        System.out.println("Tried to borrow book first time:");
        book.borrowBook();
        book.displayInfo();

        System.out.println("Tried to borrow book second time:");
        book.borrowBook();

        System.out.println("Returned book back:");
        book.returnBook();
        book.displayInfo();
        library.addBook(book);

        library.printAvailableBooks();
        library.printBooksByAuthor("Klee Hull");
        library.printBooksByAuthor("Sarah Buchman");
    }
}