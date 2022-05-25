package Utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	
	@Override
	public boolean retry(ITestResult result) {
		if(counter < retryLimit)
	}
}
