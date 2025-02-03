package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customs {

	public WebDriver driver;

	public Customs(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
	
	//identify elements
	
	@FindBy(xpath="(//li[@class='no-dropdown'])[1]")
	WebElement Ccustoms;
	
	@FindBy(xpath="(//div[@class='pf-c'])[2]")
	WebElement CCnow;
	
	@FindBy(xpath="//button[@fdprocessedid='3nes15']")
	WebElement Cnext;
	
	@FindBy(xpath="(//div[@class='pf-slide-main-media is-visible'])[3]")
	WebElement Mplant;
	
	@FindBy(xpath="//button[@fdprocessedid='rhdsz']")
	WebElement Ccancel;
	
	@FindBy(xpath="//div[@class='logo']")
	WebElement logo;
	
	//create actions
	
	public void Custom() {
		Ccustoms.click();
	}
	
	public void CustomNow() {
		CCnow.click();
	}
	public void ClickNext() {
		Cnext.click();
	}
	public void MoneyPlant() {
		Mplant.click();
	}
	public void Cut() {
		Ccancel.click();
	}
	public void Logo() {
		logo.click();
	}

}
