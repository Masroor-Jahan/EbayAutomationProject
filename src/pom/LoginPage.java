package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;


public class LoginPage extends BasePage{

	@FindBy(id = "userid")
	private WebElement un;

	@FindBy(id = "pass")
	private WebElement pwd;

	@FindBy(id = "sgnBt")
	private WebElement btn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void uname(String username) {
		un.sendKeys(username);
	}

	public void password(String pass) {
		pwd.sendKeys(pass);
	}

	public void SignBtn() {
		btn.click();
	}
}
