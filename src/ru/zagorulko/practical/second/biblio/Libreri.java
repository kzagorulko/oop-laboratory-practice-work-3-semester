package ru.zagorulko.practical.second.biblio;


import ru.zagorulko.practical.second.Author;

/**
 * Created by liveuser on 12.09.18.
 */
public class Libreri {
    private int numbersOfBooks, numbersOfAuthors, realNumberOfBooks = 0, realNumberOfAuthors = 0;
    private Author[] authors;
    private Book[] books;

    public Libreri(int numbersOfBooks, int numbersOfAuthors) {
        this.numbersOfBooks = numbersOfBooks;
        authors = new Author[numbersOfAuthors];
        this.numbersOfAuthors = numbersOfAuthors;
        books = new Book[numbersOfBooks];
    }

    public void newAuthor(String firstname, String lastname, char gender, int birthyear) {
        boolean flug = true;
        for(int i = 0; i < realNumberOfAuthors; i++)
            if(authors[i].getName() == (firstname + " " + lastname)) {
                flug = false;
                break;
            }
        if(flug)
            authors[realNumberOfAuthors++] = new Author(firstname, lastname, gender, birthyear);
        else
            System.out.println("Автор " + firstname + " " + lastname + " уже существует!");
    }

    public void newBook(String title, String author, int registerNumber, int numberPages, int year, String publisher,
                        int numberOfLastReader, boolean bookInLibreri) {
        Author thisAuthor;
        for(int i = 0; i < realNumberOfAuthors; i++) {
            if(authors[i].getName() == author)
                ;
        }
        books[realNumberOfBooks++] = new Book(title, "чё", registerNumber, numberPages, year, publisher,
                numberOfLastReader, bookInLibreri);
    }

    public void showAuthors() {
        for(int i = 0; i < realNumberOfAuthors; i++)
            System.out.println(authors[i].toString());
    }

    public void showBooks() {
        for(int i = 0; i < realNumberOfBooks; i++)
            System.out.println(books[i].toString());
    }
}
