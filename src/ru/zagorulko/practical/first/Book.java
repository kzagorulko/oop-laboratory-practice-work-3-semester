package ru.zagorulko.practical.first;

class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("Book \"%s\" with %d pages.", title, pages);
    }
}