package pomLoginScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {
	
		@FindBy(xpath = "//input[@class='_2zrpKA']")
		private WebElement un;

		@FindBy(xpath = "//input[@class='_2zrpKA _3v41xv']")
		private WebElement pwd;

		@FindBy(xpath = "//input[@class='_2AkmmA _1LctnI _7UHT_c']")
		private WebElement btn;

		public Flipkart(WebDriver driver) {
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


