package Tarea5_Unidad2;

public class rectangle {

	String area (double base, double high) {
		double area = base * high;
		return String.format("\n- - AREA DOUBLE - -\nBase: " + base + "\nHigh: " + high + "\nArea: " + area);
	}
	
	String area (int base, int high) {
		int area = base * high;
		return String.format("\n- - AREA INT - -\nBase: " + base + "\nHigh: " + high + "\nArea: " + area);
	}
	
	String perimeter (double base, double high) {
		double perimeter = (2 * base) + (2 * high);
		return String.format("\n- - PERIMETER DOUBLE - -\nBase: " + base + "\nHigh: " + high + "\nPerimeter: " + perimeter);
	}
	
	String perimeter (int base, int high) {
		int perimeter = (2 * base) + (2 * high);
		return String.format("\n- - PERIMETER INT - -\nBase: " + base + "\nHigh: " + high + "\nPerimeter: " + perimeter);
	}
	
	public static void getRectangleInfo(){
		rectangle rectangle = new rectangle();
		
		System.out.println("\nR E C T A N G L E  C L A S S");
		System.out.println(rectangle.area(15, 45));
		System.out.println(rectangle.area(8.56, 20.32));
		
		System.out.println(rectangle.perimeter(15, 45));
		System.out.println(rectangle.perimeter(8.56, 20.32));
	}
}
