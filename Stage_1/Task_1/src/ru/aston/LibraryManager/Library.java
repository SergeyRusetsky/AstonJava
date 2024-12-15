package ru.aston.LibraryManager;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        if (book==null){
            System.out.println("Cannot add uninitialized object.");
            return;
        }

        this.books.add(book);
    }

    public void printAvailableBooks() {
        System.out.println("List of the books available:");
        for (Book book : this.books) {
            if (book.getIsAvailable()) {
                book.displayInfo();
            }
        }
    }

    public ArrayList<Book> findBooksByAuthor(String author) {
        ArrayList<Book>  booksByAuthor = new ArrayList<Book>();
        if (author!=null && !author.isEmpty()) {
            for(Book book: this.books){
                if (book.getAuthor().equals(author)) {
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }

    public void printBooksByAuthor(String author){
        ArrayList <Book> booksByAuthor = this.findBooksByAuthor(author);

        if (booksByAuthor.isEmpty()){
            System.out.println("Library does not contain books of the author " + author);
            return;
        }

        System.out.println("Library contains next books of " + author + ":");
        for (Book book: booksByAuthor) {
                book.displayInfo();
        }
    }
}