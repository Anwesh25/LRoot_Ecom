package testCases;

import org.testng.annotations.Test;

import pageObject.Cart;

public class TC_02_Cart extends BaseClass {
	
	public Cart CT;
	
	@Test
	public void CartV() {
		
		CT = new Cart(driver);
		CT.Cartt();
		CT.Delete();
		
	}

}
