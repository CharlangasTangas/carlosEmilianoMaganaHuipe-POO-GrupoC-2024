package Tarea6_Unidad2;

public class Product {
	private String name;
	private double price;
	private int stock;
	
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Product(String name, double price, int stock) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
    public void increaseStock(int quantity) {
        if (quantity > 0) {
            stock = stock + quantity;
        }
    }

    public void reduceStock(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock = stock - quantity;
        }
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
