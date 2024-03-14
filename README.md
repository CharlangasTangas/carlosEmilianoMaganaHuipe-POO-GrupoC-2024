Tarea #8 - Unidad 2
=============
Esta clase contendrá dos atributos principales: una lista de libros y una lista de usuarios registrados. También tendrá métodos para registrar usuarios, registrar libros, realizar la renta de un libro, listar todos los usuarios registrados, listar todos los libros registrados, listar todos los usuarios que hayan comprado al menos un libro, listar todos los libros que no han sido rentados y listar todos los libros que han sido rentados.


<br>


####Clase Librería

<br>

```javascript
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
```

<br>

Esta clase representará un libro en la librería y tendrá atributos como título, autor, año de publicación, estado de renta (rentado o disponible), etc.


<br>


####Clase Libro

<br>

```javascript
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
```

<br>

Esta clase representará a un usuario de la librería y contendrá atributos como nombre, dirección, lista de libros rentados, etc.

####Clase Usuario

<br>

```javascript
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
```

<br>


*Hecho por: Carlos Emiliano Magaña Huipe*