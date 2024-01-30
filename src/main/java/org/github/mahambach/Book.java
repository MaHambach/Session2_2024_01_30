package org.github.mahambach;

public class Book {
    //'title', 'author', and 'isbn'
    private String title;
    private String author;

    private String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn =isbn;
    }

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


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
