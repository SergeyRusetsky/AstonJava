package ru.aston.LibraryManager;
public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Book (){
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book (String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
        } else {
            System.out.println("This book is not available. More details about book are below:");
            this.displayInfo();
        }
    }

    public void returnBook() {
        this.isAvailable = true;
    }

    public void displayInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", isAvailable=" + isAvailable +
                '}';
    }

    /*
    * equals and hashcode indicate that the class is Information Expert
    * */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;
        return year == book.year && isAvailable == book.isAvailable && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + year;
        result = 31 * result + Boolean.hashCode(isAvailable);
        return result;
    }
}