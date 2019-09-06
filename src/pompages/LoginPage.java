
package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	//Declaration
	@FindBy(id="Username")
	private WebElement unTB;
	
	@FindBy(name="Password")
	private WebElement pwTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBtn;
	
	
	//Initialization
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	public void setUsername(String un){
		unTB.sendKeys(un);
	}
	public void setPassword(String pw){
		pwTB.sendKeys(pw);
	}
	public void clickLogin(){
		loginBtn.click();
	}

}