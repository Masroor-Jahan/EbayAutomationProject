package testLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import genericlib.BaseTest;
//import pom.Homepage;
//import pom.LoginPage;
//import pom.SignOut;
//import pom.WelcomePage;
//import pomLoginScript.Flipkart;
import pomLoginScript.Myntra;

public class testMyntra  {
	WebDriver driver = null;

	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/?src=logo");
	}

	@Test
	public void test1() throws InterruptedException {

		Myntra m = new Myntra(driver);
		m.uname("ashrafimasroor58@gmail.com");
		m.password("ashrafi1");
		
		Thread.sleep(3000);
		
		m.SignBtn();

		Thread.sleep(3000);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
