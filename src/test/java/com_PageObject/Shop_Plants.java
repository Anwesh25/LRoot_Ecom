package com_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop_Plants {
	public WebDriver driver;
	//1.Constructor
	public Shop_Plants(WebDriver driver) {

		this.driver=driver;

		PageFactory.initElements(driver, this);
	}   

	//2.idenrify web elements
	@FindBy(xpath="(//span[text()='Shop Plants'])[1]")
	WebElement Shopplantsdown;

	//@FindBy(xpath="(//ul[@role='navigation'])[5]")
	//WebElement username;
	@FindBy(xpath="//div[text()='Featured']")
	WebElement ClickFeaturedrop;
	
	@FindBy(xpath="//div[@class='selectize-dropdown-content']//div[3]")//8
	WebElement ClickFeature;
	@FindBy(xpath="(//wk-icon[@icon='wishlist'])[3]")//32
	WebElement Clickwishlist;
	@FindBy(xpath="//div[@class='filter-item'][1]")//5drop
	WebElement Clickdrop;
	
	@FindBy(xpath="(//span[@class='custom-checkbox'])[2]")//12check
	WebElement ClickCheckbox;
	
	//@FindBy(xpath="//ul[@class='collections-filters flex--column']//li[1]")
	//WebElement ClickCheckbo;
	@FindBy(xpath="//ul[@class='collections-filters flex--column']//li[2]")
	WebElement ClickCheckb;
	@FindBy(xpath="//ul[@class='collections-filters flex--column']//li[3]")
	WebElement ClickCheck;
	@FindBy(xpath="//ul[@class='collections-filters flex--column']//li[4]")
	WebElement ClickChec;
	@FindBy(xpath="//ul[@class='collections-filters flex--column']//li[5]")
	WebElement ClickChe;
	@FindBy(xpath="(//button[@tabindex='0'])[1]")
	WebElement ClickCncleplantas;
	@FindBy(xpath="//ul[@class='collections-filters flex--column']//li[6]")
	WebElement ClickCh;
	
	
	
	//3.Create actions
	
	public void ShopplantsDownArrow() throws InterruptedException {
		Thread.sleep(2400);
		/*Actions a=new Actions(driver);
		
		a.moveToElement(Shopplantsdown).build().perform();
		Thread.sleep(2400);
		*/Shopplantsdown.click();
		}
		
	/*public void user(){
			username.click();
		}*/
	public void ClickFeaturedropr(){
		ClickFeaturedrop.click();
	}public void ClickFeature(){
		ClickFeature.click();
	}public void Clickwishlist(){
		Clickwishlist.click();
	}
	public  void Clickdrop(){
		Clickdrop.click();
	}
	public void ClickCheckbox(){
		ClickCheckbox.click();
	}
	
	
	/*public void ClickCheckbo(){
		ClickCheckbo.click();
	}*/
	public void ClickCheckb(){
		ClickCheckb.click();
	}
	public void ClickCheck(){
		ClickCheck.click();
	}
	public void ClickChec(){
		ClickChec.click();
	}
	public void ClickChe(){
		ClickChe.click();
	}
	public void ClickCncleplantas(){
		ClickCncleplantas.click();
	}
	public void ClickCh(){
		ClickCh.click();
	}
	
}
