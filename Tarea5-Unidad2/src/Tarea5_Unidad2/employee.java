package Tarea5_Unidad2;

public class employee {
	
	String calculateSalary(double baseSalary){
		
		return String.format("\n- - BASE SALARY - -\nSalary: " + baseSalary);
	}
	
	String calculateSalary(double baseSalary, double bonus){
		double total = baseSalary + bonus;
		return String.format("\n- - BASE SALARY + BONUS - -\nSalary: " + baseSalary + "\nBonus: " + bonus + "\nTotal: " + total);
	}
	
	
	String calculateSalary(double baseSalary, double bonus, int extraHours){
		double total = baseSalary + bonus + (extraHours * 20);
		return String.format("\n- - BASE SALARY + BONUS + EXTRA HOURS - -\nSalary: " + baseSalary + "\nBonus: " + bonus + "\nExtra Hours: "+ extraHours +"\nTotal: " + total);
	}
	
	public static void getEmployeeInfo(){
		employee employee = new employee();
		
		System.out.println("\n\nE M P L O Y E E  C L A S S");
		System.out.println(employee.calculateSalary(275));
		System.out.println(employee.calculateSalary(275,35));
		System.out.println(employee.calculateSalary(275,35,3));
	}

}
