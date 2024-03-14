package Tarea8_Unidad2;

import java.util.ArrayList;
import java.util.Scanner;

class Library {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();

    public void registerUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del usuario: ");
        String name = scanner.nextLine();
        users.add(new User(name));
        System.out.println("Usuario registrado exitosamente.");
    }

    public void registerBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título del libro: ");
        String title = scanner.nextLine();
        books.add(new Book(title));
        System.out.println("Libro registrado exitosamente.");
    }

    public void rentBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del usuario: ");
        String userName = scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        String bookTitle = scanner.nextLine();

        User user = findUser(userName);
        Book book = findBook(bookTitle);

        if (user != null && book != null) {
            if (!book.isRented()) {
                book.setRented(true);
                user.rentBook(book);
                System.out.println("Libro rentado exitosamente.");
            } else {
                System.out.println("Lo siento, el libro ya está rentado.");
            }
        } else {
            System.out.println("Usuario o libro no encontrado.");
        }
    }

    public void listAllUsers() {
        System.out.println("Lista de todos los usuarios registrados:");
        for (User user : users) {
            System.out.println(user.getName());
        }
    }

    public void listAllBooks() {
        System.out.println("Lista de todos los libros registrados:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void listUsersWithRentedBooks() {
        System.out.println("Lista de usuarios que han rentado al menos un libro:");
        for (User user : users) {
            if (!user.getRentedBooks().isEmpty()) {
                System.out.println(user.getName());
            }
        }
    }

    public void listBooksNotRented() {
        System.out.println("Lista de libros que no han sido rentados:");
        for (Book book : books) {
            if (!book.isRented()) {
                System.out.println(book.getTitle());
            }
        }
    }

    public void listRentedBooks() {
        System.out.println("Lista de libros que han sido rentados:");
        for (Book book : books) {
            if (book.isRented()) {
                System.out.println(book.getTitle());
            }
        }
    }

    private User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    private Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
}