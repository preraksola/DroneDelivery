package entity;

import java.util.ArrayList;

public class Grid {
	private int[][] field;
	private int nbRow;
	private int nbColumns;
	private Warehouse[] wareHouseList;
	private Drone[] DroneList;
	private Orders[] orderList;
	private Product[] prodList;
	
	public Grid(int nbRow, int nbCol, int sizeWareHouseList, int sizeDroneList, int sizeOrderList, int sizeProdList){
		this.field=new int[nbRow][nbCol];
		this.nbRow=nbRow;
		this.nbColumns=nbCol;
		this.wareHouseList=new Warehouse[sizeWareHouseList];
		this.DroneList=new Drone[sizeDroneList];
		this.orderList=new Orders[sizeOrderList];
		this.prodList=new Product[sizeProdList];
	}
	
	public void initGrid(){
		
	}
	
	public void initWarehouse(ArrayList<Coordinates> listOfCoordinates){
		for(int i=0;i<listOfCoordinates.size();i++){
			this.wareHouseList[i]=new Warehouse(listOfCoordinates.get(i),i);
		}
	}
	
	public int[][] getField() {
		return field;
	}
	public void setField(int[][] field) {
		this.field = field;
	}
	public int getNbRow() {
		return nbRow;
	}
	public void setNbRow(int nbRow) {
		this.nbRow = nbRow;
	}
	public int getNbColumns() {
		return nbColumns;
	}
	public void setNbColumns(int nbColumns) {
		this.nbColumns = nbColumns;
	}

	public Warehouse[] getWareHouseList() {
		return wareHouseList;
	}

	public void setWareHouseList(Warehouse[] wareHouseList) {
		this.wareHouseList = wareHouseList;
	}

	public Drone[] getDroneList() {
		return DroneList;
	}

	public void setDroneList(Drone[] droneList) {
		DroneList = droneList;
	}

	public Orders[] getOrderList() {
		return orderList;
	}

	public void setOrderList(Orders[] orderList) {
		this.orderList = orderList;
	}

	public Product[] getProdList() {
		return prodList;
	}

	public void setProdList(Product[] prodList) {
		this.prodList = prodList;
	}

	
	
}
