package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class BuyNow extends BasePage{
	@FindBy(xpath = "//a[@title='Click this link to access Philips HP8302/00 Essential Selfie Hair Straightener Black']")
	private WebElement straightener;

	@FindBy(id = "binBtn_btn")
	private WebElement straightenerbuy;

	

	public BuyNow(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickStraightener() {
		straightener.click();

	}

	public void buyStraightener() {
		straightenerbuy.click();
	}


}