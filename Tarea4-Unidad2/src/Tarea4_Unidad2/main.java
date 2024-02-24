package Tarea4_Unidad2;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número para calcular su factorial: ");
        int num = scanner.nextInt();
        
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("El factorial de " + num + " es: " + factorial);

	}

}
