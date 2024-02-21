package Tarea3_Unidad2;

public class person {
	
	String name;
	int age;
	boolean isFemale;
	String adress;
	String country;
	
	public person(String name, int age, boolean isFemale) {
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
	}
	
	public void getPersonInfo() {
		System.out.printf("Name: %s \nAge: %d \nFemale: %b",this.name,this.age,this.isFemale);
	}
	
	public static void personClass() {
		System.out.println("- - P E R S O N  C L A S S - -");
		System.out.println("------------------------------ \n1st Person \n------------------------------");
		person firstPerson = new person("Juan",18,false);
		firstPerson.getPersonInfo();
		
		System.out.println("\n------------------------------ \n2nd Person \n------------------------------");
		person secondPerson = new person("Pedro",24,false);
		secondPerson.getPersonInfo();
		
		System.out.println("\n------------------------------ \n3rd Person \n------------------------------");
		person thirdPerson = new person("Ara",35,true);
		thirdPerson.getPersonInfo();
		
		System.out.println("\n------------------------------ \n4th Person \n------------------------------");
		person fourthPerson = new person("Daniel",12,false);
		fourthPerson.getPersonInfo();
	}
}
