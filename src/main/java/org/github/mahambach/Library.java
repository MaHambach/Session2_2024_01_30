package org.github.mahambach;

import java.util.Arrays;

public class Library {
    private String name;
    private Book[] collection;

    public Library(String name, Book[] books){
        this.name = name;
        this.collection = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getCollection() {
        return collection;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", collection=" + Arrays.toString(collection) +
                '}';
    }

    public void setCollection(Book[] collection) {
        this.collection = collection;
    }

    // Bonus Step 6 create function to add a Book
    public void addBook(Book berk){
        Book[] new_collection = new Book[collection.length + 1];
        for(int i = 0; i < collection.length; i++)
        {
            new_collection[i] = collection[i];
        }
        new_collection[new_collection.length - 1] = berk;
        collection = new Book[new_collection.length];
        collection = new_collection;
    }

    // Only works if berk is a book in the library.
    public void removeBook(Book berk){
        Book[] new_collection = new Book[collection.length -1];
        int offset = 0;

        for (int i = 0; i< collection.length; i++) {
            if(collection[i].equals(berk)){
                offset = 1;
            }
            else{
                new_collection[i-offset] = collection[i];
            }
        }

        collection = new_collection;
    }

}
