package entity;

import java.util.HashMap;

import sun.util.resources.CurrencyNames_ar_TN;

public class Drone {

	private int x;
	private int y;
	private Command currenCommand;
	private State currentState;
	private int droneId;
	private int maxCapacity;
	private int waitNbTurn;
	private HashMap<Product, Integer> productItems;
	
	
	
	public HashMap<Product, Integer> getProductItems() {
		return productItems;
	}
	public void setProductItems(HashMap<Product, Integer> productItems) {
		this.productItems = productItems;
	}
	public State getCurrentState() {
		return currentState;
	}
	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	public int getWaitNbTurn() {
		return waitNbTurn;
	}
	public void setWaitNbTurn(int waitNbTurn) {
		this.waitNbTurn = waitNbTurn;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public int getDroneId() {
		return droneId;
	}
	public void setDroneId(int droneId) {
		this.droneId = droneId;
	}
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
	
	public Command getCurrenCommand() {
		return currenCommand;
	}
	public void setCurrenCommand(Command currenCommand) {
		this.currenCommand = currenCommand;
	}
	
	public void wait(int nbTurn){
		this.currentState=State.wait;
		this.waitNbTurn=nbTurn;
		System.out.println("W "+this.droneId);
	}
	
	public void act(){
		if(this.currentState!=State.wait){
			switch(this.currenCommand){
			case load:
				break;
			case unload:
				break;
			case deliver:
				break;
			}
		}else{
			this.waitNbTurn--;
			System.out.println(this.droneId+" W "+this.waitNbTurn);
			if(this.waitNbTurn==0){
				this.currentState=State.activated;
			}
		}
	}
	
	public void move(int x,int y){
		
	}
	
	public void load(int nbItem, Product prodType){
		this.productItems.put(prodType, nbItem);
		this.maxCapacity-=prodType.getWeight()*nbItem;
	}
	
	
}
