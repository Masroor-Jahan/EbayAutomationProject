package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

public class Sell extends BasePage{
	@FindBy(xpath="//a[@_sp='m570.l1528']")
	private WebElement sell;
	
	@FindBy(xpath="//button[@class='startSellingBtn']")
	private WebElement clickStartSellingButton;
	
	@FindBy(id="gh-la")
	private WebElement ebaylogo;
	
	public Sell(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void clickSell(){
		sell.click();
	}
	public void startSell(){
		clickStartSellingButton.click();
	}
	public void ebayLogoClick(){
		ebaylogo.click();
	}
	
}

