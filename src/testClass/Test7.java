package testClass;

import org.testng.annotations.Test;
import genericlib.BaseTest;
import pom.Homepage;

public class Test7 extends BaseTest{
	@Test
	public void Wish() throws InterruptedException {

		Homepage hp = new Homepage(driver);
		hp.paisaPay();
		
		Thread.sleep(6000);
		
		Homepage hp1 = new Homepage(driver);
		hp1.backToEbay();
		
		Thread.sleep(3000);
	}

}


