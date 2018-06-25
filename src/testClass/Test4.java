package testClass;

import org.testng.annotations.Test;
import genericlib.BaseTest;
import pom.BuyNow;
import pom.Homepage;
import pom.Sell;

public class Test4 extends BaseTest {

	@Test
	public void Wish() throws InterruptedException {

		Homepage hp = new Homepage(driver);
		hp.searchItem("philips Straightener");
		hp.clickButton();

		BuyNow c = new BuyNow(driver);
		c.clickStraightener();
		c.buyStraightener();
		
		Thread.sleep(3000);
		
		Sell sell=new Sell(driver);
		sell.ebayLogoClick();
		
		Thread.sleep(5000);
		
//		LoginPage lp1 = new LoginPage(driver);
//		lp1.uname("chandrababuc32@gmail.com");
//		lp1.password("9880062710.c");
//		lp1.SignBtn();
//		
//		Thread.sleep(3000);

	}

}
