package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import generic.BaseTest;
import generic.Lib;
import pompages.LoginPage;


public class TestLogin extends BaseTest{
	
	@Test
	public void testLogin(){
		
		LoginPage l = new LoginPage(driver);
		String un = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 0);
		String pw = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 1);
//		String expectedTitle = Lib.getCellValue(EXCEL_PATH, "ValidLogin", 1, 2);
		l.setUsername(un);
		l.setPassword(pw);
		l.clickLogin();
		
		/*
		 * String actualtitle = driver.getTitle(); 
		 * SoftAssert s = new SoftAssert();
		 * s.assertEquals(actualtitle, expectedTitle); 
		 * s.assertAll();
		 */
		
		
	}
}


