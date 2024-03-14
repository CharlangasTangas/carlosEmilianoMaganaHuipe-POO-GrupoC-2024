package Tarea8_Unidad2;

import java.util.ArrayList;
import java.util.Scanner;


class User {
    private String name;
    private ArrayList<Book> rentedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void rentBook(Book book) {
        rentedBooks.add(book);
    }
}

class Book {
    private String title;
    private boolean rented;

    public Book(String title) {
        this.title = title;
        this.rented = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}
