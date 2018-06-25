package testLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomLoginScript.Trivago;

public class testTrivago {
	WebDriver driver = null;

	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.trivago.in/");
	}

	@Test
	public void test1() throws InterruptedException {

		Trivago tr = new Trivago(driver);
		Thread.sleep(3000);
		tr.signProfile();
		tr.signLogIn();
		tr.uname("ashrafimasroor58@gmail.com");
		tr.password("ashrafi1");
		tr.signBtn1();

		Thread.sleep(3000);

		String s = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(s, "Wrong Title");

		Reporter.log(s, true);

		String u = driver.getCurrentUrl();
		Reporter.log(u, true);
		
		Thread.sleep(3000);
		
		tr.clickMailId();
		
		Thread.sleep(3000);
		
		tr.signBtn2();

	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
