package testClass;

import org.testng.annotations.Test;

import genericlib.BaseTest;
//import pom.LoginPage;
import pom.Sell;

public class Test6 extends BaseTest{
	@Test
	public void Wish() throws InterruptedException {
		
		Sell sell=new Sell(driver);
		sell.clickSell();
		
		Thread.sleep(3000);
		
		sell.ebayLogoClick();
		
//		Thread.sleep(3000);
//		
//		sell.startSell();
//		
//		LoginPage lp1 = new LoginPage(driver);
//		lp1.uname("chandrababuc32@gmail.com");
//		lp1.password("9880062710.c");
//		lp1.SignBtn();
//		
		
		
		Thread.sleep(3000);
		
	}
}



