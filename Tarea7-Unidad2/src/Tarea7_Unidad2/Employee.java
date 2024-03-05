package Tarea7_Unidad2;
import java.util.*;

public class Employee {
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

    public Employee(String name, int age, double salary, long accountNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.accounts = accounts; //Se vincula a la lista accounts
    }
    
    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 65) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salario no válido");
        }
    }

    public List<BankAccount> getAccount() { //Para obtener las cuentas de la lista
        return accounts;
    }
    
    public List<BankAccount> getAccounts() {
        return accounts;
    }
    
    
    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }
    
    public String getData() {
        return String.format("Nombre: ", this.getName());
    }
}
