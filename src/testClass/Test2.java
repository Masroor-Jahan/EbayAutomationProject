package testClass;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import pom.Homepage;
import pom.Search;


public class Test2 extends BaseTest{
	@Test
	public void Wish() throws InterruptedException {
		

		Homepage hp = new Homepage(driver);
		hp.searchItem("philips Straightener");
		hp.clickButton();
		Thread.sleep(5000);
		
		Search sc=new Search(driver);
		sc.clickStraightener();

		Thread.sleep(3000);
	}
}
