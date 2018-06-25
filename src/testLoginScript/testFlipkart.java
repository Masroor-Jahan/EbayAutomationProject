package testLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import pomLoginScript.Facebook;
import pomLoginScript.Flipkart;

public class testFlipkart {
	WebDriver driver = null;

	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
	}

	@Test
	public void test1() throws InterruptedException {

		Flipkart ft = new Flipkart(driver);
		ft.uname("ashrafimasroor58@gmail.com");
		ft.password("ashrafi1");
		
		Thread.sleep(3000);
		
		ft.SignBtn();

		Thread.sleep(3000);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
