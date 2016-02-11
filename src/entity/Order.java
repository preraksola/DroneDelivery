package entity;

import java.util.HashMap;

public class Order {
	
	Coordinates c;
	private HashMap<Product, Integer> productItems;
	private int OrderId;
	
	public Order(Coordinates c, int id)
	{
		this.c = c;
		OrderId = id;
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
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	
	


}
