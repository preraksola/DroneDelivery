package work;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StartPoint {

	static int numberOfRows;
	static int numberOfColumns;
	static int maxLoad;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initializeData();

	}

	public static void initializeData()
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("inputData/test_data.in")));
			String line;
			while ((line = br.readLine()) != null)
				System.out.println("Line: "+line);
		
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
