package testLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import genericlib.BaseTest;
//import pom.LoginPage;
//import pom.SignOut;
//import pom.WelcomePage;
import pomLoginScript.Facebook;

public class testFacebook {
	WebDriver driver = null;

	@BeforeMethod
	public void openApp() {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void test1() throws InterruptedException {

		Facebook fb = new Facebook(driver);
		fb.uname("masroor.jahan@ymail.com");
		fb.password("ashrafi1");
		
		Thread.sleep(3000);
		
		fb.SignBtn();

		Thread.sleep(3000);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

}
