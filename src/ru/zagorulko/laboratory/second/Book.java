package ru.zagorulko.laboratory.second;

public class Book {
    String author, title, publishing;
    int year, pages;

    public Book(int pages) {
        this.pages  = pages;
        this.author = "Unknown";
        this.title  = "Unknown";
        this.publishing = "Unknown";
        this.year = 0;
    }


    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.publishing = "Unknown";
        this.year = 0;
    }

    public Book(String author, String title, int year, int pages) {
        this.author = author;
        this.title = title;
        this.year = year;
        this.pages = pages;
        this.publishing = "Unknown";
    }

    public Book(String author, String title, String publishing, int year, int pages) {
        this.author = author;
        this.title = title;
        this.publishing = publishing;
        this.year = year;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", pages=" + pages +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
