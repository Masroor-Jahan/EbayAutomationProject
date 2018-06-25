package testClass;

import org.testng.annotations.Test;

import genericlib.BaseTest;
import pom.Homepage;

public class Test8 extends BaseTest {
	
	@Test
	public void Wish() throws InterruptedException {

		Homepage hp = new Homepage(driver);
		hp.helpContact();

		Thread.sleep(3000);
	}

}
