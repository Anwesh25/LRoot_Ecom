package com_Testcases;

import org.testng.annotations.Test;

import com_PageObject.Shop_Plants;

public class TC_002_Livelyroot_Homepage_ShopPlants extends BaseClass{
		public Shop_Plants shp;
			@Test
			public void LRShopPlants() throws InterruptedException {
				shp=new Shop_Plants(driver);
				shp.ShopplantsDownArrow();
				Thread.sleep(2000);
				//shp.user();
				shp.ClickFeaturedropr();
				Thread.sleep(2000);
				shp.ClickFeature();
				Thread.sleep(2600);
				shp.Clickwishlist();
				Thread.sleep(2090);
				shp.Clickdrop();
				Thread.sleep(2000);
				shp.ClickCheckbox();
				Thread.sleep(2080);
				//shp.ClickCheckbo();
				//Thread.sleep(2080);
				shp.ClickCheckb();
				Thread.sleep(2180);
				shp.ClickCheck();
				Thread.sleep(2380);
				shp.ClickChec();
				Thread.sleep(2280);
				shp.ClickChe();
				Thread.sleep(2180);
				
				shp.ClickCncleplantas();
				Thread.sleep(2080);
				
				shp.ClickCh();
				Thread.sleep(2000);
		}
			
}
