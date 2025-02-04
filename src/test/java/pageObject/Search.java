package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
	
public WebDriver driver;
	
	//constructor
	
	public Search(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	//identify Elements
	
	@FindBy(id="search-field")
	WebElement Search;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement Bsea;
	
	
	//Create Actions
	
	public void SearchB() {
		Search.sendKeys("All Plants");
	}
	public void ButtonS() {
		Bsea.click();
		
	}
	

}
