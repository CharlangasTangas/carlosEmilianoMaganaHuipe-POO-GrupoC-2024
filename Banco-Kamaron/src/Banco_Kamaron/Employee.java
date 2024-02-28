package Banco_Kamaron;

public class Employee {
    private String name;
    private int age;
    private double salary;
    BankAccount account;

    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String name, int age, double salary, long accountNumber) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.account = new BankAccount(accountNumber);
    }
    
    public Employee(String name, int age, double salary, long accountNumber, char accountType) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.account = new BankAccount(accountNumber);
        this.account = new BankAccount (accountType);
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
            System.out.println("Invalid age");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }
    }

    public BankAccount getAccount() {
        return account;
    }

    public String getData() {
        return String.format("Nombre: ", this.getName());
    }
}
