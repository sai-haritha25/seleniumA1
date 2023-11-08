package testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderPractice {
	
	@Test(dataProvider="data")
	public void bookticketTest(String source, String dest) {
		System.out.println("From: "+source+"\tTo  "+dest);
		
		
	}

	@DataProvider
	public Object[][] data(){
 Object[][] obj = new Object[3][2];
 
 obj[0][0]="hyd";
 obj[0][1]="Goa";
 
 obj[1][0]="hyd";
 obj[1][1]="vij";
 
 obj[2][0]="khmm";
 obj[2][1]="warl";
 
 
 
return obj;
}
}