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
}
