package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

//import genericlib.BaseTest;

public class Cart extends BasePage{
//	@FindBy(xpath="//a[@_sp='m570.l3399']")
//	private WebElement settings;
	
	@FindBy(xpath = "(//a[@class='gh-eb-li-a'])[3]")
	private WebElement clickCart;
	
	
	public Cart(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void toSeeCart() {
		clickCart.click();
	}
	
}
