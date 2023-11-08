package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class writeToProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//step 1: convert physical file into javareadable object
				//new FileInputStream()-->throws FileNotFoundException
				FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
				//step 2:create an instance of properties class
				Properties property =  new Properties();
				//step 3:load all the key value pairs into properties object
				property.load(fis);
				//step 4: write to properties object
				property.put("user2","trainee");
				property.put("pwd2","trainee");
				//step 5:save the file
				FileOutputStream fos = new FileOutputStream("./src/test/resources/data.properties");
				property.store(fos, "updated successfully");
				
				
				

	}

}
