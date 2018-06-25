package pomLoginScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra {
	
		@FindBy(name= "email")
		private WebElement un;

		@FindBy(name = "password")
		private WebElement pwd;

		@FindBy(xpath="//button[@class='login-login-button']")
		private WebElement btn;

		public Myntra(WebDriver driver) {
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


