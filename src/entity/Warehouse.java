<<<<<<< HEAD
package entity;

import java.util.HashMap;

public class Warehouse {

	private int x;
	private int y;
	private HashMap<Product, Integer> productItems;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public HashMap<Product, Integer> getProductItems() {
		return productItems;
	}
	public void setProductItems(HashMap<Product, Integer> productItems) {
		this.productItems = productItems;
	}
	
	
}
=======
package entity;

import java.util.HashMap;

public class Warehouse {

	private Coordinates c;
	private HashMap<Product, Integer> productItems;
	private int idWarehouse;
	
	public Warehouse(Coordinates c, int id){
		this.c=c;
		this.idWarehouse=id;
	}
	
	public Coordinates getC() {
		return c;
	}
	public void setC(Coordinates c) {
		this.c = c;
	}
	public HashMap<Product, Integer> getProductItems() {
		return productItems;
	}
	public void setProductItems(HashMap<Product, Integer> productItems) {
		this.productItems = productItems;
	}
	public int getIdWarehouse() {
		return idWarehouse;
	}
	public void setIdWarehouse(int idWarehouse) {
		this.idWarehouse = idWarehouse;
	}
	
	
}
>>>>>>> c116c49263c77e84d5b5687b6b505737bb8eacac
