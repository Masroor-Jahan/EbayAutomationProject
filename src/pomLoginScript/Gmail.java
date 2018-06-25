package pomLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail {
	@FindBy(id = "identifierId")
	private WebElement un;

	@FindBy(xpath = "//input[@class='RveJvd snByac']")
	private WebElement btn1;
	
	@FindBy(xpath = "//input[@class='whsOnd zHQkBf']")
	private WebElement pwd;
	
	@FindBy(xpath = "//input[@class='RveJvd snByac']")
	private WebElement btn2;

	public Gmail(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void uname(String username) {
		un.sendKeys(username);
	}
	public void SignBtn1() {
		btn1.click();
	}

	public void password(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void SignBtn2() {
		btn2.click();
	}


	
}
