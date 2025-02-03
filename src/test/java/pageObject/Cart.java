package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	public WebDriver driver;
	
	public Cart(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//identify Element
	
	@FindBy(xpath="//button[@class='cart-toggle']")
	WebElement ClickCart;
	
	@FindBy(xpath="(//button[@class='remove'])[1]")
	WebElement Del;
	
	public void Cartt() {
		ClickCart.click();
	}
	public void Delete() {
		Del.click();
	}
}
