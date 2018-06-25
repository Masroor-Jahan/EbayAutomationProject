package testClass;

import org.testng.annotations.Test;
import genericlib.BaseTest;
import pom.Homepage;


public class Test1 extends BaseTest {

	@Test
	public void test1() throws InterruptedException {
	
		Homepage hp = new Homepage(driver);
		hp.searchItem("philips Straightener");
		hp.clickButton();

	}

}
