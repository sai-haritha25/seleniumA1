package groupexecution;

import org.testng.annotations.Test;

public class Testclass2 {

	@Test(groups="regression")
	public void demo1() {
		System.out.println("Testclass2-demo1--regression");
		
	}
	@Test(groups="smoke")
	public void demo2() {
		System.out.println("Testclass2-demo2--smoke");
	}
	@Test(groups={"regression","smoke"})
	public void demo3() {
		System.out.println("Testclass2-demo3---regression,smoke");
		
	}
}



