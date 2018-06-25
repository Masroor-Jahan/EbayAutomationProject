package testClass;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import pom.Cart;

public class Test5 extends BaseTest{
	@Test
	public void Wish() throws InterruptedException {
		
		Cart c=new Cart(driver);
		c.toSeeCart();
		

		
		Thread.sleep(3000);
		
	}
}
