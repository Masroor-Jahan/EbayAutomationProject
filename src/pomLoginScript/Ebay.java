package pomLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay {

	// declaration
	@FindBy(xpath = "//a[.='Sign in']")
	private WebElement signin;

	@FindBy(id = "userid")
	private WebElement usernametextbox;

	@FindBy(id = "pass")
	private WebElement passwordtextbox;

	@FindBy(id = "sgnBt")
	private WebElement loginbtn;

	@FindBy(id = "gh-ug")
	private WebElement signout;

	@FindBy(xpath = "//a[.='Sign out']")
	private WebElement out;

	// initiliasation
	public Ebay(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilisation
	public void signIn() {
		signin.click();
	}

	public void userName(String username) {
		usernametextbox.sendKeys(username);
	}

	public void passWord(String password) {
		passwordtextbox.sendKeys(password);
	}

	public void SignBtn() {
		loginbtn.click();
	}

	public void signOut1() {
		signout.click();
	}

	public void signOut2() {
		out.click();
	}

}
