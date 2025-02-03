package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whislist {
	
	public WebDriver driver;
	
	public Whislist(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='wk-button wk-align-center wk-align-content-center']")
	WebElement ClickW;
	
	@FindBy(xpath="//a[text()='Discover more']")
	WebElement ClickDM;
	
	@FindBy(xpath="//a[@class='is-active']")
	WebElement ClickNA;
	
	@FindBy(xpath="//a[@title='Pink Phalaenopsis Orchid']")
	WebElement Splant;
	
	@FindBy(xpath="(//span[@class='atc-text'])[2]")
	WebElement ATC;
	
	@FindBy(xpath="//div[@class='logo']")
	WebElement logo;
	
	public void Wishlist() {
		ClickW.click();
	}
	public void Discover() {
		ClickDM.click();
	}
	public void NewArrival() {
		ClickNA.click();
	}
	public void Plant() {
		Splant.click();
	}
	public void ADDCart() {
		ATC.click();
	}
	public void Logo() {
		logo.click();
	}
	
	

}
