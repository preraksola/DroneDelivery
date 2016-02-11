package entity;

import java.util.HashMap;

public class Order {
	
	private int x;
	private int y;
	private HashMap<Product, Integer> productItems;
	private int OrderId;
	
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
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	
	


}
