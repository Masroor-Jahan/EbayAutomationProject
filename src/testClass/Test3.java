package testClass;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import pom.Homepage;
import pom.LoginPage;
import pom.Search;
import pom.WishList;

public class Test3 extends BaseTest {

	@Test
	public void Wish() throws InterruptedException {

		Homepage hp = new Homepage(driver);
		hp.searchItem("philips Straightener");
		hp.clickButton();
		
		Thread.sleep(5000);

		Search sc = new Search(driver);
		sc.clickStraightener();

		Thread.sleep(3000);
		
		WishList wl = new WishList(driver);
		wl.addToWishList();
		
		Thread.sleep(3000);
		
		LoginPage lp1 = new LoginPage(driver);
		lp1.uname("chandrababuc32@gmail.com");
		lp1.password("9880062710.c");
		lp1.SignBtn();
		
		Thread.sleep(3000);
		
		WishList wl1 = new WishList(driver);
		wl1.toSeeWishBox();
		
		Thread.sleep(3000);

		
	}
}
