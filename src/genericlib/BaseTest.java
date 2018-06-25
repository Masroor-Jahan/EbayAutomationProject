package genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import pom.LoginPage;
import pom.SignOut;
import pom.WelcomePage;

public class BaseTest implements Constants {

	public static WebDriver driver;

	@BeforeMethod
	public void openApp() throws InterruptedException {
		System.setProperty(key, value);
		driver = new FirefoxDriver();
		
		
		String url=Excel.ExcelSheet(path, "Sheet1", 0, 0);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WelcomePage wp = new WelcomePage(driver);
		wp.sign();
		
		Thread.sleep(3000);
		
		String un=Excel.ExcelSheet(path, "Sheet1", 0, 1);
		String pwd=Excel.ExcelSheet(path, "Sheet1", 0, 2);
		
		LoginPage lp = new LoginPage(driver);
		lp.uname(un);
		lp.password(pwd);
		lp.SignBtn();

		Thread.sleep(3000);
	
		SoftAssert sa = new SoftAssert();
		String s = driver.getTitle();
		sa.assertEquals(s, driver.getTitle());

		Thread.sleep(3000);

		Reporter.log(s, true);
		sa.assertAll();

		Thread.sleep(3000);

	}

	@AfterMethod
	public void closeApp() throws InterruptedException {

		SignOut so = new SignOut(driver);
		so.signOut1();

		Thread.sleep(3000);
		
		so.signOut2();

		Thread.sleep(3000);
	

		driver.close();
	}
}
