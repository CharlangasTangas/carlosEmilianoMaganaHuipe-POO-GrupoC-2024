package Banco_Kamaron;
import java.util.*;

//Profe, con todo respeto, pero abusó confianza

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        
        System.out.println("- -  B A N C O  K A M A R Ó N  - -");
        
        int op;
        do {
            Employee employee = new Employee(null, 0, 0, 0);

            System.out.println("Ingresar Nombre de Empleado: ");
            String employeeName = scanner.nextLine();
            employee.setName(employeeName);

            System.out.println("Ingresar Número de Cuenta: ");
            long employeeAccountNumber = scanner.nextLong();
            employee.account.setAccountNumber(employeeAccountNumber);

            System.out.println("Ingresar Tipo de Cuenta (A, B o C): ");
            char employeeAccountType = scanner.next().charAt(0);
            employee.account.setAccountType(employeeAccountType);

            employee.account.addMoney();
            System.out.println("\n- - CUENTA DADA DE ALTA - - \nNombre de Empleado: " + employee.getName() + "\nNúmero de Cuenta: " + employee.account.getAccountNumber() + "\nTipo de Cuenta: " + employeeAccountType + "\nDinero en Cuenta: " + employee.account.getAmount());

            employees.add(employee); //Para agregar un empleado al ArrayList

            System.out.println("\n¿Deseas agregar otro empleado? \n1.- Si  \n2.- No");
            op = scanner.nextInt();
            scanner.nextLine();
        } while (op == 1);

        
        do {
	        for (Employee emp : employees) {
	            System.out.println("\nEmpleado: " + emp.getName());
	            System.out.println("¿Qué deseas hacer? \n1.- Depositar Dinero \n2.- Retirar Dinero \n3.- Ver otro empleado \n4.- Continuar \n5.- Salir");
	            op = scanner.nextInt();
	            if (op == 1) {
	                emp.account.addMoney();
	                System.out.println("Nuevo Dinero en Cuenta: $" + emp.account.getAmount());
	            } else if (op == 2) {
	                emp.account.withdrawMoney();
	                System.out.println("Nuevo Dinero en Cuenta: $" + emp.account.getAmount());
	            } else if (op == 3) {
	                System.out.println("Ingrese el número de cuenta del empleado que deseas ver:");
	                long accountNumber = scanner.nextLong();
	                boolean encontrado = false;
	                for (Employee e : employees) {
	                    if (e.account.getAccountNumber() == accountNumber) {
	                        System.out.println("\nDetalles del empleado:");
	                        System.out.println("Nombre: " + e.getName());//La "e" toma la posición en la que se encuentra, es como un contador
	                        System.out.println("Número de Cuenta: " + e.account.getAccountNumber());
	                        System.out.println("Tipo de Cuenta: " + e.account.getAccountType());
	                        System.out.println("Dinero en Cuenta: " + e.account.getAmount());
	                        encontrado = true;
	
	                    }
	                }
	                if (!encontrado) {
	                    System.out.println("Empleado no encontrado.");
	                }
	            } else if (op >= 5) {
					System.out.println("¡Adiós!");
					System.exit(1);
				}
	        }
        }while (op != 5);
    }
}