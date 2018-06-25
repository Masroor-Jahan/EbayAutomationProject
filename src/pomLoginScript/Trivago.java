package pomLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trivago {
	@FindBy(xpath = "//button[@class='siteheader__control td-none--hover js_log']")
	private WebElement profile;
	
	@FindBy(xpath = "//a[@data-log-ref='21']")
	private WebElement logIn;
	
	@FindBy(id = "login_email")
	private WebElement un;

	@FindBy(id = "login_password")
	private WebElement pwd;

	@FindBy(xpath = "//button[@class='btn btn--icon-leading btn--primary btn--regular login-btn']")
	private WebElement btn;
	
	@FindBy(xpath = "//button[@data-log='100:2364:20']")
	private WebElement mailClick;

	@FindBy(xpath = "//a[@data-log-ref='25']")
	private WebElement logOut;

	public Trivago(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void signProfile() {
		profile.click();
	}
	public void signLogIn() {
		logIn.click();
	}

	public void uname(String username) {
		un.sendKeys(username);
	}

	public void password(String pass) {
		pwd.sendKeys(pass);
	}

	public void signBtn1() {
		btn.click();
	}
	public void clickMailId() {
		mailClick.click();
	}

	public void signBtn2() {
		logOut.click();
	}
}
