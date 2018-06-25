package testClass;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import pom.Homepage;

public class Test9 extends BaseTest{
	@Test
	public void track() throws InterruptedException {

		Homepage hp = new Homepage(driver);
		hp.trackOrder();
		
	}

}




