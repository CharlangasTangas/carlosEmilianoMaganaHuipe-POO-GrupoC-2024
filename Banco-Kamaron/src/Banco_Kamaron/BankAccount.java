package Banco_Kamaron;

import java.util.*;

public class BankAccount {
	Scanner scanner = new Scanner (System.in);
    private long accountNumber;
    private double amount;
    private char accountType;
	private double employeeTotalMoney;
	private double employeeAddMoney;
	private double employeeWithdrawMoney;

    public BankAccount(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void addMoney() {

		
		do {
			switch (getAccountType()) {
			case 'A':
				do {
	                System.out.println("Cantidad que deseas ingresar (máximo $50,000): ");
	                employeeAddMoney = scanner.nextDouble();
	                if (employeeAddMoney > 50000) {
	                    System.out.println("Tu tipo de cuenta A no te permite ingresar más de $50,000");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
	                    System.out.println("Se ha agregado: $" + employeeAddMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			
			case 'a':
				do {
	                System.out.println("Cantidad que deseas ingresar (máximo $50,000): ");
	                employeeAddMoney = scanner.nextDouble();
	                if (employeeAddMoney > 50000) {
	                    System.out.println("Tu tipo de cuenta A no te permite ingresar más de $50,000");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
	                    System.out.println("Se ha agregado: $" + employeeAddMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			
			case 'B':
				do {
	                System.out.println("Cantidad que deseas ingresar (máximo $100,000): ");
	                employeeAddMoney = scanner.nextDouble();
	                if (employeeAddMoney > 100000) {
	                    System.out.println("Tu tipo de cuenta B no te permite ingresar más de $100,000");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
	                    System.out.println("Se ha agregado: $" + employeeAddMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			
			case 'b':
				do {
	                System.out.println("Cantidad que deseas ingresar (máximo $100,000): ");
	                employeeAddMoney = scanner.nextDouble();
	                if (employeeAddMoney > 100000) {
	                    System.out.println("Tu tipo de cuenta B no te permite ingresar más de $100,000");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
	                    System.out.println("Se ha agregado: $" + employeeAddMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			case 'C':
		        System.out.println("Cantidad que deseas ingresar (máximo $100,000): ");
		        employeeAddMoney = scanner.nextDouble();
		        
	        	employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
		        System.out.println("Se ha agregado: $" + employeeAddMoney);
		        setAmount(employeeTotalMoney);
	        break;
	        
	        
			case 'c':
		        System.out.println("Cantidad que deseas ingresar (máximo $100,000): ");
		        employeeAddMoney = scanner.nextDouble();
		        
	        	employeeTotalMoney = employeeTotalMoney + employeeAddMoney;
		        System.out.println("Se ha agregado: $" + employeeAddMoney);
		        setAmount(employeeTotalMoney);
	        break;
	        
		        
	        default:
	        System.out.println("Cuenta inválida. Ingresa un tipo de cuenta válida (A, B o C)");
			
			}
		}while (getAccountType() != 'A' && getAccountType() != 'B' && getAccountType() != 'C' && getAccountType() != 'a' && getAccountType() != 'b' && getAccountType() != 'c');
		
    }
    
    public void withdrawMoney() {
    	
    	do {
			switch (getAccountType()) {
			case 'A':
				do {
	                System.out.println("Cantidad que deseas retirar (mínimo en cuenta $1,000): ");
	                employeeWithdrawMoney = scanner.nextDouble();
	                if (employeeTotalMoney < 1000) {
	                    System.out.println("No tienes cantidad suficiente para retirar.");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
	                    System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			
			case 'a':
				do {
	                System.out.println("Cantidad que deseas retirar (mínimo en cuenta $1,000): ");
	                employeeWithdrawMoney = scanner.nextDouble();
	                if (employeeTotalMoney < 1000) {
	                    System.out.println("No tienes cantidad suficiente para retirar.");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
	                    System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			
			case 'B':
				do {
	                System.out.println("Cantidad que deseas retirar (mínimo en cuenta $5,000): ");
	                employeeWithdrawMoney = scanner.nextDouble();
	                if (employeeTotalMoney < 1000) {
	                    System.out.println("No tienes cantidad suficiente para retirar.");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
	                    System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			
			case 'b':
				do {
	                System.out.println("Cantidad que deseas retirar (mínimo en cuenta $5,000): ");
	                employeeWithdrawMoney = scanner.nextDouble();
	                if (employeeTotalMoney < 1000) {
	                    System.out.println("No tienes cantidad suficiente para retirar.");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
	                    System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			
			case 'C':
				do {
	                System.out.println("Cantidad que deseas retirar (mínimo en cuenta $10,000): ");
	                employeeWithdrawMoney = scanner.nextDouble();
	                if (employeeTotalMoney < 1000) {
	                    System.out.println("No tienes cantidad suficiente para retirar.");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
	                    System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			
			
			case 'c':
				do {
	                System.out.println("Cantidad que deseas retirar (mínimo en cuenta $10,000): ");
	                employeeWithdrawMoney = scanner.nextDouble();
	                if (employeeTotalMoney < 1000) {
	                    System.out.println("No tienes cantidad suficiente para retirar.");
	                } else {
	                	employeeTotalMoney = employeeTotalMoney - employeeWithdrawMoney;
	                    System.out.println("Se ha retirado: $" + employeeWithdrawMoney);
	                    setAmount(employeeTotalMoney);
	                    break;
	                }
	            } while (true);
			break;
			}
    	}while (getAccountType() != 'A' && getAccountType() != 'B' && getAccountType() != 'C' && getAccountType() != 'a' && getAccountType() != 'b' && getAccountType() != 'c');
    }
    
    public char getAccountType() {
		return accountType;
	}

	public void setAccountType(char accountType) {
		this.accountType = accountType;
	}


	public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
