package org.github.mahambach;

public class Book {
    //'title', 'author', and 'isbn'
    private String title;
    private String author;

    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
