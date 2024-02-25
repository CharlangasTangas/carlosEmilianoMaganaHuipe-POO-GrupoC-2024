Tarea5-Unidad2
=============

## Clase Rectángulo
Primero, creé la clase **Rectángulo**, la cual tiene métodos sobrecargados para calcular el **área** y el **perímetro** del rectángulo. Estos métodos pueden recibir tanto **enteros** como **decimales** como parámetros, utilizando la *sobrecarga de métodos* para manejar diferentes tipos de datos de entrada.

### CÓDIGO INT
```javascript
	String area (double base, double high) {
		double area = base * high;
		return String.format("\n- - AREA DOUBLE - -\nBase: " + base + "\nHigh: " + high + "\nArea: " + area);
	}
```

### CÓDIGO DOUBLE
```javascript
	String area (double base, double high) {
		double area = base * high;
		return String.format("\n- - AREA DOUBLE - -\nBase: " + base + "\nHigh: " + high + "\nArea: " + area);
	}
```
<br>

## Clase Empleado
Luego, definí la clase **Empleado** con el método **calcularSalario**, el cual puede recibir hasta 3 parámetros: *sueldo base, bonificación y horas extras*. Dependiendo de los parámetros proporcionados por el usuario, este método calculará el salario de la persona siguiendo las reglas especificadas.

### CÓDIGO
```javascript
	String calculateSalary(double baseSalary, double bonus, int extraHours){
		double total = baseSalary + bonus + (extraHours * 20);
		return String.format("\n- - BASE SALARY + BONUS + EXTRA HOURS - -\nSalary: " + baseSalary + "\nBonus: " + bonus + "\nExtra Hours: "+ extraHours +"\nTotal: " + total);
	}
```
<br>

## Clase Calculadora De Impuestos
Finalmente, implementé la clase **CalculadoraImpuestos** que cuenta con el método **calcularImpuestos**, el cual puede recibir hasta 4 parámetros: *ingresos, porcentaje de impuestos, dividendos y exención*. Este método calcula los impuestos a pagar según las condiciones establecidas, utilizando la lógica especificada para determinar el monto de los impuestos.

### CÓDIGO
```javascript
    String calculateTaxes(double dividends, double taxPercentage, double exemption) {
        double taxes = dividends * (taxPercentage / 100);
        if (taxes > exemption) {
        	
            return String.format("\n- - DIVIDENDS + TAX PERCENTAGE + EXEMPTION - -\nDividends: " + dividends +"\nTax Percentage: " + taxPercentage +"\nExemption: " + exemption + "\nTaxes: " + taxes);
        } else {
            return "\n- - T A X  C A L C U L A T I O N - -\nNo taxes";
        }
    }
```
<br>
*Hecho por: Carlos Emiliano Magaña Huipe*