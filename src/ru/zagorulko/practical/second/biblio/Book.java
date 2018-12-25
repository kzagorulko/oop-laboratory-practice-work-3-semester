package ru.zagorulko.practical.second.biblio;


/**
 * Created by liveuser on 12.09.18.
 */
public class Book {
    private String title, publisher;
    private String author;
    private int year, registerNumber, numberPages, numberOfLastReader;
    private boolean bookInLibreri;

    public Book(String title, String author, int registerNumber, int numberPages, int year, String publisher,
                int numberOfLastReader, boolean bookInLibreri) {
        this.title = title;
        this.author = author;
        this.registerNumber = registerNumber;
        this.numberPages = numberPages;
        this.year = year;
        this.publisher = publisher;
        this.numberOfLastReader = numberOfLastReader;
        this.bookInLibreri = bookInLibreri;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author=" + author +
                ", year=" + year +
                ", registerNumber=" + registerNumber +
                ", numberPages=" + numberPages +
                ", numberOfLastReader=" + numberOfLastReader +
                ", bookInLibreri=" + bookInLibreri +
                '}';
    }
}
