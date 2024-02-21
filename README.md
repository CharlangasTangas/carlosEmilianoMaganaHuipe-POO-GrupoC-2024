Tarea #3 - Unidad 2
=============
Definí una clase **Persona** con atributos como *nombre, edad y género*, y utilicé constructores para inicializar las instancias. También creé instancias de esta clase y mostré sus atributos.

##Clase Persona　

```javascript
	public person(String name, int age, boolean isFemale) {
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
	}
	
	public void getPersonInfo() {
		System.out.printf("Name: %s \nAge: %d \nFemale: %b",this.name,this.age,this.isFemale);
	}
```

Luego, definí una clase **Libro** con atributos como *título, autor y año de publicación*, y les di valores iniciales desde la clase. Posteriormente, creé una instancia de esta clase y mostré sus atributos, y luego creé tres más, modificando sus atributos y mostrándolos.

##Clase Libro　

```javascript
    public void bookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Of Publication: " + yearPublication);
        System.out.println();
    }
```

Finalmente, definí una clase **Rectángulo** con atributos como *ancho y altura*, y calculé el *área y el perímetro* del rectángulo utilizando constructores para crear instancias de esta clase, mostrando los resultados de los cálculos.

##Clase Rectángulo　

```javascript
	public rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void rectangleInfo() {
		double area = width * height;
		double perimeter = (2 * width) + (2 * height);
		System.out.printf("Width: %.2f \nHeight: %.2f \nArea: %.2f \nPerimeter: %.2f \n",this.width, this.height, area, perimeter);
	}
```


*Hecho por: Carlos Emiliano Magaña Huipe*