package listener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.ListenerImp.class)

public class Testclass extends Baseclass{
	
	@Test
	public void test0() {
		
		System.out.println("@test");
		
		Assert.fail();
		
	}
	@Test(dependsOnMethods = "test0")
	public void test1() {
		
		System.out.println("@test0-test1");
		
	
	}
	

}
