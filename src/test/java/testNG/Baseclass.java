package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	
		@BeforeSuite
		public void suiteconfig()
		{
			System.out.println("suiteconfig");
			
		}
		@BeforeTest
		public void testconfig() {
			System.out.println("testconfig");
			
		}
       @BeforeClass
       public void classconfig(){
    	   System.out.println("classconfig");
    	   
    	    }
       @BeforeMethod
       public void methodconfig() {
    	   System.out.println("methodconfig");
       }
       @AfterMethod
       public void methodteardown() {
    	   System.out.println("methodteardown");
    	  }
       @AfterClass
       public void  classteardown() {
    	   System.out.println("classteardown");
    	   
       }
       @AfterTest
       public void testteardown() {
    	   System.out.println("testteardown");
       }
       @AfterSuite
       public void suiteteardown() {
    	   System.out.println("suiteteardown");
    	   
    	   }
	}


