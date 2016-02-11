package entity;

import java.util.HashMap;

public class Orders {
	
	private Coordinates c;
	private HashMap<Product, Integer> productItems;
	
	public Orders(Coordinates c){
		this.c=c;
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
	
	

}
