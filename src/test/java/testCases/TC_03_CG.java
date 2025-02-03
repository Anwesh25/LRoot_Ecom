package testCases;



import org.testng.annotations.Test;

import pageObject.CGifting;

public class TC_03_CG extends BaseClass{
	
	public CGifting LCG;
	
	@Test
	public void LRCG() throws InterruptedException {
		LCG = new CGifting(driver);
		LCG.CorGift();
		LCG.EnterCname();
		LCG.EnterCE();
		LCG.EnterCFName();
		LCG.EnterCLName();
		LCG.EnterPhone();
		//LCG.SelectPlants();
		LCG.EnterDate();
		LCG.EnterDDate();
		LCG.ClickSub();
		LCG.ClickBookTC();
		LCG.ClickDate();
		LCG.ClickTime();
		LCG.CNext();
		LCG.Name();
		LCG.Mail();
		LCG.Number();
		LCG.Sevent();
	}

}
