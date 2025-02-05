package com_Testcases;

import org.testng.annotations.Test;

import com_PageObject.Gifting;



public class TS_004_livelyroot_Gifting_Giftcard extends BaseClass {
	
	public Gifting gf;
	@Test
	public void LRShopPlants() throws InterruptedException {
		gf=new Gifting(driver);
		gf.ShopplantsDownArrow();
		gf.userClickgift();
		gf.RecipientEmail();
		gf.RecipientName();
		gf.From();
		gf.Message();
		
		gf.userclicklikebtn();
		gf.locationcode();
		gf.Zipcode();
		gf.CheckZip();
		gf.ShowMore();
		gf.Instgram();
		//sgf.closeINst();
		gf.insta2();
		//gf.closeinst2();
        gf.Shopplantsgift();
		//gf.CancleButton();
		//Thread.sleep(2000);
		
	}

}
