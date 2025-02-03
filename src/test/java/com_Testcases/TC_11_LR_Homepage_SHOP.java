package com_Testcases;

import org.testng.annotations.Test;

import com_PageObject.Shop;

public class TC_11_LR_Homepage_SHOP extends BaseClass {

	public Shop Sp;
	/*public Search ss;
	public GardenClub GDC;
	public Customs CS;
	public MyAccount MA;
	public Whislist WL;
	*/
	
	
	@Test
	public void Pshop() throws InterruptedException {
		Sp = new Shop(driver);
		
		Sp.ShopP();
		Sp.ViewNow();
		Sp.Next();
		Sp.AddC();
		Sp.AddCancel();
		Sp.NArr();
		//Sp.WhisList();
		//Sp.Whislist();
		//Sp.CancelC();
		Sp.VDay();
		Sp.VdayWish();
		Sp.ViewAC();
		Sp.NewLYear();
		Sp.Featured();
		Sp.PlantSize();
		Sp.CheckB();
		Sp.LightL();
		Sp.BrightL();
		Sp.WaterL();
		Sp.Medium();
		Sp.EnterValue();
		Sp.Clicks();
		Sp.LRlogo();
		
		/*ss= new Search(driver);
		
		ss.SearchB();
		ss.ButtonS();
		
		GDC = new GardenClub(driver);
		GDC.GClub();
		GDC.Glogin();
		GDC.LRlogo();
		
		CS = new Customs(driver);
		CS.Custom();
		CS.CustomNow();
		CS.ClickNext();
		CS.MoneyPlant();
		CS.Cut();
		CS.Logo();
		
		MA = new MyAccount(driver);
		MA.MyAccountClick();
		
		WL = new Whislist(driver);
		WL.Wishlist();
		WL.Discover();
		WL.NewArrival();
		WL.Plant();
		WL.ADDCart();
		WL.Logo();*/
		
		
	}
}

