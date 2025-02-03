package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
	
	public WebDriver driver;
	
	public MyAccount(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	WebElement ClickMA;
	
	public void MyAccountClick() {
		ClickMA.click();
		driver.navigate().back();
	}

}
