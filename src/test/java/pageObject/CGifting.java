package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CGifting {
	
	public WebDriver driver;
	
	public CGifting(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[@href='/pages/live-plant-corporate-gift'])[1]")
	WebElement ClickCG;
	
	@FindBy(id="contact-company-name")
	WebElement Cname;
	
	@FindBy(id="contact-email")
	WebElement CE;
	
	@FindBy(id="contact-first-name")
	WebElement EnterCFN;
	
	@FindBy(id="contact-last-name")
	WebElement EnterCLN;
	
	@FindBy(id="contact-phone")
	WebElement EnterMobile;
	
	@FindBy(id="contact[plant_number]")
	WebElement SelectP;
	
	@FindBy(id="contact[delivery_date_start]")
	WebElement SD;
	
	@FindBy(id="contact[delivery_date_end]")
	WebElement SD1;
	
	@FindBy(id="corp-form-submit")
	WebElement ButtonSub;
	
	@FindBy(xpath="//div[@class='header-no-nav-item']")
	WebElement ClickBTC;
	
	@FindBy(xpath="//button[@aria-label='Friday, February 7 - Times available']")
	WebElement Click7;
	
	@FindBy(xpath="(//button[@data-container='time-button'])[4]")
	WebElement ClickT;
	
	@FindBy(xpath="(//button[@role='button'])[2]")
	WebElement ClickNxt;
	
	@FindBy(id="full_name_input")
	WebElement EnterName;
	
	@FindBy(id="email_input")
	WebElement EnterMail;
	
	@FindBy(id="pWsgy4mfJctoEke4WYB2K")
	WebElement EnterNo;

	@FindBy(xpath="//button[@class='uvkj3lh l15h8fme bzua8jl dyxacjh sbsarjr']")
	WebElement ClickS;
	
	
	public void CorGift() throws InterruptedException {
		Actions a=new Actions(driver);
		a.doubleClick(ClickCG).build().perform();
		//Thread.sleep(3000);
		
	}
	public void EnterCname() {
		Cname.sendKeys("W3 Soft");
	}
	public void EnterCE() {
		CE.sendKeys("W3softech@gmail.com");
	}
	public void EnterCFName() {
		EnterCFN.sendKeys("Ashraf");
	}
	public void EnterCLName() {
		EnterCLN.sendKeys("Ayyum");
	}
	public void EnterPhone() {
		EnterMobile.sendKeys("89190666999");
	}
	public void SelectPlants() {
		Select sec=new Select(SelectP);
		//sec.selectByValue("40 to 50");
		sec.selectByIndex(3);
		SelectP.click();	
	}
	public void EnterDate() {
		SD.sendKeys("04-02-2024");
	}
	public void EnterDDate() {
		SD1.sendKeys("24-02-2025");
	}
	public void ClickSub() {
		ButtonSub.click();
	}
	public void ClickBookTC() {
		ClickBTC.click();
	}
	public void ClickDate() {
		Click7.click();
	}
	public void ClickTime() {
		ClickT.click();
	}
	public void CNext() {
		ClickNxt.click();
	}
	public void Name() {
		EnterName.sendKeys("ASHRAF");
	}
	public void Mail() {
		EnterMail.sendKeys("abdulashraf013@gmail.com");
	}
	public void Number() {
		EnterNo.sendKeys("213465787");
	}
	public void Sevent() {
		ClickS.click();
	}
	

}
