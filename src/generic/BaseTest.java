package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.common.io.Files;


public class BaseTest implements IAutoConstant{
	public static WebDriver driver;

	static{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	
	@BeforeMethod
	public void openApplication(){
			driver = new ChromeDriver();
			String url = Lib.getProperty(CONFIG_PATH, "URL");
			driver.get(url);
			String ITO = Lib.getProperty(CONFIG_PATH, "ImplicitTimeOut");
			int timeoutPeriod = Integer.parseInt(ITO);
			driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
    }

	@AfterMethod
	public void closeApplication(){
			driver.close();
	}
	
	/*
	 * Capture screenshots for failed TC
	 * 
	 */
	public void captureScreenshot(String testname) throws IOException{
			Date d = new Date();
			String currentdate = d.toString().replaceAll(":", "_");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./screenshot"+currentdate+"/"+testname+"_screenshot.png");

				Files.copy(srcFile, destFile);

	}
}
