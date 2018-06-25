package pom;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.BasePage;

//import testClass.Test4;
//import testClass.TestStart;

public class Homepage extends BasePage{
	
	@FindBy(id="gh-ac")
	private WebElement searchbox;
	
	@FindBy(id="gh-btn")
	private WebElement searchbutton;
	
	@FindBy(xpath="(//a[@class='gh-eb-li-a'])[2]")
	private WebElement paisa;
	
	@FindBy(xpath="//a[@_sp='m570.l1545']")
	private WebElement help;
	
	@FindBy(xpath="(//a[@class='gh-p'])[1]")
	private WebElement deal;
	
	@FindBy(xpath="(//a[@class='gh-p'])[2]")
	private WebElement track;
	
	@FindBy(xpath="//a[@class='bluelinkYukon']")
	private WebElement back;
	
	
	public Homepage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void searchItem(String itemtype){
		searchbox.sendKeys(itemtype);
	}
	public void clickButton(){
		searchbutton.click();
	}
	public void paisaPay(){
		paisa.click();
	}
	public void helpContact(){
		help.click();
	}
	public void clickDeal(){
		deal.click();
	}
	public void trackOrder(){
		track.click();
	}
	public void backToEbay(){
		back.click();
	}
	
	
}
