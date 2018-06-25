package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;


public class WishList extends BasePage{

	@FindBy(xpath = "//a[@title='Click this link to access Philips HP8302/00 Essential Selfie Hair Straightener Black']")
	private WebElement straightener;

	@FindBy(id="watchLink")
	private WebElement straightenerswish;
	
//	@FindBy(id = "userid")
//	private WebElement un;
//
//	@FindBy(id = "pass")
//	private WebElement pwd;
//
//	@FindBy(id = "sgnBt")
//	private WebElement btn;
	
	
	@FindBy(xpath="(//a[@class='gh-eb-li-a'])[1]")
	private WebElement seeWish;
	
//	@FindBy(xpath="//a[@_sp='m570.l1534']")
//	private WebElement openWishBox;

	public WishList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickStraightener() {
		straightener.click();

	}
	
	public void addToWishList() {
		straightenerswish.click();
	}

	
//	public void uname(String username) {
//		un.sendKeys(username);
//	}
//
//	public void password(String pass) {
//		pwd.sendKeys(pass);
//	}
//
//	public void SignBtn() {
//		btn.click();
//	}
	
	
	public void toSeeWishBox() {
		seeWish.click();

	}
	
//	public void openWatchList() {
//		openWishBox.click();
//	}

}
