package Tarea5_Unidad2;

public class taxCalculator {
	
    String calculateTaxes(int income) {
        double taxes = income + 0.15;
        return String.format("\n- - INCOMES - -\nIncome: " + income + "\nTaxes: " + taxes);
    }

    String calculateTaxes(double sales, double taxPercentage) {
        double taxes = sales * (taxPercentage / 100);
        return String.format("\n- - SALE + TAX PERCENTAGE - -\nSales: " + sales +"\nTax Percentage: " + taxPercentage + "\nTaxes: " + taxes);
    }

    String calculateTaxes(double dividends, double taxPercentage, double exemption) {
        double taxes = dividends * (taxPercentage / 100);
        if (taxes > exemption) {
        	
            return String.format("\n- - DIVIDENDS + TAX PERCENTAGE + EXEMPTION - -\nDividends: " + dividends +"\nTax Percentage: " + taxPercentage +"\nExemption: " + exemption + "\nTaxes: " + taxes);
        } else {
            return "\n- - T A X  C A L C U L A T I O N - -\nNo taxes";
        }
    }
    
    public static void getTaxCalculatorInfo(){
		taxCalculator taxCalculator = new taxCalculator();
		
		System.out.println("\n\nT A X  C A L C U L A T O R  C L A S S");
		System.out.println(taxCalculator.calculateTaxes(175));
		System.out.println(taxCalculator.calculateTaxes(155, 230));
		System.out.println(taxCalculator.calculateTaxes(123, 155, 45));
    }
	
}
