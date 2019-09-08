package testscripts;


import org.testng.annotations.Test;
import generic.BaseTest;
import pompages.AdminHomePage;


public class TestAdminHome extends BaseTest {
	
	@Test
	public void testAdminHome()
	{	
		AdminHomePage a = new AdminHomePage(driver);
		a.navigationLinks();
	}

}
