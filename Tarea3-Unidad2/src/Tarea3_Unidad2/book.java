package Tarea3_Unidad2;

public class book {
	
	String title = "Harry Potter";
	String author = "J. K. Rowling";
	int yearPublication = 1997;
	
    public void bookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Of Publication: " + yearPublication);
        System.out.println();
    }
    
    public static void bookClass() {
    	System.out.println("\n\n- - B O O K  C L A S S - -");
		System.out.println("------------------------------ \n1st Book \n------------------------------");
        book firstBook = new book();
		firstBook.bookInfo();
		
		System.out.println("------------------------------ \n2nd Book \n------------------------------");
		book secondBook = new book();
        secondBook.title = "El Señor de los Anillos";
        secondBook.author = "J.R.R. Tolkien";
        secondBook.yearPublication = 1954;
        secondBook.bookInfo();

        System.out.println("------------------------------ \n3rd Book \n------------------------------");
        book thirdBook = new book();
        thirdBook.title = "Odisea";
        thirdBook.author = "Homero";
        thirdBook.yearPublication = 1911;
        thirdBook.bookInfo();

        System.out.println("------------------------------ \n4th Book \n------------------------------");
        book fourthBook = new book();
        fourthBook.title = "Don Quijote De La Mancha";
        fourthBook.author = "Miguel De Cervantes";
        fourthBook.yearPublication = 1605;
        fourthBook.bookInfo();
		
    }

}
