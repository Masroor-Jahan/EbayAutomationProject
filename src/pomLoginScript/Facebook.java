package pomLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	
		@FindBy(id = "email")
		private WebElement un;
		
		@FindBy(id = "pass")
		private WebElement pwd;

		@FindBy(id = "u_0_2")
		private WebElement btn;

		public Facebook(WebDriver driver) {
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

