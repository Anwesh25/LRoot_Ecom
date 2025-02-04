package pageObject;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Shop {
	
	public WebDriver driver;
	
	//constructor
	
	public Shop(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	//identify Elements
	
	@FindBy(xpath="//a[text()='Shop']")
	WebElement Cshop;
	
	@FindBy(xpath="(//button[@class='lr-btn--submit'])[1]")
	WebElement Vnow;
	
	@FindBy(xpath="//div[@class='arrow arrow--next']")
	WebElement next;
	
	@FindBy(xpath="(//span[@class='atc-text'])[2]")
	WebElement ATC;
	
	@FindBy(xpath="//button[@class='cart-drawer__close']")
	WebElement cancel;
	
	@FindBy(xpath="(//a[@href='/collections/new-arrivals'])[3]")
	WebElement ClickNA;
	
	/*@FindBy(xpath="(//wk-icon[@icon='wishlist'])[2]")
	WebElement ClickWish;
	
	@FindBy(xpath="(//wk-icon[@icon='wishlist'])[1]")
	WebElement ClickWlist;*/
	
	/*@FindBy(xpath="(//wk-icon[@icon='remove'])[1]")
	WebElement Clickremove;*/
	
	@FindBy(xpath="//a[@href='/collections/valentines-galentines-day-plants']")
	WebElement Valentine;
	
	@FindBy(xpath="(//wk-icon[@icon='wishlist'])[2]")
	WebElement VDWhis;
	
	@FindBy(xpath="//a[@href='/collections']")
	WebElement VAC;
	
	@FindBy(xpath="//a[@href='/collections/chinese-new-year']")
	WebElement NLY;
	
	@FindBy(xpath="//div[@class='item']")
	WebElement Feat;
	
	@FindBy(xpath="(//a[@href='/collections/plants-as-gifts'])[4]")
	WebElement PAG;
	
	@FindBy(xpath="(//div[@class='card__media'])[1]")
	WebElement SelectP;
	
	
	@FindBy(xpath="//span[text()='Plant Size']")
	WebElement PS;
	
	@FindBy(xpath="(//span[@class='custom-checkbox'])[1]")
	WebElement CC;
	
	@FindBy(xpath="(//span[@class='custom-checkbox'])[1]")
	WebElement Smal;
	
	@FindBy(xpath="//span[text()='Light Levels']")
	WebElement LL;
	
	@FindBy(xpath="(//span[@class='custom-checkbox'])[8]")
	WebElement BL;
	
	@FindBy(xpath="//span[text()='Water Needs']")
	WebElement WN;
	
	@FindBy(xpath="(//span[@class='custom-checkbox'])[11]")
	WebElement Med;
	
	@FindBy(xpath="//input[@class='search-input']")
	WebElement Enterval;
	
	@FindBy(xpath="//div[@class='search-icon']")
	WebElement ClickS;
	
	@FindBy(xpath="//div[@class='logo']")
	WebElement logo;
	
	
	//create action
	
	public void ShopP() {
		Cshop.click();
	}
	
	public void ViewNow() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);", "");
		Vnow.click();
		//ac.moveToElement(Vnow).build().perform();
	}
	
	public void Next() {
		next.click();
	}
	public void AddC() {
		
		ATC.click();
		
	}
	public void AddCancel() throws InterruptedException {
		cancel.click();
		Thread.sleep(2300);
		driver.navigate().back();
	}
	public void NArr() throws InterruptedException {
		ClickNA.click();
		
		//Thread.sleep(2300);
	}
	/*public void WhisList() throws InterruptedException {
		
		ClickWish.click();
		Thread.sleep(2500);
	}
	public void Whislist() {
		ClickWlist.click();
		driver.navigate().back();
	}*/
	/*public void CancelC() throws InterruptedException {
		Thread.sleep(2900);
		Clickremove.click();
		
	}*/
	
	public void VDay() throws InterruptedException {
		Valentine.click();
		Thread.sleep(3000);
	}
	public void VdayWish() {
		VDWhis.click();
	}
	public void ViewAC() {
		VAC.click();
	}
	public void NewLYear() {
		NLY.click();
	}
	public void Featured() {
		//Feat.click();
		Select sc = new Select(Feat);
		sc.selectByVisibleText("Price: Low to High");
	}
	public void PlantAsG() {
		PAG.click();
	}
	public void Slctplant() {
		SelectP.click();
	}
	public void PlantSize() {
		PS.click();
		JavascriptExecutor jse =  (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300);", "");
		
	}
	public void CheckB() {
		CC.click();
	}
	public void LightL() {
		LL.click();
	}
	public void BrightL() {
		BL.click();
	}
	public void WaterL() {
		WN.click();
	}
	public void Medium() {
		Med.click();
	}
	
	
	public void EnterValue() {
		Enterval.sendKeys("ashraf");
	}
	public void Clicks() {
		ClickS.click();
		driver.navigate().back();
	}
	
	
	
	
	
	
	
	
	
	public void LRlogo() {
		logo.click();
	}
	
}
