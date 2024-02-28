Tarea #6 - Unidad 2
=============

Cree una clase llamada **Producto** para representar un artículo en un inventario. Los atributos privados incluyen *nombre, precio y stock*
```javascript
	private String name;
	private double price;
	private int stock;
	
		public String getName() {
		return name;
		}

		public double getPrice() {
			return price;
		}

		public int getStock() {
			return stock;
		}
```
<br>

. Se proporcionaron métodos públicos para construcción, obtener y establecer **atributos**, y **métodos** adicionales para *aumentar y reducir el stock*, con validaciones apropiadas.


```javascript
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
```
<br>

*Hecho por: Carlos Emiliano Magaña Huipe*