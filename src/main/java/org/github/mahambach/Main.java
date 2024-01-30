package org.github.mahambach;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "1234");
        Book book2 = new Book("1984", "George Orwell", "5678");
        Book book3= new Book("Die Kinder der Zeit", "Adrian Tschaikowsky", "5487");

        Book[] bookarray= {book1, book2, book3};
        Library library1 = new Library("Gute Bücher", bookarray);

    }


}