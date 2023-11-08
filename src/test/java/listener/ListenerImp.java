package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.err.print("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.err.print(" onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.err.print("onTestFailure ");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.err.print("onTestSkipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.err.print("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.err.print(" onFinish");
	}
	
		

}
