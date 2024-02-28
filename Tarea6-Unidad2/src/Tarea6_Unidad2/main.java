package Tarea6_Unidad2;
import java.util.*;
public class main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        double price;
        int stock;

        System.out.println("- -  T I E N D A  D O N  K A M A R Ó N  - - \n\nAñadir producto\n");
        System.out.print("Nombre: ");
        name = scanner.nextLine();
        System.out.print("Precio: $");
        price = scanner.nextDouble();
        System.out.print("Cantidad de Stock: ");
        stock = scanner.nextInt();

        Product product = new Product(name, price, stock);

        int op;
        do {
            System.out.println("\n1.- Aumentar Stock");
            System.out.println("2.- Reducir Stock");
            System.out.println("3.- Información");
            System.out.println("4.- Salir");
            System.out.print("\nOpción: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Cantidad que desea aumentar: ");
                    int increaseQuantity = scanner.nextInt();
                    product.increaseStock(increaseQuantity);
                    System.out.println("Se ha aumentado el stock");
                    break;
                case 2:
                    System.out.print("Cantidad que desea reducir: ");
                    int reduceQuantity = scanner.nextInt();
                    product.reduceStock(reduceQuantity);
                    System.out.println("Se ha reducido el stock.");
                    break;
                case 3:
                    System.out.println("\nDInformación del Producto:");
                    System.out.println("Nombre: " + product.getName());
                    System.out.println("Precio: $" + product.getPrice());
                    System.out.println("Stock: " + product.getStock());
                    break;
                case 4:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción incorrecta. Elige una opción válida");
            }
        } while (op != 4);

	}

}
