package util;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.ITestContext;

public class noplisteners extends TestListenerAdapter {

	@Override
	public void onTestStart(ITestResult itr) {
		System.out.println("My Test Started");	
	}

	public void onTestSuccess(ITestResult itr) {
		System.out.println("Test Passed : " + itr.getName());
	}

	public void onTestFailure(ITestResult itr) {
		System.out.println("Test Failed : " + itr.getName());
	}

	public void onTestSkipped(ITestResult itr) {
		System.out.println("Test skipped : " + itr.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult itr) {
		System.out.println("Test Failed within Success Percentage : " + itr.getName());
	}

	public void onStart(ITestContext ctx) {
		System.out.println("Test execution started :"+ctx.getName());
	}

	public void onFinish(ITestContext ctx) {
		System.out.println("Test execution Completed :"+ctx.getName());
	}
}
