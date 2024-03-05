Tarea #7 - Unidad 2
=============
Primero agregamos la funcionalidad para que un empleado pueda tener múltiples cuentas bancarias. Modificamos la clase **Employee** para que ahora contenga una lista de BankAccount en lugar de una sola instancia. Esto nos permite almacenar múltiples cuentas bancarias para cada empleado.

###Clase Employee　

```javascript
    private String name;
    private int age;
    private double salary;
    private List<BankAccount> accounts;

    public Employee(String name, int age, double salary, List<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.accounts = accounts;
    }
```

<br>

Luego, creamos un menú en la clase **main** para que el usuario pueda interactuar con el programa. Este menú ofrece opciones para mostrar información de todos los *empleados* con sus *cuentas bancarias*, así como para mostrar la información de un *empleado específico*.
###Clase main　
```javascript
System.out.println("Seleccione un empleado:");
            for (int i = 0; i < employees.size(); i++) {
                System.out.println((i+1) + ". " + employees.get(i).getName());
            }
            int selected = scanner.nextInt() - 1;
            scanner.nextLine(); 
            Employee selectedEmployee = employees.get(selected);

            System.out.println("Seleccione una cuenta:");
            for (int i = 0; i < selectedEmployee.getAccounts().size(); i++) {
                BankAccount account = selectedEmployee.getAccounts().get(i);
                System.out.println((i+1) + ". Número de Cuenta: " + account.getAccountNumber() + ", Tipo de Cuenta: " + account.getAccountType() + ", Saldo: $" + account.getAmount());
            }
            int accountSelected = scanner.nextInt() - 1;
            scanner.nextLine(); 
            BankAccount selectedAccount = selectedEmployee.getAccounts().get(accountSelected);

            System.out.println("¿Qué deseas hacer con la cuenta?");
            System.out.println("1.- Agregar Dinero");
            System.out.println("2.- Retirar Dinero");
            System.out.println("3.- Salir");
```

<br>

*Hecho por: Carlos Emiliano Magaña Huipe*