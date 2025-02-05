package com_Testcases;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;





public class BaseClass {
	//we implement common functionalities like open application, close application, screenshots,log file

	public static WebDriver driver;
	public Logger log;//object creation

	//Registration data
   /* Readingdata LRD=new Readingdata();
	
	public String GuestName=LRD.getFirstName(); 
	public String GuestEmail=LRD.getEmail();
	public String Name=LRD.getName();

	public String Email2=LRD.gettextEmail2();
	public String PhoNo1=LRD.gettextPhoNo1(); 
    public String PhoNo2=LRD.gettext2();

    public String FirstName=LRD.getFirstName(); 
	public String LastName=LRD.getLastName();
	public String Email=LRD.getEmail3();
    public String YourName=LRD.getyourName();
*/
	@BeforeClass
	@Parameters({"browser","url"})
	public void openApplication(String br,String URL) {
		
		if(br.equals("chrome")) {
			
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			
			driver=new EdgeDriver();
		}
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	//screen shot

	public String captureScreen(String name) {
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		TakesScreenshot screenshot = ((TakesScreenshot) driver);
		File source = screenshot.getScreenshotAs(OutputType.FILE);

		// project home directory (./)
		//String destination=System.getProperty("user.dir")+"\\Screenshots\\"+name+"_"+timestamp+".png";
		String destination = "./Screenshot/" + name + "_" + timestamp + ".png";
		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}
	
	/*@AfterClass
	public void closeApplication() {
		
		driver.close();  gchfcfxgfxgfxgjfxgfx
	} 
		*/
}
