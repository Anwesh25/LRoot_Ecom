package com_PageObject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gifting {
	public WebDriver driver;
	//1.Constructor
	public Gifting(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);
	}

	//2.idenrify web elements
	@FindBy(xpath="(//span[text()='Gifting'])[1]")
	WebElement Giftingdorp;

	@FindBy(xpath="(//a[@title='Gift Cards'])[1]")// dropdown gift card
	WebElement userclickgift;
	
	@FindBy(xpath="//input[@id='pdp-gift-message-recipient']")
	WebElement userclickgif;
	@FindBy(id="pdp-gift-message-to")
	WebElement userclickgi;
	@FindBy(id="pdp-gift-message-from")
	WebElement userclickg;
	
	@FindBy(id="pdp-gift-message-text")
	WebElement userclick;//    //button[@class='cart-drawer__close']
	@FindBy(id="add")
	WebElement userclicks;
	
	
	@FindBy(xpath="//button[@class='cart-drawer__close']")
	WebElement CancleButton;
	@FindBy(xpath="(//wk-icon[@icon='wishlist'])[2]")
	WebElement userclicklikebtn;
	@FindBy(xpath="//span[@class='sc-dLMFU iEXTHI']")
	WebElement locationcode;
	@FindBy(xpath="//input[@placeholder='Enter ZIP']")
	WebElement Zipcode;
	@FindBy(xpath="//button[text()='Check ']")
	WebElement CheckZip;
	
	@FindBy(xpath="//span[text()='Show More']")
	WebElement ShowMore;
	@FindBy(xpath="//a[text()='@livelyroot']")
	WebElement Instgram;
	@FindBy(xpath="(//div[@class='x6s0dn4 x78zum5 xdt5ytf xl56j7k'])[2]")
	WebElement closeINst;
	@FindBy(xpath="//a[text()='#livelyroot']")
	WebElement insta2;
	@FindBy(xpath="//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _ab9z _aba9  _abch _abck x1vjfegm _abcm']")
	WebElement closeinst2;
	//3.Create actions
	
	public void ShopplantsDownArrow() throws InterruptedException {
		Giftingdorp.click();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(Giftingdorp).build().perform();
		}	
	public void userClickgift() {
		userclickgift.click();
	    System.out.println("good");
		}
	public void RecipientEmail() {
		userclickgif.sendKeys("ravi@gmail.com");
		}
	public void RecipientName() {
		System.out.println("hi");
		userclickgi.sendKeys("ravi");
		}
	public void From() {
		userclickg.sendKeys("Hydrabed near gachebowli");
		}
	public void Message() {
		userclick.sendKeys("good product in gift cards");
		}

	public void userclicklikebtn() {
		userclicklikebtn.click();
		}
	public void locationcode() {
		locationcode.click();
		}
	public void Zipcode() throws InterruptedException {
		Thread.sleep(2000);
		Zipcode.sendKeys("340");;	
		}	
	public void CheckZip() {
		CheckZip.click();
    	}
	public void ShowMore() {
		ShowMore.click();
		}
	public void Instgram() throws InterruptedException {
		Set<String> all=driver.getWindowHandles();
		List<String> window=new ArrayList(all);
		String Parentid=window.get(0);
		Thread.sleep(3000);
		Instgram.click();
		}
	/*public void closeINst() throws InterruptedException {
		Thread.sleep(3000);
		
		Set<String> al=driver.getWindowHandles();
		List<String> window1=new ArrayList(al);
		String Child=window1.get(1);
		driver.switchTo().window(Child).getTitle();
		Thread.sleep(2000);
		closeINst.click();
		Thread.sleep(2000);
		driver.close();
		}*/
	public void insta2() throws InterruptedException {
 	    Thread.sleep(2000);
		Set<String> all=driver.getWindowHandles();
		List<String> window=new ArrayList(all);
		String Parentid=window.get(0);
		driver.switchTo().window(Parentid).getTitle();
		Thread.sleep(2000);
		insta2.click();
		}
	/*public void closeinst2() throws InterruptedException {
		Thread.sleep(3000);
		Set<String> all=driver.getWindowHandles();
		List<String> window=new ArrayList(all);
		String child=window.get(3);
		driver.switchTo().window(child).getTitle();
		closeinst2.click();
		}
	public void CancleButton() {
		userclicks.click();
		CancleButton.click();
		}*/
	public void Shopplantsgift() throws InterruptedException {
		Set<String> all=driver.getWindowHandles();
		List<String> window=new ArrayList(all);
		String Parentid=window.get(0);
		driver.switchTo().window(Parentid).getTitle();
		
		}

}



