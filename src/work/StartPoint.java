package work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import entity.Drone;
import entity.Order;
import entity.Product;
import entity.Warehouse;

public class StartPoint {

	static int numberOfRows;
	static int numberOfColumns;
	static int maxLoad;
	static int maxTurns;
	static int droneCount;
	static ArrayList<Drone> drones;
	static ArrayList<Product> products;
	static ArrayList<Warehouse> warehouses;
	static ArrayList<Order> orders;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeData();
		verifyData();

	}

	private static void verifyData() {
		// TODO Auto-generated method stub
		System.out.println("Drones: "+drones.size());
		System.out.println("Warehouses: "+warehouses.size());
		System.out.println("Orders: "+orders.size());
		System.out.println("Products: "+products.size());
	}

	public static void initializeData()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("inputData/test_data.in")));
			String line = br.readLine();
			numberOfRows = Integer.parseInt(line.split(" ")[0]);
			numberOfColumns = Integer.parseInt(line.split(" ")[1]);

			int nummberOfDrones = Integer.parseInt(line.split(" ")[2]); 
			drones = new ArrayList<>(nummberOfDrones);
			
			for(int i = 0; i < nummberOfDrones; i++)
			{
				drones.add(new Drone());
				System.out.println(i);
			}
			
			maxTurns = Integer.parseInt(line.split(" ")[3]);
			maxLoad = Integer.parseInt(line.split(" ")[4]);

			line = br.readLine();
			int numberOfProducts = Integer.parseInt(line.split(" ")[0]);
			line = br.readLine();

			products = new ArrayList<>(numberOfProducts);
			
			for(int i = 0; i < numberOfProducts; i++) {
				Product tmp = new Product();
				tmp.setProductId(i);
				tmp.setWeight(Integer.parseInt(line.split(" ")[i]));
				products.add(new Product());
			}

			line = br.readLine();
			int numberOfWarehouses = Integer.parseInt(line.split(" ")[0]);
			
			warehouses = new ArrayList<>(numberOfWarehouses);
			
			//Set Warehouse Data
			for(int i = 0; i < numberOfWarehouses; i++)
			{
				line = br.readLine();
				Warehouse tmp = new Warehouse();
				tmp.setX(Integer.parseInt(line.split(" ")[0]));
				tmp.setY(Integer.parseInt(line.split(" ")[1]));
				line = br.readLine();
				HashMap<Product, Integer> tmpHM= new HashMap<>();
				
				for(Product tmpProduct : products)
				{
					int j = 0;
					tmpHM.put(tmpProduct, Integer.parseInt(line.split(" ")[j++]));
				}

				tmp.setProductItems(tmpHM);
				warehouses.add(new Warehouse());
			}
			
			line = br.readLine();
			int numberOfOrders = Integer.parseInt(line.split(" ")[0]);
			
			orders = new ArrayList<>(numberOfOrders);
			
			for (int i = 0; i < numberOfOrders; i++)
			{
				line = br.readLine();
				Order tmpOrder = new Order();
				tmpOrder.setOrderId(i);
				tmpOrder.setX(Integer.parseInt(line.split(" ")[0]));
				tmpOrder.setY(Integer.parseInt(line.split(" ")[1]));
				
				line = br.readLine();
				int numberOfItems = Integer.parseInt(line.split(" ")[0]);
				
				line = br.readLine();
				
				HashMap<Product, Integer> tmpHM= new HashMap<>();
				
				for (int j = 0; j < numberOfItems; j++)
				{
					int productId = Integer.parseInt(line.split(" ")[0]);

					if(tmpHM.containsKey(products.get(productId)))
						tmpHM.put(products.get(productId), (tmpHM.get(products.get(productId))) + 1);
					
					else
						tmpHM.put(products.get(productId),1);
				}
				
				tmpOrder.setProductItems(tmpHM);
				orders.add(tmpOrder);
			}
			
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("FNFE: ");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOE: ");
			e.printStackTrace();
		}
	}
}
