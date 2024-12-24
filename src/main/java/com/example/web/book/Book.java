package com.example.web.book;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Book {

    private String author;
    private int numberOfBooks;
    private LocalDateTime lastBookDate;
    private ArrayList<String> facts;

    public String getAuthor() {
        return author;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public LocalDateTime getLastBookDate() {
        return lastBookDate;
    }

    public ArrayList<String> getFacts() {
        return facts;
    }

    public Book(String author, int numberOfBooks, LocalDateTime lastBookDate, ArrayList<String> facts) {
        this.author = author;
        this.numberOfBooks = numberOfBooks;
        this.lastBookDate = lastBookDate;
        this.facts = facts;

    }
}
