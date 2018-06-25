package testLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pomLoginScript.Ebay;
public class testEbay {
	WebDriver driver;

	@Test
	public void openApp() {

		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.in/");
	}

	public void test1() throws InterruptedException {

		Ebay eb = new Ebay(driver);
		eb.signIn();
		eb.userName("chandrababuc32@gmail.com");
		eb.passWord("9880062710.c");
		eb.SignBtn();

		SoftAssert sa = new SoftAssert();
		String s = driver.getTitle();
		sa.assertEquals(s, driver.getTitle());

		Reporter.log(s, true);
		sa.assertAll();

		String u = driver.getCurrentUrl();
		Reporter.log(u, true);

		eb.signOut1();
		eb.signOut2();

	}

	public void closeApp() {
		driver.close();
	}
}
