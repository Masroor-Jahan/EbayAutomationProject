package testLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import pomLoginScript.Flipkart;
import pomLoginScript.Gmail;

public class testGmail {
	WebDriver driver = null;

	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}

	@Test
	public void test1() throws InterruptedException {

		Gmail g = new Gmail(driver);
		g.uname("ashrafimasroor58@gmail.com");
		g.SignBtn1();
		g.password("ashrafi1");
		
		Thread.sleep(3000);
		
		g.SignBtn2();

		Thread.sleep(3000);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}

