package entity;

public class Drone {

	private int x;
	private int y;
	private String currenCommand;
	private int droneId;
	private int maxCapacity;
	
	
	
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
	
	public String getCurrenCommand() {
		return currenCommand;
	}
	public void setCurrenCommand(String currenCommand) {
		this.currenCommand = currenCommand;
	}
	
	
}
