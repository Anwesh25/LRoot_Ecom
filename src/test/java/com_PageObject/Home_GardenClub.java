package com_PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_GardenClub {
	
	public WebDriver driver;
	
	public Home_GardenClub(WebDriver driver) {

		this.driver = driver;
PageFactory.initElements(driver, this);
		
	}
	
	//identify Element
	@FindBy(xpath="(//li[@class='no-dropdown'])[2]")
	WebElement GC;
	
	@FindBy(xpath="//a[@class='lr-btn lr-btn--outline']")
	WebElement GL;
	
	@FindBy(xpath="//div[@class='logo']")
	WebElement logo;
	
	//create actions
	
	public void GClub() {
		GC.click();
	}
	public void Glogin() {
		GL.click();
		driver.navigate().back();
		
	}
	public void LRlogo() {
		logo.click();
	}
	
		
		
		
		
		
		
	}

