package generic;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {
	
	BaseTest b = new BaseTest();
	
	@Override
	public void onTestStart(ITestResult result) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
	String testname = result.getName();
		try {
		b.captureScreenshot(testname);
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	}
}