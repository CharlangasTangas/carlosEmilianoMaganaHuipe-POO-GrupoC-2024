package Tarea3_Unidad2;

public class rectangle {

	double width;
	double height;

	
	public rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void rectangleInfo() {
		double area = width * height;
		double perimeter = (2 * width) + (2 * height);
		System.out.printf("Width: %.2f \nHeight: %.2f \nArea: %.2f \nPerimeter: %.2f \n",this.width, this.height, area, perimeter);
	}

	
	public static void rectangleClass() {
		System.out.println("- - R E C T A N G L E  C L A S S - -");
		System.out.println("------------------------------ \n1st Rectangle \n------------------------------");
		rectangle firstRectangle = new rectangle(10,18);
		firstRectangle.rectangleInfo();
		
		System.out.println("------------------------------ \n2nd Rectangle \n------------------------------");
		rectangle secondRectangle = new rectangle(7,9);
		secondRectangle.rectangleInfo();
		
		System.out.println("------------------------------ \n3rd Rectangle \n------------------------------");
		rectangle thirdRectangle = new rectangle(20,13);
		thirdRectangle.rectangleInfo();
		
		System.out.println("------------------------------ \n4th Rectangle \n------------------------------");
		rectangle fourthRectangle = new rectangle(35,6);
		fourthRectangle.rectangleInfo();
	}
	

}
