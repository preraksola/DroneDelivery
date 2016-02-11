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
