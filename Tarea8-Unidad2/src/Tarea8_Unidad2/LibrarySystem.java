package Tarea8_Unidad2;

import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menú del Sistema de Biblioteca:");
            System.out.println("1. Registrar un usuario");
            System.out.println("2. Registrar un libro");
            System.out.println("3. Rentar un libro");
            System.out.println("4. Listar todos los usuarios registrados");
            System.out.println("5. Listar todos los libros registrados");
            System.out.println("6. Listar usuarios que han rentado al menos un libro");
            System.out.println("7. Listar libros que no han sido rentados");
            System.out.println("8. Listar libros que han sido rentados");
            System.out.println("9. Salir");

            System.out.print("Ingrese su opción: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.registerUser();
                    break;
                case 2:
                    library.registerBook();
                    break;
                case 3:
                    library.rentBook();
                    break;
                case 4:
                    library.listAllUsers();
                    break;
                case 5:
                    library.listAllBooks();
                    break;
                case 6:
                    library.listUsersWithRentedBooks();
                    break;
                case 7:
                    library.listBooksNotRented();
                    break;
                case 8:
                    library.listRentedBooks();
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor ingrese un número del 1 al 9.");
            }
        } while (choice != 9);
    }
}

