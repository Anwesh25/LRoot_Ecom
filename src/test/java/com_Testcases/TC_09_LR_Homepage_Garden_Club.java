package com_Testcases;

import org.testng.annotations.Test;

import com_PageObject.Home_GardenClub;

public class TC_09_LR_Homepage_Garden_Club extends BaseClass {
	
public Home_GardenClub GC;
	
	@Test
	public void Gclub() {
		
		GC = new Home_GardenClub(driver);
		GC.GClub();
		GC.Glogin();
		GC.LRlogo();
	}

}
