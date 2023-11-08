package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ReadFromProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//step 1: convert physical file into javareadable object
		//new FileInputStream()-->throws FileNotFoundException
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		
		//step 2: creat an instance for properties class
		Properties property = new Properties();
		
		//step:3 load all key-value pairs from fis to properties object
		//property.load(fis)-->throws IoException
		property.load(fis);
		
		//step 4: fetch the data
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("timeouts"));
		System.out.println(property.getProperty("username"));
		System.out.println(property.getProperty("password"));
		
		}

}
