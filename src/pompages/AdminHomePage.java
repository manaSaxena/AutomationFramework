package pompages;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class AdminHomePage {
	
//	declaration
	@FindBy(className = "nav-link-text")
	private List<WebElement> allNavLinks;

//	initialization
	public AdminHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	utilization
	public void navigationLinks() {
	  for(WebElement allLinks : allNavLinks) {
		System.out.println(allLinks.getText());
		
	  }

	}
}
