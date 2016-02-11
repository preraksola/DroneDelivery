package entity;

import java.util.ArrayList;
import java.util.HashMap;

import sun.util.resources.CurrencyNames_ar_TN;

public class Drone {

	private Coordinates c;
	private Command currentCommand;
	private State currentState;
	private int droneId;
	private int maxCapacity;
	private int waitNbTurn;
	private HashMap<Product, Integer> productItems;
	
	public Drone(int droneId,int maxCapacity){
		this.droneId=droneId;
		this.maxCapacity=maxCapacity;
		this.currentState=State.activated;
	}
	
	
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
	public Coordinates getX() {
		return c;
	}
	public void setCoordinates(Coordinates c) {
		this.c = c;
	}
	
	public Command getCurrentCommand() {
		return currentCommand;
	}
	public void setCurrentCommand(Command currentCommand) {
		this.currentCommand = currentCommand;
	}
	
	public void wait(int nbTurn){
		this.currentState=State.wait;
		this.waitNbTurn=nbTurn;
		System.out.println("W "+this.droneId);
	}
	
	public void act(){
		if(this.currentState!=State.wait){
			switch(this.currentCommand){
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
		this.c.setX(x);
		this.c.setY(y);
	}
	
	public Coordinates decision(ArrayList<Coordinates> ListOfCoordinates){
		Coordinates bestDecision=new Coordinates();
		for(int i=0;i<ListOfCoordinates.size();i++){
			if(bestDecision==null){
				bestDecision=ListOfCoordinates.get(i);
			}else if(distance(this.c.getX(),this.c.getY(),bestDecision.getX(),bestDecision.getY())>distance(this.c.getX(),this.c.getY(),ListOfCoordinates.get(i).getX(),ListOfCoordinates.get(i).getY())){
				bestDecision=ListOfCoordinates.get(i);
			}
		}
		return bestDecision;
	}
	
	public void load(int nbItem, Product prodType){
		this.productItems.put(prodType, nbItem);
		this.maxCapacity-=prodType.getWeight()*nbItem;
	}
	
	public Double distance(int x1,int y1, int x2, int y2)
	{
		Double distance; 
		distance = (Double)Math.ceil(Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2)));
		return distance; 
	}
	
	
}
