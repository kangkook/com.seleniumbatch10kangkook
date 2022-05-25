package Utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersTestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started" +result.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess Method" +result.getName());
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure Method" +result.getName());
	}
	
	
	@Override
	public void onStart(ITestResult context) {
		System.out.println("onStart Method");
	}
	
	
	@Override
	public void onFinish(ITestResult context) {
		System.out.println("New Test Started" +result.getName());
	}
	
	
//	@Override
//	public void onTestStart(ITestResult result) {
//		System.out.println("New Test Started" +result.getName());
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
}
