package org.ex1;

public class Book {
    private int MAX_PAGE_COUNT = 1000;

    private String title;
    private String author;
    private String publisher;
    private int pageCount;

    Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.publisher = "Unknown Publisher";
        this.pageCount = 0;
    }

    Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public String toString() {
        return "BOOK_TITLE: [" + title.toUpperCase() + "]" +
                "\nBOOK_AUTHOR: [" + author + "]" +
                "\nBOOK_PUBLISHER: [" + publisher.toLowerCase() + "]";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPageCount(int pageCount) {
        if(pageCount >= 0 && pageCount <= MAX_PAGE_COUNT) {
            this.pageCount = pageCount;
            return;
        }

        System.err.println("PageCount nu este valid.");
    }
}
