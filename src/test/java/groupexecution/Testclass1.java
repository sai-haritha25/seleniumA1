package groupexecution;

import org.testng.annotations.Test;

public class Testclass1 {
	
	@Test(groups="smoke")
	public void demo1() {
		System.out.println("Testclass1-demo1-smoke");
		
	}
	@Test(groups="sanity")
	public void demo2() {
		System.out.println("Testclass1-demo2--sanity");
	}
	@Test(groups={"smoke","sanity"})
	public void demo3() {
		System.out.println("Testclass1-demo3---smoke,sanity");
		
	}
}





