package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;


public class SignOut extends BasePage{
	
	@FindBy(id="gh-ug")
	private WebElement signout;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement out;
	
	public SignOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void signOut1(){
		signout.click();
	}
	
	public void signOut2(){
		out.click();
	}
}
