package genericlib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage extends BaseTest {
	public void elementPresent(WebElement element){
		try{
	WebDriverWait w1=new WebDriverWait(driver, 30);
	w1.until(ExpectedConditions.visibilityOf(element));
	Reporter.log("Element is present",true);
	}
		catch(Exception e){
			Reporter.log("Element is not present",true);
		}
		}
	public void verifyTitle(String title){
		try{
			WebDriverWait w2=new WebDriverWait(driver, 20);
			w2.until(ExpectedConditions.titleContains(title));
			Reporter.log("Title is matching");
		}
		catch(Exception e){
			Reporter.log("Title is not matching");
		}
	}
}
